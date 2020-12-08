// Created by RitsukiShuto on 2020/12/01.
// sample5.java
//
class sample5{
    public static void main(String[] args){
        int n;

        n = Count5.count;           System.out.println(n);

        Count5 c1 = new Count5();   System.out.println(c1.count);
        n = Count5.count;           System.out.println(n);
        
        Count5 c2 = new Count5();   System.out.println(c2.count);
        n = Count5.count;           System.out.println(n);
    }
}

class Count5{
    static int count;
    public Count5() { count++; }
}