package praveenAssignment;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	What is difference between Integer and int.
		//How do you convert Integer into int and Long into long and Boolean from boolean.
		Integer integerObject = new Integer(10);
		int intValue = integerObject.intValue();
		System.out.println(intValue);
		
		Long longObject = new Long(20);
		long longValue = longObject.longValue();
		System.out.println(longValue);
		
		Boolean booleanObject = new Boolean(true);
		boolean booleanValue = booleanObject.booleanValue();
		System.out.println(booleanValue);
	}

}
