package baseball;

import java.util.*;

public interface PlayerMg {
	public void input(Player player);
	public boolean delete(String team, String name);
	public List<Player> view(String team);
	//public Player checkName(String name);
	public void trade(String selectTeam, String name, String team);
}
