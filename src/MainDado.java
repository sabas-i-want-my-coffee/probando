import java.util.Scanner;

public class MainDado {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        boolean salir = false;
        int option;
        int numPartidas = 0;

        System.out.println("||||||||||||||||||||||||");
        System.out.println("||JUEGOS TRADICIONALES||");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("");
        System.out.println("Seleccione un juego del menú");
        System.out.println("");
        JocDaus juegazo = new JocDaus( );

        while (salir == false){
            System.out.println("[1] .. Dados");
            System.out.println("[2] .. 3 en raya");
            System.out.println("[3] .. Piedra, papel, tijera");
            System.out.println("[4] .. Risk");
            System.out.println("[5] .. Salir");
            System.out.println("");
            System.out.println("Que juego desea???");
            option = rc.nextInt();
            switch (option){
                 case 1:
                     numPartidas ++;
                     //juego del dado, consiste en sacar 3 dados iguales para ganar, si no pierdes
                    juegazo.jugar();





                     break;
                 case 2:
                     System.out.println("Albert Rivera está jugando con el...");
                     break;
                 case 3:
                     System.out.println("Tenemos la piedra, nos falta el papel y la tijera");
                     break;
                 case 4:
                     System.out.println("Estamos trabajando en ellooo...");
                     break;
                 case 5:
                     //Cuando sales debes de mostrar cuantas partidas has ganado y cuantas partidas has perdido
                     System.out.println("");

                     System.out.println("-----------------------------------------");
                     System.out.println("Has jugado: "+ numPartidas + " partidas!!");
                     System.out.println("-----------------------------------------");
                     System.out.println("Has perdido: "+ juegazo.getPerdidas() + "partidas!!");
                     System.out.println("-----------------------------------------");
                     System.out.println("Has ganado: "+ juegazo.getGanadas() + "partidas!!");
                     System.out.println("-----------------------------------------");
                     salir = true;
                     break;

             }
        }
    }
}
