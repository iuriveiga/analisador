/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automataproject;

/**
 *
 * @author rodrigo
 */
public class Automata7 {
    //a DFA that can receive a string of 0's and 1's and verify if it has three consecutives 0's
    
    public String string;
    public int QuantidadeChars = 0;
    public String EstadoAtual = "q0";
    
    public boolean processa(String string){
        this.string = string;
        QuantidadeChars = this.string.length();
        for (int n = 0; n < QuantidadeChars; n++){
            //logic to process each char
            switch (EstadoAtual) {
                case "q0":
                    if (this.string.charAt(n) == '1'){
                        EstadoAtual = "q1";
                    }   break;
                case "q1":
                    if (this.string.charAt(n) == '1'){
                        EstadoAtual = "q2";
                    }   break;
                case "q2":
                    if (this.string.charAt(n) == '1'){
                        EstadoAtual = "q3";
                    } 
                    break;
                case "q3":
                    if (this.string.charAt(n) == '1'){
                        EstadoAtual = "q4";
                    } 
                    break;
                case "q4":
                    if (this.string.charAt(n) == '1'){
                        EstadoAtual = "q0";
                    } else if (this.string.charAt(n) == '0'){
                        EstadoAtual = "q4";
                    }
                    break;
            }
            
        }
        
        if (!EstadoAtual.equals("q0")){
            return false;
        } 
            return true;
        
    }
    
    
    
}
    