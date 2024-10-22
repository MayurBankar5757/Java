package demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import entity.Emp;

public class EmpDemo {
	
	public static void main(String []args) {
		
//		Comparator <Emp> strcmp = new Comparator<Emp>() {
//
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				
//				if(o1.getSalary()>o2.getSalary()) {
//					
//					return 1;
//				}
//				else if(o1.getSalary()<o2.getSalary()) {
//					return -1;
//				}
//				else {
//					o1.getName().compareTo(o2.getName());
//				}
//				return 0;
//			}};
		
		Comparator <Emp> strcmp = new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				
				o1.getDept().compareTo(o2.getDept());
				
				if(o1.getDept().equals(o2.getDept())) {
					
				if(o1.getSalary()<o2.getSalary()) {
					
					return 1;
				}
				else if(o1.getSalary()>o2.getSalary()) {
					return -1;
				}
				else {
					
					o1.getName().compareTo(o2.getName());
					if(o1.getName().equals(o2.getName())) {
						
						if(o1.getEmpId()<o2.getEmpId()) {
							return 1;
						}
						else if(o1.getEmpId()>o2.getEmpId()) {
							return -1;
						}
						
					}
				}
				}
				return 0;
			}};
		
		Set <Emp> e = new TreeSet<>(strcmp);
		
		e.add(new Emp(1,"Suraj",10000,"Tech"));
		e.add(new Emp(2,"Aditya",10000,"Consultant"));
		e.add(new Emp(3,"Rohan",30000,"Management"));
		e.add(new Emp(7,"Rohan",30000,"Management"));

		e.add(new Emp(4,"shubham",4000,"Tech"));
		e.add(new Emp(5,"Onkar",400000,"Consultant"));

		for(Emp s : e) {
			System.out.println(s);
		}
		
	}

}
