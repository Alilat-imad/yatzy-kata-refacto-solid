package com.company.game.factoryBuilder;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class TwoPairBuilder {

  // 1,1,2,3,3 scores 8 (1+1+3+3)
  // 1,1,2,3,4 scores 0
  // 1,1,2,2,2 scores 6 (1+1+2+2)

  public static final int SUM_DICE_VALUE_ZERO = 0;
  public static final int SUM_DICE_VALUE_6 = 6;
  public static final int SUM_DICE_VALUE_8 = 8;
  public static final int SUM_DICE_VALUE_12 = 12;
  public static final int SUM_DICE_VALUE_14 = 14;
  public static final int SUM_DICE_VALUE_20 = 20;

  public static List<Integer> correctDiceValues_1() {
    return List.of(1, 1, 2, 3, 3);
  }

  public static List<Integer> correctDiceValues_2() {
    return List.of(1, 1, 2, 2, 2);
  }

  public static List<Integer> correctDiceValues_3() {
    return List.of(3, 3, 3, 4, 4);
  }

  public static List<Integer> correctDiceValues_4() {
    return List.of(1, 1, 3, 5, 5);
  }

  public static List<Integer> correctDiceValues_5() {
    return List.of(6, 4, 6, 4, 2);
  }

  public static List<Integer> correctDiceValues_6() {
    return List.of(1, 3, 3, 1, 5);
  }

  public static Stream<Arguments> streamOfCorrectDiceValues() {
    return Stream.of(
        Arguments.of(correctDiceValues_1(), SUM_DICE_VALUE_8),
        Arguments.of(correctDiceValues_2(), SUM_DICE_VALUE_6),
        Arguments.of(correctDiceValues_3(), SUM_DICE_VALUE_14),
        Arguments.of(correctDiceValues_4(), SUM_DICE_VALUE_12),
        Arguments.of(correctDiceValues_5(), SUM_DICE_VALUE_20),
        Arguments.of(correctDiceValues_6(), SUM_DICE_VALUE_8));
  }

  public static List<Integer> wrongDiceValues_1() {
    return List.of(2, 2, 3, 4, 5);
  }

  public static List<Integer> wrongDiceValues_2() {
    return List.of(1, 2, 4, 4, 5);
  }

  public static List<Integer> wrongDiceValues_3() {
    return List.of(1, 2, 1, 1, 1);
  }

  public static List<Integer> wrongDiceValues_4() {
    return List.of(2, 3, 1, 4, 3);
  }

  public static List<Integer> wrongDiceValues_5() {
    return List.of(2, 6, 3, 1, 5);
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
