package com.company.game.rules;

import java.util.List;

public class LargeStraightCategory implements Category {

  public static final List<Integer> LARGE_CATEGORY_SEQUENCE_REFERENCE = List.of(2, 3, 4, 5, 6);

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    if (dices.equals(LARGE_CATEGORY_SEQUENCE_REFERENCE)) {
      return 20;
    }
    return 0;
  }
}
