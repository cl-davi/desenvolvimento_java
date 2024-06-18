package GrauTecnico.testes.exemplo05;

public class TvDigital implements Smart_Tv {
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

    @Override
    public boolean internet() {
        return false;
    }

    @Override
    public String tvStore() {
        return "";
    }
}
