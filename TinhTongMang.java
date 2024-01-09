//Họ và tên: Nguyễn Quốc Huy
//Lớp: CNTT15-04
//MSV: 1571020117
package com.mycompany.tuan2;
public class TinhTongMang {
    public static void main (String [] args){
       int[] array = {1,2,3,4,5,6,7,8,9,10};
       int numThreads = 2;
       Thread[] ths = new Thread[numThreads];
       SumCalculator[] cals = new SumCalculator[numThreads];
       for (int i = 0; i < numThreads; i++){
           cals[i] = new SumCalculator(array,i,numThreads);
           ths[i]= new Thread (cals[i]);
           ths[i].start(); 
       } 
       for (int i = 0; i < numThreads; i++){
           try{
               ths[i].join();
           }catch(InterruptedException e){
               e.printStackTrace();
           }
       }
       int totalSum = 0;
       for (SumCalculator c : cals){
           totalSum += c.getTong1phan();
       }
       System.out.println("Tong la: " + totalSum);
    }
    
}
class SumCalculator implements Runnable {
    private int[] array;
    private int startIndex;
    private int chia;
    private int tong1phan;

    public SumCalculator(int[] array, int startIndex, int chia ) {
        this.array = array;
        this.startIndex = startIndex;
        this.chia = chia;
        this.tong1phan = 0;
    }
    public void run(){
        //tính tổng các phần tử
        for(int i = startIndex; i < array.length; i += chia){
            tong1phan +=array[1];
        }
    }
    public int getTong1phan(){
        return tong1phan;
    }
    
}