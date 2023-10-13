package Semana1Moshak;

import java.util.Scanner;

public class S1MoshakB {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int num = ler.nextInt();
        int soma = 0 ;
        int dig = 0;
        while(num>0){
            while(num !=0) {

                dig = num % 10;
                if (dig % 2 == 0) {

                    soma = soma + dig;

                }
                num = num / 10;
            }
            System.out.println(soma);
            soma = 0;
            dig = 0;
            num = ler.nextInt();

        }

    }
}
