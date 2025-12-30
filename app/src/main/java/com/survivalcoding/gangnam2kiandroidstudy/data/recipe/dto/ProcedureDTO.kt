package com.survivalcoding.gangnam2kiandroidstudy.data.recipe.dto

import kotlinx.serialization.SerialName

data class ProcedureDTO(
    @SerialName("recipeId")
    val recipeId: Int?,
    @SerialName("step")
    val step: Int?,
    @SerialName("content")
    val content: String?
)