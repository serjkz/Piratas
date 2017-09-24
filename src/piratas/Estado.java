package piratas;

public abstract class Estado {
	protected final int SALUDABLE = 0;
	protected final int ESCORBUTO = -1;
	protected final int HIPERSALUDABLE = 1;
	protected int estado;
	protected int contGrog;
	protected int atq;
	protected int def;
	
	
	public int getEstado() {return estado;}

	
	public abstract Estado beberGrog();
	
	public abstract Estado tomarNaranja();

	public void incrementarGrog() {
		contGrog++;
	}
}
