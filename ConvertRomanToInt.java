package com.suruchi.demos;

import java.util.Scanner;

public class ConvertRomanToInt {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Roman no in capital");
		 ConvertRomanToInt cr=new ConvertRomanToInt();
		 String Input=sc.next();
		 System.out.println("After converting Roman no to integer is:"+cr.Convert(Input));
   sc.close();
	}
	public int value(char c) {
		if(c=='I')
			return 1;
		if(c=='V')
			return 5;
		
		if(c=='X')
			return 10;
		if(c=='L')
			return 50;
		if(c=='C')
			return 100;
		if(c=='D')
			return 500;
		if(c=='M')
			return 1000;
		
		return 0;
		
	}

	public int Convert(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			int s1=value(str.charAt(i));
			if(i+1<str.length())
			{
				int s2=value(str.charAt(i+1));
				if(s1 >=s2)
				{
					sum=sum+s1;
				}
				else
				{
					sum=sum-s1;
				}
			}
			else
				sum=sum+s1;
			
		}
		
		return sum;
	}

}
