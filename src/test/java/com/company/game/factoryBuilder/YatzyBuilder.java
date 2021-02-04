package com.company.game.factoryBuilder;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class YatzyBuilder {

  // 1,1,1,1,1 placed on "yatzy" scores 50
  // 1,1,1,2,1 placed on "yatzy" scores 0

  public static final int SUM_DICE_VALUE_ZERO = 0;
  public static final int SUM_DICE_VALUE_50 = 50;

  public static List<Integer> correctDiceValues_1() {
    return List.of(1, 1, 1, 1, 1);
  }

  public static List<Integer> correctDiceValues_2() {
    return List.of(2, 2, 2, 2, 2);
  }

  public static List<Integer> correctDiceValues_3() {
    return List.of(3, 3, 3, 3, 3);
  }

  public static List<Integer> correctDiceValues_4() {
    return List.of(4, 4, 4, 4, 4);
  }

  public static List<Integer> correctDiceValues_5() {
    return List.of(5, 5, 5, 5, 5);
  }

  public static List<Integer> correctDiceValues_6() {
    return List.of(6, 6, 6, 6, 6);
  }

  public static Stream<Arguments> streamOfCorrectDiceValues() {
    return Stream.of(
        Arguments.of(correctDiceValues_1(), SUM_DICE_VALUE_50),
        Arguments.of(correctDiceValues_2(), SUM_DICE_VALUE_50),
        Arguments.of(correctDiceValues_3(), SUM_DICE_VALUE_50),
        Arguments.of(correctDiceValues_4(), SUM_DICE_VALUE_50),
        Arguments.of(correctDiceValues_5(), SUM_DICE_VALUE_50),
        Arguments.of(correctDiceValues_6(), SUM_DICE_VALUE_50));
  }

  public static List<Integer> WrongDiceValues_1() {
    return List.of(1, 1, 3, 2, 2);
  }

  public static List<Integer> WrongDiceValues_2() {
    return List.of(4, 4, 4, 4, 1);
  }

  public static List<Integer> WrongDiceValues_3() {
    return List.of(1, 2, 2, 2, 5);
  }

  public static List<Integer> WrongDiceValues_4() {
    return List.of(1, 1, 3, 1, 3);
  }

  public static List<Integer> WrongDiceValues_5() {
    return List.of(1, 1, 2, 4, 5);
  }

  public static List<Integer> WrongDiceValues_6() {
    return List.of(1, 1, 2, 4, 6);
  }

  public static Stream<Arguments> streamOfWrongDiceValues() {
    return Stream.of(
        Arguments.of(WrongDiceValues_1(), SUM_DICE_VALUE_ZERO),
        Arguments.of(WrongDiceValues_2(), SUM_DICE_VALUE_ZERO),
        Arguments.of(WrongDiceValues_3(), SUM_DICE_VALUE_ZERO),
        Arguments.of(WrongDiceValues_4(), SUM_DICE_VALUE_ZERO),
        Arguments.of(WrongDiceValues_5(), SUM_DICE_VALUE_ZERO),
        Arguments.of(WrongDiceValues_6(), SUM_DICE_VALUE_ZERO));
  }
}
