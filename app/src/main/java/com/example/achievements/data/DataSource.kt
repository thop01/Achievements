package com.example.achievements.data

import com.example.achievements.R
import com.example.achievements.model.LessonTheme
import com.example.achievements.model.Topic

class DataSource {
    fun loadLessonThemes() : List<LessonTheme> {
        return listOf<LessonTheme>(
            LessonTheme(R.string.lt_economie, R.drawable.economie_header),
            LessonTheme(R.string.lt_ict, R.drawable.header),
            LessonTheme(R.string.lt_landbouw, R.drawable.landbouw_header),
            LessonTheme(R.string.lt_techniek, R.drawable.techniek_header),
            LessonTheme(R.string.lt_zorg, R.drawable.zorg_header)
        )
    }
        fun loadTopics() : List<Topic> {
            return listOf<Topic>(
                Topic(R.string.subject_getting_started, 2, R.drawable.n1),
                Topic(R.string.subject_fundamentals, 5, R.drawable.n2),
                Topic(R.string.subject_oop, 8, R.drawable.n3),
                Topic(R.string.subject_internal_modules, 5, R.drawable.n4),
                Topic(R.string.subject_external_modules, 5, R.drawable.n5),
                Topic(R.string.subject_webservice, 13, R.drawable.n6),
                Topic(R.string.subject_security, 13, R.drawable.n7),
                Topic(R.string.subject_deployment, 8, R.drawable.n8)
            )
        }


}
