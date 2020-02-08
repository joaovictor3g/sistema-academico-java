

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp06.model;

import java.io.FileWriter;
import java.io.PrintWriter;
import tp06.view.ReitorInterface;

/**
 *
 * @author joao
 */
public class Reitor extends Professor{
    
    public static Reitor instancia;
    
    private Reitor(){
        
    }
    public static synchronized Reitor getInstancia(){
        if(instancia == null)
            instancia = new Reitor();
        return instancia;
    }
    
    @Override
    public boolean Acesso(String _login, String _senha){
        try {
            new java.io.FileInputStream("Disciplinas.txt");
            
        } catch (java.io.FileNotFoundException e) {
            try {
                FileWriter file1 = new FileWriter("Disciplinas.txt", true);
                PrintWriter print1 = new PrintWriter(file1);
                ReitorInterface reitorIn = new ReitorInterface();
                
                //print1.print(reitorIn.);
                
            } catch (Exception e1) {
            }
            
        }
        return true;
    }
    
}
