package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class WordService {
	private boolean pal;
    
	public ResponseEntity<Object> palindromeObj(String word)
	{
		if(checkPalindrome(word) && canFormPalindrome(word))
	      {
	    	   return new ResponseEntity<>("word :"+ word + "    "+"palindrome :"+ checkPalindrome( word) +  "      "+
	    				"anagram :"   +  canFormPalindrome( word) , HttpStatus.OK);
	      }
		return new ResponseEntity<>("word :"+ word + "    "+"palindrome :"+ false +  "      "+
				"anagram :"   +  canFormPalindrome( word) , HttpStatus.OK);
		   
	}
	
	public boolean  checkPalindrome(String word)
	{
		char [] chars= word.toCharArray();
		char [] reverserChar= new char[chars.length];
		
		for(int i=0; i<chars.length; i++)
		{
			reverserChar[i]= chars[chars.length-1 - i];
			
		}
		String reverseWord = String.valueOf(reverserChar);
		
		return  word.equals(reverseWord);
	}
	
	 public boolean canFormPalindrome(String text) 
	    { 
//		 text="bzzubu";
	    	// Create a count array and initialize 
	        // all values as 0 
	        int[] count = new int[256]; 
	  
	        // For each character in input strings, 
	        // increment count in the corresponding 
	        // count array 
	        for (int i = 0; i < text.length(); i++) 
	            count[text.charAt(i)]++; 
	  
	        // Count odd occurring characters 
	        int odd = 0; 
	        for (int i = 0; i < 256; i++) { 
	            if ((count[i] & 1) != 0) 
	                odd++; 
	  
	            if (odd > 1) 
	                return false; 
	        } 
	  
	        // Return true if odd count is 0 or 1, 
	        return true; 
	    } 

	
}
