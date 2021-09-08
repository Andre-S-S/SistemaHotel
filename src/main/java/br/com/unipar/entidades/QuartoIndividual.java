package br.com.unipar.entidades;

import br.com.unipar.codigo.Quarto;

/**
 *
 * @author andre
 */
public class QuartoIndividual implements Quarto {
    
    private final double VALOR_DIARIA = 90.00;

    @Override
    public double opcaoQuarto() {
        return VALOR_DIARIA;
    }
}
