/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.codigo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Consumacao {
    
    private long id;
    private String descricao;
    private int quantidadeItem;
    private double valorUnitario;
    private double valorTotal;
    private List <Consumacao> consumacoes = new ArrayList<>();
    
    public void inserir(Consumacao con) {
        this.consumacoes.add(con);
        atualizar();
    }
    
    public void alterar() {
        
        
    }
    
    public void atualizar() {
        for (Consumacao con: consumacoes) {
            
        }
    }
    
    public Consumacao exibir(Consumacao c) {
        return c;
    }
    
    public void valorTotal() {
        
    }

}
