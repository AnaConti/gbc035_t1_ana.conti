public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome=nome;
    }
    public boolean eMenorQue(Classificavel o){
        Cliente compara= (Cliente) o;
        if(this.nome.compareTo(compara.nome)<0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
