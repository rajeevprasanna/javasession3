package charLiteral;

//Refer : https://gist.github.com/rajeevprasanna/8755247
public class CharLiteral {
	
	public static void main(String[] args) {
		char a = 0x892;
		System.out.println(a);// ?

		char b = 982;
		System.out.println(b);// ?
		
		char c = 255;
		System.out.println(c);//Ø
		
		c = 256;
		System.out.println(c);// ?
				 

		char letterN = '\u004E';
		System.out.println(letterN);// N

		char e = 34534;
		System.out.println(e);// ?

		char x = 65;
		System.out.println(x);// A

		/*
		 * A char in java is an unsigned 16-bit integer. If you cast a negative
		 * integer literal like -65 to a char, then the value is interpreted as
		 * a positive number; in this case 65471(2 pow 16 - 65) - or Unicode
		 * character \uFFBF.
		 * 
		 * The character \uFFBF isn't a character which is normally displayable
		 * so a '?' is printed.
		 */
		char y = (char) -65;
		System.out.println(y);// ?

		char p = 0;
		p--;
		System.out.println(p);// ?
	}
}
