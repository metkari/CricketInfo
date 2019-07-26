package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Player;

public class PlayerDaoImpl implements PlayerDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String addPlayerDetails(Player player) {
		
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.saveOrUpdate(player);
			tx.commit();
			session.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return "Success";
	}

	@Override
	public ArrayList<Player> allPlayerList() {
		List<Player> list=null;
		try {
			Session session=sessionFactory.openSession();
			Query q=session.createQuery("from Player");
			 list=q.list();
			session.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return (ArrayList<Player>) list;
	
	}

	@Override
	public ArrayList<Player> editList() {
		List<Player> list=null;
		try {
			Session session=sessionFactory.openSession();
			Query q=session.createQuery("from Player");
			 list=q.list();
			session.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return (ArrayList<Player>) list;
	
	}

	@Override
	public Player getPlayer(Long playerNo) {
		Player player=null;
		try {
			Session session=sessionFactory.openSession();
			player=(Player)session.get(Player.class, playerNo);
			/*Query q=session.createQuery("from Player where PlayerNo="+playerNo+"");
			player=(Player) q.list();*/
			session.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return player;
	
	}

	@Override
	public int deletePlayer(Long id) {
		
		int res=0;
		try {
			Session session=sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			//player=(Player)session.get(Player.class, id);
			Query q=session.createQuery("delete from Player where PlayerNo="+id+"");
			  res = q.executeUpdate();
			  tx.commit();
			session.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return res;
	
	}

}
