package C2.sample3;
// Created by RitsukiShuto on 2020/12/01.
// Sample3a.java
//
class sample3a{
    public static void main(String[] args){
        Calc c = new Calc();
        int a = c.add(10, 5);

        System.out.println("10 + 5 = " + a);
    }
}

class Calc{
    private int x;
    private int y;

    public Calc(){
        this.x = this.y = 0;
    }

    public int add(int n1, int n2){
        this.x = n1;
        this.y = n2;

        return this.x + this.y;
    }
}