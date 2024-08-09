
public class MainFor {
    public static void main(String[] args) {

        int i, suma = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Numeros a sumar:" + i);

            suma += i;
        }
        System.out.println("\nLa suma es: " + suma);
    }
}
