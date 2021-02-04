package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairCategoryTest {

  private static final Category category = new PairCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.PairBuilder#streamOfCorrectDiceValues")
  void categorySum_ShouldReturnSumOfArrayMaxPairingValue(List<Integer> givenDice, int actualSum) {
    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.PairBuilder#streamOfWrongDiceValues")
  void categorySum_ShouldReturnZeroOfSumOfArrayMaxPairingValue(
      List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
