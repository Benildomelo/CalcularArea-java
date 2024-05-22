import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("Escolha uma figura geométrica para calcular a área:");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Triângulo");
            System.out.println("4. Círculo");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    int lado = scanner.nextInt();
                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("A área do quadrado é: " + quadrado.calculaArea());
                    break;
                case 2:
                    System.out.print("Digite a largura do retângulo: ");
                    int largura = scanner.nextInt();
                    System.out.print("Digite a altura do retângulo: ");
                    int altura = scanner.nextInt();
                    Retangulo retangulo = new Retangulo(largura, altura);
                    System.out.println("A área do retângulo é: " + retangulo.calculaArea());
                    break;
                case 3:
                    System.out.print("Digite a base do triângulo: ");
                    int base = scanner.nextInt();
                    System.out.print("Digite a altura do triângulo: ");
                    altura = scanner.nextInt();
                    Triangulo triangulo = new Triangulo(base, altura);
                    System.out.println("A área do triângulo é: " + triangulo.calculaArea());
                    break;
                case 4:
                    System.out.print("Digite o raio do círculo: ");
                    int raio = scanner.nextInt();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("A área do círculo é: " + circulo.calculaArea());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
