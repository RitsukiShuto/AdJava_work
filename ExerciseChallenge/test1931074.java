// Created by RitsukiShuto on 2021/01/21.
// test1931074.java
//
class test1931074{
    public static void main(String[] args){
        // �z��a[]�Ɋw�Дԍ����i�[
        int a[] = {0, 1, 9, 3, 1, 0, 7, 4};

        // a[]���o��
        for(int i = 0;i < 8;i++){
            System.out.print(a[i]);
        }
        System.out.print("\n");     // ���s

        // �����̐������o��
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