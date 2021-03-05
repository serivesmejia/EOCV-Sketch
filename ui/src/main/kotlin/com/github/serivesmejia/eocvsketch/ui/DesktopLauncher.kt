package com.github.serivesmejia.eocvsketch.ui

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

fun main() {
    val config = LwjglApplicationConfiguration()
    LwjglApplication(EOCVSketchApp(), config)
}