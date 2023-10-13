package Semana1Moshak;

import java.util.Scanner;

public class S1MoshakG {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int num = ler.nextInt();
        int count  = 0 ;
        int divisao  = 1 ;


        for (int i = 1; i <=num ; i++) {
            divisao = num  % i ;
            if(divisao   == 0 ){
                count ++ ;
                System.out.println(i);

            }

        }
        System.out.println("("+count+")");
    }
}
