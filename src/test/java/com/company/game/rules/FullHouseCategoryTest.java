package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FullHouseCategoryTest {

  private static final Category category = new FullHouseCategory();

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.FullHouseBuilder#streamOfCorrectDiceValues")
  void categorySum_shouldReturnCorrectValue(List<Integer> givenDice, int actualSum) {
    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.FullHouseBuilder#streamOfWrongDiceValues")
  void categorySum_shouldReturnZeroValue(List<Integer> givenDice, int actualSum) {
    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
