package com.sus.collection;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>
{
 public double rating;
 public int year;
 public String name;
 
 
	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}


	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 	this.year-o.year;
		
	}
	
	
	public Movie(String nm,double rt,int yr)
	{
		this.name=nm;
		this.rating=rt;
		this.year=yr;
	}
	}

public class Comparablemain  {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("smita childhood", 8.3, 2017));
		movieList.add(new Movie("jyo childhood", 8.7, 2016));
		movieList.add(new Movie("lipy childhood", 8.8, 1980));
		movieList.add(new Movie("gulu childhood", 8.4, 1983));
		
		Collections.sort(movieList);
		System.out.println("movie after sorting");
		for(Movie m:movieList)
		{
			System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}

	}

}
