public class C3 extends C2{
    public int num7;
    protected int num8;
    private int num9;

    public C3(){
        this.num7=9;
        this.num8=8;
        this.num9=7;
        System.out.println("Pasagem pelo construtor sem parametro C3!");
    } 

    public C3(int i, int j, int k){
        this.num7=i;
        this.num8=j;
        this.num9=k;
        System.out.println("Passagem pelo construtor com parametro C3!");
    }

    public C3(int i, int j){
        super(1,2,3);
        this.num7=i;
        this.num8=j;
        this.num9=0;
    }

    public int getNum7() {
        return num7;
    }

    public void setNum7(int num7) {
        this.num7 = num7;
    }

    public int getNum8() {
        return num8;
    }

    public void setNum8(int num8) {
        this.num8 = num8;
    }

    public int getNum9() {
        return num9;
    }

    public void setNum9(int num9) {
        this.num9 = num9;
    }

    public String mostraC3(){
        return "Numero 1: " +getNum1()+
                "\nNumero 2: "+getNum2()+
                "\nNumero 3: "+getNum3()+
                "\nNumero 4: "+getNum4()+
                "\nNumero 5: "+getNum5()+
                "\nNumero 6: "+getNum6()+
                "\nNumero 7: "+getNum7()+
                "\nNumero 8: "+getNum8()+
                "\nNumero 9: "+getNum9();
    }

    public String mostraSuperC3(){
        return super.mostraSuperC2()+
                "\nNumero 7: "+getNum7()+
                "\nNumero 8: "+getNum8()+
                "\nNumero 9: "+getNum9();
    }
}
