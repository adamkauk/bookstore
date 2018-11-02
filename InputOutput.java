

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

	public static void output(String string) {
		System.out.println(string);
	}
	
	
	static String input(String str){
		String inputline = "";
		try {
		inputline = (new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine();}
		catch(Exception e)
		{String err = e.toString();
		 System.out.println(err);
		 inputline = "";
		}
		return inputline;
	}
	
	static int inputInt(String string) {
		int input = 0;
		try {
			input = Integer.valueOf(input(string).trim()).intValue();}
		catch(Exception e) {input=0;}
		return input;		
	}
	
	static char inputChar(String string) {
		char input = (char)0;
		try {
			input = input(string).charAt(0);}
		catch(Exception e) {
			input = (char)0;
		}
		return input;
	}
	static String inputString(String string) {
		String input = "";
		try {
			input = input(string);}
		catch(Exception e) {
			input = "";	
		}
		return input;
	}
	
		
	
    //The methods used here can be found in:
    //The IB Computer Science subject guide (first examination in 2010)
    //Appendix A: Core Computer Science for the IB Diploma Program (International Baccalaureate). Published by Express Publishing.
}
