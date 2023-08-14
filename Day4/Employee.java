/**
 * a program for Divison operator
 * @author prashanth
 * @since 02/08/2023
 */

package com.techzenure.java.arrays;

	class Employee 
	{
		int empno;
		String name;
		float sal;
		
		void setDetails(){
			name = "Praveen";
			sal = 2750.75f;
		}

		void getDetails(){
			System.out.println(empno + " | " + name + " | " + sal);
		}	
	} 

	class ObjectTest
	{
		public static void main(String[] args) 
		{
			
			Employee emp = new Employee();
	
			System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);
			emp.getDetails();
			emp.empno = 101;
			emp.name = "Sanjay";
			emp.sal = 2500f;
			emp.getDetails();

			emp.setDetails();
			emp.getDetails();
		}
	

	}


