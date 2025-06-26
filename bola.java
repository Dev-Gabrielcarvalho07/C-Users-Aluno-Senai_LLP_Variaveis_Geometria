import java.util.Scanner;


public class bola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite o raio da esfera (em unidades): ");
        try {
            double raio = scanner.nextDouble();
            if (raio >= 0) {
                double area = calcularAreaEsfera(raio);
                System.out.printf("A área superficial da esfera é: %.2f unidades quadradas%n", area);
            } else {
                System.out.println("O raio não pode ser negativo!");
            }
        } catch (Exception e) {
            System.out.println("Por favor, digite um número válido!");
        } finally {
            scanner.close();
        }
    }
   
    public static double calcularAreaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}
