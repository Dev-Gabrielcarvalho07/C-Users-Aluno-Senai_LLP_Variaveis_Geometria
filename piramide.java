import java.util.Scanner;


public class piramide {


    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Digite o lado da base da pirâmide (em cm): ");
            double ladoBase = scanner.nextDouble();
           
            System.out.print("Digite a altura da pirâmide (em cm): ");
            double altura = scanner.nextDouble();
           
           
            double areaBase = ladoBase * ladoBase;
           
           
            double apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(ladoBase / 2, 2));
           
           
            double areaFaceLateral = (ladoBase * apotema) / 2;
           
           
            double areaTotal = areaBase + (4 * areaFaceLateral);
           
           
            System.out.printf("A área superficial da pirâmide é: %.2f cm²%n", areaTotal);
        }
    }
}
   
