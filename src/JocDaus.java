public class JocDaus {

    Dau dado1 = new Dau();
    Dau dado2 = new Dau();
    Dau dado3 = new Dau();
   private int ganadas = 0;
    private int perdidas = 0;

    public JocDaus() {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.dado3 = dado3;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public void jugar(){
       int uno = dado1.tirar();
       int dos = dado2.tirar();
       int tres = dado3.tirar();
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("El resultado de su tirada es: \ndado1: ("+ uno +"), dado2: ("+ dos + "), dado3: ("+ tres +")" );
        System.out.println("------------------------------------");
        System.out.println("");
       if((uno == dos) && (dos ==tres)){
           ganadas ++;
       }else {
           perdidas ++;
       }
    }

}
