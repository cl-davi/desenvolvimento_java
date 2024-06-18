package GrauTecnico.testes.exemplo1POO;

public class Trangulo implements FiguraGeometrica {

    private double altura, base, lado1, lado2;

    public Trangulo() {}

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
}
