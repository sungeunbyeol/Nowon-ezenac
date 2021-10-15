package baseball;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PlayerMgImpl implements PlayerMg {
	Hashtable<String, Hashtable<String, Player>> set;//备窜 包府
	Scanner in;
	
	public PlayerMgImpl() {
		in = new Scanner(System.in);
		set = new Hashtable<>();
		TeamName[] team = TeamName.values(); 
		for(int i=0; i<team.length; ++i) {
			Hashtable<String, Player> ht = new Hashtable<>(); //评盔 包府
			set.put(String.valueOf(team[i]), ht);
		}
	}
	
	@Override
	public void input(Player player) {
		Hashtable<String, Player> ht = set.get(player.getTeam());
		ht.put(player.getName(), player);
	}

	@Override
	public List<Player> view(String team) {
		List<Player> list = new ArrayList<>();
		Hashtable<String, Player> ht = set.get(team);
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			Player view = ht.get(enu.nextElement());
			list.add(view);
		}
		return list;
	}
	/*
	@Override
	public Player checkName(String name) {
		//Hashtable<String, Player> ht = set.get(name);
		Iterator it = ((List<Player>) set).iterator();
		while(it.hasNext()) {
			Player check = (Player) it.next();
			if (check.getName().equals(name)) {
				return check;
			}
		}
		return null;
	}
	*/
	@Override
	public void trade(String selectTeam, String name, String team) {
		Hashtable<String, Player> ht = set.get(selectTeam);		//扁粮评
		Player trade = ht.get(name);
		trade.setTeam(team);
		
		ht.remove(name);
		ht = set.get(team);					
		ht.put(name, trade);
	}

	@Override
	public boolean delete(String team, String name) {
		if (set.containsKey(team)) {
			Hashtable<String, Player> ht = set.get(team);
			if (ht.containsKey(name)) {
				ht.remove(name);
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
