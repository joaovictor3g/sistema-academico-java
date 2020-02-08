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
public class Disciplina {
    private String nome;
    private int qtdCreditos = 0;
    private String codigo;
    private Aluno aluno;
    private Professor professor;
    
    public Disciplina(){
        
    }
    public Disciplina(String _nome, int _qtdCreditos){
        this.nome = _nome;
        this.qtdCreditos = _qtdCreditos;
     
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdCreditos() {
        return qtdCreditos;
    }

    public void setQtdCreditos(int qtdCreditos) {
        this.qtdCreditos = qtdCreditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
