import java.util.Scanner;

public class Quesolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Number daal BC\n");
		String str = sc.next();
		int len = str.length();

	        str = str + " ";
	        int result = 0;
	        for (int i = 0; i < len; i++) {
	            char ch   = str.charAt(i);
	            char next_char = str.charAt(i+1);
	            char match1 = 'I';
	            char match2 = 'X';
	            char match3 = 'V';
	            if (str.charAt(1) == match1|| str.charAt(1) == match2 || str.charAt(1) == match3)
	            {
	            	
	            if (str.charAt(2) == match1|| str.charAt(2) == match2 || str.charAt(2) == match3)
	            {
	            	if (str.charAt(3) == match1|| str.charAt(3) == match2 || str.charAt(3) == match3)
	            	{
	            	   System.out.print("Wrong Input");
	            	}
	            	
	            	
	            	}
	            }
	        
	            
	            else if (ch == 'M') {
	                result += 1000;
	            } else if (ch == 'C') {
	                if (next_char == 'M') {
	                    result += 900;
	                    i++;
	                } else if (next_char == 'D') {
	                    result += 400;
	                    i++;
	                } else {
	                    result += 100;
	                }
	            } else if (ch == 'D') {
	                result += 500;
	            } else if (ch == 'X') {
	                if (next_char == 'C') {
	                    result += 90;
	                    i++;
	                } else if (next_char == 'L') {
	                    result += 40;
	                    i++;
	                } else {
	                    result += 10;
	                }
	            } else if (ch == 'L') {
	                result += 50;
	            } else if (ch == 'I') {
	                if (next_char == 'X') {
	                    result += 9;
	                    i++;
	                } else if (next_char == 'V') {
	                    result += 4;
	                    i++;
	                } else {
	                    result++;
	                }
	            } else { // if (ch == 'V')
	                result += 5;
	            }
	        }
	       System.out.println("\nTera dala hua Number: "+str);
		   System.out.println("Sahi ya nahi : "+result+"\n");
	    }
	}