package java_BingFa_BianCheng_ShiJian;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
   public static void main(String args[]) throws InterruptedException{
	//���̳߳��д���2���߳�
	   ExecutorService exec = Executors.newFixedThreadPool(2);
	   for(int index = 0 ; index<100 ;  index++ ){
		   Runnable run = new Runner(index);
		   //ִ���߳�Ŀ�����
		   exec.execute(run);
		   
	   }
	   //shutdown
	   exec.shutdown();
   }
}

//�߳�Ŀ�����
class Runner implements Runnable{
	int index = 0;
	public Runner(int index){
		this.index = index;
	}
	@Override
	public void run(){
		long time = (long)(Math.random()*1000 );
		
		System.out.println("�̣߳�" + Thread.currentThread().getName()+"(Ŀ�����"
				+ index+")"+":Sleeping" + time + "ms");
		
		try{
			Thread.sleep(time);
		}catch(InterruptedException e){
		}
	}
}