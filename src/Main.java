import java.util.Scanner; 

public class Main {
	public static void main(String[] args) { /* the 2 scanners for inputs  */
		Scanner letters = new Scanner(System.in);
		Scanner type = new Scanner(System.in); 
		
		System.out.println("Type the alphabet in order (hit enter between letters)");
		System.out.print("Forwards or Backwards (f/b)?:");
		char x = type.next().charAt(0);/* this assigns the value from the first scanner to x */
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};	
		/* the main array  */
		if(x =='f') /* if statement for forwards */
		{
			System.out.println("forwards");
			long startTime = System.currentTimeMillis();/* start of timer  */
			for (int i = 0; i <= alphabet.length; i++) { /* for loop the length of alphabet starting at 0  */
				char a = letters.next().charAt(0); /* second scanner assigning the value to a */
		while(a!=alphabet[i]) {		/* while loop to keep looping until the value of the first charachter is the same as the alaphabet  */
		  a = letters.next().charAt(0);}
		 if(a==alphabet[i]) { /* if correct */
			if(i==25) {System.out.println("[ CORRECT , Well Done ]"); /* if at the last charachter */ 
			long elapsedTime = System.currentTimeMillis() - startTime; /* this is just the method for getting the time by taking away the original timer */
			long elapsedSeconds = elapsedTime / 1000;
			long secondsDisplay = elapsedSeconds % 60 ;
			System.out.println("Time taken: "+secondsDisplay+" seconds");
			}else
			System.out.println("[ "+alphabet[i]+": CORRECT  Now type "+alphabet[i+1]+" ]"); /* this prompts the player to select the next charachter */
			
			
			}
			}
		}else if(x == 'b') { /* for backwards  */
			
			System.out.println("backwards");
			long startTime = System.currentTimeMillis();
			for (int i = 25; i >= 0; i--) { /* instead of incrimenting it decrements i and starts at 25  */
				char a = letters.next().charAt(0);
		while(a!=alphabet[i]) {		
		  a = letters.next().charAt(0);}
		 if(a==alphabet[i]) {
			if(i==0) {System.out.println("[ CORRECT , Well Done ]");
			long elapsedTime = System.currentTimeMillis() - startTime;
			long elapsedSeconds = elapsedTime / 1000;
			long secondsDisplay = elapsedSeconds % 60;
			System.out.println("Time taken: "+secondsDisplay+" seconds");
			}else
			System.out.println("[ "+alphabet[i]+": CORRECT  Now type "+alphabet[i-1]+" ]"); /* it takes 1 away from alphabet instead of adding 1  */
			
			
			}
			}

		}else {System.out.println("\n ERRROR INVALID CHARACTER");} /*  Error message the code gets terminated*/
}
		 
		 
}

