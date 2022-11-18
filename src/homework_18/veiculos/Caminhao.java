package homework_18.veiculos;

public class Caminhao extends Veiculo {

    private int qtdEixos;
    private String tipoCarroceria;
    private double tara;
    private double pesoBrutoTotal;
    
    public Caminhao() {}

    public Caminhao(int qtdEixos, String tipoCarroceria, double tara, double pesoBrutoTotal, String ano, String fabricante, String modelo, String cor, boolean novo) {
        super(ano, fabricante, modelo, cor, novo);
        this.qtdEixos = qtdEixos;
        this.tipoCarroceria = tipoCarroceria;
        this.tara = tara;
        this.pesoBrutoTotal = pesoBrutoTotal;
    }

    

    
    
    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    public void setPesoBrutoTotal(double pesoBrutoTotal) {
        this.pesoBrutoTotal = pesoBrutoTotal;
    }

    @Override
    public String toString() {
        return "\nModelo = " + getModelo()
                + "\nFabricante = " + getFabricante()
                + "\nEstado = " + isNovo()
                + "\nCor = " + getCor()
                + "\nAno = " + getAno()
                + "\nEixos = " + getQtdEixos()
                + "\nTipo de Carroceria = " + getTipoCarroceria()
                + "\nTara = " + getTara()
                + "\nPeso Liquido = " + (getPesoBrutoTotal() - getTara())
                + "\nPeso Bruto Total = " + getPesoBrutoTotal();

    }
}
