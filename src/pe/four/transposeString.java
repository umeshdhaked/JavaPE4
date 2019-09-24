package pe.four;

import java.util.Scanner;

public class transposeString {

    public static void find(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] str = input.split(" ");
        String ans="";
        for(int i=0;i<str.length;i++){
            StringBuilder ss = new StringBuilder(str[i]);
            ans = ans + ss.reverse()+" ";

        }

        System.out.println(ans.trim());



    }






}
