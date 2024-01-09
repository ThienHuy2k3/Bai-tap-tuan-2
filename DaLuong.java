//Họ và tên: Nguyễn Quốc Huy
//Lớp: CNTT15-04
//MSV: 1571020117
package com.mycompany.tuan2;

public class DaLuong {
    public static void main (String[] args){
        //goi luong
        Thread th1 = new Thread(new DNRunnable("Luong 1"));
        th1.start();
        Thread th2 = new Thread(new DNRunnable("Luong 2"));
        th2.start();
    } 
}
class DNRunnable implements Runnable{
    //Quan li theo ten
    private String threadName ;
    //hàm khởi tạo
    public DNRunnable(String name){
        this.threadName = name;
    }
    @Override
    public void run(){
        System.out.println("Bat dau thuc hien cong viec trong " + threadName);
        //thuc hien cong viec cua luong
        for(int i = 0; i <=5; i++){
            System.out.println(threadName + "; Buoc " + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Ket thuc cong viec cua " + threadName);
    }
}