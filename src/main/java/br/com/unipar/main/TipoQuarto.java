/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.main;

import br.com.unipar.codigo.Quarto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class TipoQuarto {
    
    private String descricao;
    private double valorDiaria;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    public double opcaoQuarto(double valorDiaria) {
        this.valorDiaria = valorDiaria;
        System.out.println(valorDiaria);
        return this.valorDiaria;
    }
    
     private long id;
    private int numero;
    private int andar;
    private boolean situacao;
    private List<Quarto> quartos = new ArrayList<>();
  
}
