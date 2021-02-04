package com.company.game.rules;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class OneToSixCategory implements Category {

  private final int value;

  @Override
  public Integer getCategoryScore(List<Integer> dices) {
    return dices.stream().filter(diceValue -> value == diceValue).reduce(0, Integer::sum);
  }
}
