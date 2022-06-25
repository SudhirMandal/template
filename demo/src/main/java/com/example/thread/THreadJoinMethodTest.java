package com.example.thread;

import java.util.ArrayList;
import java.util.List;

public class THreadJoinMethodTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
//					System.out.println(i);
					try {
						Thread.sleep(100*100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					list.add(i);
				}
				
				Thread t2 = new Thread(() -> {
					for (int i = 10; i < 20; i++) {
						list.add(i);
					}
				});
				
				t2.start();
				try {
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t2 " + t2.isAlive());
				System.out.println(Thread.activeCount());
			}

		};

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		list.add(20);
		System.out.println("t1 " + t1.isAlive());
		System.out.println(list);
	}
}
