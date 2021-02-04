package com.company.game.factoryBuilder;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class ChanceBuilder {

  //  1,1,3,3,6 placed on "chance" scores 14 (1+1+3+3+6)
  //  4,5,5,6,1 placed on "chance" scores 21 (4+5+5+6+1)

  public static final int FACE_DACE_1_SUM = 12;
  public static final int FACE_DACE_2_SUM = 11;
  public static final int FACE_DACE_3_SUM = 13;
  public static final int FACE_DACE_4_SUM = 17;
  public static final int FACE_DACE_5_SUM = 13;
  public static final int FACE_DACE_6_SUM = 16;

  public static List<Integer> correctDiceValues_1() {
    return List.of(1, 1, 2, 4, 4);
  }

  public static List<Integer> correctDiceValues_2() {
    return List.of(3, 3, 2, 2, 1);
  }

  public static List<Integer> correctDiceValues_3() {
    return List.of(3, 1, 2, 2, 5);
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
        Arguments.of(correctDiceValues_1(), FACE_DACE_1_SUM),
        Arguments.of(correctDiceValues_2(), FACE_DACE_2_SUM),
        Arguments.of(correctDiceValues_3(), FACE_DACE_3_SUM),
        Arguments.of(correctDiceValues_4(), FACE_DACE_4_SUM),
        Arguments.of(correctDiceValues_5(), FACE_DACE_5_SUM),
        Arguments.of(correctDiceValues_6(), FACE_DACE_6_SUM));
  }
}
