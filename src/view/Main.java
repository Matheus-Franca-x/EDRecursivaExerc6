package view;

import javax.swing.JOptionPane;

import controller.QuantDigitoControll;

public class Main {

	public static void main(String[] args) 
	{
		
		int first = 0;
		int second = 0;
		
		QuantDigitoControll quantidade = new QuantDigitoControll();
		
		while(first < 10 || first > 999999 && second < 0 || second > 9) //teste para executar o valor pedido
		{
			first = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 10 a 999999"));
			second = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 9"));
			if(first < 10 || first > 999999 && second < 0 || second > 9) //print erro
			{
				System.out.println("Valor incorreto.");
			}
		}
		
		System.out.println(quantidade.quant(first, second)); //entrada de valores
		
	}
	
	
	

}
