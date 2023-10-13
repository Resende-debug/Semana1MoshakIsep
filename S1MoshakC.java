package Semana1Moshak;

import java.util.Scanner;

public class S1MoshakC {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int produto = 1;
        int num = ler.nextInt();
        boolean verificar = false;

        int digito = 0 ;
        while(num>0){
            digito = num % 10 ;
            if(digito%2 != 0) {
                produto = digito * produto;
                verificar = true;
            }
            num /= 10 ;


        }
        if(!verificar){
            System.out.println("no odd digits");
        }else {
            System.out.println(produto);
        }
    }
}
