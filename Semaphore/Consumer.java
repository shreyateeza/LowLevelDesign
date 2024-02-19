package LLD1.Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Shirt> store;
    private String name;
    private int maxSize;
    private Semaphore semaConsumer, semaProducer;

    public Consumer(Queue<Shirt> store, String name, Semaphore semaProducer, Semaphore semaConsumer){
        this.store = store;
        this.name = name;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;
    }

    @Override
    public void run(){
        while(true) {
            try {
                semaConsumer.acquire(); // reduce the count for consumer by 1
                System.out.println("Current size : " + store.size() + ", Removed by consumer : " + name);
                store.remove(); // removes a single shirt from store
                semaProducer.release(); // increase the count for producer by 1
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
