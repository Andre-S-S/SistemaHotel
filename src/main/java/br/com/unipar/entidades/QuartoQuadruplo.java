package br.com.unipar.entidades;

import br.com.unipar.codigo.Quarto;

/**
 *
 * @author andre
 */
public class QuartoQuadruplo implements Quarto {

    private final double VALOR_DIARIA = 200.00;

    @Override
    public double opcaoQuarto() {
        return VALOR_DIARIA;
    }
}
