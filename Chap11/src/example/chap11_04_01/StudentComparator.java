package example.chap11_04_01;

import java.util.Comparator;

import example.chap11_04_01.CompareExample.Student;

public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
	}

}
