
public class Coin {
	
	private Parity parity;
	
	public Coin() {
		this.parity = (Math.random() < 0.5)? Parity.valueOf("HEADS") : Parity.valueOf("TAILS");
	}
	
	public Parity getCoinParity() {
		return this.parity; 
	}

}
