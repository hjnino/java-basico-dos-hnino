public class MainWhile {
    public static void main(String[] args) {

        int suma = 0;
        int I = 0;

        while (I < 10) {
            I++;
            System.out.println("Numeros a sumar:" + I);

            suma = suma + I;
        }
        System.out.println("\nLa suma de los numeros es: " + suma);
    }
}