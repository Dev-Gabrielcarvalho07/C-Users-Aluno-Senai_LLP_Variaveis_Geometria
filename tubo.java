import java.util.Scanner;


public class tubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite o comprimento da aresta do cubo (em unidades): ");
        try {
            double aresta = scanner.nextDouble();
            if (aresta >= 0) {
                double area = calcularAreaCubo(aresta);
                System.out.printf("A área superficial do cubo é: %.2f unidades quadradas%n", area);
            } else {
                System.out.println("A aresta não pode ser negativa!");
            }
        } catch (Exception e) {
            System.out.println("Por favor, digite um número válido!");
        } finally {
            scanner.close();
        }
    }
   
    public static double calcularAreaCubo(double aresta) {
        return 6 * Math.pow(aresta, 2);
    }
}
