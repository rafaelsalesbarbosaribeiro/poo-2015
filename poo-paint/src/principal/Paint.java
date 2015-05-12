package principal;

import java.util.ArrayList;

import javax.swing.JFrame;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class Paint extends JFrame {

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		Retangulo ret1 = new Retangulo(5, 5, 100, 80);
		Retangulo ret2 = new Retangulo(400, 150, 30, 30);
		Circulo c = new Circulo(200, 200, 56);
		
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(ret1);
		figuras.add(ret2);
		figuras.add(c);
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho(figuras);
		Mouse m = new Mouse(areaDeDesenho);
		areaDeDesenho.addMouseListener(m);
				
		this.setContentPane(areaDeDesenho);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
