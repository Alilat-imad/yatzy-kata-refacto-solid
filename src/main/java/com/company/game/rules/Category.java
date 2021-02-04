package com.company.game.rules;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface Category {

  Integer getCategoryScore(List<Integer> dices);

  default TreeMap<Integer, Integer> getFrequencyForEachFace(List<Integer> dices) {
    Map<Integer, Integer> frequency =
        dices.stream().collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
    return new TreeMap<>(frequency);
  }
}
