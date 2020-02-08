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
public class Curso {
    public Curso(){
        
    }
    public Curso(String _nome){
        this.nome = _nome;
        //this.id = _id;
        
    }
    private String nome;
    private int id;
    
    public String getNome(){
        return this.nome;
        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int _id){
        this.id = _id;
    }
}
