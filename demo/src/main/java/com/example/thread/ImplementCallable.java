package com.example.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

public class ImplementCallable {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Callable<List<Integer>> callable = () -> {
			List<Integer> list = new ArrayList<>();
			for (int i = 1; i < 1000000; i++) {
				System.gc();
				list.add(i);
			}
			return list;
		};
		FutureTask<List<Integer>> task = new FutureTask<>(callable);
		Thread t1 = new Thread(task);
		t1.start();
		try {
			System.out.println("size: " + task.get().size());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------------");

		Callable<Long> callable2 = () -> {
			return task.get().stream().parallel().filter(i -> i % 2 == 0).collect(Collectors.summingLong(a -> a));
		};
		FutureTask<Long> task2 = new FutureTask<>(callable2);
		Thread t2 = new Thread(task2);
		t2.start();
		try {
			System.out.println("sum: " + task2.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
