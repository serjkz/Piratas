package piratas;

public class Pirata {
	private int ptos;
	private Estado estadoPirata;
	
	public Pirata(){
		estadoPirata = new Saludable();//-1=Escorbuto, 0=Saludable, 1=Hipersaludable
		ptos = 0;
	}
	
	public int getPtos() {return ptos;}
	public int getEstado() {return estadoPirata.getEstado();}

	public void atacar(Pirata p){
		this.ptos+=p.defender(this.estadoPirata.atq);
	}
	
	public int defender(int atq){
		return atq-this.estadoPirata.def;
	}
	
	public void tomarGrog(){
		this.estadoPirata = estadoPirata.beberGrog();
	}
	public void tomarNaranja(){
		this.estadoPirata = estadoPirata.tomarNaranja();
	}
	
	
}
