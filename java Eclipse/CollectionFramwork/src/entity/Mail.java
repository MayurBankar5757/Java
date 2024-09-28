package entity;

public class Mail implements Comparable<Mail> {
	
	private long mailId;
	private String from;
	private String subject;
	private String body;
	private LocalDateTime rec_time;
	
	public Mail(long mailId, String from, String subject, String body,int dd,int mm, int yy) {
		super();
		this.mailId = mailId;
		this.from = from;
		this.subject = subject;
		this.body = body;
		rec_time = new LocalDateTime(dd,mm,yy);
	}
	
	

	@Override
	public String toString() {
		return "Mail [mailId=" + mailId + ", from=" + from + ", subject=" + subject + ", body=" + body + ", rec_time="
				+ rec_time +  "]";
	}
	



@Override
public int compareTo(Mail o) {
	
	return o.rec_time.compareTo(this.rec_time);

}
	
	

}
