import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o comprimento da caixa (em cm): ");
            double comprimento = scanner.nextDouble();
            
            System.out.print("Digite a largura da caixa (em cm): ");
            double largura = scanner.nextDouble();
            
            System.out.print("Digite a altura da caixa (em cm): ");
            double altura = scanner.nextDouble();
            
            
            double area = 2 * (comprimento * largura + comprimento * altura + largura * altura);
            
            
            System.out.printf("A área superficial da caixa é: %.2f cm²%n", area);
        }
    }
}

