package Loja.MenuComprar;

import Legumes.Inverno.Alho.Alho;
import Legumes.Inverno.Brocolis.Brocolis;
import Legumes.Outono.Batata.Batata;
import Legumes.Outono.Cenoura.Cenoura;
import Legumes.Primavera.Alface.Alface;
import Legumes.Primavera.Rabanete.Rabanete;
import Legumes.Verao.Pimentao.Pimentao;
import Legumes.Verao.Tomate.Tomate;


import java.util.Scanner;

public abstract class Comprar {

    public static void menuComprar() {
        Scanner in = new Scanner(System.in);

        int menuEntrada;
        boolean comprando = true;

        while (comprando) {
            System.out.println("+------------------------------------------------+");
            System.out.println("|                    Comprar                     |");
            System.out.println("+------------------------------------------------+");
            System.out.println("|                 1 - Sementes                   |");
            System.out.println("|                 2 - Água                       |");
            System.out.println("|                 3 - Adubo                      |");
            System.out.println("|                 4 - Lote                       |");
            System.out.println("|                 0 - Sair                       |");
            System.out.println("+------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuEntrada = in.nextInt();
            switch (menuEntrada) {
                case 0:
                    comprando = false;
                    break;
                case 1:
                    menuEstacao();
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                case 3:
                    System.out.println("Case 3");
                    break;
                case 4:
                    System.out.println("Case 4");
                    break;
                default:
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                    System.out.println("+------------------------------------------------+");
            }
        }
    }

    public static void menuEstacao() {
        Scanner in = new Scanner(System.in);

        int menuEntrada;
        boolean comprando = true;

        while (comprando) {
            System.out.println("+------------------------------------------------+");
            System.out.println("|                   Estação                      |");
            System.out.println("+------------------------------------------------+");
            System.out.println("|                1 - Verão                       |");
            System.out.println("|                2 - Outono                      |");
            System.out.println("|                3 - Inverno                     |");
            System.out.println("|                4 - Primavera                   |");
            System.out.println("|                0 - Sair                        |");
            System.out.println("+------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuEntrada = in.nextInt();
            switch (menuEntrada) {
                case 0:
                    comprando = false;
                    break;
                case 1:
                    sementesVerao();
                    break;
                case 2:
                    sementesOutono();
                    break;
                case 3:
                    sementesInverno();
                    break;
                case 4:
                    sementesPrimavera();
                    break;
                default:
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                    System.out.println("+------------------------------------------------+");
            }
        }
    }

    public static void sementesVerao() {

        Pimentao pimentao = new Pimentao();
        Tomate tomate = new Tomate();

        Scanner in = new Scanner(System.in);
        int menuEntrada;
        boolean isEntrada = true;

        while (isEntrada) {

            System.out.println("+------------------------------------------------+");
            System.out.println("|                      Verão                     |");
            System.out.println("+------------------------------------------------+");
            System.out.println("|  1 - Pimentão                       $$" + pimentao.getValorComprarSemente() + "     |");
            System.out.println("|  2 - Tomate                         $$" + tomate.getValorComprarSemente() + "     |");
            System.out.println("|  0 - Sair                                      |");
            System.out.println("+------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuEntrada = in.nextInt();

            switch (menuEntrada) {
                case 0:
                    isEntrada = false;
                    break;
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                    System.out.println("+------------------------------------------------+");
            }
        }
    }

    public static void sementesOutono() {

        Batata batata = new Batata();
        Cenoura cenoura = new Cenoura();

        Scanner in = new Scanner(System.in);
        int menuEntrada;
        boolean isEntrada = true;


        while (isEntrada) {

            System.out.println("+------------------------------------------------+");
            System.out.println("|                     Outono                     |");
            System.out.println("+------------------------------------------------+");
            System.out.println("|  1 - Batata                         $$" + batata.getValorComprarSemente() + "     |");
            System.out.println("|  2 - Cenoura                        $$" + cenoura.getValorComprarSemente() + "     |");
            System.out.println("|  0 - Sair                                      |");
            System.out.println("+------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuEntrada = in.nextInt();

            switch (menuEntrada) {
                case 0:
                    isEntrada = false;
                    break;
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                    System.out.println("+------------------------------------------------+");
            }
        }
    }

    public static void sementesInverno() {

        Alho alho = new Alho();
        Brocolis brocolis = new Brocolis();

        Scanner in = new Scanner(System.in);
        int menuEntrada;
        boolean isEntrada = true;

        while (isEntrada) {

            System.out.println("+------------------------------------------------+");
            System.out.println("|                    Inverno                     |");
            System.out.println("+------------------------------------------------+");
            System.out.println("|  1 - Alho                           $$" + alho.getValorComprarSemente() + "     |");
            System.out.println("|  2 - Brócolis                       $$" + brocolis.getValorComprarSemente() + "     |");
            System.out.println("|  0 - Sair                                      |");
            System.out.println("+------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuEntrada = in.nextInt();

            switch (menuEntrada) {
                case 0:
                    isEntrada = false;
                    break;
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                    System.out.println("+------------------------------------------------+");
            }
        }
    }

    public static void sementesPrimavera() {

        Alface alface = new Alface();
        Rabanete rabanete = new Rabanete();

        Scanner in = new Scanner(System.in);
        int menuEntrada;
        boolean isEntrada = true;

        while (isEntrada) {

            System.out.println("+------------------------------------------------+");
            System.out.println("|                    Primavera                   |");
            System.out.println("+------------------------------------------------+");
            System.out.println("|  1 - Alface                          $$" + alface.getValorComprarSemente() + "     |");
            System.out.println("|  2 - Rabanete                        $$" + rabanete.getValorComprarSemente() + "     |");
            System.out.println("|  0 - Sair                                      |");
            System.out.println("+------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuEntrada = in.nextInt();

            switch (menuEntrada) {
                case 0:
                    isEntrada = false;
                    break;
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("+------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                    System.out.println("+------------------------------------------------+");
            }
        }
    }

}


