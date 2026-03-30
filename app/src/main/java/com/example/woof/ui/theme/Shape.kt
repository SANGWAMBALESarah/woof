package com.example.woof.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val AppShapes = Shapes(
// Forme très arrondie (utilisée par exemple pour les petits boutons ou images)
    small = RoundedCornerShape(50.dp),

// Notre fameuse forme asymétrique pour les cartes de chiens
    medium = RoundedCornerShape(
        topStart = 0.dp,
        topEnd = 16.dp,
        bottomEnd = 0.dp,
        bottomStart = 16.dp
    )
)