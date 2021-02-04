package com.company.game.rules;

import java.util.List;

public class FullHouseCategory implements Category {

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    var dicesFrequency = getFrequencyForEachFace(dices);
    if (dicesFrequency.containsValue(2) && dicesFrequency.containsValue(3)) {
      return dices.stream().reduce(0, Integer::sum);
    }
    return 0;
  }
}
