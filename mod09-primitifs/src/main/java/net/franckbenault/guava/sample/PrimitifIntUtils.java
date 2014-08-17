package net.franckbenault.guava.sample;

import java.util.List;

import com.google.common.primitives.Ints;

public class PrimitifIntUtils {

	private static int[] tab =Ints.toArray(Ints.asList(-1, 3, -2, 7, 4));
	
	public static List<Integer> initList() {
		return Ints.asList(-1, 3, -2, 7, 4);
	}
	
	public static int[] initTab() {
		return Ints.toArray(Ints.asList(-1, 3, -2, 7, 4));
	}
	
	public static Integer getMin() {
		return Ints.min(-1, 3, -2, 7, 4);
	}

	public static Integer getMax() {
		return Ints.max(-1, 3, -2, 7, 4);
	}

	public static boolean contains(Integer input) {
		return Ints.contains(tab,input);
	}

	
	public static int indexOf(Integer input) {
		return Ints.indexOf(tab,input);
	}
}
