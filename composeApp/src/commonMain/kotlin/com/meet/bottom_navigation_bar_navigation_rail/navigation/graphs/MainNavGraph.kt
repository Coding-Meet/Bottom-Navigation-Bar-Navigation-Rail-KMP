package com.meet.bottom_navigation_bar_navigation_rail.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.meet.bottom_navigation_bar_navigation_rail.navigation.Graph
import com.meet.bottom_navigation_bar_navigation_rail.navigation.Routes
import com.meet.bottom_navigation_bar_navigation_rail.screens.HomeScreen
import com.meet.bottom_navigation_bar_navigation_rail.screens.SettingScreen

/**
 * Created 28-02-2024 at 03:05 pm
 */

fun NavGraphBuilder.mainNavGraph(
    rootNavController: NavHostController,
    innerPadding: PaddingValues
) {
    navigation(
        startDestination = Routes.Home.route,
        route = Graph.NAVIGATION_BAR_SCREEN_GRAPH
    ) {
        composable(route = Routes.Home.route) {
            HomeScreen(rootNavController = rootNavController, paddingValues = innerPadding)
        }
        composable(route = Routes.Setting.route) {
            SettingScreen(rootNavController = rootNavController, paddingValues = innerPadding)
        }
    }

}