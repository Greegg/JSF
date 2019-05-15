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
 * @author Gregório
 */
@ManagedBean(name = "cadastro")
//@RequestScoped // padrão
@ViewScoped
//@SessionScoped
//@ApplicationScoped
public class CadastroBean {

    private String nome;
    private String senha;
    private String confSenha;
    private String observação;
    private String msg = "";

    public void retorno() {
        if (confirmacao() == true) {
            msg = "Bem vindo " + this.nome.toString();
        } else {
            msg = "Favor preencher todos os campos necessários";
        }
    }

    public boolean confirmacao() {
        if (senha.equalsIgnoreCase(confSenha)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void validar(){
        if (confirmacao() == true) {
            msg = "Senha valida!";
        } else {
            msg = "Campo senha e confirmação devem ser identicos";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfSenha() {
        return confSenha;
    }

    public void setConfSenha(String confSenha) {
        this.confSenha = confSenha;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
