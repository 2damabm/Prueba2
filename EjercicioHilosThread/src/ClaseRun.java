
public class ClaseRun {
	
	public static void main(String[] args) {
		Thread seatIbiza = new SeatIbiza("2", 0, 10);
		Thread FordFiesta = new FordFiesta("1", 0, 5);

		
		seatIbiza.run();
		FordFiesta.run();
		
		
		System.out.println(seatIbiza);
		System.out.println(FordFiesta);
	}
}
