package LojaEletronicos;

public class Smartwatch extends Equipamento {
    private static final long serialVersionUID = 1L;

    private String Pulseira;
    private String Sensor;

    public Smartwatch(String nome, String marca, String modelo, Double tamanhoDeTela,
                      Double preco, Double peso, String bateria, Integer garantia, String conexao,
                      String acessorios, String pulseira, String sensores) {

        super(nome, marca, modelo, tamanhoDeTela, preco, peso, bateria, garantia, conexao, acessorios);
        Pulseira = pulseira;
        Sensor = sensores;
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
        retorno += "Pulseira: "     + this.Pulseira     + "\n";
        retorno += "Sensores: "     + this.Sensor + "\n";

        return retorno;
    }
}
