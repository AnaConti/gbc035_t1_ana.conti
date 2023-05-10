public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial( float val , int num , int pwd, float lim){
        super(val, num, pwd);
        this.limite=lim;
    }

    @Override
    public boolean debitaValor(float val, int pwd, float lim) {
        super.debitaValor(val, pwd);

        if(lim>0 && getSaldo(pwd)==0){
            super.setEstado(pwd, 1);
        }
        
    }

    
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public ContaComum transformarEmContaComum(float val ,int num ,int pwd) {
        ContaComum novaConta = new ContaComum(val ,num ,pwd);
        return novaConta;
    }

}
