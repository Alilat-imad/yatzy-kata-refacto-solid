package com.company.game.rules;

import java.util.List;

public class PairCategory implements Category {

  public static final int TWO_OCCURRENCE = 2;

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    var dicesFrequency = getFrequencyForEachFace(dices);
    for (var entry : dicesFrequency.descendingMap().entrySet()) {
      if (entry.getValue() >= TWO_OCCURRENCE) return entry.getKey() * TWO_OCCURRENCE;
    }
    return 0;
  }
}
