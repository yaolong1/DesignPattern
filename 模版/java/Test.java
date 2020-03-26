import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-01-26 11:42
 **/
public class Test {

    public static void main(String[] args) throws InterruptedException {


/*//        CountDownLatch countDownLatch = new CountDownLatch(16);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(16,()->{
            System.out.println(Thread.currentThread().getName()+"\t"+"召唤16个神龙");
        });
        for (int i=0;i<16;i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t"+"离开教室");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
//                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
//        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"\t"+"班长关门离开教室");*/




    }
}

class MyCache{

    private volatile Map<String,Object> map = new HashMap<>();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void put(String key, Object value){

        readWriteLock.writeLock().lock();
            try {
                System.out.println(Thread.currentThread().getName()+"\t---写入数据"+key);
                try { TimeUnit.MICROSECONDS.sleep(300); } catch (InterruptedException e) { e.printStackTrace(); }
                map.put(key,value);
                System.out.println(Thread.currentThread().getName()+"\t---写入数据完成");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                readWriteLock.writeLock().unlock();
        }



    }

    public void get(String key){
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"\t---开始读取数据");
            try { TimeUnit.MICROSECONDS.sleep(300); } catch (InterruptedException e) { e.printStackTrace(); }
            Object o = map.get(key);
            System.out.println(Thread.currentThread().getName()+"\t---读取数据成功"+o);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }



    }

}

/**
 * 读写锁
 */
class Main{
    public static void main(String[] args) {
        MyCache myCache = new MyCache();
        for (int i = 1; i<5;i++){
            final int i1 =i;
            new Thread(()->{
                myCache.put(i1+"",i1+"");
            },String.valueOf(i)).start();
        }


        for (int i = 1; i<5;i++){
            final int i1 =i;
            new Thread(()->{
                myCache.get(i1+"");
            },String.valueOf(i)).start();
        }
    }

}


class Queue{
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

       /* 抛异常的插入（add）、移除(remove)、检查(element)
        当添加操作的容量超出ArrayBlockingQueue实例自定义的队列容量时会报
        java.lang.IllegalStateException: Queue full
        当移除队列和查找队列为空时会报
        java.util.NoSuchElementException


        System.out.println(blockingQueue.add("a"));
//        System.out.println(blockingQueue.add("a"));
//        System.out.println(blockingQueue.add("a"));
//        System.out.println(blockingQueue.add("a"));
        blockingQueue.add("b");
        blockingQueue.add("c");

        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());

        System.out.println(blockingQueue.element());
*/

/*
         插入（offer）、移除(poll)、检查(peek)
        当添加操作的容量超出ArrayBlockingQueue实例自定义的队列容量时
        添加操作的返回值为false
        当移除队列和查找队列为空时其返回值都会为null


        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        System.out.println(blockingQueue.offer("d"));

        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());

        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.peek());
*/



/*
        插入（put）、移除(take)
        当添加操作的容量超出ArrayBlockingQueue实例自定义的队列容量时
        当前主线程会阻塞，
        当移除队列和查找队列为空时
        当前主线程会阻塞，直到队列可用

         try {
            blockingQueue.put("a");
            blockingQueue.put("b");
            blockingQueue.put("v");
            blockingQueue.put("d");

            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());

            System.out.println(blockingQueue.element());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

/*
         插入（offer）、移除(poll)
        当添加操作的容量超出ArrayBlockingQueue实例自定义的队列容量时
        当前主线程会超时阻塞直到自定义超时时间之后返回值为（false）才会执行下一段程序
        当移除队列和查找队列为空时
        当前主线程会超时阻塞自定义超时时间之后返回值为（false）才会执行下一段程序

        try {
            System.out.println(blockingQueue.offer("a", 3L, TimeUnit.SECONDS));
            System.out.println(blockingQueue.offer("b", 3L, TimeUnit.SECONDS));
            System.out.println(blockingQueue.offer("c", 3L, TimeUnit.SECONDS));
            System.out.println(blockingQueue.offer("d", 3L, TimeUnit.SECONDS));
            System.out.println(blockingQueue.poll());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }

}
