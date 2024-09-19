package com.meet.bottom_navigation_bar_navigation_rail.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.meet.bottom_navigation_bar_navigation_rail.navigation.Graph
import com.meet.bottom_navigation_bar_navigation_rail.navigation.Routes
import com.meet.bottom_navigation_bar_navigation_rail.screens.HomeDetailScreen
import com.meet.bottom_navigation_bar_navigation_rail.screens.SettingDetailScreen

/**
 * Created 28-02-2024 at 03:04 pm
 */
@Composable
fun RootNavGraph(
    rootNavController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(
        navController = rootNavController,
        startDestination = Graph.NAVIGATION_BAR_SCREEN_GRAPH,
    ) {
        mainNavGraph(rootNavController = rootNavController, innerPadding = innerPadding)
        composable(
            route = Routes.HomeDetail.route,
        ) {
            rootNavController.previousBackStackEntry?.savedStateHandle?.get<String>("name")?.let { name ->
                HomeDetailScreen(rootNavController = rootNavController, name = name)
            }
        }
        composable(
            route = Routes.SettingDetail.route,
        ) {
            SettingDetailScreen(rootNavController = rootNavController)
        }
    }
}