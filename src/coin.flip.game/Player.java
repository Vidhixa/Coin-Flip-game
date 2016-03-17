import java.util.Scanner;


public class Player {
	
	private Parity choice ; 
	private String name ;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;		
	}
	
	public Parity getChoice() {
		return this.choice;		
	}
	
	public void setChoice(String choice) {
		switch (choice.toLowerCase()) {
			case "heads":
				this.choice = Parity.valueOf("HEADS"); 
				break;
				
			case "tails":
				this.choice = Parity.valueOf("TAILS"); 
				break;

			default:
				throw new IllegalAccessError();
				
		}
	}
	
	public void setOpponentChoice(String choice) {
		if(choice.equalsIgnoreCase("HEADS") || choice.equalsIgnoreCase("TAILS")) {
			this.choice = (choice.equalsIgnoreCase("HEADS"))? Parity.valueOf("TAILS") : Parity.valueOf("HEADS");
		} else {
		throw new IllegalAccessError();
		}
	}
}
