package scaneer;
import java.util.Scanner;
public class UserInput_2 {
	
	public static void main(String[] args) {
		
		int a,b,c,d,e,f;
		double g;
		
		
		@SuppressWarnings("resource")
		Scanner UserInput_2 = new Scanner(System.in);
		System.out.println("Enter the Student Name");
		String studentname = UserInput_2.nextLine();
		System.out.println("Student Name is "+studentname);
		System.out.println("Enter the Student ID");
		int studentid = UserInput_2.nextInt();
		System.out.println("Student Id is "+ studentid);
		System.out.println("Enter Mark_1");
		int mark1 =UserInput_2.nextInt();
        System.out.println("Enter Mark_2");
        int mark2 = UserInput_2.nextInt();
        System.out.println("Enter Mark_3");
        int mark3 = UserInput_2.nextInt();
        System.out.println("Enter Mark_4");
        int mark4 = UserInput_2.nextInt();
        System.out.println("Enter Mark_5");
        int mark5 = UserInput_2.nextInt();
        
        a = mark1;
        b = mark2;
        c = mark3;
        d = mark4;
        e = mark5;
        f = a+b+c+d+e;
        g = (f / 500.0)*100;
       
        System.out.println("Total Mark is "+f);
        System.out.println("Total Avarage Mark is "+g);
        
        
        
        
	
		
	}

}
