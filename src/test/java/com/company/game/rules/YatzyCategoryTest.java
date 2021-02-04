package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YatzyCategoryTest {

  private static final Category category = new YatzyCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.YatzyBuilder#streamOfCorrectDiceValues")
  void getCategoryScore_shouldReturnCorrectValue(List<Integer> givenDice, int actualSum) {
    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.YatzyBuilder#streamOfWrongDiceValues")
  void getCategoryScore_shouldReturnZeroValue(List<Integer> givenDice, int actualSum) {
    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
