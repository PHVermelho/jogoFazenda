package Loja;

import java.util.Scanner;

import Loja.MenuComprar.Comprar;
import Loja.MenuVender.Vender;

public class Loja {

    public static void menuLoja() {
        Scanner in = new Scanner(System.in);
        int menuEntrada;
        boolean isEntrada = true;

        try {
            while (isEntrada) {

                System.out.println("+------------------------------------------------+");
                System.out.println("|         --->xxx SEJA BEM-VINDO xxx<---         |");
                System.out.println("+------------------------------------------------+");
                System.out.println("|                  1 - Comprar                   |");
                System.out.println("|                  2 - Vender                    |");
                System.out.println("|                  0 - Sair                      |");
                System.out.println("+------------------------------------------------+");
                System.out.print("Digite uma opção: ");

                menuEntrada = in.nextInt();

                switch (menuEntrada) {
                    case 1:
                        isEntrada = true;
                        Comprar.menuComprar();
                        break;
                    case 2:
                        isEntrada = true;
                        Vender.menuVender();
                        break;
                    case 0:
                        isEntrada = false;
                        break;
                    default:
                        System.out.println("+------------------------------------------------+");
                        System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
                        System.out.println("+------------------------------------------------+");
                }
            }
            System.out.println("+------------------------------------------------+");
            System.out.println("|          --->xxx VOLTE SEMPRE! xxx<---         |");
            System.out.println("+------------------------------------------------+");

        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("+------------------------------------------------+");
            System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---        |");
            System.out.println("+------------------------------------------------+");
        }
    }

    public static void main(String[] args) {

        Loja pedido = new Loja();
        pedido.menuLoja();
    }
}

/*C:\ProjetosPessoais\JogoFazenda>javac -d . Legumes\Legumes.java Legumes\Outono\Cenoura\Cenoura.java Legumes\Primavera\Alface\Alface.java Legumes\Verao\Tomate\Tomate.java Legumes\Inverno\Brocolis\Brocolis.java Loja\Loja.java

C:\ProjetosPessoais\JogoFazenda>java Loja\Loja.java*/