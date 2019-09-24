package pe.four;

import java.util.Scanner;

public class findWordInString {

    public static void find(){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is String:");
        String str = sc.nextLine();
        System.out.println("Find this word : ");
        String find = sc.nextLine();

        int i = str.indexOf(find);
        if(i!=-1)
            System.out.println("True");
        else
            System.out.println("false");



    }



}
