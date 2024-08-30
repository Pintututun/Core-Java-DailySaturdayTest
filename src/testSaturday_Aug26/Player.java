package testSaturday_Aug26;

import java.util.Date;

public class Player {
private Integer playerNumber;
private String playerName;
private Double playerPrice;
private Date dateOfAuction=new Date();
public Player(Integer playerNumber, String playerName, Double playerPrice) {
	super();
	this.playerNumber = playerNumber;
	this.playerName = playerName;
	this.playerPrice = playerPrice;
	this.dateOfAuction = dateOfAuction;
}
public static Player getPlayerObject()
{
  Player pp=new Player(100,"Deepak",456.6);
  return pp;
}
@Override
public String toString() {
	return "Player [playerNumber=" + playerNumber + ", playerName=" + playerName + ", playerPrice=" + playerPrice
			+ ", dateOfAuction=" + dateOfAuction + "]";
}

}
