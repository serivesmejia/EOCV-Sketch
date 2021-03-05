package com.github.serivesmejia.eocvsketch.ui

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.badlogic.gdx.utils.viewport.Viewport
import com.github.serivesmejia.eocvsketch.ui.widgets.HomeWindow
import com.kotcrab.vis.ui.VisUI
import kotlin.math.min

class EOCVSketchApp : ApplicationAdapter() {

    companion object {
        const val VERSION = "1.0.0"
    }

    private lateinit var camera: OrthographicCamera
    private lateinit var viewport: Viewport
    private lateinit var stage: Stage

    private lateinit var homeWindow: HomeWindow

    override fun create() {
        VisUI.load()

        camera = OrthographicCamera()
        viewport = ScreenViewport(camera)

        stage = Stage(viewport)
        Gdx.input.inputProcessor = stage

        homeWindow = HomeWindow()
        stage.addActor(homeWindow)

        Gdx.graphics.setTitle("EasyOpenCV Sketching v$VERSION")
    }

    override fun render() {
        Gdx.gl.glClearColor(44/255f, 44/255f, 44/255f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        viewport.apply();

        val deltaTime = Gdx.graphics.deltaTime
        stage.act(min(deltaTime, 1 / 30f))
        stage.draw()
    }

    override fun resize(width: Int, height: Int) {
        viewport.update(width, height)
    }

    override fun dispose() {
        stage.dispose()
        VisUI.dispose()
    }

}