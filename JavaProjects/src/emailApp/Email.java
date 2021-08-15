package emailApp;

import java.util.Scanner;

public class Email {
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 8;
	private String department;
	private int mailboxCapacity = 500;
	private String altEmail;
	private String companySuffix = "mycompany.com";
	
	//Constructor for getting first and last name
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call method that will ask for the department
		this.department = setDepartment();
		
		//Call a method that gives a random password
		this.password = randPassword(defaultPasswordLength);
		
		//Generate Email
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companySuffix;
		
		//debug
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		//System.out.println("Department: " + this.department);
		//System.out.println("Your Password: " + this.password);
		//System.out.println("Your Email: " + this.email);
	}
	
	//Set department
	private String setDepartment()
	{
		System.out.print("Enter the department name: ");
		Scanner in = new Scanner(System.in);
		String departmentchoice = in.next();
		
		//Should add something that checks for valid input
		
		return departmentchoice;
	}
	
	//Generate a random password
	private String randPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVwXYZ0123456789!@#$%";
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	//Set mailbox capacity
	public void setMailCapcaity(int mailboxCapacity)
	{
		this.mailboxCapacity = mailboxCapacity;
	}
	
	//Set alt email address
	public void setAltEmail(String altEmail)
	{
		this.altEmail = altEmail;
	}
	
	//Change password 
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	//Show mailbox capacity, alternate email, and password
	public int getMailboxCapacity() { return this.mailboxCapacity; }
	public String getAltEmail() { return this.altEmail; }
	public String getPassword() { return this.password; }
	
	public String showInfo() 
	{
		return "Display Name: " + this.firstName + " " + this.lastName +
				"\nCompany Email: " + this.email +
				"\nMailbox Capacity: " + this.mailboxCapacity + "mb";
	}
}
