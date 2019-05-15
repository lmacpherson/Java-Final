/**
 * @author Juo-Wei, Bansi, Lauran
 * Java Programming
 * CS170-01
 * Final Project
 */

import java.util.Comparator;

public class PlayerInfo {

	private String playerName;
	private int playerScore;
	
	public PlayerInfo(String name, int score)
	{
		this.playerName = name;
		this.playerScore = score;
	}
	
	//playerName
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	//playerScore
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	// for sorting
	public static Comparator<PlayerInfo> scoreComparator = new Comparator<PlayerInfo>() {

		public int compare(PlayerInfo f1, PlayerInfo f2) {
		   String friendName1 = f1.getPlayerName();
		   String friendName2 = f2.getPlayerName();
		   return friendName2.compareTo(friendName1);
	    }
	};
}
