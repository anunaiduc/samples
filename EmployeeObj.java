package praveenAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Employee emp1=new Employee("1","Praveen");
	    Employee emp2=new Employee("2","Vamsi");
	    Employee emp3=new Employee("3","Vinay");
	    Employee emp4=new Employee("4","Balu");
	    Employee emp5=new Employee("5","Imran");

	   // Add them to a List
	    ArrayList <Employee>Employees=new ArrayList<>();
	    Employees.add(emp1);
	    Employees.add(emp2);
	    Employees.add(emp3);
	    Employees.add(emp4);
	    Employees.add(emp5);

	    //Get 3rd element from the list
	    Employees.get(2);

	    //Remove 4 th element from the list
	    Employees.remove(3);

	    //Ensure there are no duplicates
	HashSet<Employee>temp=new HashSet<Employee>(Employees);//convert to hashset to avoid duplicates
	Employees=new ArrayList<Employee>(temp);//Assign it back to original array list.
	
	for(Employee i:Employees){
		System.out.println(i);
	}
		


	}

}
