public class SeatIbiza extends Coche implements Runnable {

	int velocidad;

	public SeatIbiza(String matricula, int kilometros, int velocidad) {
		super(matricula, kilometros);
		this.velocidad = velocidad;
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			this.kilometros = kilometros + velocidad;
			System.out.println("Matricula " + this.matricula + this.kilometros
					+ " kilometros");
		}
	}

	@Override
	public String toString() {
		return "SeatIbiza con velocidad:" + velocidad + "]";
	}

}
