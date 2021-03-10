package com.company;

public class OddThread extends Thread{
    public OddThread(String name){
        super(name);
    }
    @Override
    public void run(){
        try {
            System.out.println(getName());
            for (int i = 1; i <=10; i++) {
                if (i%2==1) System.out.println(i + ",");
            }
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
