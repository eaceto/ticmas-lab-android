package com.example.textmatchapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import com.example.textmatchapp.viewmodel.CompararTextViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class CompararTxtViewModelUnitTest {
    private lateinit var viewModel: CompararTextViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Test
    fun mainViewModel_CheckInitResultValue() = runTest {
        val value = viewModel.result.value?.length
        assertEquals(null,value)

    }

    @Before
    fun setup(){
        Dispatchers.setMain(dispatcher)
        viewModel = CompararTextViewModel()
    }
    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }
}