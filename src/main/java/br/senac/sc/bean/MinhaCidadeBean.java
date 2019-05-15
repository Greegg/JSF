/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sc.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alunos
 */
@ViewScoped
@ManagedBean
public class MinhaCidadeBean {

    private String cidadeNatal;
    private final List<String> todasCidades;

    public MinhaCidadeBean() {
        todasCidades = new ArrayList<>();
        todasCidades.add("Palhoça");
        todasCidades.add("Florianopolis");
        todasCidades.add("São José");
        todasCidades.add("Blumenau");
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public List<String> getTodasCidades() {
        return todasCidades;
    }

}
