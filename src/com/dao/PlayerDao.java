package com.dao;

import java.util.ArrayList;

import com.model.Player;

public interface PlayerDao {
	
	public String addPlayerDetails(Player player);

	public ArrayList<Player> allPlayerList();

	public ArrayList<Player> editList();

	public Player getPlayer(Long playerNo);

	public int deletePlayer(Long id);

}
