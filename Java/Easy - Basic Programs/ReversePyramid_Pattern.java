/*
 * Author: Nitharshana18
 * Email: nitharshana0518@gmail.com
 * Date: 2024.02.15
 * Description: This program is to print the reverse pyramid pattern using stars.
 */

 
 public class ReversePyramid_Pattern {
	public static void main(String[] args)  
	{  
	int rows=8;  
	for (int i= 0; i<= rows-1; i++)  
	{  
	for (int j=0; j<=i; j++)  
	{  
	System.out.print(" ");  
	}  
	for (int k=0; k<=rows-1-i; k++)  
	{  
	System.out.print("*" + " ");  
	}  
	System.out.println();  
	}  
	}  
	}  