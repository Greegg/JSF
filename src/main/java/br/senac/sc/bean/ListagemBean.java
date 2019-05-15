/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sc.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alunos
 */
@ManagedBean
@ViewScoped
public class ListagemBean {

    private String timeFavorito;

    public String getTimeFavorito() {
        return timeFavorito;
    }

    public void setTimeFavorito(String timeFavorito) {
        this.timeFavorito = timeFavorito;
    }

}
