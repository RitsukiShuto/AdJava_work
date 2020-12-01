// Created by RitsukiShuto on 2020/12/01.
// sample4a.java
//
class sample4a {
    public static void main(String[] s){
        Robot4 rb = new Robot4();
        SuperRobot4 srb = new SuperRobot4();
        rb.move();
        srb.move();
    }    
}

class Robot4{
    public Robot4() { /* System.out.println("BASE"); */}
    public void move()  { System.out.println("BASE::MOVE"); }
}

class SuperRobot4 extends Robot4{
    public SuperRobot4() {/* System.out.println(" -EXT"); */}
    public void jump()   {System.out.println(" -EXT::JUMP");}
}
