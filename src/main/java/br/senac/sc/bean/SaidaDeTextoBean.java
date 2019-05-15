/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sc.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SaidaDeTextoBean {

    private String nomeUsuario = "Gregório";
    private int qtdTarefasPendentes = 10;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getQtdTarefasPendentes() {
        return qtdTarefasPendentes;
    }

    public void setQtdTarefasPendentes(int qtdTarefasPendentes) {
        this.qtdTarefasPendentes = qtdTarefasPendentes;
    }

}
