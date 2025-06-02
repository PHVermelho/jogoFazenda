package Loja.MenuVender;

import java.util.Scanner;

public abstract class Vender {

    public static void menuVender() {
        Scanner in = new Scanner(System.in);

        String menuOp;
        boolean isStart = true;

        while (isStart) {
            System.out.println("+-------------------------------------------------+");
            System.out.println("|                     Vender                      |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|                 1 - Sementes                    |");
            System.out.println("|                 2 - Água                        |");
            System.out.println("|                 3 - Adubo                       |");
            System.out.println("|                 4 - Lote                        |");
            System.out.println("|                 0 - Loja                        |");
            System.out.println("+-------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuOp = in.nextLine();


            switch (menuOp) {
                case "0":
                    isStart = false;
                    break;
                case "1":
                    System.out.println("Case 1");
                    break;
                case "2":
                    System.out.println("Case 2");
                    break;
                case "3":
                    System.out.println("Case 3");
                    break;
                case "4":
                    System.out.println("Case 4");
                    break;
                default:
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("|        --->xxx ESCOLHA INVÁLIDA xxx<---         |");
                    System.out.println("+-------------------------------------------------+");
            }
        }
    }
}
