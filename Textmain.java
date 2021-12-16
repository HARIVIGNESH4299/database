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
		String username=null;
		long phonenumber=0;
		String email=null;
		String address=null;
		String password=null;
		do {
		System.out.println("enter the user name");
		 username=scan.nextLine();
		 if(!username.matches("[a-zA-Z]{3,}"))
		 {
			 System.out.println("must be provide name in above 3 leters");
		 }
		 if(username.isEmpty())
		 {
			 System.out.println("must be provide name");
		 }
		}while(!username.matches("[a-zA-Z]{3,}"));
		String tempphonenumber=null;
		do {
			System.out.println("enter the phone number");
			tempphonenumber=scan.nextLine();
			if(!tempphonenumber.matches("[0-9]{10}")) 
			{
				System.out.println("must be provide 10 values");
			}
			if(tempphonenumber.isEmpty()) 
			{
			System.out.println("must be provide phone numnber");
			}
		}while(!tempphonenumber.matches("[0-9]{10}"));
		phonenumber=Long.parseLong(tempphonenumber);
		 do {
		System.out.println("enter the email");
		 email=scan.nextLine();
		 if(!email.matches("[a-z]+[a-z0-9]*[@][a-z]+[.][a-z]{2,}"))
		 {
			 System.out.println("must be provide valide emailid");
		 }
		 if(email.isEmpty()) {
			 System.out.println("must be provide email");
		 }
		 }while(!email.matches("[a-z]+[a-z0-9]*[@][a-z]+[.][a-z]{2,}"));
		 do {
		System.out.println("enter the address");
		 address=scan.nextLine();
		 if(address.isEmpty())
		 {
			 System.out.println("must be enter address");
		 }
		 }while(address.isEmpty());
		 do {
		System.out.println("enter the password");
		 password=scan.nextLine();
		 if(!password.matches("[A-Z]+[a-z]+[@][0-9]+"))
				 {
			 System.out.println("must be provide 8 characters and use some special characters for safty purpose");
				 }
		 if(password.isEmpty())
		 {
			 System.out.println("must be provide password");
		 }
		 }while(!password.matches("[A-Z]+[a-z]+[@][0-9]+"));

		User user=new User(username,phonenumber,email,address,password);
		Userdao.insert(user);
		case 2:
			user=new User();
			System.out.println("login");
			System.out.println("\nenter the register emailid");	
			 String emailid=scan.nextLine();
			 System.out.println("\nenter the currect password");
			 String password1=scan.nextLine();
			 currentUser=new Userdao();
			 user=currentUser.validateUser(emailid,password1);
				if(user!=null)
				{
				System.out.println("Welcome "+user.getUsername());
				} 
				else
				{
					System.out.println("invalid entry");
				}
		}
	}
}

