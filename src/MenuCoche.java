import java.util.*;
import java.io.*;

public class MenuCoche {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        Coche Puig = new Coche();

        boolean salir = false;
        boolean atras = false;
        int option;
        int personalizacion;

        System.out.println("***Bienvenido al concesionario del Puig***");
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("");

        while (!salir){
            System.out.println("[1] .. Mostrar los modelos existentes en el concesionario");
            System.out.println("[2] .. Personalizar vehiculo");
            System.out.println("[3] .. Salir");
           // try {
                System.out.println("Seleccione una opcion");
                option = rc.nextInt();
                switch (option){
                    case 1:
                        System.out.println("OPCION 1");
                        System.out.println("Estos son las marcas disponibles en nuestro concesionario");
                        System.out.println("");
                        System.out.println("asix GTI");
                        System.out.println("dam TDi");
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("OPCION 2");
                        System.out.println("Personalice su vehiculo");
                        while (!atras) {
                            System.out.println("[1] .. Seleccione el modelo de su Puig ");
                            System.out.println("[2] .. Seleccione la cilindrada de su Puig");
                            System.out.println("[3] .. seleccione la matricula de su Puig");
                            System.out.println("[4] .. seleccione el numero de puertas de su Puig");
                            System.out.println("[5] .. Visualizar como ha quedado su Puig");
                            System.out.println("[6] .. Atraaaaaas!!!");
                            personalizacion = rc.nextInt();
                            switch (personalizacion) {
                                case 1:
                                    System.out.println("Seleccione el modelo de su Puig");
                                    Puig.setModelo(rc.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Seleccione el color de su Puig");
                                    Puig.setColor(rc.nextLine());
                                    break;
                                case 3:
                                    System.out.println("seleccione la matricula de su Puig");
                                    Puig.setMatricula(rc.nextInt());
                                    break;
                                case 4:
                                    System.out.println("seleccione el numero de puertas de su Puig");
                                    Puig.setPuertas(rc.nextInt());
                                    break;
                                case 5:
                                    System.out.println("Visualizar como ha quedado su Puig");
                                    System.out.println("Usted ha elegido un Puig " + Puig.getModelo() + " de " + Puig.getColor() + " cc, con matricula " + Puig.getMatricula() + " y " + Puig.getPuertas() + " puertas.");
                                    break;
                                case 6:
                                    atras = true;
                                    break;
                            }

                        }
                        break;
                    case 3:
                        salir = true;
                        break;
                }
           // }catch (InputMismatchException e){
             //   System.out.println("Debes escribir un numero");
               // rc.nextInt();
            }
        }
    }

//}
