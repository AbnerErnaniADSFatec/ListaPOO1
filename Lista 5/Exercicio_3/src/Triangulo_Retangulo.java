import javax.swing.JOptionPane;

public class Triangulo_Retangulo {

	private static int hipotenusaQuadrado, somaCatetoQuadrado;

	public static void main(String[] args) {

		int hipotenusaA = Integer.parseInt(JOptionPane.showInputDialog("(A) - Hipotenusa: "));
		int catetoB = Integer.parseInt(JOptionPane.showInputDialog("(B) - Cateto: "));
		int catetoC = Integer.parseInt(JOptionPane.showInputDialog("(C) - Cateto: "));

		if (hipotenusaA != 0 && catetoB != 0 && catetoC != 0) {
			hipotenusaQuadrado = hipotenusaA * hipotenusaA;
			somaCatetoQuadrado = (catetoB * catetoB) + (catetoC * catetoC);

			if (hipotenusaQuadrado == somaCatetoQuadrado) {
				JOptionPane.showMessageDialog(null, "Forma Triângulo Retangulo");
			} else {
				JOptionPane.showMessageDialog(null, "Não forma um Triângulo Retangulo");
			}
		} else {
			JOptionPane.showMessageDialog(null, "ERROR! Insira um valor diferente de zero!");
		}
	}
}