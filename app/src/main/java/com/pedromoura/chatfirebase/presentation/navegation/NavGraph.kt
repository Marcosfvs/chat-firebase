package com.pedromoura.chatfirebase.presentation.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pedromoura.chatfirebase.presentation.Chat.ChatScreen
import com.pedromoura.chatfirebase.presentation.login.LoginScreen


sealed class Screen(val route: String) {
    object Login : Screen("login")

    object Chat : Screen("chat")
}

@Composable
fun NavGraph(startDestination: String = Screen.Login.route) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Login.route) { LoginScreen(navController = navController)}
        composable(Screen.Chat.route) { ChatScreen()}
    }
}