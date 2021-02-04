package com.company.game.rules;

import java.util.List;

public class ThreeOfKindCategory implements Category {
  public static final int THREE_OCCURRENCE = 3;

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    var dicesFrequency = getFrequencyForEachFace(dices);
    for (var entry : dicesFrequency.descendingMap().entrySet()) {
      if (entry.getValue() >= THREE_OCCURRENCE) return entry.getKey() * THREE_OCCURRENCE;
    }
    return 0;
  }
}
