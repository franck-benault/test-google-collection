package net.franckbenault.guava.sample;

import java.util.List;

import com.google.common.primitives.Longs;

public class PrimitifLongUtils {

	private static long[] tab =Longs.toArray(Longs.asList(-1, 3, -2, 7, 4));
	
	public static List<Long> initList() {
		return Longs.asList(-1, 3, -2, 7, 4);
	}
	
	public static long[] initTab() {
		return Longs.toArray(Longs.asList(-1, 3, -2, 7, 4));
	}
	
	public static long getMin() {
		return Longs.min(-1, 3, -2, 7, 4);
	}

	public static long getMax() {
		return Longs.max(-1, 3, -2, 7, 4);
	}

	public static boolean contains(long input) {
		return Longs.contains(tab,input);
	}

	
	public static int indexOf(long input) {
		return Longs.indexOf(tab,input);
	}
}
