import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Tarea5 {
    // La operación dominante es la comparación dentro de los bucles anidados.
    // Complejidad O(n^2).
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.close(); // Se cierra el scanner para evitar fugas de recursos

        int[] data = new int[n];
        Random rand = new Random();

        // Llenar el arreglo con datos aleatorios
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(1000);
        }

        // Medición del tiempo de ejecución [cite: 55]
        long startTime = System.nanoTime(); // Iniciar medición [cite: 55]
        bubbleSort(data); // Ejecutar el algoritmo
        long endTime = System.nanoTime(); // Finalizar medición [cite: 55]
        long duration = (endTime - startTime) / 1000000; // Duración en milisegundos

        System.out.println("Sorted array (first 10 elements): " + Arrays.toString(Arrays.copyOf(data, Math.min(n, 10))));
        System.out.println("Execution time: " + duration + " ms");
    }
}