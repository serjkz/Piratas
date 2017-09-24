package piratas;

public class Escorbuto  extends Estado{
	
	public Escorbuto(){
		estado=ESCORBUTO;
		contGrog=3;
		atq=2;
		def=0;
	}
	public Estado beberGrog(){
		return this;
	}
	
	public Estado tomarNaranja(){
		return new Saludable();
	}
}
