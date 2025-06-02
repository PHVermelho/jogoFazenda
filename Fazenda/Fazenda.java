package Fazenda;

import Banco.Banco;
import Loja.Loja;

import java.util.Scanner;

public class Fazenda {

    public static int contadorDia = 1;

    //--------ACERTA OS ESPAÇOS DOS DIAS--------
    public static void contadorDiaFinal() {

        int limite = 38;
        String contadorDiaConvert = String.valueOf(contadorDia);

        char[] nome = new char[limite];

        for (int i = 0; i < limite - contadorDiaConvert.length(); i++) { //coloca os espaços vazios no nome;
            nome[i] = ' ';
            System.out.print(nome[i]);
        }
    }

    public static void menuFazenda() {
        Scanner in = new Scanner(System.in);

        String menuOp;
        boolean isStart = true;

        NomeFazenda.nomeContagem();

        while (isStart) {

            System.out.println("+-------------------------------------------------+");
            System.out.print("|");
            NomeFazenda.comecoNome();
            System.out.print(NomeFazenda.getNomeFazenda());
            NomeFazenda.finalNome();
            System.out.println("|");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|                                                 |");
            System.out.print("|     Saldo $$" + Banco.getSaldoFazenda());
            Banco.finalSaldo();
            System.out.println("|");
            System.out.print("|     Dia - ");
            System.out.print(contadorDia);
            contadorDiaFinal();
            System.out.println("|");
            System.out.println("|                                                 |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("\n");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|                  Menu Fazenda                   |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|              1 - Lotes                          |");
            System.out.println("|              2 - Loja                           |");
            System.out.println("|              3 - Banco                          |");
            System.out.println("|              4 - Relatório                      |");
            System.out.println("|              0 - Terminar o Dia                 |");
            System.out.println("+-------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuOp = in.nextLine();

            switch (menuOp) {

                case "1":
                    System.out.println("Case 1: Lotes");
                    break;
                case "2":
                    Loja.menuLoja();
                    break;
                case "3":
                    Banco.menuBanco();
                    break;
                case "4":
                    System.out.println("Case 4: Relatório");
                    break;
                default:
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---         |");
                    System.out.println("+-------------------------------------------------+");
                    break;
                case "0":
                    boolean isStart2 = true;
                    while (isStart2) {
                        System.out.println("+-------------------------------------------------+");
                        System.out.println("|            Deseja Finalizar seu Dia?            |");
                        System.out.println("|                                                 |");
                        System.out.println("|            S - SIM           N - NÃO            |");
                        System.out.println("+-------------------------------------------------+");
                        System.out.print("Digite uma opção: ");
                        menuOp = in.nextLine().toUpperCase();

                        switch (menuOp) {
                            case "S":
                                System.out.println("+-------------------------------------------------+");
                                System.out.println("|         --->xxx Dia Finalizado xxx<---          |");
                                System.out.println("+-------------------------------------------------+");
                                contadorDia++;
                                isStart2 = false;
                                break;
                            default:
                                System.out.println("+-------------------------------------------------+");
                                System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---         |");
                                System.out.println("+-------------------------------------------------+");
                                isStart2 = false;
                                break;
                            case "N":
                                isStart2 = false;
                                break;

                        }
                    }
            }
        }
    }


    public static void main(String[] args) {

        Fazenda fazenda = new Fazenda();
        fazenda.menuFazenda();
    }
}
