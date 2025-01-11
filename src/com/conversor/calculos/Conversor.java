package com.conversor.calculos;

import com.conversor.modelos.ConsultarDivisa;
import com.conversor.modelos.MonedaOMDB;

public class Conversor {
    private double valor;
    private double resultado;
    private String divisaBase;
    private String divisaSalida;

    public Conversor(String divisaSalida, String divisaBase, double valor) {
        this.divisaSalida = divisaSalida;
        this.divisaBase = divisaBase;
        this.valor = valor;
    }

    public double convirtiendo(){
        ConsultarDivisa consultar = new ConsultarDivisa();
        MonedaOMDB moneda = consultar.consultar(divisaBase);
        double tasaCambio = Double.parseDouble(moneda.conversion_rates().get(divisaSalida));
        resultado = valor * tasaCambio;
        return resultado;
    }

}
