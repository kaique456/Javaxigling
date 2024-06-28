/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votarsimounao;

import javax.swing.JOptionPane;

/**
 *
 * @author caio.alunos
 */
public class Votarsimounao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declara As Variaveis
        
         //1 declarar  as variaveis

        String nome;
        int idade;

        //2 entrada
        nome = JOptionPane.showInputDialog("Digite Seu Nome");

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Sua Idade"));

        if (idade >= 16) {

            JOptionPane.showMessageDialog(null, "Você Pode Votar!! Volte Com Consciência! ");

        }
        
       else {
            JOptionPane.showMessageDialog(null, "Idade Inválida, Quando Você Tiver 16 anos Você volta");
        }
        
    }

}
        
        
        
        
  
    

