package net.franckbenault.guava.sample;

import java.util.List;

import com.google.common.primitives.Doubles;

public class PrimitifUtils {

	private static double[] tab =Doubles.toArray(Doubles.asList(1.1, 1.3, 2.2, 2.4, 2.7));
	
	public static List<Double> initListDouble() {
		return Doubles.asList(1.1, 1.3, 2.2, 2.4, 2.7);
	}
	
	public static double[] initTabDouble() {
		return Doubles.toArray(Doubles.asList(1.1, 1.3, 2.2, 2.4, 2.7));
	}
	
	public static double getMin() {
		return Doubles.min(1.1, 1.3, 2.2, 2.4, 2.7);
	}

	public static double getMax() {
		return Doubles.max(1.1, 1.3, 2.2, 2.4, 2.7);
	}

	public static boolean contains(double input) {
		return Doubles.contains(tab,input);
	}

	
	public static int indexOf(double input) {
		return Doubles.indexOf(tab,input);
	}
}
