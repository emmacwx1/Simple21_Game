package simple21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameControlTest {

	//declare 4 players for testing
	//HumanPlayer human;
	
	//ComputerPlayer player1;
	
	//ComputerPlayer player2;
	
	//ComputerPlayer player3;
	
	//TA comment: all the variables are inside GameControl class. should initialize GameControl class instead of 4 separate object. 
	GameControl gameControl;
	
	
	
	//runs before each unit test method
	@BeforeEach
	void setUp() throws Exception {
		
		//Initialize the players here
		this.gameControl = new GameControl();
		
		
		//this.human = new HumanPlayer("Emma"); should pass real string "" instead of String name
		//this.player1 = new ComputerPlayer("player1");
		//this.player2 = new ComputerPlayer("player2");
		//this.player3 = new ComputerPlayer("player3");
		
		
	
	}
	

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

	@Test
	void testRun() {
		fail("Not yet implemented");
	}

	@Test
	void testCreatePlayers() {
		fail("Not yet implemented");
	}

	@Test
	void testDeal() {
		fail("Not yet implemented");
	}

	@Test
	void testNextCard() {
		fail("Not yet implemented");
	}

	@Test
	void testControlPlay() {
		fail("Not yet implemented");
	}

	@Test
	void testCheckAllPassed() {
		fail("Not yet implemented");
	}

	@Test
	void testFindMin() {
		int[] ls1 = {1, 2, 3, 4};
		assertEquals(1, this.gameControl.findMin(ls1)); //passed
		
		int[] ls2 = {0, 0 , 1, 0};
		assertEquals(0,this.gameControl.findMin(ls2)); //passed
	}
	
	
	//for personal education only, not for assignment
	@Test
	void testFindMinWrong() {
		int[] ls1 = {1, 2, 3, 4};
		assertEquals(1, this.gameControl.findMinWrong(ls1)); //passed
		
		int[] ls2 = {0, 0 , 1, 0};
		assertEquals(0,this.gameControl.findMinWrong(ls2)); //passed
		
		int[] ls3 = {4, 2, 2, 0};
		assertEquals(0, this.gameControl.findMinWrong(ls3));//FAILED, expect 0, but was 2! --> solution: change list[i] < minDiff to <=
		
		int[] ls4 = {4, 3, 2, 1};
		assertEquals(1, this.gameControl.findMinWrong(ls4));
		
		int[] ls5 = {21, 3, 9, 1};
		assertEquals(1, this.gameControl.findMinWrong(ls5)); //expected 1 but was 3, the return in else should be deleted
	}

	@Test
	void testSmallestScoreDuplicate() {
		int[] ls1 = {1, 2, 3, 4};
		assertFalse(this.gameControl.smallestScoreDuplicate(ls1));
		
		int[] ls2 = {0, 0 , 1, 0};
		assertTrue(this.gameControl.smallestScoreDuplicate(ls2));
		
		//should not be true because not the smallest score duplicates
		int[] ls3 = {4, 2, 2, 0};
		assertFalse(this.gameControl.smallestScoreDuplicate(ls3));
		
		int[] ls4 = {0, 0, 0, 0};
		assertTrue(this.gameControl.smallestScoreDuplicate(ls4));
		
		int[] ls5 = {1, 1, 1, 0};
		assertFalse(this.gameControl.smallestScoreDuplicate(ls5));
		
		
	}

	@Test
	void testPrintResults() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintWinner() {
		fail("Not yet implemented");
	}

}
