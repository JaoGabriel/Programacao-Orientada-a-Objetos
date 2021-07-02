package LojaEletronicos;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class LojaEletronicos {
    private ArrayList<Equipamento> equipamentos;

    public LojaEletronicos() {
        this.equipamentos = new ArrayList<>();
    }

    public Notebook readNotebook(){
        String [] valores;
        String [] nomeVal = {"Notebook","Nome","Marca","Modelo","Tamanho De Tela (Polegadas Ex.:22.1)",
                "Preco (Ex.: 1000.00)","Peso (Em Gramas Ex.: 1000)","Bateria (Miliampere hora Ex.: 5000maH)",
                "Garantia (Anos ex.: 2)","Conexao","Acessorio","Processador","MemoriaRam (GB)","Memoria (GB)","Fonte (W)"};

        valores = readValues (nomeVal);

        var tamanhoTela = this.retornaDouble(valores[4]);
        var preco = this.retornaDouble(valores[5]);
        var peso = this.retornaDouble(valores[6]);
        var garantia = this.retornaInteiro(valores[8]);
        var memoRam = this.retornaInteiro(valores[12]);
        var memo = this.retornaInteiro(valores[13]);
        var fonte = this.retornaInteiro(valores[14]);

        var noteBook = new Notebook(valores[1],valores[2],valores[3],tamanhoTela,preco,
                peso,valores[7],garantia,valores[9],valores[10],valores[11],
               memoRam,memo,fonte);

        return noteBook;
    }

    public Smartphone readSmartphone(){
        String [] valores;
        String [] nomeVal = {"Smartphone","Nome","Marca","Modelo","Tamanho De Tela (Polegadas Ex.:22.1)",
                "Preco (Ex.: 1000.00)","Peso (Em Gramas Ex.: 1000)","Bateria (Miliampere hora Ex.: 5000maH)",
                "Garantia (Anos ex.: 2)","Conexao","Acessorio","QuantidadeDeChips","Camera (Pixels)"};

        valores = readValues (nomeVal);

        var tamanhoTela = this.retornaDouble(valores[4]);
        var preco = this.retornaDouble(valores[5]);
        var peso = this.retornaDouble(valores[6]);
        var garantia = this.retornaInteiro(valores[8]);
        var qtdChips = this.retornaInteiro(valores[11]);
        var camera = this.retornaInteiro(valores[12]);

        var smartPhone = new Smartphone(valores[1],valores[2],valores[3],tamanhoTela,preco,
                peso,valores[7],garantia,valores[8],valores[10],qtdChips,camera);

        return smartPhone;
    }

    public Smartwatch readSmartwatch(){
        String [] valores;
        String [] nomeVal = {"Smartwatch","Nome","Marca","Modelo","Tamanho De Tela (Polegadas Ex.:22.1)",
                "Preco (Ex.: 1000.00)","Peso (Em Gramas Ex.: 1000)","Bateria (Miliampere hora Ex.: 5000maH)",
                "Garantia (Anos ex.: 2)","Conexao","Acessorio","Pulseira","Sensor"};

        valores = readValues (nomeVal);

        var tamanhoTela = this.retornaDouble(valores[4]);
        var preco = this.retornaDouble(valores[5]);
        var peso = this.retornaDouble(valores[6]);
        var garantia = this.retornaInteiro(valores[8]);

        var smartwatch = new Smartwatch(valores[1],valores[2],valores[3],tamanhoTela,preco,
                peso,valores[7],garantia,valores[9],valores[10],valores[11],valores[12]);

        return smartwatch;
    }

    public String[] readValues (String [] dadosIn){
        String [] dadosOut = new String [dadosIn.length];

        for (int i = 1; i < dadosIn.length; i++){
            if(dadosIn[0].equals("Notebook")){
                dadosOut[i] = JOptionPane.showInputDialog  ("Insira " + dadosIn[i]+ ": ");
                ValidaEntradaDeDadosNoteBook(dadosIn[i],dadosOut[i],i);
            }

            if(dadosIn[0].equals("Smartphone")){
                dadosOut[i] = JOptionPane.showInputDialog  ("Insira " + dadosIn[i]+ ": ");
                ValidaEntradaDeDadosSmartphone(dadosIn[i],dadosOut[i],i);
            }

            if(dadosIn[0].equals("Smartwatch")){
                dadosOut[i] = JOptionPane.showInputDialog  ("Insira " + dadosIn[i]+ ": ");
                ValidaEntradaDeDadosSmartwatch(dadosIn[i],dadosOut[i],i);
            }
        }

        return dadosOut;
    }

    private String ValidaEntradaDeDadosNoteBook(String dadosIn, String dadosOut,int contador){
        if(contador == 4 || contador == 5 || contador == 6)
            while (!doubleValido(dadosOut)){ dadosOut = JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");}

        if (contador == 8 || contador == 12 || contador == 13 || contador == 14)
            while (!intValido(dadosOut)){ dadosOut = JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");}

        while (dadosOut.isBlank() || dadosOut.isEmpty()){ dadosOut = JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");}

        return dadosOut;
    }

    private String ValidaEntradaDeDadosSmartphone(String dadosIn, String dadosOut,int contador){
        if(contador == 4 || contador == 5 || contador == 6 ){
            if(doubleValido(dadosOut))
                return dadosOut;
            else
                return JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");
        }

        if (contador == 8 || contador == 11 || contador == 12){
            if(intValido(dadosOut))
                return dadosOut;
            else
                return JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");
        }

        if(dadosOut.isBlank() || dadosOut.isEmpty())
            dadosOut = JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");

        return dadosOut;
    }

    private String ValidaEntradaDeDadosSmartwatch(String dadosIn, String dadosOut,int contador){
        if(contador == 4 || contador == 5 || contador == 6){
            if(doubleValido(dadosOut))
                return dadosOut;
            else
                return JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");
        }

        if (contador == 8){
            if(intValido(dadosOut))
                return dadosOut;
            else
                return JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");
        }

        if(dadosOut.isBlank() || dadosOut.isEmpty())
            dadosOut = JOptionPane.showInputDialog  ("Insira " + dadosIn + " correto: ");

        return dadosOut;
    }

    public int retornaInteiro(String entrada) {
        while (!this.intValido(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um numero inteiro.");
        }
        return Integer.parseInt(entrada);
    }

    private boolean intValido(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Double retornaDouble(String entrada) {
        while (!this.doubleValido(entrada)) {
            entrada = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um valor correto.");
        }
        return Double.parseDouble(entrada);
    }

    private boolean doubleValido(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void saveEquipamentos (ArrayList<Equipamento> equipamentos){
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream
                    (new FileOutputStream("c:\\temp\\lojaEletronicos.dados"));
            for (int i = 0; i < equipamentos.size(); i++)
                outputStream.writeObject(equipamentos.get(i));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Impossivel criar arquivo!");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @SuppressWarnings("finally")
    public ArrayList<Equipamento> readEquipamentos (){
        var equipamentosTemp = new ArrayList<Equipamento>();

        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream
                    (new FileInputStream("c:\\temp\\lojaEletronicos.dados"));
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Equipamento) {
                    equipamentosTemp.add((Equipamento) obj);
                }
            }
        } catch (EOFException ex) {
            System.out.println("Fim do arquivo.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Arquivo inexistente!");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
            return equipamentosTemp;
        }
    }

    public void menuLojaEquipamentos (){

        String menu = "";
        String entrada;
        int    opc1, opc2;

        do {
            menu = "Bem-Vindo a Loja De Equipamentos!\n" +
                    "Menu de Opcoes:\n" +
                    "1. Incluir Equipamentos\n" +
                    "2. Listar Equipamentos\n" +
                    "3. Excluir Equipamentos\n" +
                    "4. Salvar Equipamentos\n" +
                    "5. Ler Equipamentos\n" +
                    "9. Sair";

            entrada = JOptionPane.showInputDialog (menu + "\n\n");
            opc1 = this.retornaInteiro(entrada);

            switch (opc1) {
                case 1:
                    menu = "Inclusao de equipamentos\n" +
                            "Opcoes:\n" +
                            "1. Notebook\n" +
                            "2. Smartphone\n" +
                            "3. Smartwatch\n" +
                            "9. Voltar\n";

                    entrada = JOptionPane.showInputDialog (menu + "\n\n");
                    opc2 = this.retornaInteiro(entrada);

                    switch (opc2){
                        case 1: var notebook = readNotebook();
                            equipamentos.add(notebook);
                            JOptionPane.showMessageDialog(null,notebook);
                            break;
                        case 2: var smartphone = readSmartphone();
                            equipamentos.add(smartphone);
                            JOptionPane.showMessageDialog(null,smartphone);
                            break;
                        case 3: var smartwatch = readSmartwatch();
                            equipamentos.add(smartwatch);
                            JOptionPane.showMessageDialog(null,smartwatch);
                            break;
                        case 9: break;
                        default:
                            JOptionPane.showMessageDialog(null,"Favor escolher uma opcao valida!");
                    }
                    break;

                case 2: // Exibir dados
                    if (equipamentos.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Erro! Favor cadastrar equipamentos!");
                        break;
                    }
                    String dados = "";
                    for (int i = 0; i < equipamentos.size(); i++)	{
                        dados += equipamentos.get(i).toString() + "---------------\n";
                    }
                    JOptionPane.showMessageDialog(null,dados);
                    break;

                case 3: // Limpar Dados
                    if (equipamentos.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Erro! Nao e possivel limpar dados inexistentes!");
                        break;
                    }
                    equipamentos.clear();
                    JOptionPane.showMessageDialog(null,"Dados LIMPOS com sucesso!");
                    break;

                case 4: // Grava Dados
                    if (equipamentos.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Erro! Nao foi possivel salvar os dados.\n Cadastre equipamentos primeiro!");
                        break;
                    }
                    saveEquipamentos(equipamentos);
                    JOptionPane.showMessageDialog(null,"Dados SALVOS com sucesso!");
                    break;

                case 5: // Recupera Dados
                    equipamentos = readEquipamentos();
                    if (equipamentos.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Erro! Nao existem dados para serem listados.");
                        break;
                    }
                    JOptionPane.showMessageDialog(null,"Dados Lidos com sucesso!");
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null,"Encerrando Aplicativo Loja De Eletronicos!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Favor escolher uma opcao valida!");
            }
        } while (opc1 != 9);
    }

    public static void main (String [] args){

        var loja = new LojaEletronicos ();
        loja.menuLojaEquipamentos();
    }
}
