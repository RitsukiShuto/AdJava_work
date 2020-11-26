// Created by RitsukiShuto on 2020/11/24.
// Sample1b.java
//
class Sample1b {
    public static void main(String[] args){
        String str1 = new String("Johathan");
        String str2 = new String("Joseph");

        System.out.print("I am " + str1 + " Joester.\n");
        System.out.print("I am " + str2 + " Joester.\n");

        System.out.printf(str1 + " has " + str1.length() + " characters.\n");
        System.out.printf("1st letter of " + str2 + " is " + str2.charAt(0) + ".");
    }    
}
