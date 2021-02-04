package com.company.game;

import com.company.game.rules.Category;

import java.util.ArrayList;
import java.util.List;

public class Yatzy {

  private List<Integer> dices = new ArrayList<>();

  public Yatzy(int d1, int d2, int d3, int d4, int d5) {
    dices.addAll(List.of(d1, d2, d3, d4, d5));
  }

  public int getScoreByCategory(Category category) {
    return category.getCategoryScore(dices);
  }
}
