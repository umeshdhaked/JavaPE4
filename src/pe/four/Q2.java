package pe.four;

import java.util.Scanner;

public class Q2 {

    public static void find(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //sc.nextLine();

        String str;
         str = input.replaceAll("l","t");
         str = str.replaceAll("d","f");
        System.out.println(str);


    }



}
