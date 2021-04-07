package helloworld;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MultiThreading{
	
//	public static void main(String args[]) {
//		Thread t = new Thread( new Runnable() {
//			public void run(){
//				System.out.println("This is it");
//			}
//		});
//		
//		ExecutorService executor = Executors.newFixedThreadPool(10);
//		for(int i=0; i< 100; i++) {
//		executor.execute(t);
//		}
//		executor.shutdown();
//	}
	
}

public class CallableAndFuture implements Callable<String>{
	
	public String call() throws Exception{
        Thread.sleep(1000);
		return  Thread.currentThread().getName();
	}
	
public static void main(String args[]) {
	ExecutorService executor = Executors.newFixedThreadPool(10);
	List<Future<String>> list = new ArrayList<Future<String>>();
	Callable<String> callable = new CallableAndFuture();
	for(int i=0; i< 100; i++) {
		
		Future<String> future = executor.submit(callable);
		list.add(future);
		
	}
	for(Future<String> fut : list) {
		try {
			System.out.println(new Date() + " :: " + fut.get());
		} catch(InterruptedException | ExecutionException e) {
            e.printStackTrace();
		}
        executor.shutdown();
	}
}
	
}
