
public class Retangulo {

	int x;
	int y;
	int altura;
	int largura;
	
	public Retangulo(int x, int y, int largura, int altura) {
		valor++;
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.largura = largura;
	}

	public String imprime() {
		return "retangulo[X:"+this.x+",Y:"+this.y+",l:"+this.largura+",a:"+this.altura+"]";
	}

	static int valor = 0;
	
	public static void zeraContador(){
		
			valor = 0;
		
	}
	
	public static int Instancias(){
		
		return valor;
	}
	
}
