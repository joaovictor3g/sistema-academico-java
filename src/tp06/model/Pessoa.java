/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.model;

/**
 *
 * @author joao
 */
public abstract class Pessoa{
    private String nome;
    private String cpf;
    private int codigo;
    private int idade;
    private int id;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome_){
        this.nome = nome_;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getIdade(){
        return this.idade;
        
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return this.nome + " " + this.idade + " " + this.cpf + " ";
        
    }
}