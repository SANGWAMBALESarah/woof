package com.example.woof.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Un modèle de données représentant un chien.
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameResourceId: Int,
    val age: Int,
    @StringRes val hobbiesResourceId: Int
)
