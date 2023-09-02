package senaiprojetos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Crie um array de doubles com 7 elementos e calcule a média dos valores
		 * armazenados no array. Imprima o resultado.
		 */
	
		
		Double[] decimais = { 1.245, 1.589, 6.819, 9.932, 10.023, 4.092, 3.929 };
		double soma = 0;

		for (int i = 0; i < decimais.length; i++) {
			
			soma += decimais[i];
		}
		
		DecimalFormat formato = new DecimalFormat("#.#");
        
		String numeroFormatado =  formato.format(soma);
		String media = formato.format(soma/decimais.length);
		
		JOptionPane.showMessageDialog(null,"A soma de todos os elementos do array é igual a : " + numeroFormatado);
		JOptionPane.showMessageDialog(null,"Sua média é :  " + media);

	}

}
