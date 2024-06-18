package GrauTecnico.testes.exemplo2POO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa();
        empresa1.setNome("Loja 1");
        empresa1.setCnpj("12343232");
        empresa1.setDataFundacao(new Date());
        empresa1.setEndereco("Rua abc, 100");
        empresa1.setFaturamento(50000);
        empresa1.imprimir();

        Empresa empresa2 = new Empresa();
        empresa2.setNome("Loja 2");
        empresa2.setCnpj("12354432");
        empresa2.setDataFundacao(new Date());
        empresa2.setEndereco("Rua abc, 200");
        empresa2.setFaturamento(50000);
        empresa2.imprimir();

        Empresa empresa3 = new Empresa();
        empresa3.setNome("Posto de Gasolina");
        empresa3.setCnpj("12345434");
        empresa3.setEndereco("Rua afd, 500");
        empresa3.setFaturamento(10000);
        empresa3.setDataFundacao(new Date());
        empresa3.imprimir();
    }
}
