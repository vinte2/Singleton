/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.Scanner;

/**
 *
 * @author Seduc
 */
public class Singleton {

         
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Config autentica = Config.getInstancia();
//        System.out.println(autentica.usuario());;
        String login,senha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o usuario: ");
        login = sc.nextLine();
        System.out.println("Digite a Senha: ");
        senha = sc.nextLine();
        
        if(login.equals(autentica.usuario()) && senha.equals(autentica.senha())){
            
            System.out.println(" ok");
        }else{
            System.out.println("erro");
        }
    
        
        
        
        
        
        // TODO code application logic here
    }
    
}
