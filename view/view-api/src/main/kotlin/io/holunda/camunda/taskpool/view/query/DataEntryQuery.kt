package io.holunda.camunda.taskpool.view.query

import io.holunda.camunda.taskpool.api.business.EntryId
import io.holunda.camunda.taskpool.api.business.EntryType
import io.holunda.camunda.taskpool.view.DataEntry

data class DataEntryQuery(
  val entryType: EntryType,
  val entryId: EntryId? = null
) : FilterQuery<DataEntry> {
  override fun applyFilter(element: DataEntry) =
// entry type
    element.entryType == this.entryType
// if id is specified, applyFilter by it
      && (this.entryId == null || element.entryId == this.entryId)

}


