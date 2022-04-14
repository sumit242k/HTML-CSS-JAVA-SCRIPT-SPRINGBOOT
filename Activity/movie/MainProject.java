package com.ltts.movieproject.main;

import java.util.List;
import java.util.Scanner;

import com.ltts.movieproject.bo.movielistBo;
import com.ltts.movieproject.model.movielist;

public class MainProject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("1. insert");
System.out.println("2. view");
System.out.println("3. view movie by telugu language");
System.out.println("4. update movie");
System.out.println("5. delete movie");

movielistBo pb = new movielistBo();
int n=s.nextInt();
switch(n) {
case 1:
	System.out.println("INSERT MOVIE INFORMATION");
System.out.println("insert movieID");
int mno = s.nextInt();
System.out.println("insert movie name");
String name = s.next();
System.out.println("insert Hero Name");
String hname = s.next();
System.out.println("insert Heroine Name");
String honame = s.next();
System.out.println("Release date format YYYY-MM-DD");
String msl=s.next();
java.sql.Date date = java.sql.Date.valueOf(msl);
System.out.println("insert Language");
String lang = s.next();
System.out.println("insert movie length");
int leng = s.nextInt();
System.out.println("insert movie type");
String type = s.next();
System.out.println("insert production ID");
int pid = s.nextInt();
movielist p1 = new movielist(mno,name,hname,honame,date,lang,leng,type,pid);
	boolean b=pb.insertmovielist(p1);
	if(b==false) {
	System.out.println("Value inserted....");
}
break;
case 2:
	System.out.println("movies are:");
	List<movielist> li = pb.getAllmovielists();
	for(movielist p2:li) {
		System.out.println(p2);
	}
	break;
case 3:
	System.out.println("telugu movies are:");
	
	}

}
}
