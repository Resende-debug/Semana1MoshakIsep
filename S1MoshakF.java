package Semana1Moshak;

import java.util.Scanner;

public class S1MoshakF {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int num = ler.nextInt();
        int dig = 0 ;
        int numeroinvertido  = 0 ;

        while(num<0){
            num = ler.nextInt();

        }
        int num1 = num ;
         while (num1!=0){
             dig =num1 % 10 ;
             numeroinvertido = numeroinvertido * 10 + dig;
             num1 /= 10 ;


         }
         if (numeroinvertido == num){
             System.out.println("palindrome");
         }else{
             System.out.println("not palindrome");
         }

    }
}
