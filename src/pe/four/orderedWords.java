package pe.four;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class orderedWords {
    public static void check(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] str = input.split(" ");

        Set<String> s = new TreeSet<String>();

        for(int i=0;i<str.length;i++){
            s.add(str[i]);
        }

        System.out.println("Ordered words are : ");
        Iterator<String > itr = s.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+">");
        }


    }






}
