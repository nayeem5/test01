package NTIIT.ProjectOct2019;

public class JavaLec3LogicalOperatorIf {

	public static void main(String[] args) {
		int n=5;
		double m=7;
		// && = AND
		if((n>=4)&& (m>=8)) {
			System.out.println("The Condition is true");
		}
		else {
System.out.println("Condition false");
	}
		//|| = OR
		if ((n>=4) || (m>=9)) {
System.out.println("true");
}
		else {
			System.out.println("false");
		}
}
}
