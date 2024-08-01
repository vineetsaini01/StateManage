package com.visionairtel.testing.screen.home2

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.visionairtel.testing.utils.Utils.showLog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeVieModel2 @Inject constructor() : ViewModel() {

    private val _state = HomeState2()
    val state = _state

    init {
        start()
    }


    private fun start() {
        viewModelScope.launch(Dispatchers.IO) {
            repeat(100000) {
                delay(2000L)
                _state.test1.value = "Test $it"
                showLog(it)
            }
        }
    }
}


@Immutable
data class HomeState2(
    val test1: MutableState<String> = mutableStateOf("Test 1"),
    val test2: MutableState<String> = mutableStateOf("Test 2"),
    val test3: MutableState<String> = mutableStateOf("Test 3"),
)

