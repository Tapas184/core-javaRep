package com.tapas.java.interviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {
		Player p1 = new Player("abc", 50, "Batsman");
		Player p2 = new Player("lyc", 30, "Batsman");
		Player p3 = new Player("abc", 20, "Bowler");
		Player p4 = new Player("asyz", 10, "Bowler");
		List<Player> playerList = new ArrayList<>();
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);
		playerList.add(p4);

		Team team = new Team();
		int total = team.totalScore(playerList);
		System.out.println("Team Score");
		System.out.println(total);

		Map<String, List<Player>> map = team.groupByType(playerList);
		map.forEach((s, y) -> {
			System.out.println(s);
			y.forEach(System.out::println);
		});
	}

}
