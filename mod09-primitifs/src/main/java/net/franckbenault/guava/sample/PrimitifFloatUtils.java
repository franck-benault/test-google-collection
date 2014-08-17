package net.franckbenault.guava.sample;

import java.util.List;

import com.google.common.primitives.Floats;

public class PrimitifFloatUtils {

	private static float[] tab =Floats.toArray(Floats.asList(1.1f, 1.3f, 2.2f, 2.4f, 2.7f));
	
	public static List<Float> initList() {
		return Floats.asList(1.1f, 1.3f, 2.2f, 2.4f, 2.7f);
	}
	
	public static float[] initTab() {
		return Floats.toArray(Floats.asList(1.1f, 1.3f, 2.2f, 2.4f, 2.7f));
	}
	
	public static float getMin() {
		return Floats.min(1.1f, 1.3f, 2.2f, 2.4f, 2.7f);
	}

	public static float getMax() {
		return Floats.max(1.1f, 1.3f, 2.2f, 2.4f, 2.7f);
	}

	public static boolean contains(float input) {
		return Floats.contains(tab,input);
	}

	
	public static int indexOf(float input) {
		return Floats.indexOf(tab,input);
	}
}
