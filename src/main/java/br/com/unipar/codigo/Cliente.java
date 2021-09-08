/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.codigo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Cliente {
    
    private long id;
    private String nome;
    private String rg;
    private String cpfCnpj;
    private String telefone;
    private String endereco;
    private int numero;
    private List<Cliente> clientes = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}















//    public Cliente consultarNome(String nome) {
//        for (Cliente c: clientes) {
//            if (c.nome.equalsIgnoreCase(nome)) {
//                return c;
//            }
//        }
//        return null;
//    }
//    
//    public Cliente ConsultarId(long id) {
//       for (Cliente c: clientes) {
//           if (c.id == id) {
//               return c;
//           }
//       }
//       return null;
//    }