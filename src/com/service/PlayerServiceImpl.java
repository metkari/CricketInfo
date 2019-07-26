package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.PlayerDao;
import com.model.Player;

public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerDao playerDao;
	
	@Override
	public String addPlayerDetails(Player player) {
		
		return playerDao.addPlayerDetails(player);
	}

	@Override
	public ArrayList<Player> allPlayerList() {
		// TODO Auto-generated method stub
		return playerDao.allPlayerList();
	}

	@Override
	public ArrayList<Player> editList() {
		
		return playerDao.editList();
	}

	@Override
	public Player getPlayer(Long playerNo) {
		return playerDao.getPlayer(playerNo);
	}

	@Override
	public int deletePlayer(Long id) {
		// TODO Auto-generated method stub
		return playerDao.deletePlayer(id);
	}

}
