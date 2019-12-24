package com.basic.app;

import java.io.Serializable;

public class Runner {
	
	public static void main(String[] args) {
	CollageDao dao = new CollageDao();
	
	// create collage which has to saved
//	CollageDto vrindhavan = new CollageDto();
//	vrindhavan.setName("Vrindhavan");
//	vrindhavan.setNoOfStudenrts(1000);
//	vrindhavan.setNoOfTeachers(50);
//	vrindhavan.setAddress("Btm , bangalore , KA");
		
	// now go to hibernate.cfg.xml
	// do the mapping in xml
	// then save 
	
	//int pk = (Integer)dao.saveCollage(vrindhavan);
//	Serializable pk = dao.saveCollage(vrindhavan);
//	Integer i = (Integer)pk;
//	int ii = i;
//	System.out.println(ii);
	
	CollageDto mit = new CollageDto();
	mit.setId(2);
	mit.setName("Mit");
	mit.setNoOfStudenrts(9000);
	
	dao.updateCollage(mit);
	
	
	}

}
