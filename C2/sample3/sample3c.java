package C2.sample3;

// Created by RitsukiShuto on 2020/12/01.
// sample3c.java
//
public class sample3c {
    public static void main(String[] args){
        Calc3c c = new Calc3c();

        System.out.println("c.add( 10, 5 ) = " + c.add(10, 5));
        System.out.println("c.add( 10, 5, 2 ) = " + c.add(10, 5, 2));
    }  
}

class Calc3c{
    public int add(int n1, int n2){ 
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}
