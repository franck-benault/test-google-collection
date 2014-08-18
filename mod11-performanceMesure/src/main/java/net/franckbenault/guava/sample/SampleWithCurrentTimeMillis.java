package net.franckbenault.guava.sample;

public class SampleWithCurrentTimeMillis {


	
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
		System.out.println("SampleWithCurrentTimeMillis");
		
		final long date1 = System.currentTimeMillis();
		
		subProcess1();
		final long date2 = System.currentTimeMillis();
		System.out.println("subprocess1 "+(date2-date1));
		
		subProcess2();
		final long date3 = System.currentTimeMillis();
		System.out.println("subprocess2 "+(date3-date2));
		
		return date3-date1;
		
	}
	
}
