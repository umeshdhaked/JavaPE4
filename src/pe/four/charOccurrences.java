package pe.four;

import java.util.*;

public class charOccurrences {

public void find(){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    //sc.nextLine();
    String ch = sc.nextLine();

    String str = input.replaceAll(ch,"");

    System.out.println(input.length()-str.length());


}




}
