/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author assud
 */
public class ClientTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2); //Makes two threads

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My Task1 has started");
                try {
                    TimeUnit.SECONDS.sleep(3); //sleeps for 3 secs
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
                System.out.println("My Task1 ended");
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My Task2 has started");
                try {
                    TimeUnit.SECONDS.sleep(3); //sleeps for 3 secs
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
                System.out.println("My Task2 ended");
            }
        };
        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My Task3 has started");
                try {
                    TimeUnit.SECONDS.sleep(3); //sleeps for 3 secs
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
                System.out.println("My Task3 ended");
            }
        };
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        
        executorService.shutdown();
    }
}
