package com.company.game.rules;

import java.util.List;

public class TwoPairCategory implements Category {
  public static final int TWO_OCCURRENCE = 2;

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    var dicesFrequency = getFrequencyForEachFace(dices);

    int occurrence = 0;
    int score = 0;

    for (var entry : dicesFrequency.descendingMap().entrySet()) {
      if (entry.getValue() >= TWO_OCCURRENCE) {
        score += entry.getKey() * 2;
        occurrence++;
      }
    }
    if (occurrence == 2) return score;
    return 0;
  }
}
