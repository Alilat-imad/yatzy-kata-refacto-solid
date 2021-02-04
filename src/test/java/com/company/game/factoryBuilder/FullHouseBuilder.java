package com.company.game.factoryBuilder;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class FullHouseBuilder {

  //          1,1,2,2,2 scores 8 (1+1+2+2+2)
  //          2,2,3,3,4 scores 0
  //          4,4,4,4,4 scores 0

  public static final int SUM_DICE_VALUE_ZERO = 0;

  public static List<Integer> correctDiceValues_1() {
    return List.of(1, 1, 2, 2, 2);
  }

  public static List<Integer> correctDiceValues_2() {
    return List.of(4, 4, 6, 6, 6);
  }

  public static List<Integer> correctDiceValues_3() {
    return List.of(5, 5, 3, 3, 3);
  }

  public static Stream<Arguments> streamOfCorrectDiceValues() {
    return Stream.of(
        Arguments.of(correctDiceValues_1(), 8),
        Arguments.of(correctDiceValues_2(), 26),
        Arguments.of(correctDiceValues_3(), 19));
  }

  public static List<Integer> wrongDiceValues_1() {
    return List.of(1, 1, 3, 2, 2);
  }

  public static List<Integer> wrongDiceValues_2() {
    return List.of(4, 4, 4, 4, 4);
  }

  public static List<Integer> wrongDiceValues_3() {
    return List.of(1, 2, 3, 4, 5);
  }

  public static List<Integer> wrongDiceValues_4() {
    return List.of(1, 1, 1, 1, 1);
  }

  public static List<Integer> wrongDiceValues_5() {
    return List.of(1, 1, 2, 4, 5);
  }

  public static Stream<Arguments> streamOfWrongDiceValues() {
    return Stream.of(
        Arguments.of(wrongDiceValues_1(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_2(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_3(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_4(), SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_5(), SUM_DICE_VALUE_ZERO));
  }
}
