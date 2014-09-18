/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automataproject;

import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class AutomataProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Qual automato você quer? Escolha de 1 a 7");
       
       AutomataProject project = new AutomataProject();
       
       int automato = project.escolheAutomato();
       String string =project.recebeString();
       
       switch (automato){
           case 1:
               
                Automata automata = new Automata();

                if (automata.processa(string)){
                    System.out.println("string aceita");
                } else {
                    System.out.println("String recusada");
                }
                break;
          case 2:
               
                Automata2 automata2 = new Automata2();

                if (automata2.processa(string)){
                    System.out.println("string aceita");
                } else {
                    System.out.println("String recusada");
                }
                break;
           case 3:
               
                Automata3 automata3 = new Automata3();

                if (automata3.processa(string)){
                    System.out.println("string aceita");
                } else {
                    System.out.println("String recusada");
                }
                break;
               
             case 4:
               
                Automata4 automata4 = new Automata4();

                if (automata4.processa(string)){
                    System.out.println("string aceita");
                } else {
                    System.out.println("String recusada");
                }
                break;
                 
            case 5:
               
                Automata5 automata5 = new Automata5();

                if (automata5.processa(string)){
                    System.out.println("string aceita");
                } else {
                    System.out.println("String recusada");
                }
                break;
                
            case 6:
               
                Automata6 automata6 = new Automata6();

                if (automata6.processa(string)){
                    System.out.println("string aceita");
                } else {
                    System.out.println("String recusada");
                }
                break;
                
             case 7:
               
                Automata7 automata7 = new Automata7();

                if (automata7.processa(string)){
                    System.out.println("string aceita");
                } else {
                    System.out.println("String recusada");
                }
                break;
       }
       
       
    }
    
    public int escolheAutomato(){
        
        
        Scanner scanner = new Scanner(System.in);
        int automato = scanner.nextInt();
        
        return automato;
    }
    
    public String recebeString(){
        System.out.println("digite a string a ser processada: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
    
}
