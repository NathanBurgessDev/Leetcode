import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scr = new Scanner(System.in);
        String str = new String();
        StringBuilder buildStr = new StringBuilder();
        while (scr.hasNext()){
            str = scr.nextLine();
            String[] splitStr = str.split(";"); // [0] - Split or Combine [1] - Class, method , variable [2] - Main String 
            buildStr.setLength(0);
            
            if (splitStr[0].equals("S")){ // put space before capital
                if (splitStr[1].equals("C")){ // All lower case
                    buildStr.append(splitStr[2].charAt(0));
                    for (int i = 1; i < splitStr[2].length(); i++){
                        if (Character.isUpperCase(splitStr[2].charAt(i))){
                            buildStr.append(" ");
                        }
                        buildStr.append(splitStr[2].charAt(i));
                    }
                }
                
                else{
                    for (int i = 0; i < splitStr[2].length(); i++){
                        if (Character.isUpperCase(splitStr[2].charAt(i))){
                            buildStr.append(" ");
                            buildStr.append(splitStr[2].charAt(i));
                        }
                        else if (splitStr[2].charAt(i) == '(' || splitStr[2].charAt(i) == ')' ){
                            // do nothing
                        }
                        else{
                            buildStr.append(splitStr[2].charAt(i));
                        }
                        
                    }
                    
                }
                
                System.out.println(buildStr.toString().toLowerCase());
            }
            
            if (splitStr[0].equals("C")){
                if (splitStr[1].equals("C")){
                    buildStr.append(Character.toUpperCase(splitStr[2].charAt(0)));
                    for (int i = 1; i < splitStr[2].length(); i++){
                        if (splitStr[2].charAt(i) == ' '){
                            i++;
                            buildStr.append(Character.toUpperCase(splitStr[2].charAt(i)));
                        }
                        else{
                            buildStr.append(splitStr[2].charAt(i));
                        }
                    }
                }
                
                if (splitStr[1].equals("M")){
                    for (int i = 0; i < splitStr[2].length(); i++){
                        if (splitStr[2].charAt(i) == ' '){
                            i++;
                            buildStr.append(Character.toUpperCase(splitStr[2].charAt(i)));
                        }
                        else{
                            buildStr.append(splitStr[2].charAt(i));
                        }
                    }
                    buildStr.append("()");
                }
                
                if (splitStr[1].equals("V")){
                    for (int i = 0; i < splitStr[2].length(); i++){
                        if (splitStr[2].charAt(i) == ' '){
                            i++;
                            buildStr.append(Character.toUpperCase(splitStr[2].charAt(i)));
                        }
                        else{
                            buildStr.append(splitStr[2].charAt(i));
                        }
                    }
                }
                
                System.out.println(buildStr.toString());
            }
            
            
        }
    }
}

// Combinations
// S C
// S V
// S M
// C C
// C V
// C M
