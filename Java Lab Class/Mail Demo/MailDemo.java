package CollectionFrameworkDemo;

import java.sql.Date;
import java.time.LocalDateTime;

public class MailDemo implements Comparable<MailDemo> {

	private long MailId;
	private String from;
	private String subject;
	private String body;
	private LocalDateTime  rec_time;
	public MailDemo(long mailId, String from, String subject, String body, LocalDateTime rec_time) {
		MailId = mailId;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time = rec_time;
	}
	@Override
	public String toString() {
		return "\nMailId=" + MailId + "\tFrom=" + from + "\tSubject=" + subject + "\tBody=" + body
				+ "\tRec_time=" + rec_time + "]";
	}
	
	public int compareTo(MailDemo m) {
		
		return m.rec_time.compareTo(this.rec_time);
		
	}
	
	
}
