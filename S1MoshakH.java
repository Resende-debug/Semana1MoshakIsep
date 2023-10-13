package Semana1Moshak;

import java.util.Scanner;

public class S1MoshakH {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int num = ler.nextInt();
         while(num<0){
             num = ler.nextInt();
         }
        int count  = 0 ;
         int divisao = 1 ;
        for (int i = 1; i <=num ; i++) {
            divisao = num % i;
            if(divisao == 0 ){
                count ++ ;
            }
        }
        if(count == 2 ){
            System.out.println("prime");
        }else
            System.out.println("not prime");
    }
}
