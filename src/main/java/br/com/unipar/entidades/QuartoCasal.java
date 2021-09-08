package br.com.unipar.entidades;

import br.com.unipar.codigo.Quarto;


/**
 *
 * @author andre
 */
public class QuartoCasal implements Quarto {

    private final double VALOR_DIARIA = 110.00;

    @Override
    public double opcaoQuarto() {
        return VALOR_DIARIA;
    }  
}
