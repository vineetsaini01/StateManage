package com.visionairtel.testing.screen.home2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.visionairtel.testing.components.OBX
import com.visionairtel.testing.utils.Utils.showLog

@Composable
fun Home2(vm: HomeVieModel2 = hiltViewModel()) {
    val state = vm.state

    showLog("HomeScreen")
    Scaffold(Modifier.fillMaxSize()) {
        showLog("Scaffold")
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            showLog("Column")
            OBX {
                showLog("TEXT 1")
                Text(text = state.test1.value)
            }
            OBX {
                showLog("TEXT 2")
                Text(text = state.test2.value)
            }
        }
    }
}



