/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.model;

import tp06.model.Funcionario;

/**
 *
 * @author joao
 */
public class Professor extends Funcionario{
    public Professor(){
        
    }
    public Professor(String nome, String cpf, int idade, int id){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setId(id);
    }
    public boolean Acesso(String login, String _senha){
        return true;
        
    }
    
}
