
public abstract class Coche extends Thread{
	
	protected String matricula;
	protected int kilometros;
	
	public Coche(String matricula, int kilometros) {
		
		this.matricula = matricula;
		this.kilometros = kilometros;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", kilometros=" + kilometros + "]";
	}
	
	

}
