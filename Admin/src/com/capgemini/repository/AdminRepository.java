package com.capgemini.repository;

import java.util.Scanner;

import com.capgemini.service.AdminService;

public class AdminRepository {

	public void addTheater()
	{
	System.out.println("Enter Theater Id: "+setTheaterId());
	System.out.println("Enter Theater Name: "+setTheaterName());
	System.out.println("Enter Theater City: "+setTheaterCity());
	System.out.println("Enter Movies: "+setMovies());
	System.out.println("Enter List of Screens: "+setListOfScreens());
	System.out.println("Enter Manager Name: "+setManagerName());
	System.out.println("Enter Manager Contact: "+setManagerContact());
}
	public void addMovie()
	{
		System.out.println("Enter Theater Id: "+setMovieId());
		System.out.println("Enter Theater Name: "+setMovieName());
		System.out.println("Enter Theater City: "+setMovieGenre());
		System.out.println("Enter Movies: "+setMovieDirector());
		System.out.println("Enter List of Screens: "+setMovieLength());
		System.out.println("Enter Manager Name: "+setLanguages());
		System.out.println("Enter Manager Contact: "+setMovieReleaseDate());
	}
	public void addScreen()
	{
		System.out.println("Enter Theater Id: "+setScreenId());
		System.out.println("Enter Theater Name: "+setTheatreId());
		System.out.println("Enter Theater City: "+setScreenName());
		System.out.println("Enter Movies: "+setShowList());
		System.out.println("Enter List of Screens: "+setMovieEndDate());
		System.out.println("Enter Manager Name: "+setRows());
		System.out.println("Enter Manager Contact: "+setColumns());
	}
	public void addShow()
	{
		System.out.println("Enter Theater Id: "+setShowId());
		System.out.println("Enter Theater Name: "+setShowStartTime());
		System.out.println("Enter Theater City: "+setShowEndTime());
		System.out.println("Enter Movies: "+setSeats());
		System.out.println("Enter List of Screens: "+setShowName());
		System.out.println("Enter Manager Name: "+setMovieName());
		System.out.println("Enter Manager Contact: "+setScreenId());
		System.out.println("Enter Theater Id: "+setTheaterId());
	}
	public Integer deleteTheater()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
			if(id.equals(getTheaterId))
			{
				/*AdminService adminServiceObject=new AdminService();
				adminServiceObject.deleteById(id);*/
				System.out.println("Deleted Theater details successfully.");
			}
			else
				System.out.println("Id is not correct. Please enter another id.");
	}
	public Integer deleteMovie()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
			if(id.equals(getMovieId))
			{
				System.out.println("Deleted Movie details successfully.");
			}
			else
				System.out.println("Id is not correct. Please enter another id.");
	}
	public Integer deleteScreen()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
			if(id.equals(getScreenId))
			{
				System.out.println("Deleted Screen details successfully.");
			}
			else
				System.out.println("Id is not correct. Please enter another id.");
	}
	public Integer deleteShow()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
			if(id.equals(getShowId))
			{
				System.out.println("Deleted Show details successfully.");
			}
			else
				System.out.println("Id is not correct. Please enter another id.");
	}
}
