package com.tapas.java.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsExample {
public static void main(String[] args) {
	
	List<Player> list = new ArrayList<>();
	list.add(new Player("Tapas", 50, "Batting"));
	list.add(new Player("Avi", 40, "Bowler"));
	list.add(new Player("Devi", 50, "Allround"));
	list.add(new Player("Dbibrata", 0, "Bowler"));
	list.add(new Player("Talib", 50, "Batting"));
	//need playler name who scored more then 40
	Map<String, Integer> playerlist = list.stream().filter(s->s.getScore()>40).collect(Collectors.toMap(Player::getName, Player::getScore));
System.out.println(playerlist);	 
}
	
}
