import java.util.Scanner;
public class Triângulo {
    public static void main (String[] args) {
    Scanner Scanner = new Scanner(System.in);
    int Altura, Base , area ; 
    System.out.println("Digite a base:");
    Base = Scanner.nextInt();
    System.out.println("Digite a altura:");
    Altura = Scanner.nextInt(); 
    area = Base * Altura / 2 ; 
    System.out.println("A área do Triângulo é: " + area);
    }

  } 


    

