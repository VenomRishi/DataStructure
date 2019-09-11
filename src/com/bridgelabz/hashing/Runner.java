package com.bridgelabz.hashing;

public class Runner {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new Map<Integer, Integer>();
		map.add(77, 77);
		map.add(44, 44);
		map.add(99, 99);
		map.add(12, 12);
		map.add(34, 34);
		map.add(17, 17);
		map.add(96, 96);
		map.add(25, 25);
		
		System.out.println(map.size());
		System.out.println(map.remove(99));
		System.out.println(map.remove(12));
		System.out.println(map.size());
		//System.out.println(map.isEmpty());
		map.show();
	}
}
