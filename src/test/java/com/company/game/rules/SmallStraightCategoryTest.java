package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallStraightCategoryTest {

  private static final Category category = new SmallStraightCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.SmallStraightBuilder#streamOfCorrectDiceValues")
  void categorySum_ShouldReturnSumOfArray15(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.SmallStraightBuilder#streamOfWrongDiceValues")
  void categorySum_ShouldReturnSumOfArrayZero(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
