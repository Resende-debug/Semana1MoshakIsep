package Semana1Moshak;

import java.util.Scanner;

public class S1MoshakD {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        boolean verificar = false;
        int num = ler.nextInt();
        int dig = 0 ;
        int produto = 1;
        while(num>-1){
            while(num!=0){
                dig = num %10;
                if(dig%2 != 0){
                    produto= produto * dig;
                    verificar = true;
                }
                num = num /10;
            }

            if(!verificar) {
                System.out.println("no odd digits");
            }else{
                System.out.println(produto);
            }
            dig = 0;
            produto = 1;
            verificar = false;
            num = ler.nextInt();
        }



    }
}
