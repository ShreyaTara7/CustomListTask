package com.epam.Custom;
import java.util.Arrays;

public class MyList<E> 
{	    
	    int size_of_list = 0,min_capacity=10;
	    private Object list[];
	    public MyList() 
	    {
	        list = new Object[min_capacity];
	    }
	 //FETCHING
	    @SuppressWarnings("unchecked")
	    public E get(int i) throws Exception 
	    {
	        if (i<0|| i>=size_of_list) {
	            throw new Exception("Oops!!!Index Out Of the Range");
	        }
	        return (E) list[i];
	    }
	    //ADDING
	    public void add(E ele) {
	        if (size_of_list == list.length) {
	            Increse_size_of_list();
	        }
	        list[size_of_list++] = ele;
	    }
	    //REMOVING
	    @SuppressWarnings("unchecked")
		public E remove(int i) throws Exception 
	    {
	        if (i<0|| i>=size_of_list ) 
	        {
	        	 throw new Exception("Oops!!!Index Out Of the Range");
	        }
	        Object temp = list[i];
	        int len= list.length - ( i + 1 ) ;
	        System.arraycopy( list, i + 1, list, i,len) ;
	        size_of_list--;
	        return (E) temp;
	    }
	     
	    //Get Size of list
	    public int size() 
	    {
	        return size_of_list;
	    }
	     
	    //Print method
	    @Override
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size_of_list ;i++) {
	             sb.append(list[i].toString());
	             if(i<size_of_list-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	     
	    private void Increse_size_of_list() 
	    {
	        int newsize_of_list =list.length * 2;
	        list = Arrays.copyOf(list, newsize_of_list);
	    }
	}


