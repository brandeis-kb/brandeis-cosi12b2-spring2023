package edu.brandeis.cosi12b2.lec23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {
	
	public static final int NUMBERS = 6;
	public static final int MAX_NUMBER = 40;
	
	public static void main(String[] args) {
		checkForWinner(List.of(1, 4, 8, 12, 16, 32));
	}
	
	public static Set<Integer> createWinningNumbers() { 
		Set<Integer> winningNumbers = new TreeSet<Integer>(); 
		Random r = new Random();	
		while (winningNumbers.size() < NUMBERS) {
		    int number = r.nextInt(MAX_NUMBER) + 1;
		    winningNumbers.add(number);
		}
		return winningNumbers;
	}
	
	// reads the player's lottery ticket from the console
	public static Set<Integer> getTicket(List<Integer> lottoTicket) {
		Set<Integer> ticket = new TreeSet<Integer>();
		for (Integer number: lottoTicket) {
            ticket.add(number);
		}
	    return ticket;
	}
	 
	public static void checkForWinner(List<Integer> lottoTicket) {
		Set<Integer> winningNumbers = createWinningNumbers();
		Set<Integer> ticket = getTicket(lottoTicket);
		// keep only the winning numbers from the user's ticket
		Set<Integer> intersection = new TreeSet<Integer>(ticket); 
		intersection.retainAll(winningNumbers);
		
		List<Integer> winners = new ArrayList<>();
		for (Integer test: ticket) {
			if (ticket.contains(test)) {
				winners.add(test);
			}
		}
		
		System.out.println("Your ticket numbers are : " + ticket);
		System.out.println("The winning numbers are : " + winningNumbers);
		System.out.println("You had '" + intersection.size() + "' matching numbers.");
		if (intersection.size() > 0) {
			double prize = 100 * intersection.size(); 
			System.out.println("The matched numbers are " + intersection); 
			System.out.printf("Your prize is $  %.2f \n", prize);
		}
	}

}
