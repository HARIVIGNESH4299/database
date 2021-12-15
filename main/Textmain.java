package com.pizzahut.main;

import java.util.Scanner;

import com.pizzahut.dao.Userdao;
import com.pizzahut.model.User;

public class Textmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userdao udao=new Userdao();
		Scanner scan=new Scanner(System.in);
		System.out.println("\n1.Register\n2.Login\nEnter your chioce");
		int choice=Integer.parseInt(scan.nextLine());
		Userdao currentUser=null;
		switch(choice) {
		case 1:
		String name=null;
		System.out.println("enter the user name");
		String username=scan.nextLine();
		System.out.println("enter the phone number");
		Long phonenumber=Long.parseLong(scan.nextLine());
		System.out.println("enter the email");
		String email=scan.nextLine();
		System.out.println("enter the address");
		String address=scan.nextLine();
		System.out.println("enter the password");
		String password=scan.nextLine();
		User user=new User(username,phonenumber,email,address,password);
		Userdao.insert(user);
		case 2:
			user=new User();
			System.out.println("login");
			System.out.println("\nenter the register emailid");
			 String emailid=scan.nextLine();
			 currentUser=new Userdao();
			 user=currentUser.validateUser(emailid);
				if(currentUser!=null)
				{
				System.out.println("Welcome "+user.getUsername());
				} 
		}
	}
}

