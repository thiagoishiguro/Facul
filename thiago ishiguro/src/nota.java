import javax.swing.JOptionPane;

public class nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String valor = JOptionPane.showInputDialog("informe o valor da polpa");
		String polpa1 = JOptionPane.showInputDialog("informe a quantidade de polpas na semana 1");
		String polpa2 = JOptionPane.showInputDialog("informe a quantidade de polpas na semana 2");
		String polpa3 = JOptionPane.showInputDialog("informe a quantidade de polpas na semana 3");
		String polpa4 = JOptionPane.showInputDialog("informe a quantidade de polpas na semana 4");	
		
		double valorpolpa = Double.parseDouble(valor); 
		double Ppolpa1 = Double.parseDouble(polpa1); 
		double Ppolpa2 = Double.parseDouble(polpa2); 
		double Ppolpa3 = Double.parseDouble(polpa3); 
		double Ppolpa4 = Double.parseDouble(polpa4); 
		
	
		double valorvendido = (Ppolpa1 + Ppolpa2 + Ppolpa3 + Ppolpa4)* (valorpolpa);
		
		double semana1 = (Ppolpa1)* (valorpolpa);
		double semana2 = (Ppolpa2)* (valorpolpa);
		double semana3 = (Ppolpa3)* (valorpolpa);
		double semana4 = (Ppolpa4)* (valorpolpa);
		

	
		int resposta = JOptionPane.showConfirmDialog(null,"você lucrou: R$:" + valorvendido +
				 " , Deseja saber quanto ganhou em cada semana? 💰"); {
		
		if (resposta ==0) { 

			JOptionPane.showMessageDialog(null, "na primeira semana você ganhou" + semana1);
			JOptionPane.showMessageDialog(null, "na segunda semana você ganhou" + semana2);
			JOptionPane.showMessageDialog(null, "na terceira semana você ganhou" + semana3);
			JOptionPane.showMessageDialog(null, "na quarta semana você ganhou" + semana4);
		
			JOptionPane.showMessageDialog(null, "Espero ter ajudado, bom trabalho 😀");
		}
		else JOptionPane.showMessageDialog(null, "espero ter ajudado, bom trabalho 😀");

		
		
	}

}
} 