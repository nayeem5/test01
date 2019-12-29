package NTIIT.ProjectOct2019;

public class JavaLec3BreakContinue {
/*break uses to "jump out" of a switch statement.
 break statement can also be used to jump out of a loop.
 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  } 
			  System.out.println(i);
			}
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}

	}

}
