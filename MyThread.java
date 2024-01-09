//Họ và tên: Nguyễn Quốc Huy
//Lớp: CNTT15-04
//MSV: 1571020117
package com.mycompany.tuan2;


public class MyThread extends Thread {
    
    @Override
    public void run(){
        System.out.println("Luong dang chay");
    }
    
    public static void main (String[] arg){
        MyThread th = new MyThread();
        th.start();     
    }
    
}
