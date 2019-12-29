package NTIIT.ProjectOct2019;

public class JavaLec3SwitchStatement {

	public static void main(String[] args) {
		// byte,short,int,char
		int result=90;
		
		switch(result)
		{
		case 90:
			System.out.println("Grade A+");
			break;// break means out of switch statement
		case 80:
			System.out.println("Grade A");
		   break;
		case 70:
			System.out.println("Grade B");
			break;
		default :
			System.out.println("F");//if condition not defined then F
			break;
		}

	}

}
