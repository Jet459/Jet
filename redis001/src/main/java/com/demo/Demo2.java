package com.demo;

public class Demo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(
                ()->{
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                    }
                }
        );
        Thread thread1 = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                    }
                }
        );


        thread.start(); 
        thread1.start();
    }
}
