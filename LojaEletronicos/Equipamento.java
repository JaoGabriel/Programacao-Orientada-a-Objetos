package LojaEletronicos;

import java.io.Serializable;

public abstract class Equipamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private String Nome;
    private String Marca;
    private String Modelo;
    private Double TamanhoDeTela;
    private Double Preco;
    private Double Peso;
    private String Bateria;
    private Integer Garantia;
    private String Conexao;
    private String Acessorio;

    public Equipamento(String nome, String marca, String modelo,
                       Double tamanhoDeTela, Double preco, Double peso,
                       String bateria, Integer garantia, String conexao,
                       String acessorios) {
        Nome = nome;
        Marca = marca;
        Modelo = modelo;
        TamanhoDeTela = tamanhoDeTela;
        Preco = preco;
        Peso = peso;
        Bateria = bateria;
        Garantia = garantia;
        Conexao = conexao;
        Acessorio = acessorios;
    }

    public String getNome() {
        return Nome;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public Double getTamanhoDeTela() {
        return TamanhoDeTela;
    }

    public Double getPreco() {
        return Preco;
    }

    public Double getPeso() {
        return Peso;
    }

    public String getBateria() {
        return Bateria;
    }

    public Integer getGarantia() {
        return Garantia;
    }

    public String getConexao() {
        return Conexao;
    }

    public String getAcessorios() {
        return Acessorio;
    }

    @Override
    public String toString() {
        String retorno = "";

        retorno += "Nome: "     + this.Nome     + "\n";
        retorno += "Marca: "     + this.Marca     + "\n";
        retorno += "Modelo: "     + this.Modelo     + "\n";
        retorno += "TamanhoDeTela: "     + this.TamanhoDeTela     + "\n";
        retorno += "Preco: "     + this.Preco     + "\n";
        retorno += "Peso: "     + this.Peso     + "\n";
        retorno += "Bateria: "     + this.Bateria     + "\n";
        retorno += "Garantia: "     + this.Garantia     + "\n";
        retorno += "Conexao: "     + this.Conexao     + "\n";
        retorno += "Acessorios: "     + this.Acessorio     + "\n";

        return retorno;
    }
}
