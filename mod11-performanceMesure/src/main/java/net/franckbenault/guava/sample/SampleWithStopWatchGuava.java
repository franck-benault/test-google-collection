package net.franckbenault.guava.sample;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class SampleWithStopWatchGuava {


	
	private static void subProcess1() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void subProcess2() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static long longProcess() {
		System.out.println("SampleWithStopWatchGuava");
		Stopwatch stopwatch = Stopwatch.createStarted();
		
		subProcess1();
		final long date2 = stopwatch.elapsed(TimeUnit.MILLISECONDS);
		System.out.println("subprocess2 "+date2);
		
		subProcess2();
		final long date3 = stopwatch.elapsed(TimeUnit.MILLISECONDS);
		System.out.println("subprocess2 "+(date3-date2));
		
		return date3;
		
	}
	
}
