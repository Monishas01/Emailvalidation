import java.util.regex.*;    
import java.util.*;  
public class EmailValidation {
	 public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("monishas@gmail.co.in");  
	        emails.add("monishas@domain.com");  
	        emails.add("monishas.name@domain.com");  
	        emails.add("monisha#@domain.co.in");  
	        emails.add("java@domain.com");  
	        emails.add("anusha@domaincom");  
	        //Add invalid emails in list  
	        emails.add("@yahoo.com");  
	        emails.add("javaTpoint#domain.com");  
	        //Regular Expression   
	        String regex = "^(.+)@(.+)$";  
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
}
