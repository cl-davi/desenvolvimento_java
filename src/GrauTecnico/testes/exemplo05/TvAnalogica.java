package GrauTecnico.testes.exemplo05;

public class TvAnalogica implements Televisao {
    @Override
    public boolean ligar() {
        return false;
    }

    @Override
    public int volume() {
        return 0;
    }

    @Override
    public double canal() {
        return 0;
    }
}
