package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeStraightCategoryTest {

  private static final Category category = new LargeStraightCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.LargeStraightBuilder#streamOfCorrectDiceValues")
  void categorySum_ShouldReturnSumOfArray20(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.LargeStraightBuilder#streamOfWrongDiceValues")
  void categorySum_ShouldReturnSumOfArrayZero(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
