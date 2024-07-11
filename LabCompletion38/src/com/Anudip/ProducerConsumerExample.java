package com.Anudip;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 5; 

        Thread producer = new Thread(new Producer(queue, maxSize), "Producer");
        Thread consumer = new Thread(new Consumer(queue), "Consumer");

        producer.start();
        consumer.start();
    }

    // Producer class
    static class Producer implements Runnable {
        private final Queue<Integer> queue;
        private final int maxSize;

        public Producer(Queue<Integer> queue, int maxSize) {
            this.queue = queue;
            this.maxSize = maxSize;
        }

        @Override
        public void run() {
            int count = 0;
            while (true) {
                synchronized (queue) {
                    while (queue.size() == maxSize) {
                        try {
                            System.out.println("Queue is full, Producer is waiting...");
                            queue.wait(); 
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Producing: " + count);
                    queue.offer(count++); 
                    queue.notify(); 

                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private final Queue<Integer> queue;

        public Consumer(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            System.out.println("Queue is empty, Consumer is waiting...");
                            queue.wait(); 
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int item = queue.poll(); 
                    System.out.println("Consuming: " + item);
                    queue.notify(); 

                    try {
                        Thread.sleep(1500); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

/*
Consuming: 7
Consuming: 8
Consuming: 9
Consuming: 10
Consuming: 11
Queue is empty, Consumer is waiting...
Producing: 12
Producing: 13
Producing: 14
Producing: 15
Producing: 16
Queue is full, Producer is waiting...
Consuming: 12
Consuming: 13
Consuming: 14
Consuming: 15
Consuming: 16
Queue is empty, Consumer is waiting...
Producing: 17
Consuming: 17
Queue is empty, Consumer is waiting...
Producing: 18
Producing: 19
Producing: 20
Producing: 21
Producing: 22
Queue is full, Producer is waiting...
*/


