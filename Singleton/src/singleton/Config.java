/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Seduc
 */
public class Config {
    
    private static Config instancia ;
    private String usuario;
    private String senha;
    
    Config(){
    }
public static Config getInstancia(){
    
    if (instancia == null) {
        instancia = new  Config();
    }
    return instancia;
        
}
public String usuario(){
    return new String("edson");
}
public String senha (){
    return new String("452530");
}
}
