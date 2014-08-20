package net.franckbenault.guava.sample;


import com.google.common.primitives.UnsignedInts;

public class PrimitifUnsignedIntUtils {


	
	public static Integer getMin() {
		return UnsignedInts.min(-1, 3, -2, 7, 4);
	}

	public static Integer getMax() {
		return UnsignedInts.max(-1, 3, -2, 7, 4);
	}

}
