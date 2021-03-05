package com.github.serivesmejia.eocvsketch

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.badlogic.gdx.utils.viewport.Viewport
import com.kotcrab.vis.ui.VisUI
import kotlin.math.min

class EOCVSketch : ApplicationAdapter() {

    private lateinit var viewport: Viewport
    private lateinit var stage: Stage

    override fun create() {
        VisUI.load();

        viewport = ScreenViewport()
        stage = Stage(viewport)

        stage.addActor(MainWindow())
    }

    override fun render() {
        val deltaTime = Gdx.graphics.deltaTime
        stage.act(min(deltaTime, 1 / 30f));
        stage.draw()
    }

    override fun dispose() {
        VisUI.dispose()
    }
    
}