package Banco;

import java.util.Scanner;

public abstract class Banco {
    static double saldoFazenda = 10000.0;
    static double saldoCredito;
    static double emprestimoNivel5 = 10000.0;
    static double emprestimoNivel10 = 20000.0;
    static double emprestimoNivel20 = 40000.0;
    static double emprestimoNivel30 = 60000.0;
    static double emprestimoNivel40 = 80000.0;
    static double emprestimoNivel50 = 100000.0;
    static double investimento30;
    static double investimento90;
    static double investimento180;

    public void setSaldoFazenda(double saldoFazenda){
        this.saldoFazenda = saldoFazenda;
    }

    public static double getSaldoFazenda(){
        return saldoFazenda;
    }

    public void setSaldoCredito(double saldoCredito){
        this.saldoCredito = saldoCredito;
    }

    public double getSaldoCredito(){
        return saldoCredito;
    }

    public double getEmprestimoNivel5() {
        return emprestimoNivel5;
    }

    public double getEmprestimoNivel10() {
        return emprestimoNivel10;
    }

    public double getEmprestimoNivel20() {
        return emprestimoNivel20;
    }

    public double getEmprestimoNivel30() {
        return emprestimoNivel30;
    }

    public double getEmprestimoNivel40() {
        return emprestimoNivel40;
    }

    public double getEmprestimoNivel50() {
        return emprestimoNivel50;
    }

    public void setInvestimento30(double investimento30){
        this.investimento30 = investimento30;
    }

    public double getInvestimento30(){
        return investimento30;
    }

    public void setInvestimento90(double investimento90){
        this.investimento90 = investimento90;
    }

    public double getInvestimento90(){
        return investimento90;
    }

    public void setInvestimento180(double investimento180){
        this.investimento180 = investimento180;
    }

    public double getInvestimento180(){
        return investimento180;
    }

    //--------ACERTA OS ESPAÇOS DO SALDO---------

    public static void finalSaldo(){ //centraliza o nome
        int limite = 36;
        String saldoConvert = String.valueOf(saldoFazenda);

        char[] nome = new char[limite];

        for (int i = 0; i < limite - saldoConvert.length(); i++){ //coloca os espaços vazios no nome;
            nome[i] = ' ';
            System.out.print(nome[i]);
        }
    }

    //--------MENU BANCO---------
    public static void menuBanco() {
        Scanner in = new Scanner(System.in);

        String menuOp;
        boolean isStart = true;

        while (isStart) {
            System.out.println("+-------------------------------------------------+");
            System.out.println("|                     Banco                       |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|              1 - Saldo                          |");
            System.out.println("|              2 - Crédito                        |");
            System.out.println("|              3 - Empréstimo                     |");
            System.out.println("|              4 - Investimentos                  |");
            System.out.println("|              5 - Resumo Finanças                |");
            System.out.println("|              0 - Voltar a Fazenda               |");
            System.out.println("+-------------------------------------------------+");
            System.out.print("Digite uma opção: ");

            menuOp = in.nextLine();

            switch (menuOp) {

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
                case "0":
                    isStart = false;
                    break;
                default:
                    System.out.println("+-------------------------------------------------+");
                    System.out.println("|         --->xxx OPÇÃO INVÁLIDA xxx<---          |");
                    System.out.println("+-------------------------------------------------+");
            }
        }
    }
}
