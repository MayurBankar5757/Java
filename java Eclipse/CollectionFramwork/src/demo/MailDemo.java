package demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import entity.LocalDateTime;
import entity.Mail;

public class MailDemo {
	
	public static void main (String [] args) {
		
	//	Comparator<LocalDateTime> strcmp = new Comparator<LocalDateTime>() {

			

//			@Override
//			public int compare(LocalDateTime o1, LocalDateTime o2) {
//				
//				
//
//				if(o1.getDd()> o2.getDd()) {
//					return 1;
//				}
//				else if(o1.getDd() <o2.getDd()) {
//					
//					return -1;
//				}
//				else {
//					
//					if(o1.getMm() > o2.getMm()) {
//						return 1;
//					}
//					else if(o1.getMm()< o2.getMm()) {
//						return -1;
//					}
//					else {
//						
//						if(o1.getYy()> o2.getYy()) {
//							return 1;
//						}
//						else if(o1.getYy()< o2.getYy()) {
//							return -1;
//						}
//					}
//				}
//				
//				return 0;
//			}
//		};

		
		Set <Mail> m = new TreeSet<>(strcmp);
		
	
		
		m.add(new Mail(1234,"aditya","xyz","aaa",20,10,2020));
		m.add(new Mail(1234,"aditya","xyz","aaa",21,11,2020));
		m.add(new Mail(1234,"aditya","xyz","aaa",23,20,2020));
		m.add(new Mail(1234,"aditya","xyz","aaa",20,9,2020));
		m.add(new Mail(1234,"aditya","xyz","aaa",20,2,2020));
		
		for(Mail e :m) {
			
			System.out.println(e);
		}
	}

}
