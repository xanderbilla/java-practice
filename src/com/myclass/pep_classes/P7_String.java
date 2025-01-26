package com.myclass.pep_classes;

public class P7_String {
    public static void run(){
        String str = "Hello";
        char [] name = new char[str.length()];
        for(int i =0; i <str.length(); i++){
            name[i] = str.charAt(i);
        }
        name[3] = 'd';
        for(char c: name){
            System.out.print(c);
        }
        System.out.println();
    }
}
