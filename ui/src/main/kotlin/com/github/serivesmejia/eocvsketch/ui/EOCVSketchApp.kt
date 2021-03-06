package com.github.serivesmejia.eocvsketch.ui

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.utils.viewport.ScreenViewport
import com.github.serivesmejia.eocvsketch.ui.widgets.HomeWindow
import com.github.serivesmejia.eocvsketch.ui.widgets.TopMenuBar
import com.github.serivesmejia.eocvsketch.ui.widgets.editor.Editor
import com.kotcrab.vis.ui.VisUI
import kotlin.math.min

class EOCVSketchApp : ApplicationAdapter() {

    companion object {
        const val VERSION = "1.0.0"
    }

    private lateinit var camera: OrthographicCamera
    private lateinit var stage: Stage

    private lateinit var menuBar: TopMenuBar

    private lateinit var homeWindow: HomeWindow
    private lateinit var editor: Editor

    lateinit var menuBarTable: Table

    override fun create() {
        // Load VisUI, lib for nice UI elements
        VisUI.load()

        // Setup camera, viewport and stage
        camera = OrthographicCamera()
        stage = Stage(ScreenViewport(camera))

        Gdx.input.inputProcessor = stage

        // Creating root table
        menuBarTable = Table()
        menuBarTable.setFillParent(true)

        // Create top menu bar and adding to the top of root table
        menuBar = TopMenuBar()
        menuBarTable.add(menuBar.table).expandX().fillX().row()
        menuBarTable.add().expand().fill()

        // Editor
        editor = Editor()
        stage.addActor(editor)

        // Add the root table to stage
        stage.addActor(menuBarTable)

        // Add home window to stage
        homeWindow = HomeWindow()
        stage.addActor(homeWindow)
    }

    override fun render() {
        Gdx.gl.glClearColor(44/255f, 44/255f, 44/255f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        stage.viewport.apply()

        val deltaTime = Gdx.graphics.deltaTime
        stage.act(min(deltaTime, 1 / 30f))
        stage.draw()
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun dispose() {
        stage.dispose()
        VisUI.dispose()
    }

}