// Created by RitsukiShuto on 2020/11/24.
// Sample2c.java
//
class Sample2c {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        
        while(i <= 100){
            sum = sum + i;
            if(i == 100){
                System.out.print(i + " = ");
            }else{
                System.out.print(i + " + ");
            }
            i++;
        }
        System.out.println(sum);
    }  
}
