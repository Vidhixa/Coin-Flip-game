import java.util.Scanner;


public class CoinGame {
	
	static Player[] players; 
	private static Coin coin;
	
	public CoinGame(String name1, String name2) {
		this.players = new Player[2]; 
		players[0] = new Player(name1);
		players[1] = new Player(name2);
		coin = new Coin();
	}

	public static void main(String[] args) {
		//Getting player names and adding them
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 players name :: ");
		//player 1
		String name1 = sc.next(); 
		//Player 2
		String name2 = sc.next();
		
		//Creating game instance
		CoinGame game = new CoinGame(name1, name2);
				
		//Start game
		game.startGame();
		
	}
	//some logic in main
	//didplayer win method
	
	public static void startGame() {
		Scanner sc = new Scanner(System.in);
		String ch;
		do {
			
			System.out.println("\nStarting game now..");
			int first = selectRandomFirst();
			Player one = players[first];
			Player two = (first == 1)? players[0] : players[1];
			
			//Asking first player for choice
			System.out.println(one.getName()+", you are randomly selected first, what's your choice? HEADS or TAILS ?");
			String choice = sc.next();
			one.setChoice(choice);
			two.setOpponentChoice(choice);
			
			Parity winning = coin.getCoinParity();
			Player winner = decideWinner(winning, one, two);
			System.out.println("\nWinner is : "+winner.getName());
			
			System.out.println("\n************************\n");
			System.out.println("Continue playing :: Y or N ");
			ch = sc.next();
			
		} while (ch.equalsIgnoreCase("Y"));
	}
	
	public static int selectRandomFirst() {
		return ((Math.random() < 0.5)? 0 : 1);
		
	}
	
	public static Player decideWinner(Parity x, Player one, Player two) {
		if(x == one.getChoice()) {
			return one;
		} else {
			return two;
		}		
	}
}
