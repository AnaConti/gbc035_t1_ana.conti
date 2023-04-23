public class C2 extends C1{
    public int num4;
    protected int num5;
    private int num6;

    public C2(){
        this.num4=4;
        this.num5=2;
        this.num6=6;
        System.out.println("Pasagem pelo construtor sem parametro C2!");
    } 

    public C2(int i, int j, int k){
        //super(55,66,10);
        this.num4=i;
        this.num5=j;
        this.num6=k;
        System.out.println("Passagem pelo construtor com parametro C2!");
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public String mostraC2(){
        return "Numero 1: " +getNum1()+
                "\nNumero 2: "+getNum2()+
                "\nNumero 3: "+getNum3()+
                "\nNumero 4: "+getNum4()+
                "\nNumero 5: "+getNum5()+
                "\nNumero 6: "+getNum6();
    }

    public String mostraSuperC2(){
        return super.mostraC1() +
        "\nNumero 4: "+getNum4()+
        "\nNumero 5: "+getNum5()+
        "\nNumero 6: "+getNum6();
    }
}
