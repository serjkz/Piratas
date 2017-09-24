package piratas;

public class Saludable extends Estado{
	
	public Saludable(){
		estado=SALUDABLE;
		contGrog=0;
		atq=5;
		def=2;
	}
	
	public Estado beberGrog(){
		
		if(++contGrog==3)
			return new Escorbuto();
		
		return this;
	}
	
	public Estado tomarNaranja(){
		return new HiperSaludable();
	}
}
