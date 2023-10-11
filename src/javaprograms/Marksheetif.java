package javaprograms;

import java.util.Scanner;

public class Marksheetif {
	
	
			public void getdetails(String studentname,String fathername,String collegename,String coursename,int hindi
		,int english,int science,int math,int computer)
	
{
System.out.println("Student name is "+studentname);
System.out.println("Father name is "+fathername);
System.out.println("College name is "+collegename);
System.out.println("Course name is "+ coursename);

String result="";
int f=0;

if ( hindi<33)
{
		
	result="hindi";
	
	f=1;
 
}
 
else if (english<33)
{
	 result="english";
	 f=1;
	

}

else if (science<33)
{
	result="science";
	f=1;
}


else if (math<33)
{
	result="math";

	f=1;
}


else if (computer<33)
{
	result="computer";
	f=1;
	}

if (f==1)
{
	System.out.println("Failed in subject"+result);
}

else
{
	 float total= hindi+english+science+math+computer;
	 float per=(total*100)/500;
		 String division="";
	 	 if (per>=33&per<45)
			{
				division="third division";
				
			}
	 	else if(per>=45&per<60)
		{
			division="second division";
		}
		else
		{
			
				division="first division";
				
		}
	 	 
			System.out.println("Total marks are "+total);
			System.out.println("Passed with percentage"+per);
}
		
}





	
	public static void main(String[] args) 
	
	{
		Marksheetif ob=new Marksheetif();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter studentname");
		String studentname=sc.next();
		System.out.println("Please enter fathername");
		String fathername=sc.next();
		System.out.println("Please enter collegename");
		String collegename=sc.next();
		System.out.println("Please enter course name");
		String coursename =sc.next();
		System.err.println("Please enter hindimarks");
				int hindi=sc.nextInt();
		System.out.println("Please enter englishmarks");
		int english=sc.nextInt();
		System.out.println("Please enter sciencemarks");
		int science=sc.nextInt();
		System.out.println("Please enter mathmarks");
		int math=sc.nextInt();
		System.out.println("Please enter computermarks");
		int computer=sc.nextInt();
				ob.getdetails(studentname,fathername,collegename,coursename,hindi,english,science,math,computer);
		
		
		
	
	}
	

}
