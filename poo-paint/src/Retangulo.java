
public class Retangulo {

	private int x;
	private int y;
	private int altura;
	private int largura;
	
	public Retangulo(int x, int y, int largura, int altura) {
		valor++;
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.largura = largura;
	}

	public int getx() {
		return x;
		}

		public void setx(int x) {
		this.x = x;
		}
	
		public int gety() {
			return y;
			}

			public void sety(int y) {
			this.y = y;
			}
		
			public int getlargura() {
				return largura;
				}

								
				public int getaltura() {
					return altura;
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
