package net.franckbenault.guava.sample;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class SetUsage {

	
	private Set<Integer> mult2 = new HashSet<>();
	private Set<Integer> mult3 = new HashSet<>();
	
	
	public SetUsage() {
		
		mult2.add(2);
		mult2.add(4);
		mult2.add(6);
		mult2.add(8);
		mult2.add(10);
		mult2.add(12);
		
		mult3.add(3);
		mult3.add(6);
		mult3.add(9);
		mult3.add(12);
	}
	
	public Set<Integer> getMult6View() {
		
		return Sets.intersection(mult2, mult3);
	}
	
	public Set<Integer> getMult2Or3View() {
		
		return Sets.union(mult2, mult3);
	}
}
