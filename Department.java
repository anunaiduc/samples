package praveenAssignment;

public class Department implements Comparable {
	private int depid;
	private String depname;
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public Department(int depid, String depname) {
		super();
		this.depid = depid;
		this.depname = depname;
	}
	public Department(){
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depname == null) ? 0 : depname.hashCode());
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
		Department other = (Department) obj;
		if (depname == null) {
			if (other.depname != null)
				return false;
		} else if (!depname.equals(other.depname))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		String thatDepartment = ((Department)o).getDepname();
		return this.getDepname().compareTo(thatDepartment);
		
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + "]";
	}
	

}
