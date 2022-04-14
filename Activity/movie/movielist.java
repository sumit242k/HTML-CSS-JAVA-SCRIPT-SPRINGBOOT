package com.ltts.movieproject.model;

import java.sql.Date;

public class movielist {
	private int movieid;
	private String moviename;
	private String heroname;
	private String heroinename;
	private Date releasedate;
	private String language;
	private int length;
	private String movietype;
	private int productionid;
	
	public movielist() {
		super();
	}
	public movielist(int movieid, String moviename,String heroname,String heroinename,
			Date string, String language, int length, String movietype, int productionid) {
		super();
		this.movieid=movieid;
		this.moviename=moviename;
		this.heroname=heroname;
		this.heroinename=heroinename;
		this.releasedate=string;
		this.language=language;
		this.length=length;
		this.movietype=movietype;
		this.productionid=productionid;
	}
	public int getmovieid() {
		return movieid;
	}
	public void setmovieid(int movieid) {
		this.movieid=movieid;
	}
	public String getmoviename() {
		return moviename;
	}
	public void setmoviename(String moviename) {
		this.moviename=moviename;
	}
	public String getheroname() {
		return heroname;
	}
	public void setheroname(String heroname) {
		this.heroname=heroname;
	}
	public String getheroinename() {
		return heroinename;
	}
	public void setheroinename(String heroinename) {
		this.heroinename=heroinename;
	}
	public Date getreleasedate() {
		return releasedate;
	}
	public void setreleasedate(Date releasedate) {
		this.releasedate=releasedate;
	}
	public String getlanguage() {
		return language;
	}
	public void setlanguage(String language) {
		this.language=language;
	}
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length=length;
	}
	public String getmovietype() {
		return movietype;
	}
	public void setmovietype(String movietype) {
		this.movietype=movietype;
	}
	public int getproductionid() {
		return productionid;
	}
	public void setproductionid(int productionid) {
		this.productionid=productionid;
	}
	public String toString() {
		return "movielist [movieid="+movieid+",movie name="+moviename+",hero name="+heroname+",heroine name="+heroinename+
				",release date="+releasedate+",language="+language+",length="+length+",movie type="+movietype+",production id="+productionid+"]";
	}

}
