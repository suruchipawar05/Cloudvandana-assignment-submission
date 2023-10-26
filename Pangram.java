package com.suruchi.demos;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		 
		if(CheckPangram(sentence)==true)
			{
			System.out.println("Sentence is a Pangram");
			}
		else
			System.out.println("Sentence is  not a Pangram");
		
        sc.close();
	}

	public static boolean CheckPangram(String sen) {
  boolean[] check=new boolean[26];
int index=0;
	for(int i=0;i<sen.length();i++)
	{
		if(sen.charAt(i)>='A' && sen.charAt(i)<='Z')
		{
			index=sen.charAt(i)-'A';
		}else if(sen.charAt(i)>='a' && sen.charAt(i)<='z')
		{
			index=sen.charAt(i)-'a';
		}
		else
			continue;
		check[index]=true;
	}
	
	for(int i=0;i<=25;i++)

		if(check[i]==false)
		return false;
	return true;
	
	}

}
