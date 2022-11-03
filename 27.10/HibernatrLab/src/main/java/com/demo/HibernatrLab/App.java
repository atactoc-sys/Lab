package com.demo.HibernatrLab;

import com.demo.HibernatrLab.daoimpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	// created a StudentDaoImpl class object and called the method
        StudentDaoImpl std = new StudentDaoImpl();
        std.addStudent();
    }
}
