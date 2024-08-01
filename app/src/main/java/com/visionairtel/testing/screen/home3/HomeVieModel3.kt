package com.visionairtel.testing.screen.home3

import androidx.compose.runtime.Immutable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.visionairtel.testing.utils.Utils.showLog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeVieModel3 @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(HomeState3())
    val state: SharedFlow<HomeState3> = _state.asSharedFlow()

    init {
        start()
    }


    private fun start() {
        viewModelScope.launch(Dispatchers.IO) {
            repeat(100000) {
                delay(2000L)
                _state.update { current ->
                    current.copy(
                        test1 = "Test $it"
                    )
                }
                showLog(it)
            }
        }
    }
}

data class HomeState3(
    val test1: String = "Test 1",
    val test2: String = "Test 2",
    val test3: String = "Test 3",
)



