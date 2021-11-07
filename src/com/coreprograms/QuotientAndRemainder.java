package com.coreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
	
	public double quotient(int n,int m) {
		double quotient = n/(double)m;
		return quotient;
		
	}
	public int remainder(int n,int m) {
		int rem =(int) n%m;
		return rem;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter divident value = ");
		int divident = scan.nextInt();
		System.out.print("enter divisor value = ");
		int divisor = scan.nextInt();
		
		
		QuotientAndRemainder qr=new QuotientAndRemainder();
		double quotient = qr.quotient(divident,divisor);
		System.out.println("quotient= "+quotient);
		int remainder = qr.remainder(divident,divisor);
		System.out.println("remainder= "+remainder);
		
	}
	

}
