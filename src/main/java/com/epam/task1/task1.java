package com.epam.task1;
import java.util.*;
import java.io.*;


/**
 * Hello world!
 *
 */
interface Choc
{
	int n=10;
	void getInput();
}
 class Gift implements Choc
{
	Scanner scan = new Scanner(System.in);
	String [] chocolates = new String[n];
  	String [] sweets = new String[n];
	
	public void getInput()
	{
		int i,j=0,k=0;
		  	
		  	for(i=0;i<n;i++)
		  	{
		  		System.out.println("enter the 1 for sweet or 2 for chocolate");
		  		int c=scan.nextInt();
		  		scan.nextLine();
		  		if(c==1)
		  			sweets[k++]=scan.next();
		  		else
		  			chocolates[j++]=scan.next();
		  	}
	}
	void display()
	{}
	
}
 class sweet extends Gift
 {
	 void display()
	 {
	 System.out.println("sweets are:");
	 for(String x : sweets)
		 System.out.println(x);
	 }
 }
 class chocolate extends Gift
 {
	 void display()
	 {
	System.out.println("chocolates are");
	for(String x : chocolates)
		 System.out.println(x);	
	 }
 }
public class task1 
{
    public static void main( String[] args )
    {
     Gift g = new Gift();
     g.getInput();
     sweet s=new sweet();
     chocolate c=new chocolate();
     s.display();
     c.display();
     
    }
}
