package com.student;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	
	public class EmployeeUploader 
	{
		Scanner s = new Scanner(System.in);  
		// method to store the Employee data in database
				public void storeEmployeeDetails() 
				{
					Scanner s1 = new Scanner(System.in);
					Scanner s2 = new Scanner(System.in);
					Employee emp = new Employee();
					try 
					{
						Connection conn = getConnect();
						// prepare sql statement
						String sql = "insert into employee(Employee_Id,Employee_Name,Employee_Address,Employee_Salary,Employee_Contact_No,Department_Id) values(?,?,?,?,?,?)";
						PreparedStatement pstm = conn.prepareStatement(sql);
						// taking input from user
						System.out.print("Enter Employee ID: ");
						pstm.setInt(1, s.nextInt());
						System.out.print("Enter Employee Name: ");
						pstm.setString(2, s.next());
						System.out.print("Enter Employee Address: ");
						pstm.setString(3, s1.next());
						System.out.print("Enter Employee Salary: ");
						pstm.setDouble(4, s.nextDouble());
						System.out.print("Enter Employee Contact No: ");
						pstm.setLong(5, s.nextLong());
						System.out.print("Enter Department ID: ");
						pstm.setInt(6, s2.nextInt());
						// execute the statement
						int x = pstm.executeUpdate();
						// condition
						if(x == 1) {
							System.out.println("Record inserted succesfully.");
						}
						if(emp.getEmployee_Salary()< 1000) 
						{
							System.out.println("Invalid Empolyee Data!");
						}
						// close object
						conn.close();
					} catch (Exception e) 
					{
						System.out.println("Duplicate entry!");
					}
					
				}
				// method to store the Department data in database
				public void storeDepartmentDetails() 
				{
					try 
					{
						Connection conn = getConnect();
						// prepare sql statement
						String sql = "insert into department(Department_ID,Department_Name,Department_Head,Department_Description) values(?,?,?,?)";
						PreparedStatement pstm = conn.prepareStatement(sql);
						// taking input from user
						System.out.print("Enter Department ID: ");
						pstm.setInt(1, s.nextInt());
						System.out.print("Enter Department Name: ");
						pstm.setString(2, s.next());
						System.out.print("Enter Department Head: ");
						pstm.setString(3, s.next());
						System.out.print("Enter Department Description: ");
						pstm.setString(4, s.next());
						// execute the statement
						int x = pstm.executeUpdate();
						if(x == 1) 
						{
							System.out.println("Record inserted succesfully.");
						}
						conn.close();
					} catch (Exception e) 
					{
						System.out.println("Department ID does not exist!");
					}
				}
				public void calculatePF() throws SQLException
				{
					Connection conn = getConnect();
					Statement stm = conn.createStatement();
					System.out.print("Enter Employee ID: ");
					int id = s.nextInt();
					// declare the sql statement
					ResultSet rs = stm.executeQuery("SELECT * FROM employee where Employee_Id="+id);
					// traversing through database
					while(rs.next()) 
					{
						// logic & condition to calculate pf
						if(rs.getDouble(4)>1000 && rs.getDouble(4)<10000)
						{
							System.out.println("Employee PF amount is: "+rs.getDouble(4)*5/100);
						}
						else if(rs.getDouble(4)>10000 && rs.getDouble(4)<100000)
						{
							System.out.println("Employee PF amount is: "+rs.getDouble(4)*6/100);
						}
						else if(rs.getDouble(4)>100000)
						{
							System.out.println("Employee PF amount is: "+rs.getDouble(4)*7/100);
						}
					}
					rs.close();
					conn.close();
				}
				// method to fetch the data by Employee ID
				public void retrieveEmployeeDetails() throws SQLException 
				{
					System.out.print("Enter Emlpyee ID:");
					int id = s.nextInt();
					String sql = "SELECT Employee_Id,Employee_Name,Employee_Contact_No,Employee_Address,Department_Name,Department_Head from department left join employee on department.Department_Id = employee.Department_Id where Employee_Id="+id;
					Connection conn = getConnect();
					Statement stmt = conn.createStatement();
					// execute the sql query
					ResultSet rs = stmt.executeQuery(sql);
					// traversing through database
					if(rs.next()) 
					{
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
					} else 
					{
						System.out.println("Employee Id not Present.");
					}
					// close objects
					rs.close();
					conn.close();
				}
				
			
	public Connection getConnect() 
	{		
			try 
			{
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/daku","root","root");
				
				return conn;
			// catch block	
			} catch (Exception e) {
				System.out.println(e);
			}
			return null;
		}	


				
		
		private static Scanner s = new Scanner(System.in);  
		public static void main(String[] args) 
		{
			try 
			{
				EmployeeUploader emp = new EmployeeUploader();
				int choice;
				do 
				{
					System.out.println("------Menu------");
					System.out.println(" 1.Department");
					System.out.println(" 2.Employee");
					System.out.println(" 3.Retrive Data");
					System.out.println(" 4.Calculate PF");
					System.out.println(" 5.Exit");
					System.out.print(" Enter your choice: ");
					choice = s.nextInt();
					switch(choice) 
					{
					case 1: 
						emp.storeDepartmentDetails();
					
						break;

					case 2:
					
						emp.storeEmployeeDetails();
					
						break;
					
					case 3:
						
						emp.retrieveEmployeeDetails();
						
						break;
					
					case 4:
						
						emp.calculatePF();
						
						break;
					// 5. Exit	
					case 5:
						System.out.println("Thank You.");
						
					default:
						break;
					}
				} while (choice!=5);
				
					
			} catch (Exception e) 
			{
				System.out.println("Invalid entry!");
			}
		}
	}
		
		
		
		
