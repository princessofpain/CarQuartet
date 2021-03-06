package com.Chilja.game;

import java.util.ArrayList;

public class GameLogic {
	
	public String compare(Card myCard, Card opponentsCard) {
		int allPoints = compareEachValue(myCard, opponentsCard);
		String result = evaluate(allPoints);
		
		return result;
	}
	
	private int compareEachValue(Card myCard, Card opponentsCard) {
		int points = 0;
		int hasTheSameValues = 0;

		if(myCard.getDisplacement() > opponentsCard.getDisplacement()) {
			points ++;
		} else if(myCard.getDisplacement().equals(opponentsCard.getDisplacement())) {
			hasTheSameValues++;
		}
		
		if(myCard.getZeroToHundred() < opponentsCard.getZeroToHundred()) {
			points++;
		} else if(myCard.getZeroToHundred().equals(opponentsCard.getZeroToHundred())) {
			hasTheSameValues++;
		}
		
		if(myCard.getMaxSpeed() > opponentsCard.getMaxSpeed()) {
			points++;
		} else if(myCard.getMaxSpeed().equals(opponentsCard.getMaxSpeed())) {
			hasTheSameValues++;
		}
		
		if(myCard.getHorsepower() > opponentsCard.getHorsepower()) {
			points++;
		} else if(myCard.getHorsepower().equals(opponentsCard.getHorsepower())) {
			hasTheSameValues++;
		}
		
		if(hasTheSameValues == 4) {
			points = 2;
		}
		
		return points;
	}
	
	private String evaluate(int allPoints) {
		String result = "";
		
		if(allPoints == 2) {
			result = "It is equal.";
		} else if(allPoints > 2) {
			result = "You win.";
		} else {
			result = "You lose.";
		}
		
		return result;
	}
	
	public Card[] calculateRankingOf(Card[] remainingCards) {
		ArrayList<Card> rankings = new ArrayList<Card>();
		
		for(Card card: remainingCards) {
			rankings.add(card);
		}
		
		for(Card card: remainingCards) {		
			for(Card cardToCompare: remainingCards) {
				if(!cardToCompare.equals(card)) {
					String result = compare(card,cardToCompare);
					
					int indexOriginal = rankings.indexOf(card);
					int indexChange = rankings.indexOf(cardToCompare);

					if(result == "You win." && indexChange < indexOriginal || 
					   result == "You lose." && indexChange > indexOriginal) {
						rankings.set(indexOriginal, cardToCompare);
						rankings.set(indexChange, card);
					}	
				} 
			}
		}
		
		Card[] ranking = rankings.toArray(new Card[rankings.size()]);
		return ranking;
	}
}
