package com.company.game.factoryBuilder;

import com.company.game.Yatzy;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class GameBuilder {

  public static final int SUM_DICE_VALUE_ZERO = 0;
  public static final int FACE_DACE_1 = 1;
  public static final int FACE_DACE_2 = 2;
  public static final int FACE_DACE_3 = 3;
  public static final int FACE_DACE_4 = 4;
  public static final int FACE_DACE_5 = 5;
  public static final int FACE_DACE_6 = 6;

  public static Stream<Arguments> streamOneToSixDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(1, 1, 2, 4, 4), FACE_DACE_1, 2),
        Arguments.of(new Yatzy(3, 3, 2, 2, 1), FACE_DACE_2, 4),
        Arguments.of(new Yatzy(3, 1, 2, 2, 3), FACE_DACE_3, 6),
        Arguments.of(new Yatzy(2, 2, 5, 4, 4), FACE_DACE_4, 8),
        Arguments.of(new Yatzy(1, 1, 4, 2, 5), FACE_DACE_5, 5),
        Arguments.of(new Yatzy(1, 1, 6, 2, 6), FACE_DACE_6, 12));
  }

  public static Stream<Arguments> streamYatzyDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(1, 1, 1, 1, 1), 50),
        Arguments.of(new Yatzy(2, 2, 2, 2, 2), 50),
        Arguments.of(new Yatzy(3, 3, 3, 3, 3), 50),
        Arguments.of(new Yatzy(4, 4, 4, 4, 4), 50),
        Arguments.of(new Yatzy(5, 5, 5, 5, 5), 50),
        Arguments.of(new Yatzy(6, 6, 6, 6, 6), 50));
  }

  public static Stream<Arguments> streamChanceDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(1, 1, 2, 4, 4), 12),
        Arguments.of(new Yatzy(3, 3, 2, 2, 1), 11),
        Arguments.of(new Yatzy(3, 1, 2, 2, 5), 13),
        Arguments.of(new Yatzy(2, 2, 5, 4, 4), 17),
        Arguments.of(new Yatzy(1, 1, 4, 2, 5), 13),
        Arguments.of(new Yatzy(1, 1, 6, 2, 6), 16));
  }

  public static Stream<Arguments> streamFourOfKindDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(1, 1, 1, 1, 1), 4),
        Arguments.of(new Yatzy(2, 2, 2, 2, 6), 8),
        Arguments.of(new Yatzy(3, 3, 4, 3, 3), 12),
        Arguments.of(new Yatzy(4, 4, 4, 5, 4), 16),
        Arguments.of(new Yatzy(5, 5, 4, 5, 5), 20),
        Arguments.of(new Yatzy(6, 3, 6, 6, 6), 24));
  }

  public static Stream<Arguments> streamThreeOfKindDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(1, 1, 1, 1, 1), 3),
        Arguments.of(new Yatzy(1, 1, 4, 1, 3), 3),
        Arguments.of(new Yatzy(2, 2, 4, 2, 6), 6),
        Arguments.of(new Yatzy(3, 1, 4, 3, 3), 9),
        Arguments.of(new Yatzy(4, 6, 4, 5, 4), 12),
        Arguments.of(new Yatzy(5, 1, 4, 5, 5), 15),
        Arguments.of(new Yatzy(6, 3, 6, 6, 6), 18));
  }

  public static Stream<Arguments> streamSmallStraightDiceValues() {
    return Stream.of(Arguments.of(new Yatzy(1, 2, 3, 4, 5), 15));
  }

  public static Stream<Arguments> streamLargeStraightDiceValues() {
    return Stream.of(Arguments.of(new Yatzy(2, 3, 4, 5, 6), 20));
  }

  public static Stream<Arguments> streamFullHouseDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(1, 1, 2, 2, 2), 8),
        Arguments.of(new Yatzy(4, 4, 6, 6, 6), 26),
        Arguments.of(new Yatzy(5, 5, 3, 3, 3), 19));
  }

  public static Stream<Arguments> streamPairDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(3, 3, 3, 4, 4), 8),
        Arguments.of(new Yatzy(1, 1, 6, 2, 6), 12),
        Arguments.of(new Yatzy(3, 3, 3, 4, 1), 6),
        Arguments.of(new Yatzy(3, 3, 3, 3, 1), 6),
        Arguments.of(new Yatzy(5, 5, 5, 6, 6), 12),
        Arguments.of(new Yatzy(6, 6, 6, 6, 6), 12));
  }

  public static Stream<Arguments> streamTwoPairDiceValues() {
    return Stream.of(
        Arguments.of(new Yatzy(1, 1, 2, 3, 3), 8),
        Arguments.of(new Yatzy(1, 1, 2, 2, 2), 6),
        Arguments.of(new Yatzy(3, 3, 3, 4, 4), 14),
        Arguments.of(new Yatzy(1, 1, 3, 5, 5), 12),
        Arguments.of(new Yatzy(6, 4, 6, 4, 2), 20),
        Arguments.of(new Yatzy(1, 3, 3, 1, 5), 8));
  }
}
