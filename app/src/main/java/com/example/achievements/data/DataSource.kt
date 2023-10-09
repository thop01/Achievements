package com.example.achievements.data

import com.example.achievements.R
import com.example.achievements.model.LessonTheme

class DataSource {
    fun loadLessonThemes() : List<LessonTheme>{

        return listOf<LessonTheme>(

            LessonTheme(R.string.lt_economie, R.drawable.economie_header),
            LessonTheme(R.string.lt_ict, R.drawable.header),
            LessonTheme(R.string.lt_landbouw, R.drawable.landbouw_header),
            LessonTheme(R.string.lt_techniek, R.drawable.techniek_header),
            LessonTheme(R.string.lt_zorg, R.drawable.zorg_header)
        )

    }
}