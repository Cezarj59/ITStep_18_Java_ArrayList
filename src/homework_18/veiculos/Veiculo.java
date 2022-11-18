
package homework_18.veiculos;


public abstract class Veiculo {

   
    private String ano;
    private String fabricante;
    private String modelo;
    private String cor;
    private boolean novo;   

    public Veiculo() {
    }
    
    

    public Veiculo( String ano, String fabricante, String modelo, String cor, boolean novo) {
      
        this.ano = ano;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.novo = novo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String isNovo() {
        return novo == true? "Novo" : "Semi-Novo";
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    @Override
    public abstract String toString();
    
}
