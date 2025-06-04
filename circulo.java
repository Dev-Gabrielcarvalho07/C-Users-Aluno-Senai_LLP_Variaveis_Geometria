
  import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.printf("A área do círculo é: %.2f unidades quadradas%n", area);
        
        scanner.close();
    }
}