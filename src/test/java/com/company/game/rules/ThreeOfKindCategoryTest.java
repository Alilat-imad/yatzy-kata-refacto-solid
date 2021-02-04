package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeOfKindCategoryTest {

  private static final Category category = new ThreeOfKindCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.ThreeOfKindBuilder#streamOfCorrectDiceValues")
  void categorySum_ShouldReturnSumOfArrayRepeatingThreeTimes(
      List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.ThreeOfKindBuilder#streamOfWrongDiceValues")
  void categorySum_ShouldReturnSumOfArrayZero(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
