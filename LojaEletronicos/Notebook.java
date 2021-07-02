package LojaEletronicos;

public class Notebook extends Equipamento{
    private static final long serialVersionUID = 1L;

    private String Processador;
    private Integer MemoriaRam;
    private Integer Memoria;
    private Integer Fonte;

    public Notebook(String nome, String marca, String modelo, Double tamanhoDeTela, Double preco,
                    Double peso, String bateria, Integer garantia, String conexao, String acessorios,
                    String processador, Integer memoriaRam, Integer memoria, Integer fonte) {

        super(nome, marca, modelo, tamanhoDeTela, preco, peso, bateria, garantia, conexao, acessorios);
        Processador = processador;
        MemoriaRam = memoriaRam;
        Memoria = memoria;
        Fonte = fonte;
    }

    @Override
    public String toString() {
        String retorno = "";

        retorno += "Nome: "     + getNome()     + "\n";
        retorno += "Marca: "     + getMarca()     + "\n";
        retorno += "Modelo: "     + getModelo()    + "\n";
        retorno += "TamanhoDeTela: "     + getTamanhoDeTela()     + "pol\n";
        retorno += "Preco: R$"     +  getPreco()     + "\n";
        retorno += "Peso: "     +  getPeso()     + "g\n";
        retorno += "Bateria: "     + getBateria()     + "\n";
        retorno += "Garantia: "     + getGarantia()    + " ano(s)\n";
        retorno += "Conexao: "     + getConexao()    + "\n";
        retorno += "Acessorios: "     + getAcessorios()     + "\n";
        retorno += "Processador: "     + this.Processador     + "\n";
        retorno += "MemoriaRam: "     + this.MemoriaRam     + "GB\n";
        retorno += "Memoria: "     + this.Memoria     + "GB\n";
        retorno += "Fonte: "     + this.Fonte     + "W\n";

        return retorno;
    }
}
