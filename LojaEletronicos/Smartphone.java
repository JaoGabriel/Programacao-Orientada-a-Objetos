package LojaEletronicos;

public class Smartphone extends Equipamento{

    private static final long serialVersionUID = 1L;

    private Integer QuantidadeChips;
    private Integer Camera;

    public Smartphone(String nome, String marca, String modelo, Double tamanhoDeTela,
                      Double preco, Double peso, String bateria, Integer garantia, String conexao,
                      String acessorios, Integer quantidadeChips, Integer camera) {

        super(nome, marca, modelo, tamanhoDeTela, preco, peso, bateria, garantia, conexao, acessorios);
        QuantidadeChips = quantidadeChips;
        Camera = camera;
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
        retorno += "QuantidadeChips: "     + this.QuantidadeChips     + "\n";
        retorno += "Camera: "     + this.Camera     + "px\n";

        return retorno;
    }
}
