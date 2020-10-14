import java.util.Random;
import java.util.Scanner;

public class MainDau1 {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        Random random = new Random();
        int tiradas;
        int dado1;
        int dado2;
        int dado1y2 = 0;
        int con2 = 0;
        int con3 = 0;
        int con4 = 0;
        int con5 = 0;
        int con6 = 0;
        int con7 = 0;
        int con8 = 0;
        int con9 = 0;
        int con10 = 0;
        int con11 = 0;
        int con12 = 0;


        System.out.println("¿¿¿¿Cuantas veces quieres tirar tus dados????");
            tiradas = rc.nextInt();
            for(int i = 0; i < tiradas; i++){
                dado1 = random.nextInt(6) + 1;
                dado2 = random.nextInt(6) + 1;
                dado1y2 = dado1 + dado2;



                switch (dado1y2){
                    case 2:
                        con2++;
                        break;
                    case 3:
                        con3++;
                        break;
                    case 4:
                        con4++;
                        break;
                    case 5:
                        con5++;
                        break;
                    case 6:
                        con6++;
                        break;
                    case 7:
                        con7++;
                        break;
                    case 8:
                        con8++;
                        break;
                    case 9:
                        con9++;
                        break;
                    case 10:
                        con10++;
                        break;
                    case 11:
                        con11++;
                        break;
                    case 12:
                        con12++;
                        break;
                }
            }
        System.out.println("El numero 2 ha salido: "+ con2 +" veces");
        System.out.println("El numero 3 ha salido: "+ con3 +" veces");
        System.out.println("El numero 4 ha salido: "+ con4 +" veces");
        System.out.println("El numero 5 ha salido: "+ con5 +" veces");
        System.out.println("El numero 6 ha salido: "+ con6 +" veces");
        System.out.println("El numero 7 ha salido: "+ con7 +" veces");
        System.out.println("El numero 8 ha salido: "+ con8 +" veces");
        System.out.println("El numero 9 ha salido: "+ con9 +" veces");
        System.out.println("El numero 10 ha salido: "+ con10 +" veces");
        System.out.println("El numero 11 ha salido: "+ con11 +" veces");
        System.out.println("El numero 12 ha salido: "+ con12 +" veces");

    }
}
