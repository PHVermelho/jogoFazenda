package Loja;

import java.util.Scanner;

import Loja.MenuComprar.Comprar;
import Loja.MenuVender.Vender;

public abstract class Loja {

    public static void menuLoja() {
        Scanner in = new Scanner(System.in);

        String menuOp;
        boolean isStart = true;

            while (isStart) {

                System.out.println("+-------------------------------------------------+");
                System.out.println("|         --->xxx SEJA BEM-VINDO xxx<---          |");
                System.out.println("+-------------------------------------------------+");
                System.out.println("|                  1 - Comprar                    |");
                System.out.println("|                  2 - Vender                     |");
                System.out.println("|             0 - Voltar a Fazenda                |");
                System.out.println("+-------------------------------------------------+");
                System.out.print("Digite uma opção: ");

                menuOp = in.nextLine();

                switch (menuOp) {
                    case "1":
                        Comprar.menuComprar();
                        break;
                    case "2":
                        Vender.menuVender();
                        break;
                    case "0":
                        isStart = false;
                        break;
                    default:
                        System.out.println("+-------------------------------------------------+");
                        System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---         |");
                        System.out.println("+-------------------------------------------------+");
                }
            }
            System.out.println("+-------------------------------------------------+");
            System.out.println("|          --->xxx VOLTE SEMPRE! xxx<---          |");
            System.out.println("+-------------------------------------------------+");
    }
}

/*C:\ProjetosPessoais\JogoFazenda>javac -d . Legumes\Legumes.java Legumes\Outono\Cenoura\Cenoura.java Legumes\Primavera\Alface\Alface.java Legumes\Verao\Tomate\Tomate.java Legumes\Inverno\Brocolis\Brocolis.java Loja\Loja.java

C:\ProjetosPessoais\JogoFazenda>java Loja\Loja.java*/