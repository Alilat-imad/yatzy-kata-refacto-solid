package com.company.game.factoryBuilder;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class LargeStraightBuilder {

  // 2,3,4,5,6, => scores 20
  public static final int SUM_DICE_VALUE_20 = 20;
  public static final int SUM_DICE_VALUE_ZERO = 0;

  public static List<Integer> correctDiceValues_1() {
    return List.of(2, 3, 4, 5, 6);
  }

  public static Stream<Arguments> streamOfCorrectDiceValues() {
    return Stream.of(Arguments.of(correctDiceValues_1(), SUM_DICE_VALUE_20));
  }

  public static List<Integer> wrongDiceValues_1() {
    return List.of(2, 2, 3, 4, 5);
  }

  public static List<Integer> wrongDiceValues_2() {
    return List.of(4, 2, 3, 4, 5);
  }

  public static List<Integer> wrongDiceValues_3() {
    return List.of(1, 2, 3, 4, 6);
  }

  public static List<Integer> wrongDiceValues_4() {
    return List.of(2, 3, 4, 4, 5);
  }

  public static List<Integer> wrongDiceValues_5() {
    return List.of(2, 2, 3, 4, 5);
  }

  public static List<Integer> wrongDiceValues_6() {
    return List.of(2, 3, 4, 5, 1);
  }

  public static Stream<Arguments> streamOfWrongDiceValues() {
    return Stream.of(
        Arguments.of(wrongDiceValues_1(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_2(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_3(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_4(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_5(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_6(), SUM_DICE_VALUE_ZERO));
  }
}
