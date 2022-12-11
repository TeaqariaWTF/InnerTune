package com.zionhuang.music.compose.utils

import androidx.navigation.NavController
import androidx.navigation.NavGraph

val NavController.canNavigateUp: Boolean
    get() = backQueue.count { entry -> entry.destination !is NavGraph } > 1