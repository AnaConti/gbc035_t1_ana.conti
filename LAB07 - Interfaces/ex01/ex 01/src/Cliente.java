public class Cliente implements Classificavel{
    private String nome;

    public boolean eMenorQue(Classificavel o){
        Cliente compara= (Cliente) o;
        if(this.nome.equals(compara.nome)){
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
