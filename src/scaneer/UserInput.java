package scaneer;
import java.util.Scanner;
public class UserInput {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
	
	System.out.println("Enter Employee Name");
    
	String empName = userInput.nextLine();
	System.out.println("your Name is " + empName);
	
    System.out.println("Enter your Employee ID");
    
		int empId = userInput.nextInt();
	System.out.println("Your Employee Id is "+ empId);
	userInput.nextLine();
	
	System.out.println("Enter Your Email ID");
	String empEmail = userInput.nextLine();
	System.out.println("Your Email Id Is "+ empEmail);
	
	System.out.println("Enter Your Mob_Number");
	long empPhonenum = userInput.nextLong();
	System.out.println("Your Mobile Number is "+ empPhonenum);
	
	System.out.println("Enter Your Salary");
	
    double empSalary = userInput.nextDouble();
    System.out.println("Your Salary is "+empSalary);
    userInput.nextLine();
	
    System.out.println("Enter Your Gender");
     String empGender = userInput.nextLine();
     System.out.println("Your gender is "+empGender);
     
     System.out.println("Thankyou for Your Support");
	
	
	
		
		
	}
	

}
