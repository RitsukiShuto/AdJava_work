// Created by RitsukiShuto on 2020/12/01.
// sample4b.java
//
class sample4b {
    public static void main(String[] s){
        Robot4 rb = new Robot4();
        SuperRobot4 srb = new SuperRobot4();

        rb.move();
        srb.jump();
        srb.move();
    }    
}

class Robot4{
public Robot4() { /* System.out.println("BASE"); */}
    public void move()  { System.out.println("BASE::MOVE"); }
}

class SuperRobot4 extends Robot4{
public SuperRobot4() { /*System.out.println(" -EXT");*/}
    public void jump()   { System.out.println(" -EXT::JUMP");}
    public void move()  { System.out.println(" -EXT::MOVE"); }
}
