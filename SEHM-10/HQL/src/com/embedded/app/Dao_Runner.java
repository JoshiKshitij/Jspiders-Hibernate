package com.embedded.app;

public class Dao_Runner {
	
	public static void main(String[] args) {
		CartoonDao dao = new CartoonDao();
	//	CartoonDto cartoonDto = dao.getCartoonByName("A");
	//	System.out.println(cartoonDto);
	
	System.out.println(dao.getCartoonNamebyId(2));
	}
}

