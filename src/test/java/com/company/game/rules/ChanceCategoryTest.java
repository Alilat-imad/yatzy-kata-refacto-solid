package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceCategoryTest {

  private static final Category category = new ChanceCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.ChanceBuilder#streamOfCorrectDiceValues")
  void categorySum_ShouldReturnSumOfArray(List<Integer> givenDice, int actualSum) {

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
