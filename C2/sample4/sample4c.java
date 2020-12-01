// Created by RitsukiShuto on 2020/12/01.
// sample4c.java
//
class sample4c {
    public static void main(String[] s){
        Robot4 rb = new Robot4();
        SuperRobot4 srb = new SuperRobot4();
        UltraSuperRobot4 usrb = new UltraSuperRobot4();

        usrb.jump();
        usrb.move();
    }    
}

class Robot4{
    public Robot4() { System.out.println("BASE"); }
    public void move()  { System.out.println("BASE::MOVE"); }
}

class SuperRobot4 extends Robot4{
    public SuperRobot4() {System.out.println(" -EXT");}
    public void jump()   {System.out.println(" -EXT::JUMP");}
}

class UltraSuperRobot4 extends Robot4{
    public UltraSuperRobot4() { System.out.println(" --ULT-EXT"); }
    public void jump()        { System.out.println(" --ULT-EXT::JUMP"); }
    public void move()        { System.out.println(" --ULT-EXT::MOVE"); }
}