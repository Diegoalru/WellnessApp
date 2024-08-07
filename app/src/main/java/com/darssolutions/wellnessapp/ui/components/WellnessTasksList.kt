package com.darssolutions.wellnessapp.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.darssolutions.wellnessapp.models.WellnessTask

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task #$i") }

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = rememberSaveable { getWellnessTasks() }
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessTasksListPreview() {
    WellnessTasksList()
}
