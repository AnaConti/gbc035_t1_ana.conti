public class CamaroteSuperior extends VIP{
    private double valorAdicionalCS;

    public CamaroteSuperior(double valorAdicionalCS, double valor, double valorAdicional){
        super(valor, valorAdicional);
        this.valorAdicionalCS=valorAdicionalCS;
    }

    public double getValorAdicionalCS() {
        return valorAdicionalCS;
    }

    public void setValorAdicionalCS(double valorAdicionalCS) {
        this.valorAdicionalCS = valorAdicionalCS;
    }

    public double valorCS(){
        return super.valorIngressoVIP() + getValorAdicionalCS();
    }
}
