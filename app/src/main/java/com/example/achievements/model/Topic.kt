package com.example.achievements.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val hours : Int,
    @DrawableRes val imageResourceId: Int
)

