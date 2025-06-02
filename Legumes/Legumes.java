package Legumes;

public abstract class Legumes {

    private String nome;
    private double tempoColheita;
    private double aguaDiaria;
    private boolean isPerene;
    private String estacaoIdeal;
    private double valorComprarSemente;
    private double valorVenda;

    public Legumes(String nome, double tempoColheita, double aguaDiaria, boolean isPerene, String estacaoIdeal, double valorComprarSemente, double valorVenda) {
        this.nome = nome;
        this.tempoColheita = tempoColheita;
        this.aguaDiaria = aguaDiaria;
        this.isPerene = isPerene;
        this.estacaoIdeal = estacaoIdeal;
        this.valorComprarSemente = valorComprarSemente;
        this.valorVenda = valorVenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTempoColheita(double tempoColheita) {
        this.tempoColheita = tempoColheita;
    }

    public double getTempoColheita() {
        return tempoColheita;
    }

    public void setAguaDiaria(double aguaDiaria) {
        this.aguaDiaria = aguaDiaria;
    }

    public double getAguaDiaria() {
        return aguaDiaria;
    }

    public void setIsPerene(boolean isPerene) {
        this.isPerene = isPerene;
    }

    public boolean getIsPerene() {
        return isPerene;
    }

    public void setEstacaoIdeal(String estacaoIdeal) {
        this.estacaoIdeal = estacaoIdeal;
    }

    public String getEstacaoIdeal() {
        return estacaoIdeal;
    }

    public void setValorComprarSemente(double valorComprarSemente) {
        this.valorComprarSemente = valorComprarSemente;
    }

    public double getValorComprarSemente() {
        return valorComprarSemente;
    }

    public void setValorVenderSemente(double valorVenderSemente) {
        this.valorVenda = valorVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Tempo Colheita: " + tempoColheita + " dias");
        System.out.println("Água diaria: " + aguaDiaria + " litros");
        System.out.println("Perene: " + isPerene);
        System.out.println("Estação Ideal: " + estacaoIdeal);
        System.out.println("Valor Semente: R$" + valorComprarSemente);
        System.out.println("Valor Venda: R$" + valorVenda);
    }
}