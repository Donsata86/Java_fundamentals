package StringManipulator;

public class StringManipulator {
	 
	public String trimAndConcat(String str1, String str2){
	   
		 String newStr = str1.trim() + str2.trim();
	     
		 return newStr;
	}

	public Integer getIndexOrNull( String str, char c ) {
		
				
		Integer result = str.indexOf(c);	
		
		if (result != -1){    
						
			return result;	
		}
		
		return -1;
	}

	public Integer getIndexOrNull( String str, String subString ) {
		
		Integer result = str.indexOf(subString);	
		
		if (result != -1){    
						
			return result;	
		}
		
		return -1;
	}
	
	 public String concatSubstring(String str1, int int1, int int2, String str2){
	        String str = str1.substring(int1,int2);
	        String result = str.concat(str2);
	        return result;
	 }
	
}


	
    