package thrd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThread extends Thread{
	Scanner sc = new Scanner(System.in);
	private int num;

	public MyThread() {
		System.out.println("Enter number");
		this.num = sc.nextInt();
		new Thread(this).start();
	}

	@Override
	public synchronized void run() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		for (int i = 2; i < num; i++) {
			list.add(i, list.get(i-1)+list.get(i-2));
		}
		for (Integer integer : list) {
			
			System.out.print(integer+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println();
	}
	
}
