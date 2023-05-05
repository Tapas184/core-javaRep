package com.tapas.java.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	Map<String, Integer> playerlist = list.stream()
			                        .filter(s->s.getScore()>40)
			                        .collect(Collectors.toMap(Player::getName, Player::getScore));
	System.out.println(playerlist);
	list.stream()
	    .filter(s->s.getScore()==50)
	    .collect(Collectors.groupingBy(Player::getScore))
	    .forEach((s,y)->{
	    	System.out.print("Score: "+s+"=");
	    System.out.println(y.stream()
	    	                .map(Player::getName)
	    	                .toList());
	    });

	list.stream()
	    .collect(Collectors.groupingBy(Player::getScore))
	    .forEach((x,y)->{
	    	System.out.print("Score: "+x+"=");
	    	System.out.println(y.stream()
	    			            .map(Player::getName)
	    			            .toList());
	    });
	
	list.stream()
	    .sorted(Comparator.comparing(Player::getScore))
	    .toList()
	    .forEach(s->{
	    	System.out.print(s.getName()+"="+s.getScore()+", ");
	    });
	    System.out.println();
	list.stream()
	    .sorted(Comparator.comparing(Player::getScore).reversed())
	    .toList()
	    .forEach(s->{
	    	System.out.print(s.getName()+"="+s.getScore()+", ");
	    });
	System.out.println();
	List<Player> list2 = list.stream()
	    .sorted(Comparator.comparing(Player::getName))
	    .toList();
	list2.forEach(s->{
		if(list2.size()-1==list2.indexOf(s))
			System.out.print(s.getName());
		else
		System.out.print(s.getName()+", ");
	});
	    
   }
	
}
