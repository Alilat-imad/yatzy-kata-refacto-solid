package com.company.game.rules;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneToSixCategoryTest {

  private static Category category;

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.OneToSixBuilder#streamOfCorrectDiceValues")
  void categorySum_shouldReturnCorrectValues(
      List<Integer> givenDice, int chosenFace, int actualSum) {

    // Given
    category = new OneToSixCategory(chosenFace);

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(actualSum, expectedSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.OneToSixBuilder#streamOfWrongDiceValues")
  void categorySum_shouldReturnWrongValues(List<Integer> givenDice, int chosenFace, int actualSum) {

    // Given
    category = new OneToSixCategory(chosenFace);

    // When
    var expectedSum = category.getCategoryScore(givenDice);

    // Then
    assertEquals(actualSum, expectedSum);
  }
}
