import java.util.Scanner;

public class CountChar {
    static String CountChar(String input1) {
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
    }
        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        CountChar(input1);
        }
    }






















