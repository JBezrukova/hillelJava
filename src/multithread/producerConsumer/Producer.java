package multithread.producerConsumer;

import multithread.producerConsumer.Bucket;

/**
 * Created by Юля on 06.05.2016.
 */
public class Producer implements Runnable{

    private Bucket bucket;

    public Producer(Bucket bucket) {
        this.bucket = bucket;
    }

    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            bucket.put();
        }
    }
}
