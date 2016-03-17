import static org.junit.Assert.*;
import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;


public class CoinGameTest {
	private CoinGame cg; 
	
	@Before
	public void setUp() {
		cg = new CoinGame("Vid", "Mayur");	
	}
	
	//Player 1 tests
	@Test
	public void testSetChoiceHeads() {
		cg.players[0].setChoice("heads");
		assertEquals(Parity.HEADS, cg.players[0].getChoice());
	}
	
	@Test
	public void testSetChoiceTails() {
		cg.players[0].setChoice("tails");
		assertEquals(Parity.TAILS, cg.players[0].getChoice());
	}
	
	@Test(expected =  IllegalAccessError.class)
	public void testSetChoiceSome() {
		cg.players[0].setOpponentChoice("some");
	}
	
	
	//Player 1 tests
	@Test
	public void testSetOpponentChoiceHeads() {
		cg.players[1].setOpponentChoice("heads");
		assertEquals(Parity.TAILS, cg.players[1].getChoice());
	}
	
	@Test
	public void testSetOpponentChoiceTails() {
		cg.players[1].setOpponentChoice("tails");
		assertEquals(Parity.HEADS, cg.players[1].getChoice());
	}
	
	@Test(expected =  IllegalAccessError.class)
	public void testSetOpponentChoiceSome() {
		cg.players[1].setOpponentChoice("some");
	}
	
	
	@Test
	public void testCoinGame() {
		System.out.println(cg.players[0].getName());
		//fail("Not yet implemented");
	}

	/*@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testStartGame() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testSelectRandomFirst() {/*
		CoinGame cg = EasyMock.createNiceMock(CoinGame.class);
		EasyMock.expect(cg.selectRandomFirst()).andReturn(0);
		EasyMock.replay(cg);
		Assert.assertEquals(0, 0);	//	 || (assertEquals(0, CoinGame.selectRandomFirst())));
		*/
	}

	@Test
	public void testDecideWinner() {
		/*CoinGame cg = new CoinGame("Vid","Mayur");
		
		Parity x = Parity.HEADS;
		
		p1.setChoice("heads");
		p2.setOpponentChoice("heads");
		
		CoinGame cg = new CoinGame("one", "two");
		assertEquals(p1, cg.decideWinner(x, p1, p2));	*/
	}

}
