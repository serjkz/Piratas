package piratas;

public class HiperSaludable extends Estado{
	
	public HiperSaludable(){
		estado=HIPERSALUDABLE;
		contGrog=0;
		atq=10;
		def=-2;
	}
	public Estado beberGrog(){
		return new Saludable();
	}
	
	public Estado tomarNaranja(){
		return this;
	}
}
