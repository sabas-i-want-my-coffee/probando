import java.util.Random;

public class Dau {

    private int valor;
    private Random random = new Random();

    public int getValor() {

        return valor;
    }

    public void setValor(int valor) {

        this.valor = valor;
    }

    @Override
    public String toString() {
        return "valor=" + valor;
    }

    public int tirar() {
        // int valor = (int)(Math.random()*10+1);
        //Random random = new Random();
        //IntStream intStream = random.ints(1, 1, 7);
        //Iterator iterator = intStream.iterator();
        //while (iterator.hasNext()) {

            //System.out.println("En su tirada ha sacado el numero: " + iterator.next());
            // }
        valor = (random.nextInt(6) + 1);
        return valor;
        }
    }

