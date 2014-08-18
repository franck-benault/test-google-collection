package net.franckbenault.guava.sample;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;

public class SampleWithStopWatchCommons {


	
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
		System.out.println("SampleWithStopWatchCommons");
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		subProcess1();
		stopwatch.split();
		final long date2 = stopwatch.getSplitTime();
		System.out.println("subprocess1 "+date2);
		
		subProcess2();
		stopwatch.split();
		final long date3 =  stopwatch.getSplitTime();
		System.out.println("subprocess1 "+(date3-date2));
	
		
		return date3;
		
	}
	
}
