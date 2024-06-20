package edu.desafioiphone.model;

import edu.desafioiphone.service.AparelhoTelefonico;
import edu.desafioiphone.service.NavegadorInternet;
import edu.desafioiphone.service.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String modelo;
    private String numeroIdentificacao;
    private float preco;

    public Iphone(String modelo, String numeroIdentificacao, float preco){
        setModelo(modelo);
        setNumeroIdentificacao(numeroIdentificacao);
        setPreco(preco);
    }

    public Iphone(String modelo, String numeroIdentificacao){
        setModelo(modelo);
        setNumeroIdentificacao(numeroIdentificacao);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {

        Iphone iphone = new Iphone("15 Pro Max", "0709417738");

        //Métodos em AparelhoTelefonico
        iphone.ligar("34992929292");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Métodos em NavegadorInternet
        iphone.exibirPagina("https://www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //Métodos em ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música Exemplo");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz\n");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Entrando em " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página\n");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
    System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}