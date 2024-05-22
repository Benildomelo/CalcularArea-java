public class Triangulo implements AreaCalculavel {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2.0;
    }
}
