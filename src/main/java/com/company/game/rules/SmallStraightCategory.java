package com.company.game.rules;

import java.util.List;

public class SmallStraightCategory implements Category {

  public static final List<Integer> SMALL_CATEGORY_SEQUENCE_REFERENCE = List.of(1, 2, 3, 4, 5);

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    if (dices.equals(SMALL_CATEGORY_SEQUENCE_REFERENCE)) {
      return 15;
    }
    return 0;
  }
}
