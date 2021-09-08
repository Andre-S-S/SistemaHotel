package br.com.unipar.entidades;

import br.com.unipar.codigo.Quarto;

/**
 *
 * @author andre
 */
public class QuartoTriplo implements Quarto {

    private final double VALOR_DIARIA = 160.00;

    @Override
    public double opcaoQuarto() {
        return VALOR_DIARIA;
    }
}
