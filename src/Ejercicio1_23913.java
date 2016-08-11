/*------------------------------------------------------------------
 * 		EJERCICIO 1_23913
 * 		BRETZNER LEYSSA GONZALEZ
 ------------------------------------------------------------------*/

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_23913 
{
	public static void testing(String[] word1)
	{
		for(int i = 0; i < word1.length ; i++)
		{			
			for(int j = 1; j < word1.length; j++)
			{			
				if(i!=j)
				{
					if (word1[i].contentEquals(word1[j]))
					{
						System.out.println(true);
						System.out.println("Tu palabra tiene letras repetidas");
					}
					else
					{						
						break;	
					}					
				}					
			}
		}
		return;
	}
	
	public static void main(String args[])
	{
		System.out.println("Por favor ingresa una palabra: ");
		Scanner userInput = new Scanner(System.in);
		String[] word1 = userInput.next().split("");
		System.out.println("Tu palabra tiene las letras: " + Arrays.toString(word1));
		Ejercicio1_23913.testing(word1);
	}
}
