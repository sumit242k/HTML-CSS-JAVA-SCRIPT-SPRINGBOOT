package com.ltts.movieproject.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.movieproject.model.movielist;

public class movielistBo {
	public boolean insertmovielist(movielist p) throws Exception{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","sachitdahiya@1");
		Statement s=c.createStatement();
		boolean b=s.execute("insert into movielist values("+p.getmovieid()+",'"+p.getmoviename()+"','"+p.getheroname()+"','"+p.getheroinename()+"','"+p.getreleasedate()+"','"+p.getlanguage()+"',"+p.getlength()+",'"+p.getmovietype()+"',"+p.getproductionid()+")");
	c.close();
	return b;
	}
	public List<movielist> getAllmovielists() throws Exception{
		List<movielist> al= new ArrayList<movielist>();
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","sachitdahiya@1");
		PreparedStatement ps=c.prepareStatement("select * from movielist");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			al.add(new movielist(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9)));
		}
		c.close();
		return al;
	}
public List<movielist> getmoviebylang(String lang)throws Exception{
	List<movielist> li=new ArrayList<movielist>();
	return li;
}
public boolean updatemovielist(movielist p)throws Exception{
	return false;
}
public boolean deletemovielist(int movieid)throws Exception{
	return false;
}
public movielist getmovielistbyId(int movieid)throws Exception{
	movielist p=new movielist();
	return p;
}
}
