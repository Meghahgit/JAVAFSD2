package Phase1_Non_Assisted_Projects;

import java.util.regex.*;    
import java.util.*;    
public class EmailValidation1{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("javaTpoint@domain.co.in");  
        emails.add("javaTpoint@domain.com");  
        emails.add("javaTpoint.name@domain.com");  
        emails.add("javaTpoint#@domain.co.in");  
        emails.add("javaTpoint@domain.com");  
        emails.add("javaTpoint@domaincom");  
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