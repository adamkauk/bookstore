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
		if (input_scanner == null) {
			input_scanner = new Scanner(System.in);
		}
		String s = input_scanner.next();
		return s.charAt(0);
	}

	public static String input(String string) {
		if (input_scanner == null) {
			input_scanner = new Scanner(System.in);
		}
		String s = input_scanner.next();
		return s;
	}

	public static int inputInt(String string) {
		String s = input(string);
		int i = Integer.parseInt(s);
		return i;
	}

	public static String inputString(String string) {
		String s = input(string);
		return s;
	}

	
    //The methods used here can be found in:
    //The IB Computer Science subject guide (first examination in 2010)
    //Appendix A: Core Computer Science for the IB Diploma Program (International Baccalaureate). Published by Express Publishing.
}
