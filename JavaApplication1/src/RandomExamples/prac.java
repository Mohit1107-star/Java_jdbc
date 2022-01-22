/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class prac {
    public static void main(String[] args) {
        int coreCOunt = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCOunt);
        for(int i=00;i<100;i++){
            service.execute(new Task());
        }
//        System.out.println("Thread Name:" + Thread.currentThread().getName());
        service.shutdown();
    }

    static class Task implements Runnable {
        public void run(){
            System.out.println("Thread Name:" + Thread.currentThread().getName());
        }
    }
}