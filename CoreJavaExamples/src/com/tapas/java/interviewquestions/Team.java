package com.tapas.java.interviewquestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Team {

	public int totalScore(List<Player> plist) {

		return plist.stream().
				map(Player::getScore)
				.reduce(0, (a, b) -> a + b);
	}

	public Map<String, List<Player>> groupByType(List<Player> plist) {
		return plist.stream()
                     .collect(Collectors.groupingBy(Player::getType));
	}

}
