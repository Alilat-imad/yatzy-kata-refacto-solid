package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPairCategoryTest {

  private static final Category category = new TwoPairCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.TwoPairBuilder#streamOfCorrectDiceValues")
  void categorySum_ShouldReturnSumOfArrayTwoPairSum(List<Integer> givenDice, int actualSum) {
    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.TwoPairBuilder#streamOfWrongDiceValues")
  void categorySum_ShouldReturnZeroSumOfArrayTwoPairSum(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
