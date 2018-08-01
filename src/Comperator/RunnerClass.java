package Comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import Test1.Student;

public class RunnerClass {

	public static void main(String[] args) {
		
		
		List<Student1> people = new ArrayList<>();
		people.add(new Student1(1,"Adam"));
		people.add(new Student1(2,"Eve"));
		people.add(new Student1(5,"Mike"));
		people.add(new Student1(4,"Mary"));
		people.add(new Student1(6,"Mary"));
		
		
//		Comparator<Student1> idCom = new IdComperator();
//		Collections.sort(people, idCom);
//		System.out.println(people);
//		
//		Comparator<Student1> nCom = new ReverNameComperator();
//		Collections.sort(people, nCom);
//		System.out.println(people);
//	
//		Comparator<Student1> bothCom = idCom.thenComparing(nCom);
//		Collections.sort(people, bothCom);
//		System.out.println(people);
		
		Comparator<Student1> lCom = Comparator.comparing(s -> s.getId());
		Comparator<Student1> nCom = Comparator.comparing(s -> s.getName());
		
		System.out.println(lCom);

	}

}
