/*------------------------------------------------------------------
 * 		EJERCICIO 2_23913
 * 		BRETZNER LEYSSA GONZALEZ
 ------------------------------------------------------------------*/

import java.util.Scanner;

public class Ejercicio2_23913 
{
	//TEST TWO STRINGS TO DETERMINE IF THEY ARE THE SAME LENGTH BEFORE COMPARING
		public static boolean testLength(String stg1, String stg2)
		{
			int len1 = stg1.length();
			int len2 = stg2.length();
			
			if(len1 != len2)
				System.out.println("Tus palabras no tienen la misma cantidad de letras!");
				return false;
		}
		
		//TEST THAT EACH OF THE LETTERS OF BOTH STRINGS ARE CONTAINED IN THE DICTIONARY
		public static boolean testLetters(String source, String compare)
		{			
			for (char cs : source.toCharArray()) {
				
				if (compare.indexOf(cs) < 0)
					return false;
			}
			return true;
		}
		
		//MAIN CLASS WHERE USER INPUTS TWO DIFFERENT STRINGS TO BE TESTED
		public static void main(String args[])
		{
			
			System.out.println("Por favor ingresa la primera palabra: ");
			Scanner userInput = new Scanner(System.in);
			String stg1 = userInput.next();
			System.out.println("Por favor ingresa la segunda palabra: ");
			String stg2 = userInput.next();
			
			Ejercicio2_23913.testLength(stg1, stg2);
			
			boolean first, second;
			first = Ejercicio2_23913.testLetters(stg1, stg2);
			second = Ejercicio2_23913.testLetters(stg2, stg1);
			
			String result = first && second ? "Si, tus palabras tienen todos los mismos caracteres" : "No son iguales";
			System.out.println(result);
		}

}
