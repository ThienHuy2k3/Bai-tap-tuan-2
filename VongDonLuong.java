//Họ và tên: Nguyễn Quốc Huy
//Lớp: CNTT15-04
//MSV: 1571020117
package com.mycompany.tuan2;

public class VongDonLuong {
    public static void main (String[] args) {
        //tao 1 luong moi
        Thread th1 = new Thread(new DNRunnable2());
        th1.start();
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        th1.interrupt();
    }
}
class DNRunnable2 implements Runnable {
    
    @Override
    public void run(){
        System.out.println("Luong dang chay - Trang Thai " + Thread.currentThread().getState());
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Luong bi ngat ngu - trang thai "+ Thread.currentThread().getState());
        }
        System.out.println("luong da ket thuc - Trang thai" + Thread.currentThread().getState());
    }
}