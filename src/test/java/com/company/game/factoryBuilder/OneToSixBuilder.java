package com.company.game.factoryBuilder;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class OneToSixBuilder {
  public static final int FACE_DACE_1_SUM = 2;
  public static final int FACE_DACE_2_SUM = 4;
  public static final int FACE_DACE_3_SUM = 6;
  public static final int FACE_DACE_4_SUM = 8;
  public static final int FACE_DACE_5_SUM = 5;
  public static final int FACE_DACE_6_SUM = 12;

  public static final int SUM_DICE_VALUE_ZERO = 0;
  public static final int FACE_DACE_1 = 1;
  public static final int FACE_DACE_2 = 2;
  public static final int FACE_DACE_3 = 3;
  public static final int FACE_DACE_4 = 4;
  public static final int FACE_DACE_5 = 5;
  public static final int FACE_DACE_6 = 6;

  //          1,1,2,4,4 placed on "fours" scores 8 (4+4)
  //          2,3,2,5,1 placed on "twos" scores 4 (2+2)
  //          3,3,3,4,5 placed on "ones" scores 0

  public static List<Integer> correctDiceValues_1() {
    return List.of(1, 1, 2, 4, 4);
  }

  public static List<Integer> correctDiceValues_2() {
    return List.of(3, 3, 2, 2, 1);
  }

  public static List<Integer> correctDiceValues_3() {
    return List.of(3, 1, 2, 2, 3);
  }

  public static List<Integer> correctDiceValues_4() {
    return List.of(2, 2, 5, 4, 4);
  }

  public static List<Integer> correctDiceValues_5() {
    return List.of(1, 1, 4, 2, 5);
  }

  public static List<Integer> correctDiceValues_6() {
    return List.of(1, 1, 6, 2, 6);
  }

  public static Stream<Arguments> streamOfCorrectDiceValues() {
    return Stream.of(
        Arguments.of(correctDiceValues_1(), FACE_DACE_1, FACE_DACE_1_SUM),
        Arguments.of(correctDiceValues_2(), FACE_DACE_2, FACE_DACE_2_SUM),
        Arguments.of(correctDiceValues_3(), FACE_DACE_3, FACE_DACE_3_SUM),
        Arguments.of(correctDiceValues_4(), FACE_DACE_4, FACE_DACE_4_SUM),
        Arguments.of(correctDiceValues_5(), FACE_DACE_5, FACE_DACE_5_SUM),
        Arguments.of(correctDiceValues_6(), FACE_DACE_6, FACE_DACE_6_SUM));
  }

  public static List<Integer> wrongDiceValues_1() {
    return List.of(4, 4, 3, 2, 2);
  }

  public static List<Integer> wrongDiceValues_2() {
    return List.of(4, 4, 4, 4, 4);
  }

  public static List<Integer> wrongDiceValues_3() {
    return List.of(1, 2, 6, 4, 5);
  }

  public static List<Integer> wrongDiceValues_4() {
    return List.of(1, 1, 2, 1, 2);
  }

  public static List<Integer> wrongDiceValues_5() {
    return List.of(1, 1, 2, 4, 3);
  }

  public static List<Integer> wrongDiceValues_6() {
    return List.of(1, 1, 2, 3, 3);
  }

  public static Stream<Arguments> streamOfWrongDiceValues() {
    return Stream.of(
        Arguments.of(wrongDiceValues_1(), FACE_DACE_1, SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_2(), FACE_DACE_2, SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_3(), FACE_DACE_3, SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_4(), FACE_DACE_4, SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_5(), FACE_DACE_5, SUM_DICE_VALUE_ZERO),
        Arguments.of(wrongDiceValues_6(), FACE_DACE_6, SUM_DICE_VALUE_ZERO));
  }
}
