package com.abstractlabs.oefen.card;

import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck(List<Card> cards) {
		if(cards.size() <= 30) {
			this.cards = cards;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public List<Card> getCards() {
		return this.cards;
	}
}