package io.holunda.camunda.taskpool.api.business

import org.axonframework.commandhandling.TargetAggregateIdentifier
import org.camunda.bpm.engine.variable.VariableMap
import org.camunda.bpm.engine.variable.Variables

data class CreateDataEntryCommand(
  val entryType: String,
  @TargetAggregateIdentifier
  val entryId: String,
  val payload: VariableMap = Variables.createVariables()
)