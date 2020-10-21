package pack;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * @author Bruno Gressler da Silveira
 * @version 3
 * @since 21/10/20
 */
public class Controle { 
    
    Pessoa objPessoa = new Pessoa();

    void limpar(JButton jButtonLimpar, JTextField JTextFieldX1, JTextField JTextFieldX2, JTextField JTextFieldY1, JTextField JTextFieldY2) {
        JTextFieldX1.setText("");
        JTextFieldX2.setText("");
        JTextFieldY1.setText("");
        JTextFieldY2.setText("");
        JTextFieldX1.grabFocus();
    }
    
    public double calcularDistancias(double x1, double x2, double y1, double y2){
        objPessoa.setX1(x1);
        objPessoa.setX2(x2);
        objPessoa.setY1(y1);
        objPessoa.setY2(y2);
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
        @Override
    public String toString() {
        return "x1: " + objPessoa.getX1() + "      |      x2: " + objPessoa.getX2() + "\n"
                + "y1: " + objPessoa.getY1() + "      |      y2: " + objPessoa.getY2() + "\n\n"
                + "Distancia Total: " + calcularDistancias(objPessoa.getX1(), objPessoa.getX2(), objPessoa.getY1(), objPessoa.getY2());
    }
}
