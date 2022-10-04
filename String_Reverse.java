import java.io.*;
import java.util.*;

public class String_Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
     int s = 0, e = A.length()-1;
     
     while(s<=e){
         if(A.charAt(s)!=A.charAt(e)){
             System.out.println("No");
             return;
         }
         s++;
         e--;
     }
        System.out.println("Yes");
        
    }
}