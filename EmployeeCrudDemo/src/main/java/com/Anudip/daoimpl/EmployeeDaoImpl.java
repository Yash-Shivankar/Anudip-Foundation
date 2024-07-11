package com.Anudip.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Anudip.Entity.Employee;
import com.Anudip.config.HiberUtil;
import com.Anudip.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void addEmp() {
        Session session = HiberUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        
        String fName, lName, phone, address, desig;
        
        System.out.println("Enter your First Name:");
        fName = sc.next();
        
        System.out.println("Enter your Last Name:");
        lName = sc.next();
        
        System.out.println("Enter your Mobile no.:");
        phone = sc.next();
        
        System.out.println("Enter your Address:");
        address = sc.next();
        
        System.out.println("Enter your Designation:");
        desig = sc.next();
        
        Employee emp = new Employee();
        emp.setfName(fName);
        emp.setlName(lName);
        emp.setPhone(phone);
        emp.setAdd(address);
        emp.setDesig(desig);
        
        session.save(emp);
        tx.commit();
        session.close();
        System.out.println("Employee saved");
    }

    @Override
    public void deleteEmp() {
        Session session = HiberUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Employee ID to delete:");
        int empId = sc.nextInt();
        
        Employee emp = session.get(Employee.class, empId);
        if (emp != null) {
            session.delete(emp);
            tx.commit();
            System.out.println("Employee deleted");
        } else {
            System.out.println("Employee not found");
            tx.rollback();
        }
        
        session.close();
    }

    @Override
    public void getEmp() {
        Session session = HiberUtil.getSessionFactory().openSession();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Employee ID to fetch:");
        int empId = sc.nextInt();
        
        Employee emp = session.get(Employee.class, empId);
        if (emp != null) {
            System.out.println("Employee Details:");
            System.out.println("ID: " + emp.getEmpId());
            System.out.println("First Name: " + emp.getfName());
            System.out.println("Last Name: " + emp.getlName());
            System.out.println("Phone: " + emp.getPhone());
            System.out.println("Address: " + emp.getAdd());
            System.out.println("Designation: " + emp.getDesig());
        } else {
            System.out.println("Employee not found");
        }
        
        session.close();
    }

    @Override
    public void updateEmp() {
        Session session = HiberUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Employee ID to update:");
        int empId = sc.nextInt();
        
        Employee emp = session.get(Employee.class, empId);
        if (emp != null) {
            System.out.println("Enter new First Name:");
            emp.setfName(sc.next());
            
            System.out.println("Enter new Last Name:");
            emp.setlName(sc.next());
            
            System.out.println("Enter new Mobile no.:");
            emp.setPhone(sc.next());
            
            System.out.println("Enter new Address:");
            emp.setAdd(sc.next());
            
            System.out.println("Enter new Designation:");
            emp.setDesig(sc.next());
            
            session.update(emp);
            tx.commit();
            System.out.println("Employee updated");
        } else {
            System.out.println("Employee not found");
            tx.rollback();
        }
        
        session.close();
    }
}
