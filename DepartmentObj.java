package praveenAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DepartmentObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department(1,"IT");
		Department d2=new Department(2,"Sales");
		Department d3=new Department(3,"Marketing");
		Department d4=new Department(4,"HR");
		Department d5=new Department(5,"Accounts");
		
		ArrayList<Department>Departments=new ArrayList<Department>();
		   Departments.add(d1);
		   Departments.add(d2);
		   Departments.add(d3);
		   Departments.add(d4);
		   Departments.add(d5);

		//Convert List to set
		   HashSet<Department>temp=new HashSet<Department>(Departments);
		   
		//Sort set by deptname
		//Department class implements comparable /add umimplemented method compare to
		   Collections.sort(Departments);
		   for(Department i:Departments){
			   System.out.println(i);
		   }
		   
		 //Create a new deparment with same name as one of the departments in the list (dept id can  be different)  
		   Department d6=new Department(6,"Accounts");
		 
		   temp.add(d6);
		 
		 //Prove that dept exists in the dept list (Def of equality is same deptname) 
		 //override equals method by depname  
		   System.out.println("--------------------");
		   for(Department i:Departments){
			   System.out.println(i);
		   } 
	}

}
