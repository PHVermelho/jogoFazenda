package Fazenda;

import java.util.Scanner;

public abstract class NomeFazenda {
    public static String nomeFazenda;
    //public static String setNomeFazenda;

    NomeFazenda(){
        this.nomeFazenda = nomeFazenda;
    }

    public static String getNomeFazenda() {
        return nomeFazenda;
    }

    //--------CENTRALIZA O NOME DA FAZENDA---------

    public static void comecoNome(){ //centraliza o nome
        int limite = 50;

        char[] nome = new char[limite];

        for (int i = 0; i < (limite - nomeFazenda.length()) / 2; i++){ //coloca os espaços vazios no nome;
            nome[i] = ' ';
            System.out.print(nome[i]);
        }
    }


    public static void finalNome(){ //centraliza o nome
        int limite = 50;

        if(nomeFazenda.length() % 2 == 0){
            limite = 48;
        }
        //System.out.println(nomeFazenda.length());

        char[] nome = new char[limite];

        for (int i = 0; i < ((limite - nomeFazenda.length()) / 2); i++){ //coloca os espaços vazios no nome;
            nome[i] = ' ';
            System.out.print(nome[i]);
        }
    }

    public static void nomeContagem(){
        Scanner in = new Scanner(System.in);
        boolean isStart = true;

        while (isStart){
            System.out.print("Escolha o nome da sua Fazenda: ");
            nomeFazenda = in.nextLine();

            if(nomeFazenda.length() < 50) {
                isStart = false;
            }else{
                System.out.println("+-------------------------------------------------+");
                System.out.println("|  --->xxx Limite 50 caracteres Excedido xxx<---  |");
                System.out.println("+-------------------------------------------------+");
            }
        }
    }
}
