package com.example.achievements.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LessonTheme(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
