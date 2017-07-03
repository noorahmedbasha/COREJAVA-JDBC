package Personpack;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persondetails {
	 public static void main(String []args) throws SQLException{
	       Scanner s=new Scanner(System.in);
	         int apply;
	          List studentList=new ArrayList();
	          Person p=new Person();
	          Collections c=new Collections();
	    do
	    {
	    	System.out.println("enter details");
	    	System.out.println("select a choice");
	    	System.out.println("1.add");
	    	System.out.println("2.dispaly");
	    	System.out.println("3.insert");
	    	System.out.println("4.delete");
	    	System.out.println("5.exit");
	    	apply=s.nextInt();
	    	switch(apply){
	    	case 1:
	    	{
	    		c.AddMethod();
	    		break;
	    	}
	    	
	    	case 2:
	    	{
	    		c.Displaymethod();
	    		break;
	    	}
	    	case 3:
	    	{
	    		c.UpdateMethod();
	    		break;
	    	}
	    	case 4:
	    	{
	    		c.DeleteMethod();
	    		break;
	    	}
	    	
	    	case 5:
	    	{
	    		System.exit(0);
	    	}
	    	}
	   }while(apply!=5);
	    	
	    	
	    
	  }
	  }

	



