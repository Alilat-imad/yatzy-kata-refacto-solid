package com.company.game.rules;

import java.util.List;

public class FourOfKindCategory implements Category {

  public static final int FOUR_OCCURRENCE = 4;

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    var dicesFrequency = getFrequencyForEachFace(dices);
    for (var entry : dicesFrequency.descendingMap().entrySet()) {
      if (entry.getValue() >= FOUR_OCCURRENCE) return entry.getKey() * FOUR_OCCURRENCE;
    }
    return 0;
  }
}
