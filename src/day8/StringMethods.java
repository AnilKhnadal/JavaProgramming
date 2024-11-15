package day8;

import java.util.Arrays;

// built in methods

public class StringMethods {
         public static void main(String[] args) {
			
////        String s="Welcome";
//          String s=new String("Welcome"); 
//        	System.out.println(s);
        	 
        	 //Length() -- Returns the length of string(Number of charters)
        	 String s="Welcome";
        	 int l = s.length();
        	 System.out.println(l); // 7
        	 System.out.println(s.length()); // or // 7
        	 System.out.println("Welcome".length()); // 7
        	 
        	 //concat - Joining Strings
        	 
        	 String s1="Welcome";
        	 String s2="to java";
        	 String s3="automation";
        	 
        	 System.out.println(s1+s2);// Welcometo java
        	 System.out.println(s1.concat(s2));// Welcometo java
        	 
        	 System.out.println(s1+s2+s3); // Welcometo javaautomation
        	 System.out.println(s1.concat(s2).concat(s3)); // Welcometo javaautomation
        	 System.out.println(s.concat(s2+s3)); //Welcometo javaautomation
        	 System.out.println("Welcom"+"to java"); // Welcomto java
        	 System.out.println("welcom".concat("to java")); // Welcomto java
        	 
        	 //trim() - Remove spaces right and left side
        	 
        	 s="   welcome   ";
        	 
        	 System.out.println(s); // print string along with space
        	 System.out.println("Before trimming : "+s.length());
        	 
             System.out.println(s.trim()); // print string without space
             System.out.println("After trimming : "+s.trim().length());
             
             //charAt() - Returns a character from a string based on index
            // index starts from Zero
             
             s="welcome";
             System.out.println(s.charAt(3)); // c
             System.out.println(s.charAt(0)); // w
             
           // contains() - Returns true/false
           // check string is part of main string or not  
             System.out.println(s.contains("wel")); //true
             System.out.println(s.contains("come")); //true
             
             System.out.println(s.contains("Wel")); // false : Case sensitive
             System.out.println(s.contains("COME")); // false : Case sensitive
             System.out.println(s.contains("welme")); // false : position mismatch
             
           // equals() ,equalsIgnoreCase() - Comparing the strings
             s1="Welcome";
             s2="Welcome";
             System.out.println(s1==s2); // true
             System.out.println(s1.equals(s2)); // true
             System.out.println(s1.equals("welcome")); // false : Case sensitive
             System.out.println(s1.equalsIgnoreCase("welcome")); // true
             
          // replace() - Replace single/multiple/sequence of characters in a string
             
             s="welcome to selenium java selenium plython selenium c#";
            System.out.println(s.replace('e', 'X')); // e replace to X character // wXlcomX to sXlXnium java sXlXnium plython sXlXnium c#
            System.out.println(s.replace("selenium","playwrite")); // welcome to playwrite java playwrite plython playwrite c#

          // substring() - extract substring from the main string  
          // starting index - 0
          // ending index -1
            
            s="selenium";
            System.out.println(s.substring(1,5)); // elen
            System.out.println(s.substring(0,1)); // s
            System.out.println(s.substring(0,3)); //sel
            
         // toUpperCase()  toLowerCase()
            
            s="Welcome";
            System.out.println(s.toUpperCase()); // WELCOME
            System.out.println(s.toLowerCase()); //welcome
            
        // split() - split the string into multiple parts on delimeter (@ . space)
            
            //ex 1
            
            s="anil1234@gmail.com";
           String a[] = s.split("@");
           System.out.println(a[0]); // anil
           System.out.println(a[1]); // gmail.com
           
           System.out.println(Arrays.toString(a)); // [anil1234, gmail.com]
           
           //ex 2
           
           String amount="$15,20,30";
           
           System.out.println(amount.replace("$"," ")); // 15,20,30
           System.out.println(amount.replace("$"," ").replace(",", " ")); // 15 20 30

           // ex 3
           
           s="abc,123@xyz";
           String arr1[] = s.split(",");
           System.out.println(Arrays.toString(arr1)); // [abc, 123@xyz]
           
           String arr2[] = arr1[1].split("@");
           System.out.println(Arrays.toString(arr2)); // [123, xyz]
           
           System.out.println(arr1[0]); // abc
           System.out.println(arr2[0]); // 123
           System.out.println(arr2[1]); // xyz
           
           // ex 4
           
           s="abc 123 xyz"; // Remove space
           String arr[] = s.split(" ");
           System.out.println(Arrays.toString(arr)); // [abc, 123, xyz]
           
           // * % & ( ) -  you cannot use as a delimeters
           
           // ex 5
           
           String name="Anil Khanadal";
           
           System.out.println(name.contains("anil")); // false
           
           System.out.println(name.replace('A', 'a').contains("anil")); // true
           
           System.out.println(name.toLowerCase().contains("anil")); // true
           
         }
}






