package com.company;

public class EvenThread extends Thread{
    public EvenThread(String name){
        super(name);
    }
    @Override
    public void run(){
        try {
            System.out.println(getName());
            for (int i = 1; i <10 ; i++) {
                if (i%2==0) System.out.println(i+",");
            }
            Thread.sleep(15);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
