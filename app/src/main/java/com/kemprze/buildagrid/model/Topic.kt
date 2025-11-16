package com.kemprze.buildagrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(@DrawableRes val referencePicture: Int, val topicNumber: Int, @StringRes val topicName: Int)
