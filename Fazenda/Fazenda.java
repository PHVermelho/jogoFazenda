package Fazenda;

import Banco.Banco;
import Loja.Loja;

import java.util.Scanner;

public class Fazenda {

    public static void menuFazenda() {
        Scanner in = new Scanner(System.in);

        String menuOp;
        int contadorDias = 1;
        String nomeFazenda;

        //System.out.print("Escolha o nome da sua Fazenda: ");
        //nomeFazenda = in.nextLine();

        while (true) {

            System.out.println("+------------------------------------------------+");
            //System.out.println("     Fazenda "+nomeFazenda                       );
            System.out.println("     Saldo $$" + Banco.getSaldoFazenda()           );
            System.out.println("     Dia - "+ contadorDias                         );
            System.out.println("+------------------------------------------------+");
            System.out.println("|              1 - Lotes                         |");
            System.out.println("|              2 - Loja                          |");
            System.out.println("|              3 - Banco                         |");
            System.out.println("|              4 - Relatório Diário              |");
            System.out.println("|              0 - Terminar o Dia                |");
            System.out.println("+------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuOp = in.nextLine();

            switch (menuOp) {

                case "1":
                    System.out.println("Case 1");
                    break;
                case "2":
                    Loja.menuLoja();
                    break;
                case "3":
                    Banco.menuBanco();
                    break;
                case "4":
                    System.out.println("Case 4");
                    break;
                default:
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                    System.out.println("+------------------------------------------------+");
                case "0":
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|            Deseja Finalizar seu Dia?           |");
                    System.out.println("|                                                |");
                    System.out.println("|            S - SIM           N - NÃO           |");
                    System.out.println("+------------------------------------------------+");
                    System.out.print("Digite uma opção: ");
                    menuOp = in.nextLine().toUpperCase();

                    switch (menuOp){
                        case "S":
                            System.out.println("+------------------------------------------------+");
                            System.out.println("|         --->xxx Dia Finalizado xxx<---         |");
                            System.out.println("+------------------------------------------------+");
                            contadorDias++;
                            break;
                        case "N":
                    }
            }
        }
    }


    public static void main(String[] args) {

        Fazenda fazenda = new Fazenda();
        fazenda.menuFazenda();
    }
}
