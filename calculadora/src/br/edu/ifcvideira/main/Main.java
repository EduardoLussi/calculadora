package br.edu.ifcvideira.main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i == 0;) {
			
			double resultado = 0;
			
			int op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
					+ "1- Soma\n"
					+ "2- Subtração\n"
					+ "3- Multiplicação\n"
					+ "4- Divisão\n"
					+ "5- Sair"));
			
			if (op == 1) {
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primerio número\n"));
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número\n"));
				resultado = num1 + num2;
			} else {
				break;
			}
			
			JOptionPane.showMessageDialog(null, "Resultado: \n" + resultado);
			
		}
		
	}
	
}
