import java.util.Scanner;

public class CountChar {
    static String CountChar(String input1) {
<<<<<<< HEAD
          if(input1.length()>10) {
              char first = input1.charAt(0);
              char last = input1.charAt(input1.length() - 1);
              int len = (input1.substring(1, input1.length() - 1)).length();
              System.out.println(first + "" + len + "" + last);
          }
          else{
              System.out.println(input1);
          }


        return null;
=======
          char first=input1.charAt(0);
          char last=input1.charAt(input1.length()-1);
          int len=(input1.substring(1,input1.length()-1)).length();
          System.out.println(first+""+len+""+last);
          return null;
>>>>>>> 0cd4c144b52b287356d7d268a1c1d343b16f3953
    }
        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        CountChar(input1);
        }
    }






















