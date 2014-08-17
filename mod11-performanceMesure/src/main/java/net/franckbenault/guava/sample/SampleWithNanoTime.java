package net.franckbenault.guava.sample;

public class SampleWithNanoTime {


	
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
		System.out.println("SampleWithNanoTime");
		final long ten6 = 1000000;
		final long date1 = System.nanoTime();
		
		subProcess1();
		final long date2 = System.nanoTime();
		System.out.println("subprocess1 "+(date2-date1)/ten6);
		
		subProcess2();
		final long date3 = System.nanoTime();
		System.out.println("subprocess1 "+(date3-date2)/ten6);
		
		return (date3-date1)/ten6;
		
	}
	
}
