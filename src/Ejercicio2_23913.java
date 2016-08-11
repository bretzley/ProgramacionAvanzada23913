/*------------------------------------------------------------------
 * 		EJERCICIO 2_23913
 * 		BRETZNER LEYSSA GONZALEZ
 ------------------------------------------------------------------*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		
		//ADD STRING'S CHARACTERS IN A DICTIONARY
		public static void dictionary(String stg1, String stg2)
		{
			char[] ch1 = stg1.toCharArray();
			char[] ch2 = stg2.toCharArray();
			int key = 0;
			
			
			
			for(int i=0; i < stg1.length(); i++)
			{
				if(ch1[i] == stg1.charAt(i))
					key--;
				else
					key++;
				
				
			}
			
			
		}
		
		//TEST THAT EACH OF THE LETTERS OF BOTH STRINGS ARE CONTAINED IN THE DICTIONARY
		public static boolean testLetters(String stg1, String stg2)
		{
			//char[] ch1 = stg1.toCharArray();
			//char[] ch2 = stg2.toCharArray();
			Ejercicio2_23913.dictionary(stg1,stg2);
			
		
			
			return true;
		}
		
		//MAIN CLASS WHERE USER INPUTS TWO DIFFERENT STRINGS TO BE TESTED
		public static void main(String args[])
		{
			String stg1 = "god";
			String stg2 = "dog";
			
			Ejercicio2_23913.testLength(stg1, stg2);
			Ejercicio2_23913.testLetters(stg1, stg2);	
		}

}
