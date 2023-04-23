public class C1 {
    public int num1;
    protected int num2;
    private int num3;

    public C1(){
        this.num1=0;
        this.num2=5;
        this.num3=1;
        System.out.println("Pasagem pelo construtor sem parametro C1!");
    } 

    public C1(int i, int j, int k){
        this.num2=j;
        this.num1=i;
        this.num3=k;
        System.out.println("Passagem pelo construtor com parametro C1!");
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public String mostraC1(){
        return "Numero 1: " +num1+
                "\nNumero 2: "+getNum2()+
                "\nNumero 3: "+getNum3();
    }
}
