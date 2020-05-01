package com.capgemini.dao;

import java.util.Scanner;

import com.capgemini.repository.AdminRepository;

public class AdminDao {
	Scanner sc=new Scanner(System.in);
	int choice;
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Menu------------");
		System.out.println("1.Theater");
		System.out.println("2.Movie");
		System.out.println("3.Screen");
		System.out.println("4.Show");
		System.out.print("Enter your choice:-");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			
		{
			System.out.println("1.Add theater details");
			System.out.println("2.Delete theater details");
			System.out.println("Enter your choice:-");
			int choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.addTheater();
			}
			System.out.println("Added Theater details successfully.");
			break;
			
			case 2:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.deleteTheater();
			}
			break;
			}
			break;
		}
		case 2:
		{
			
			System.out.println("1.Add Movie details");
			System.out.println("2.Delete Movie details");
			System.out.println("Enter your choice:-");
			int choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.addMovie();
			}
			System.out.println("Added Movie details successfully.");
			break;
			
			case 2:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.deleteMovie();
			}
			break;
			}
			break;
		}
		case 3:
		{
			
			System.out.println("1.Add Screen details");
			System.out.println("2.Delete Screen details");
			System.out.println("Enter your choice:-");
			int choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.addScreen();
			}
			System.out.println("Added Screen details successfully.");
			break;
			
			case 2:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.deleteScreen();
			}
			break;
			}
			break;
		}
		case 4:
{
			
			System.out.println("1.Add Show details");
			System.out.println("2.Delete Show details");
			System.out.println("Enter your choice:-");
			int choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.addShow();
			}
			System.out.println("Added Show details successfully.");
			break;
			
			case 2:
			{
				AdminRepository adminRepositoryObject=new AdminRepository();
				adminRepositoryObject.deleteShow();
			}
			break;
			}
			break;
		}	
	}
	}
}
