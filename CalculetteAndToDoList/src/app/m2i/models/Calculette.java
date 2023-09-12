package app.m2i.models;

import java.util.List;

public class Calculette {
	
	public float sum (List<Float> args) {
		  float sum = 0;
	      for (float f : args)
	           sum += f;
	        return sum;
	}
	
	public float sub (List<Float> args) {
		  float result = 0;
		  boolean bool = false;
	      for (float f : args) {
	    	  if (bool == false)  {
	    		  result = f;
	    		  bool = true;
	    	  }
	    	  else {
	         result -= f;
	    	  }
	         
	}
	        return result;
	  
	}
	
	public float multiply (List<Float> args) {
		  float result = 0;
		  boolean bool = false;
	      for (float f : args) {
	    	  if (bool == false)  {
	    		  result = f;
	    		  bool = true;
	    	  }
	    	  else {
	         result *= f;
	    	  }
	         
	}
	        return result;
	  
	}
	public float divide (List<Float> args) {
		 float result = 0;
		  boolean bool = false;
	      for (float f : args) {
	    	  if (bool == false)  {
	    		  result = f;
	    		  bool = true;
	    	  }
	    	  else {
	         result /= f;
	    	  }
	         
	}
	        return result;
	  
	}
	
	public float factorielle(float arg) {
		int n = Math.round(arg);
		if (n==0) return(1);
        else return(n*factorielle(n-1));
	}
	
	
	

}
	
	
