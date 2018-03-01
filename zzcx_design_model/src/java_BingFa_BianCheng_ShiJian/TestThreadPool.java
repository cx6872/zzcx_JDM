package java_BingFa_BianCheng_ShiJian;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
   public static void main(String args[]) throws InterruptedException{
	//在线程池中创建2个线程
	   ExecutorService exec = Executors.newFixedThreadPool(2);
	   for(int index = 0 ; index<100 ;  index++ ){
		   Runnable run = new Runner(index);
		   //执行线程目标对象
		   exec.execute(run);
		   
	   }
	   //shutdown
	   exec.shutdown();
   }
}

//线程目标对象
class Runner implements Runnable{
	int index = 0;
	public Runner(int index){
		this.index = index;
	}
	@Override
	public void run(){
		long time = (long)(Math.random()*1000 );
		
		System.out.println("线程：" + Thread.currentThread().getName()+"(目标对象"
				+ index+")"+":Sleeping" + time + "ms");
		
		try{
			Thread.sleep(time);
		}catch(InterruptedException e){
		}
	}
}