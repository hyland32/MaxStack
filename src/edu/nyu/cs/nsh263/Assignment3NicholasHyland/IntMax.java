package edu.nyu.cs.nsh263.Assignment3NicholasHyland;

public class IntMax implements Maximizer<Integer> {

	@Override
	public Integer getMax(Integer t1, Integer t2) {
		if (t1 >= t2)
			return t1;
		else
			return t2;
	}

	@Override
	public Integer getGlobalMin() {
		return Integer.MIN_VALUE;
	}

}