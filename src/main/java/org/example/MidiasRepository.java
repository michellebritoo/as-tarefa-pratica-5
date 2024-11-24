package org.example;

import java.util.List;

public interface MidiasRepository {
    void adicionarMidia(Midia midia);
    List<Midia> listarMidias();
}
