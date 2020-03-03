package com.crud.test;

public class GetMethod {

	public static  <T> T get(Class<T> classTye) {
		T t = null;
		try {
			t = classTye.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	public static void main(String[] args) {
		ClothDto cloth = get(ClothDto.class);
		System.out.println(cloth);
	}

	
}
