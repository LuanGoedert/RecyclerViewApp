package com.example.recyclerviewapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceid:
    Int, @DrawableRes val imageResourceId: Int
) {

}