import java.io.*;
import java.util.Scanner;

class Person{
	String name;
	String gender;
	String address;
	int age;
	
  Person()
     {
	name="";
	gender="";
	address="";

     }
     
  public void readValues()
     {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("Enter Name:");
   	name=sc.nextLine();
   	
   	System.out.println("Enter Gender:M/F:");
   	gender=sc.nextLine();
   	
   	System.out.println("Enter Address:");
   	address=sc.nextLine();
   	
   	System.out.println("Enter Age:");
   	age=Integer.parseInt(sc.nextLine());
   	
      }
      
    public void display()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Name:"+name);
    	System.out.println("Gender:"+gender);
    	System.out.println("Address:"+address);
    	System.out.println("Age:"+age);
    }
}
class Employee extends Person{
	int emp_id;
	String com_name;
	String qualification;
	int salary;
	
	Employee()
     {
     	emp_id="";
	com_name="";
	qualification="";
	salary="";

     }

      
       public void readValues()
      {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("Enter Employee ID:");
   	emp_id=Integer.parseInt(sc.nextLine());
   	
   	System.out.println("Enter Company Name:");
   	com_name=sc.nextLine();
   	
   	System.out.println("Enter Qualification:");
   	qualification=sc.nextLine();
   	
   	System.out.println("Enter Salary:");
   	salary=Integer.parseInt(sc.nextLine());
   	}
   	
   	  
    public void display()
     {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Employee ID:"+emp_id);
    	System.out.println("Company Name:"+qualification);
    	System.out.println("Qualification:"+address);
    	System.out.println("Salary:"+salary);
     }
      
      
}
class Teacher extends Employee{
	
	int teach_id;
	String subject;
	String dept;

   	Teacher()
     {
	subject="";
	dept="";
	
        }
     public void readValues()
      {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("Enter Teacher ID:");
   	teach_id=Integer.parseInt(sc.nextLine());
   	
   	System.out.println("Enter Subject:");
   	subject=sc.nextLine();
   	
   	System.out.println("Enter Department:");
        dept=sc.nextLine();
   	


       }
       
       	  
    public void display()
     {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Teacher ID:"+teach_id);
    	System.out.println("Subject:"+subject);
    	System.out.println("Department:"+dept);
      }
      
      
      
}
class InheritanceDemo{
	public static void main(String[] args) {
	       int a[]=new a[n];
	         int n=0,i,j;
          
		Scanner sc=new Scanner(System.in);
		Teacher t[]=new Teacher[n];
		System.out.println("Enter no.of teachers:");
		for(int i=0;t.length;i++)
		  {
		 	t[].readValues();
		 }
		for(int j=0;t.length;j++)
		 {
		 	System.out.println("No.of teachers:"+Teacher);
			t[].display();
		}
	   	 
	    
	}
}
