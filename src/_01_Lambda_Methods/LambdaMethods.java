package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)-> {
			System.out.println(new StringBuilder(s).reverse().toString());
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)-> { 
			System.out.println(s.substring(0,s.length()/2).toUpperCase()+s.substring(s.length()/2));			
		}, "mix");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			char[] word = new char[s.length()*2];
			
			for(int i =0; i < word.length; i++) {
				char added = '.';
				if(i%2 == 0) {
					added = s.charAt(i/2);
				}
				word[i] = added;
			}
			String print = "";
			for(int i = 0; i < word.length; i++) {
				print+=word[i];
			}
			System.out.print(print);
		}, "period");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)-> {
			String vowels = "aeiuoAEIUO";
			//System.out.print(new StringBuilder(s).);
		}, "no vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
