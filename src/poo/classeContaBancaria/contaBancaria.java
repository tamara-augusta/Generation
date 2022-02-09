package poo.classeContaBancaria;

import java.util.Scanner;

public class contaBancaria {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        int opcao;

        conta.informacoesConta();

        System.out.println("Selecione uma opção abaixo: ");
        System.out.println("1. Imprimir saldo\n2. Verificar status da conta\n3- Sair\n");
        System.out.print("Número: ");
        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                conta.imprimirSaldo();
                break;

            case 2:
                conta.statusConta();
                break;
            
            case 3:
                System.exit(0);
                break;
        }
        sc.close();
    }

}
