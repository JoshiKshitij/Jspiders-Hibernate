package org.spiders;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dao.FacultyDao;
import org.spiders.dto.FacultyDto;
import org.spiders.dto.StudentDto;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		
		FacultyDto mrParmod = new FacultyDto();
		mrParmod.setAge(46);
		mrParmod.setName("parmod sharma");
		mrParmod.setTeaching("science");
		mrParmod.setDegree("B.sc in medical science");
		
		FacultyDto mrShan = new FacultyDto();
		mrShan.setAge(34);
		mrShan.setName("shan ahuja");
		mrShan.setTeaching("maths");
		mrShan.setDegree("B.sc in Maths");
		
		StudentDto raju = new StudentDto();
		raju.setAge(14);
		raju.setName("raju kapil");
		raju.setStudingIn("class 9");
		
		StudentDto kiran = new StudentDto();
		kiran.setAge(16);
		kiran.setName("kiran surya");
		kiran.setStudingIn("class 11");
		
		StudentDto dhram = new StudentDto();
		dhram.setAge(15);
		dhram.setName("dhram veer");
		dhram.setStudingIn("class 10");
		
		
		List<StudentDto> studentListForParmod = new ArrayList<StudentDto>();
		studentListForParmod.add(raju);
		studentListForParmod.add(kiran);
		
		
		List<StudentDto> studentListForShan = new ArrayList<StudentDto>();
		studentListForShan.add(raju);
		studentListForShan.add(dhram);
		
		List<FacultyDto> facultyListForRaju = new ArrayList<FacultyDto>();
		facultyListForRaju.add(mrParmod);
		facultyListForRaju.add(mrShan);
		
		
		List facultyListForKiran = new ArrayList();
		facultyListForKiran.add(mrParmod);
		
		List facultyListForDhram = new ArrayList();
		facultyListForDhram.add(mrShan);
		
		
		mrParmod.setListOfStudents(studentListForParmod);
		mrShan.setListOfStudents(studentListForShan);
		
		raju.setListOfFaculties(facultyListForRaju);
		kiran.setListOfFaculties(facultyListForKiran);
		dhram.setListOfFaculties(facultyListForDhram);
		
		//---------------hibernate logic--------------------------------[
		//create two list for save method
		
		List listOfAllFaculty = new ArrayList();
		listOfAllFaculty.add(mrParmod);
		listOfAllFaculty.add(mrShan);
		
		
		List listOfAllStudent = new ArrayList();
		
		listOfAllStudent.add(raju);
		listOfAllStudent.add(kiran);
		listOfAllStudent.add(dhram);
		
		
		FacultyDao dao = new FacultyDao();
		dao.saveFacultyandStudents(listOfAllFaculty, listOfAllStudent);
	}
}
