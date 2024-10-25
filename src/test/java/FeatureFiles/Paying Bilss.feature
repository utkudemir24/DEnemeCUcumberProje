Feature: Bill Payment Functionality

  Background:Register with valid creat account

    Given Navigate to Para Bank
    When Fill out the registration form and click the register button
    Then User should register successfully

  Scenario: Electricity Bill Payment

    Given Click on the bill payment button
    When Electricity payment
    Then User should paying successfully

  Scenario: Water bill payment

    Given Click on the bill payment button
    When Water payment
    Then User should paying successfully

  Scenario: Natural gas bill payment

    Given Click on the bill payment button
    When Natural gas payment
    Then User should paying successfully

