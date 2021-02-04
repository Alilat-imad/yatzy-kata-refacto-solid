package com.company.game.rules;

import java.util.List;

public class ChanceCategory implements Category {

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    return dices.stream().reduce(0, Integer::sum);
  }
}
