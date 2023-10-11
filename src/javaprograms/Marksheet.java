package javaprograms;

import java.util.Scanner;

public class Marksheet
{
	
	public void getdetails(String studentname,String fathername,String collegename,int rollno,int hindimarks
			,int englishmarks,int sciencemarks,int mathmarks,int computer)
	
	{
System.out.println("Student name is "+studentname);
System.out.println("Father name is "+fathername);
System.out.println("College name is "+collegename);
System.out.println("Roll no is "+rollno);
System.out.println("Hindi marks "+hindimarks);
System.out.println("English marks "+englishmarks);
System.out.println("Sciencemarks "+sciencemarks);
System.out.println("Math marks "+mathmarks);
System.out.println("Computer marks "+computer);

float total=hindimarks+englishmarks+sciencemarks+mathmarks+computer;
System.out.println("Total marks are "+total);
float percentage=total/500*100;
System.out.println("Percentage is "+percentage);

	}
	
	
	
	
	public static void main(String[] args) {
		
		Marksheet ob=new Marksheet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter studentname");
		String studentname=sc.next();
		System.out.println("Please enter fathername");
		String fathername=sc.next();
		System.out.println("Please enter collegename");
		String collegename=sc.next();
		System.out.println("Please enter rollno");
		int rollno=sc.nextInt();
		System.err.println("Please enter hindimarks");
		int hindimarks=sc.nextInt();
		System.out.println("Please enter englishmarks");
		int englishmarks=sc.nextInt();
		System.out.println("Please enter sciencemarks");
		int sciencemarks=sc.nextInt();
		System.out.println("Please enter mathmarks");
		int mathmarks=sc.nextInt();
		System.out.println("Please enter computermarks");
		int computermarks=sc.nextInt();
				ob.getdetails(studentname,fathername,collegename,rollno,hindimarks,englishmarks,sciencemarks,mathmarks,computermarks);
		
		
		
	}
	

		
	
	

}

