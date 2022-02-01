package Repetição;

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

        System.out.println("Insira o décimo numero:");
        x9=id.nextInt();

        do {
            soma=x0+x1+x2+x3+x4+x5+x6+x7+x8+x9;
            System.out.println("A soma dos numeros é:"+soma );

        }while (x=0!=0x1!=0x2!=0x3!=0x4!=0x5!=0x6!=0x7!=0x8!=0||x9!=0);
    }
}