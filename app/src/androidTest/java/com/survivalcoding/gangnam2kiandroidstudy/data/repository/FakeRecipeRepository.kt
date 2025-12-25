package com.survivalcoding.gangnam2kiandroidstudy.data.repository

import com.survivalcoding.gangnam2kiandroidstudy.data.recipe.repository.RecipeRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.model.recipe.Recipe

class FakeRecipeRepository : RecipeRepository {

    private val recipes = mutableListOf<Recipe>()

    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }

    override suspend fun getRecipes(): List<Recipe> = recipes

    override suspend fun getSavedRecipes(): List<Recipe> {
        return recipes.filter { it.isSaved }
    }

    override suspend fun updateSaved(id: Int, isSaved: Boolean) {
        val index = recipes.indexOfFirst { it.id == id }
        if (index != -1) {
            recipes[index] = recipes[index].copy(isSaved = isSaved)
        }
    }
}
