package GrauTecnico.testes.exemplo1POO;

public class Quadrado implements FiguraGeometrica {

    private double base;

    public Quadrado() {}

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double perimetro() {
        return base * 4;
    }

    @Override
    public double area() {
        return base * base;
    }

    @Override
    public String toString() {
        return "Área do quadrado: " + area() + "\nPerímetro do quadrado: " + perimetro();
    }
}
