/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author assud
 */
public class ClientTest1 {

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();

        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);

        for (int i = 0; i < 100; i++) {
            executorService.execute(new CpuIntensiveTask());
            
            executorService.shutdown();
        }
    }

    static class CpuIntensiveTask implements Runnable {
    
        public void run() {
            System.out.println("Thread Name:" + Thread.currentThread().getName());

        };

    }
}
