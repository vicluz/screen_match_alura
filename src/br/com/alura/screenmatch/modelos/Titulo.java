package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLançamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duraçaoEmMinutos;


    public String getNome() {
        return nome;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuraçaoEmMinutos() {
        return duraçaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuraçaoEmMinutos(int duraçaoEmMinutos) {
        this.duraçaoEmMinutos = duraçaoEmMinutos;
    }

    public void exibeFichaTecnica (){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLançamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
