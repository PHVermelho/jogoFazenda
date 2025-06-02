package Fazenda.Lotes;

public class Lotes {
    String tamanhoLote;
    int qtPlantacoes;
    double valorLote;

    public Lotes(String tamanhoLote, int qtPlantacoes, double valorLote){
        this.tamanhoLote = tamanhoLote;
        this.qtPlantacoes = qtPlantacoes;
        this.valorLote = valorLote;
    }

    public Lotes(String are) {
    }

    public void setTamanhoLote(String tamanhoLote){
        this.tamanhoLote = tamanhoLote;
    }

    public String getTamanhoLote(){
        return tamanhoLote;
    }

    public void setQtPlantacoes(int qtPlantacoes){
        this.qtPlantacoes = qtPlantacoes;
    }

    public int getQtPlantacoes(){
        return qtPlantacoes;
    }

    public void setValorLote(double valorLote){
        this.valorLote = valorLote;
    }

    public double getValorLote(){
        return valorLote;
    }
}
