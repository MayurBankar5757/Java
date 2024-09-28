package CollectionFrameworkDemo;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class MailDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<MailDemo> S1=new TreeSet<>();
		//(long mailId, String from, String subject, String body, LocalDateTime rec_time)
		S1.add(new MailDemo(101,"Tejas","Cdac","Important",LocalDateTime.of(2004,1,19,22,34,58)));
		S1.add(new MailDemo(102,"Kunal","Cdac","Important",LocalDateTime.of(2004,1,19,22,24,55)));
		S1.add(new MailDemo(103,"rohit","Cdac","Important",LocalDateTime.of(2004,1,19,22,56,45)));
		S1.add(new MailDemo(104,"jayesh","Cdac","Important",LocalDateTime.of(2004,1,19,22,34,01)));
		
	
	   for(MailDemo m:S1)
	   {
		   System.out.println(m);	   }
	} 

}
