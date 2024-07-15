package model;

import java.time.LocalDate;

public class Issue {
	private int isid;
	private int bid;
	private int sid;
	private LocalDate isDate, expRetDate, actRetDate;
	private int fine  = 0;
	
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public Issue(int bid, int sid) {
		super();
		this.bid = bid;
		this.sid = sid;
		this.isDate = LocalDate.now();
		this.expRetDate = LocalDate.now().plusDays(7);
	}
	public Issue(int isid, int bid, int sid) {
		super();
		this.isid = isid;
		this.bid = bid;
		this.sid = sid;
		this.isDate = LocalDate.now();
		this.expRetDate = LocalDate.now().plusDays(7);
	}
	
	
	public int getIsid() {
		return isid;
	}

	public void setIsid(int isid) {
		this.isid = isid;
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public LocalDate getIsDate() {
		return isDate;
	}
	public void setIsDate(LocalDate isDate) {
		this.isDate = isDate;
	}
	public LocalDate getExpRetDate() {
		return expRetDate;
	}
	public void setExpRetDate(LocalDate expRetDate) {
		this.expRetDate = expRetDate;
	}
	public LocalDate getActRetDate() {
		return actRetDate;
	}
	public void setActRetDate(LocalDate actRetDate) {
		this.actRetDate = actRetDate;
	}
	@Override
	public String toString() {
		return "Issue [isid=" + isid + ", bid=" + bid + ", sid=" + sid + ", isDate=" + isDate + ", expRetDate="
				+ expRetDate + ", actRetDate=" + actRetDate + "]";
	}
	
	
	

}
