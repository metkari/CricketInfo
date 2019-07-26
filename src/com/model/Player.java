package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player {
	
	@Id
	@Column
	private long playerNo;
	
	@Column
	private String playerName;
	
	@Column
	private int playerAge;

	public long getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(long playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	
	
	

}
