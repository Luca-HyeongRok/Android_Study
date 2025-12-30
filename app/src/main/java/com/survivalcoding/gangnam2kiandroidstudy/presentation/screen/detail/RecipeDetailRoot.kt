package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.detail

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun RecipeDetailRoot(
    recipeId: Int,
    onBack: () -> Unit,
    viewModel: RecipeDetailViewModel = koinViewModel {
        parametersOf(recipeId)
    }
) {
    LaunchedEffect(recipeId) {
        viewModel.loadRecipeDetail(recipeId)
    }
    val state = viewModel.state.collectAsStateWithLifecycle()

    RecipeDetailScreen(
        state = state.value,
        onAction = viewModel::onAction,
        onBackClick = onBack
    )
}
