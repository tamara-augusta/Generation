package Repeti��o;

import java.util.Scanner;

public class Exercicios4 {

    public static void main(String[] args) {

        int idade, sexo, humor, cont=0, entradas=150;
        int pCalm=0, mNerv=0, hAgre=0, oCalm=0, pNerv40=0, pCalm18=0;
        Scanner ler = new Scanner(System.in);

        while(cont!=entradas) {
            System.out.println("------PESQUISA N�"+cont+"------");
            System.out.println("Qual a sua idade:");
            idade = ler.nextInt();
            System.out.println("Qual o seu sexo: \n(Digite 1-feminino / 2-masculino / 3-Outros) ");
            sexo = ler.nextInt();
            System.out.println("Qual o seu humor predominante: \n(1-Calmo(a); 2-Nervoso(a) e 3-Agressivo(a)");
            humor = ler.nextInt();
            if(humor==1) {
                pCalm++;
            }
            if(sexo==1 && humor==2) {
                mNerv++;
            }
            if(sexo==2 && humor==3) {
                hAgre++;
            }
            if(sexo==3 && humor==1) {
                oCalm++;
            }
            if(idade>40 && humor==2) {
                pNerv40++;
            }
            if(idade<18 && humor==1) {
                pCalm18++;
            }
            cont++;
        }
        System.out.println("---------------RESULTADOS DE "+cont+" ENTRADAS -------------------");
        System.out.println("O n�mero de pessoas calmas � de: "+pCalm+ " pessoas");
        System.out.println("O n�mero de mulheres nervosas � de: "+mNerv+ " mulheres");
        System.out.println("O n�mero de homens agressivos � de: "+hAgre+ " homens");
        System.out.println("O n�mero do sexo 'Outros' e calmos � de: "+oCalm+ " pessoas");
        System.out.println("O n�mero de pessoas nervosas com mais de 40 anos � de: "+pNerv40+ " pessoas");
        System.out.println("O n�mero de pessoas calmas com menos de 18 anos � de "+pCalm18+ " pessoas");

    }

}