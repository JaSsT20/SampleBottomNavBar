package com.levid.chapter4_bottomnavigationbar

sealed class Destination(val route: String, val icon: Int, val title: String) {
    object Transaction : Destination(
        route = "transactions", icon = R.drawable.baseline_supervised_user_circle_24,
        title = "Levid"
    )

    object Budgets : Destination(
        route = "budget", icon = R.drawable.ic_baseline_budget,
        title = "Budget"
    )

    object Tasks : Destination(route = "tasks", icon = R.drawable.ic_add_task, title = "Tasks")
    object Settings : Destination(
        route = "settings", icon = R.drawable.ic_settings,
        title = "Settings"
    )

    companion object {
        val toList = listOf(Transaction, Budgets, Tasks, Settings)
    }
}