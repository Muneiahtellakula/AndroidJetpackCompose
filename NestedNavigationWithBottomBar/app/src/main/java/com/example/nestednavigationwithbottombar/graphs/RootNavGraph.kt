package com.example.nestednavigationwithbottombar.graphs

import android.provider.DocumentsContract.Root
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHUNTICATION
    ) {auth
        composable(route = Graph.HOME){

        }
    }

}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHUNTICATION = "authuntication_graph"
    const val HOME = "home_graph"
    const val DETAILS = "details_graph"
}