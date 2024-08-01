package com.visionairtel.testing.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.visionairtel.testing.utils.Utils.showLog

@Composable
fun TestingText(state: String) {
    showLog("Text")
    Text(text = state)
}

@Composable
fun OBX(content: @Composable () -> Unit) {
    content()
}