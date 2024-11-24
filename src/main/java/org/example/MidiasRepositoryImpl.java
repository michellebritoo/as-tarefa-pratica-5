package org.example;

import java.util.ArrayList;
import java.util.List;

public class MidiasRepositoryImpl implements MidiasRepository {
    private List<Midia> midias; // Agora o repository que tem acesso direto à lista de mídias

    public MidiasRepositoryImpl() {
        this.midias = new ArrayList<>();
    }

    // Agora o repository que adiciona qualquer tipo de mídia
    @Override
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    //Retorna a lista de midias
    @Override
    public List<Midia> listarMidias() {
        return midias;
    }
}
