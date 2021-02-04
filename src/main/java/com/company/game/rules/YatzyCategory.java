package com.company.game.rules;

import java.util.List;

public class YatzyCategory implements Category {

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    var frequency = getFrequencyForEachFace(dices);
    if (frequency.containsValue(5)) {
      return 50;
    }
    return 0;
  }
}
