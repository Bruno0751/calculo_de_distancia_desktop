package pack;

import javax.swing.JOptionPane;
/**
 *
 * @author bruno Gressler da Silveira
 * @version 1
 * @since 15/10/2020
 */
public class Main {
    public static void main(String args[]){
        
        Pessoa objPessoa = new Pessoa();        
        
        try{
            do{
                objPessoa.setOp(Byte.parseByte(JOptionPane.showInputDialog("::::::O que Deseja Fazer?:::::::::::::\n"
                        + "0 - Sair                            ::\n"
                        + "1 - Calcular Distância              ::\n"
                        + "::::::::::::::::::::::::::::::::::::::")));
                switch(objPessoa.getOp()){
                    case 0:
                        
                        JOptionPane.showMessageDialog(null, "Sistema Encerrado");
                        System.exit(0);
                        break;
                    case 1:
                        
                        objPessoa.setX1(Double.parseDouble(JOptionPane.showInputDialog("Escreva a Distância x1: ")));
                        
                        objPessoa.setX2(Double.parseDouble(JOptionPane.showInputDialog("Escreva a Distância x2: ")));
                      
                        objPessoa.setY1(Double.parseDouble(JOptionPane.showInputDialog("Escreva a Distância y1: ")));
                        
                        objPessoa.setY2(Double.parseDouble(JOptionPane.showInputDialog("Escreva a Distância y2: ")));

                        JOptionPane.showMessageDialog(null, objPessoa.toString());
                        break;
                    default:
                        
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        break;
                }
                
            }while(objPessoa.getOp() != 0);
        }catch(Exception erro){
            
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
}
