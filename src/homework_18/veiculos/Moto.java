package homework_18.veiculos;

public class Moto extends Veiculo {

    private String cc;
    private String categoria;

    public Moto() {
    }

    
    public Moto(String cc, String categoria, String ano, String fabricante, String modelo, String cor, boolean novo) {
        super(ano, fabricante, modelo, cor, novo);
        this.cc = cc;
        this.categoria = categoria;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "\nModelo = " + getModelo()
                + "\nFabricante = " + getFabricante()
                + "\nEstado = " + isNovo()
                + "\nCor = " + getCor()
                + "\nAno = " + getAno()
                + "\nCilindradas = " + getCc()
                + "\nCategoria = " + getCategoria();
    }

}
