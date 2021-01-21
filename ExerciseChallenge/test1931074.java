// Created by RitsukiShuto on 2021/01/21.
// test1931074.java
//
class test1931074{
    public static void main(String[] args){
        // 配列a[]に学籍番号を格納
        int a[] = {0, 1, 9, 3, 1, 0, 7, 4};

        // a[]を出力
        for(int i = 0;i < 8;i++){
            System.out.print(a[i]);
        }
        System.out.print("\n");     // 改行

        // 数字の数だけ出力
        for(int i = 0;i < 8;i++){
            if(a[i] != 0){
                for(int j = 0; j < a[i];j++){
                    System.out.print(a[i]);
                }
            }else{
                System.out.print("0");
            }
            System.out.print("\n");
        }

    }
}