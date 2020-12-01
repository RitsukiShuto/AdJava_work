package C2.sample3;

// Created by RitsukiShuto on 2020/12/01.
// Sample3b.java
//
class sample3b{
    public static void main(String[] args){
        Calc3b c = new Calc3b();
        Calc3b d = new Calc3b(3, 7);

        System.out.println("c.add() = " + c.add());
        System.out.println("d.add() = " + d.add());
    }
}

class Calc3b{
    private int x;
    private int y;

    public Calc3b() {this.x = 0; this.y = 0;}
    public Calc3b(int n1, int n2) {this.x = n1; this.y = n2;}

    public int add() {return this.x + this.y;}
    public int add(int n1, int n2) {
        this.x = n1;    this.y = n2;    return n1 + n2;
    }
}