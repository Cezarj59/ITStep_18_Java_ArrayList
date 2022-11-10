package homework_18.services;

import homework_18.veiculos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cadastros {

    static ArrayList<Veiculo> cadastro = new ArrayList<>();

    public static void cadastroCarro() {

        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE CARROS---\n");

        Boolean opcionalNovo = JOptionPane.showConfirmDialog(null, "Veiculo Novo?") != 1;
        String modelo = JOptionPane.showInputDialog(null, "Informe o Modelo: ");
        String fabricante = JOptionPane.showInputDialog(null, "Informe o Fabricante: ");
        String cor = JOptionPane.showInputDialog(null, "Informe a Cor: ");
        String ano = JOptionPane.showInputDialog(null, "Informe o Ano: ");
        Boolean opcionalFreio = JOptionPane.showConfirmDialog(null, "Possui Freio ABS?") != 1;
        Boolean opcionalDirecao = JOptionPane.showConfirmDialog(null, "Possui Direção Hidraulica?") != 1;
        Boolean opcional4Portas = JOptionPane.showConfirmDialog(null, "Possui 4 Portas?") != 1;
        Boolean opcionalAr = JOptionPane.showConfirmDialog(null, "Possui Ar Condicionado?") != 1;

        cadastro.add(new Carro(opcionalFreio, opcionalDirecao, opcional4Portas, opcionalAr, ano, fabricante, modelo, cor, opcionalNovo));
      
    }

    public static void cadastroMoto() {

        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE MOTOS---\n");

        Boolean opcionalNovo = JOptionPane.showConfirmDialog(null, "Veiculo Novo?") != 1;
        String modelo = JOptionPane.showInputDialog(null, "Informe o Modelo: ");
        String fabricante = JOptionPane.showInputDialog(null, "Informe o Fabricante: ");
        String cor = JOptionPane.showInputDialog(null, "Informe a Cor: ");
        String ano = JOptionPane.showInputDialog(null, "Informe o Ano: ");
        String cc = JOptionPane.showInputDialog(null, "Quantas Cilindradas?");
        String categoria = JOptionPane.showInputDialog(null, "Categoria?");

        cadastro.add(new Moto(cc, categoria, ano, fabricante, modelo, cor, opcionalNovo));

    }

    public static void cadastroCaminhao() {

        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE CAMINHÃO---\n");

        Boolean opcionalNovo = JOptionPane.showConfirmDialog(null, "Veiculo Novo?") != 1;
        String modelo = JOptionPane.showInputDialog(null, "Informe o Modelo: ");
        String fabricante = JOptionPane.showInputDialog(null, "Informe o Fabricante: ");
        String cor = JOptionPane.showInputDialog(null, "Informe a Cor: ");
        String ano = JOptionPane.showInputDialog(null, "Informe o Ano: ");
        int eixos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de EIXOS?"));
        String tipoCarroceria = JOptionPane.showInputDialog(null, "Informe o tipo de Carroceria?");
        double tara = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Tara?"));
        double pbt = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Peso Bruto Total?"));

        cadastro.add(new Caminhao(eixos, tipoCarroceria, tara, pbt, ano, fabricante, modelo, cor, opcionalNovo));

    }
}
