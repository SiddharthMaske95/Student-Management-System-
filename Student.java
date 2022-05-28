import java.util.*;




public class Student 
{
 private int studentid;
 private String studentname;
 private String studentaddress;
 private String studentmob;
 Student(int studentid , String studentname ,String studentaddress, String studentmob)
 {
	this.studentid=studentid;
	this.studentname=studentname;
	this.studentaddress=studentaddress;
	this.studentmob=studentmob;
 }
public int getStudentid() 
{
	return studentid;
}
public void setStudentid(int studentid) 
{
	this.studentid = studentid;
}
public String getStudentname()
{
	return studentname;
}
public void setStudentname(String studentname)
{
	this.studentname = studentname;
}
public String getStudentaddress() {
	return studentaddress;
}
public void setStudentaddress(String studentaddress)
{
	this.studentaddress = studentaddress;
}


public String getStudentmob() {
	return studentmob;
}
public void setStudentmob(String studentmob) {
	this.studentmob = studentmob;
}
@Override
public String toString() {
	 System.out.println("********");
	return "Students Data"
			+ " \nStudent Id=" + studentid + ", "
					+ "\nStudent Name=" + studentname + ", "
							+ "\nStudent Address=" + studentaddress
			+ ", \nStudent Mob=" + studentmob + "";
	
}

}
 class operation
 {
	 public static void main(String[] args)
	 {
		 System.out.println("\nWellcome to Student Management Portal ");
		 List<Student> std=new ArrayList<Student>();
		 Scanner s=new Scanner(System.in);
		 Scanner ss=new Scanner(System.in);
		 int ch;
		 do
		 {
		    System.out.println("\n1. Insert data ");
		    System.out.println("2. Display data");
		    System.out.println("3. Search data");
		    System.out.println("4. Delete data");
		    System.out.println("5. Update Data");
		    System.out.println("6. Exit");
		    System.out.println("\nplease enter your choice ");
		    ch=s.nextInt();
		 
		 switch(ch)
		 {
		 case 1 :
			 System.out.println("***** Insert data *****");
			 System.out.println("\nEnter Student Id");
			 int studentid=s.nextInt();
			 System.out.println("\nEmter Student Name ");
			 String studentname=ss.nextLine();
			 System.out.println("\nEnter Student Address ");
			 String studentaddress=ss.nextLine();
			 System.out.println("\nEnter Student Mob ");
			 String studentmob=ss.nextLine();
			 std.add(new Student(studentid,studentname,studentaddress,studentmob));
			 
			 break;
		 case 2:
			 System.out.println("***** Display All Data *****");
			  Iterator<Student> u=std.iterator();
			  while(u.hasNext())
			  {
				  Student st=u.next();
				  System.out.println(st);
			  }
			  System.out.println("********");
			 break;
		 case 3:
			  boolean found=false;
			  System.out.println("***** Search Data *****");
			  System.out.println("\nEnter Student Id to Search");
				 studentid=s.nextInt();
			    u=std.iterator();
			  while(u.hasNext())
			  {
				  Student st=u.next();
				  if(st.getStudentid()==studentid )
				  {
				  System.out.println(st);
				  found=true; 
				  }
			  }
			  if(!found)
			  {
				  System.out.println("Record Not Found");
			  }
			 
		    break;
		 case 4:
			 System.out.println("***** Delete data *****");
			  found=false;
			  
			  System.out.println("\nEnter Student Id to Delete");
				 studentid=s.nextInt();
			    u=std.iterator();
			  while(u.hasNext())
			  {
				  Student st=u.next();
				  if(st.getStudentid()==studentid )
				  {
				 u.remove();
				  found=true; 
				  }
			  }
			  if(!found)
			  {
				  System.out.println("Record Not Found");
			  }
			  else
			  {
				  System.out.println("Record Deleted Successfully");
			  }
			  System.out.println("********");
			 break;
			 
		 case 5:
			 System.out.println("***** Update data *****");
			 found=false;
			  
			  System.out.println("\nEnter Student Id to Update ");
				 studentid=s.nextInt();
			    ListIterator<Student>li=std.listIterator();
			  while(li.hasNext())
			  {
				  Student st=li.next();
				  if(st.getStudentid()==studentid )
				  {
					  System.out.println("\nEnter Student Id");
						  studentid=s.nextInt();
						 System.out.println("\nEmter Student Name ");
						 studentname=ss.nextLine();
						 System.out.println("\nEnter Student Address ");
						 studentaddress=ss.nextLine();
						 System.out.println("\nEnter Student Mob ");
						  studentmob=ss.nextLine();
						 li.set(new Student(studentid,studentname,studentaddress,studentmob));
						 
				  found=true; 
				  }
			  }
			  if(!found)
			  {
				  System.out.println("Record Not Found");
			  }
			  else
			  {
				  System.out.println("Record is Updated Successfully");
			  }
			  System.out.println("********");
			 break;
			 
		 case 6:
			 System.out.println("***** Exit *****");
			 break;
		 }
		 }while(ch!=0);
	 }
 }




