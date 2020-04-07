package simple21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HumanPlayerTest {

	HumanPlayer humanPlayer;
	
	@BeforeEach
	void setUp() throws Exception {
		this.humanPlayer = new HumanPlayer("Emma");
	}

	@Test
	void testGetYesOrNoToQuestion() {
		
		Scanner scanner = new Scanner(System.in);
		//input yes?
		assertTrue(this.humanPlayer.getYesOrNoToQuestion("take a card?", scanner));
		
		//input no?
		assertFalse(this.humanPlayer.getYesOrNoToQuestion("take a card?", scanner));
		
		//input uhhhh --> keep waiting till input no
		assertFalse(this.humanPlayer.getYesOrNoToQuestion("take a card?", scanner));
	}

	@Test
	void testTakeHiddenCard() {
		int hiddenCard = 0;
		int totalScore = 0;
		assertEquals(4, this.humanPlayer.takeHiddenCard(4));
	}

	@Test
	void testTakeVisibleCard() {
		int sumOfVisibleCard = 0;
		assertEquals(5, this.humanPlayer.takeVisibleCard(5));
		
	}

	@Test
	void testGetSumOfVisibleCards() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScore() {
		fail("Not yet implemented");
	}

	@Test
	void testDiffTo21() {
		fail("Not yet implemented");
	}

}
