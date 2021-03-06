package com.abstractlabs.oefen.card;

import com.abstractlabs.oefen.User;
import com.abstractlabs.oefen.entity.Attacker;
import com.abstractlabs.oefen.screen.ScreenGame;
import com.badlogic.gdx.audio.Sound;
	
public class CardAttacker extends Card {
	private float attackerX;
	private float attackerY;
	
	public CardAttacker(ScreenGame screen, Cards card, Sound sound, User user) {
		super(screen, Card.ATTACKER, card, sound, user);
		this.attackerX = user.getTeam()=="Blue"?64+2*32:64+33*32;
		this.attackerY = user.getTeam()=="Blue"?122+13+(screen.getMap().getBlueStart())*32+10:122+13+(screen.getMap().getRedStart())*32+10;
	}
	
	public CardAttacker(Cards card, Sound sound, User user) {
		this(null, card, sound, user);
	}

	public Attacker createAttacker() {
		return Attacker.createAttacker(screen, card, attackerX, attackerY, user.getTeam());
	}
}