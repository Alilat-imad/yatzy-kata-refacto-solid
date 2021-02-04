package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourOfKindCategoryTest {

  private static final Category category = new FourOfKindCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.FourOfKindBuilder#streamOfCorrectDiceValues")
  void categorySum_ShouldReturnSumOfArrayRepeatingFourTimes(
      List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.FourOfKindBuilder#streamOfWrongDiceValues")
  void categorySum_ShouldReturnSumOfArrayZero(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
