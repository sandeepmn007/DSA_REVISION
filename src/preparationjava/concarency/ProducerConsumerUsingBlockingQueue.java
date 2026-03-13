package preparationjava.concarency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ProducerConsumerUsingBlockingQueue {


    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new SynchronousQueue<>();


        new Thread(() -> {
                for(int i=1; i<50; i++) {
                    try {
                        queue.put(i);
                        System.out.println("Producer Produced "+ i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        }).start();

        new Thread(() -> {
            try {
                while(true){
                    int val  = queue.take();
                    System.out.println("Consumer consumed "+val);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }).start();



    }


}
