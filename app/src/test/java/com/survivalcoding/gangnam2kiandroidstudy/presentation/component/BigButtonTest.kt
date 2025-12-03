package com.survivalcoding.gangnam2kiandroidstudy.presentation.component

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test


class BigButtonUITest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun bigButton_click_changesState() {
        var clicked = false

        composeTestRule.setContent {
            BigButton(
                text = "Button",
                onClick = { clicked = true }
            )
        }

        composeTestRule.onNodeWithText("Button").performClick()

        assertTrue(clicked)
    }
}