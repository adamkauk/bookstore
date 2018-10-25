import java.util.Scanner;
/**
 * class InputOutput
 * 
 * Contains input/output methods provided by the IBO for primitive data types and Strings
 * 
 * @authors Kostas Dimitriou & Markos Hatzitaskos 
 * @version 1.0
 */
public abstract class InputOutput
{
	
	static Scanner input_scanner;

	public static void output(String string) {
		System.out.print(string);
	}

	public static char inputChar(String string) {
		// TODO Auto-generated method stub
		if (InputOutput.input_scanner == null) {
			InputOutput.input_scanner = new Scanner(System.in);
		}
		String s = InputOutput.input_scanner.next();
		return s.charAt(0);
	}
	
	
	
    //The methods used here can be found in:
    //The IB Computer Science subject guide (first examination in 2010)
    //Appendix A: Core Computer Science for the IB Diploma Program (International Baccalaureate). Published by Express Publishing.
}