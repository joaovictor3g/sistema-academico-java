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
public class Aluno extends Pessoa {
    private double notas;
    public Aluno(){
        
    }
    public Aluno(String _nome, String _cpf, int _idade, int _id, Curso curso, Instituicao instituicao){
        this.setNome(_nome);
        this.setCpf(_cpf);
        this.setIdade(_idade);
        this.setCodigo(_id);
  
    }
    public Aluno(int _id){
        this.setId(_id);
    }
    public double getNotas(){
        return this.notas;
        
    }
    public void setNotas(double notas){
        this.notas = notas;
    }
    
}
