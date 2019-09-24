package pe.four;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordOccurrenceString {

    public static void check(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        System.out.println("to Find : ");
        String toFind = sc.nextLine();

        Matcher var = Pattern.compile(String.valueOf(toFind)).matcher(input);

        int count =0;
        while(var.find()){
            count++;
        }

        System.out.println("Occurrence is : "+count);





    }




}
