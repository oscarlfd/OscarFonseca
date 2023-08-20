public class Calculadora{
	private int sumatoria;
	Calculadora(){
		this.sumatoria=10;
	}
	Calculadora(int  x){
	this.sumatoria=x;

	}
	public void sumar(int sumatoria){
		this.sumatoria=this.sumatoria+sumatoria;
	
	}

	public int getSumatoria(){
		return this.sumatoria;

	}

}