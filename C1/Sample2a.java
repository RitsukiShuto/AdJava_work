// Created by RitsukiShuto on 2020/11/24.
// Sample2a.java
//
class Sample2a {
    public static void main(String[] args){
        int a = -2;
        
        for(int i = 0; i < 5; ++i){
            if(a < 0){
                System.out.println(a + "is smaller than 0.");
            }else if(a == 0){
                System.out.println(a + "is equal to 0.");
            }else{
                System.out.println(a + "is greater than 0.");
            }

            a++;
        }

        while(a >= -2){
            System.out.printf("a is now %2d\n", --a);
        }
    }
}
