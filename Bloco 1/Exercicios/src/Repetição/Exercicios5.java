package Repeti��o;

import java.util.Scanner;

public class Exercicios5 {
    public static void main(String[] args) {

        int x0, x1, x2, x3, x4, x5, x6, x7, x8, x9;
        int soma=0;

        Scanner id = new Scanner (System.in);

        System.out.println("Insira o primeiro numero:");
        x0=id.nextInt();

        System.out.println("Insira o segundo numero:");
        x1=id.nextInt();

        System.out.println("Insira o terceiro numero:");
        x2=id.nextInt();

        System.out.println("Insira o quarto numero:");
        x3=id.nextInt();

        System.out.println("Insira o quinto numero:");
        x4=id.nextInt();

        System.out.println("Insira o sexto numero:");
        x5=id.nextInt();

        System.out.println("Insira o setimo numero:");
        x6=id.nextInt();

        System.out.println("Insira o oitavo numero:");
        x7=id.nextInt();

        System.out.println("Insira o nono numero:");
        x8=id.nextInt();

        System.out.println("Insira o d�cimo numero:");
        x9=id.nextInt();

        do {
            soma=x0+x1+x2+x3+x4+x5+x6+x7+x8+x9;
            System.out.println("A soma dos numeros �:"+soma );

        }while (x0!=0 && x1!=0 && x2!=0 && x3!=0 && x4!=0 && x5!=0 && x6!=0 && x7!=0 && x8!=0 && x9!=0);
    }
}