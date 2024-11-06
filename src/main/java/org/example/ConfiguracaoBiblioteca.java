package org.example;

import java.util.ArrayList;
import java.util.List;
// Classe que gerencia configurações da biblioteca
public class ConfiguracaoBiblioteca {
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;
    public ConfiguracaoBiblioteca(String horariosDeFuncionamento,
                                  double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }
    public String getHorariosDeFuncionamento() {
        return horariosDeFuncionamento;
    }
    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }
    @Override
    public String toString() {
        return "Horários: " + horariosDeFuncionamento + ", Multa Diária: R$ " + valorMultaDiaria;
    }
}
