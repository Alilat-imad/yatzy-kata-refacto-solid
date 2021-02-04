package com.company.game;

import com.company.game.rules.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YatzyTest {

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamYatzyDiceValues")
  void chosenCategoryIsYatzy_shouldSumOfAllDices(Yatzy inputYatzyDices, int actualSum) {
    Category category = new YatzyCategory();
    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamChanceDiceValues")
  void chosenCategoryIsChance_shouldSumOfAllDices(Yatzy inputYatzyDices, int actualSum) {
    Category category = new ChanceCategory();
    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamFourOfKindDiceValues")
  void chosenCategoryIsFourOfKind_shouldSumOf4RecurrentFaces(Yatzy inputYatzyDices, int actualSum) {
    Category category = new FourOfKindCategory();
    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamThreeOfKindDiceValues")
  void chosenCategoryIsThreeOfKind_shouldSumOf3RecurrentFaces(
      Yatzy inputYatzyDices, int actualSum) {
    Category category = new ThreeOfKindCategory();
    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamLargeStraightDiceValues")
  void chosenCategoryIsLargeStraight_shoulReturn20(Yatzy inputYatzyDices, int actualSum) {
    Category category = new LargeStraightCategory();
    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamSmallStraightDiceValues")
  void chosenCategoryIsSmallStraight_shoulReturn20(Yatzy inputYatzyDices, int actualSum) {
    Category category = new SmallStraightCategory();

    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamFullHouseDiceValues")
  void chosenCategoryIsFullHouse_shoulReturnTotalSumIfTheirIs2And3Occurence(
      Yatzy inputYatzyDices, int actualSum) {
    Category category = new FullHouseCategory();

    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamPairDiceValues")
  void chosenCategoryIsPair_shoulReturnTotalSumOfMaxPair(Yatzy inputYatzyDices, int actualSum) {
    Category category = new PairCategory();

    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamTwoPairDiceValues")
  void chosenCategoryIsTwoPair_shoulReturnTotalSumOfThoses2(Yatzy inputYatzyDices, int actualSum) {
    Category category = new TwoPairCategory();

    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }

  @ParameterizedTest
  @MethodSource("com.company.game.factoryBuilder.GameBuilder#streamOneToSixDiceValues")
  void chosenCategoryIsOneToSix_shoulReturnTotalSumOfThatNbOccurence(
      Yatzy inputYatzyDices, int chosenFace, int actualSum) {
    Category category = new OneToSixCategory(chosenFace);

    // When
    var expectedSum = inputYatzyDices.getScoreByCategory(category);

    // Then
    assertEquals(expectedSum, actualSum);
  }
}
