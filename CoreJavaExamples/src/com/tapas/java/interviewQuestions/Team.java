package com.tapas.java.interviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Team {

	public int totalScore(List<Player> plist) {

		int sum = plist.stream().map(s -> s.getScore()).reduce(0, (a, b) -> a + b);
		return sum;
	}

	public Map<String, List<Player>> groupByType(List<Player> plist) {
		Map<String, List<Player>> map = plist
				                        .stream()
				                        .collect(Collectors.groupingBy(Player::getType));
		return map;
	}

}
