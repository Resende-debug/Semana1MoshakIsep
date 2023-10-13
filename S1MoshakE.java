package Semana1Moshak;

import java.util.Scanner;

public class S1MoshakE {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int NumOctal = ler.nextInt();
        int dig =0 ;
        int r  = 0;

        int Numdecimal = 0 ;
        int i = 0 ;
        while(NumOctal>-1){
            while(NumOctal != 0){
                dig  = NumOctal % 10;

                Numdecimal = (int) (dig * Math.pow(8 , i));
                i++;
                NumOctal /=10;
                r =  r + Numdecimal;

            }
            System.out.println(r);
            i = 0 ;
            Numdecimal = 0 ;
            dig = 0 ;
            r =  0 ;
            NumOctal = ler.nextInt();

        }
    }
}
