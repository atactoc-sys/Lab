package com.labHibernedDemoProject.HibernetDemo;

import java.util.Scanner;

import com.labHibernedDemoProject.HibernetDemo.daoImpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        StudentDaoImpl studentDaoImplobj = new StudentDaoImpl();
        do 
        {
        	System.out.println("_____________________________________________________");
			System.out.println("PRESS 1 TO ADD STUDENT DATA\nPRESS 2 TO FETCH STUDENT DETAILS\nPRESS 3 TO UPDATE STUDENT DATA\nPRESS 4 TO DELETE STUDENT DATA");
        	System.out.println("_____________________________________________________");
        	
        	Scanner scannerobj = new Scanner(System.in);
        	int a = scannerobj.nextInt();
        	
        	switch (a) 
        	{
			case 1:
				studentDaoImplobj.addStudent();
				break;
			case 2:
				studentDaoImplobj.fetchStudent();
				break;

			default:
				System.out.println("UPS.. WRONG INPUT");
				break;
			}
        	
		} while (a != 3);
    }
}
