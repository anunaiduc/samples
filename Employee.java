package praveenAssignment;

public class Employee {
	private String Empid;
	private String Empname;
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public Employee(String empid, String empname) {
		super();
		Empid = empid;
		Empname = empname;
	}
	public Employee(){
		
	}
	
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Empname == null) ? 0 : Empname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Empname == null) {
			if (other.Empname != null)
				return false;
		} else if (!Empname.equals(other.Empname))
			return false;
		return true;
	}

}
