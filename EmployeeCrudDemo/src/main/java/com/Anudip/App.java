package com.Anudip;

import java.util.Scanner;

import com.Anudip.daoimpl.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	char a;
       EmployeeDaoImpl daoimpl = new EmployeeDaoImpl();
    	do {
        
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Employee Registration");
        	System.out.println("1. Add Employee \n2. Display Employee \n3. Update Employee \n4. Delete Employee \n");
        	System.out.println("Enter your Choice:");
        	int ch = sc.nextInt();
        	switch(ch) {
        	case 1 :
        	{
        		daoimpl.addEmp();
        		break;
        	}
        	case 2 :
        	{
        		daoimpl.getEmp();
        		break;
        	}
        	case 3 :
        	{
        		daoimpl.updateEmp();
        		break;
        	}
        	case 4 :
        	{
        		daoimpl.deleteEmp();
        		break;
        	}
        	case 5 :
        	{
        		System.exit(0);
        		break;
        	}
        	}
        	System.out.println("Do you want to continue ?");
        	a = sc.next().charAt(0);
        		
        }while(a == 'Y' || a == 'y');
        System.out.println("Thanks");
    	
    	}
    
    }

