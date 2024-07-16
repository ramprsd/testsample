Feature: Test Feature

  @table
  Scenario: user handles the table
    Given user iterates the column values


  @DragDrop
  Scenario: Drag and drop
    Given select droppable
    When drag and drop the element

  @alert
  Scenario: Alerts
    Given select alert with ok and cancel
    When click cancel button
