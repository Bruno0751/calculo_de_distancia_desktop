package pack;

import java.util.Scanner;
/**
 *
 * @author bruno Gressler da Silveira
 * @version 1
 * @since 15/10/2020
 */
public class Main {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        
        double x1 = 0, x2 = 0, y1 = 0, y2 = 0, resultado;
        byte op;
        
        try{
            do{
                System.out.println("::::::O que Deseja Fazer?:::::::::::::\n"
                        + "0 - Sair                            ::\n"
                        + "1 - Calcular Distância              ::\n"
                        + "::::::::::::::::::::::::::::::::::::::");
                op = leia.nextByte();
                switch(op){
                    case 0:
                        
                        Tela.limparTela();
                        System.out.print("Sistema Encerrado");
                        break;
                    case 1:
                        
                        Tela.limparTela();
                        System.out.print("Escreva a Distância x1: ");
                        x1 = leia.nextDouble();
                        System.out.print("Escreva a Distância x2: ");
                        x2 = leia.nextDouble();
                        System.out.print("Escreva a Distância y1: ");
                        y1 = leia.nextDouble();
                        System.out.print("Escreva a Distância y2: ");
                        y2 = leia.nextDouble();

                        resultado = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

                        System.out.print("\n\nO Resultado é: " + resultado + "\n\n");
                        break;
                    default:
                        
                        Tela.limparTela();
                        System.out.print("Opção Inválida\n\n");
                        break;
                }
                
            }while(op != 0);
        }catch(Exception erro){
            
            Tela.limparTela();
            System.out.print("Erro: " + erro + "\n\n");
            Main.main(args);
        }
    }
}
