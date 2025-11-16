package com.kemprze.buildagrid.model

import com.kemprze.buildagrid.R

object DataSource {
    val topics = listOf(
        Topic(R.drawable.architecture, 58, R.string.architecture),
        Topic(R.drawable.crafts, 121, R.string.crafts),
        Topic(R.drawable.business, 78, R.string.business),
        Topic(R.drawable.culinary, 118, R.string.culinary),
        Topic(R.drawable.design, 423, R.string.design),
        Topic(R.drawable.fashion, 92, R.string.fashion),
        Topic(R.drawable.film, 165, R.string.film),
        Topic(R.drawable.gaming, 164, R.string.gaming),
        Topic(R.drawable.drawing, 326, R.string.drawing),
        Topic(R.drawable.lifestyle, 305, R.string.lifestyle),
        Topic(R.drawable.music, 212, R.string.music),
        Topic(R.drawable.painting, 172, R.string.painting),
        Topic(R.drawable.photography, 321, R.string.photography),
        Topic(R.drawable.tech, 118, R.string.tech)
    )

    fun loadTopics(): List<Topic> {
        return topics
    }
}
