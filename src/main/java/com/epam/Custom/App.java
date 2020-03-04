package com.epam.Custom;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	       MyList<Integer> l = new MyList<Integer>();
    	       @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
    	       System.out.println("enter temporary size of list");
    	       int temp=sc.nextInt();
    	       System.out.println("Enter the elements of the list");
    	       for(int i=0;i<temp;i++)
    	       {
    	    	   int ele=sc.nextInt();
    	           l.add(ele);
    	        
    	       }
    	       
    	        //System.out.print("list is :");
    	        System.out.println("list is :"+l);
    	        System.out.println("Size of the list : "+l.size());
    	        
    	        System.out.println("Add more elements");
    	        l.add(11);
    	        l.add(12);
    	        System.out.println(l);
    	        
    	        System.out.println("Size of the list : "+l.size());
    	        
    	        System.out.println("Enter the position of the element to fetch");
       	        int p=sc.nextInt();
       	        System.out.println( l.get(p) );
    	         
    	        System.out.println("Enter the position of the element to be deleted");
    	        int pos=sc.nextInt();
    	        l.remove(pos);
    	        System.out.println("After Deletion : "+l);
    
    	       
    	    }
    	
    }

