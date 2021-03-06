package com.github.serivesmejia.eocvsketch.ui.widgets.editor

import com.badlogic.gdx.scenes.scene2d.ui.Container
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.kotcrab.vis.ui.widget.VisLabel
import com.kotcrab.vis.ui.widget.VisTextArea
import com.kotcrab.vis.ui.widget.VisWindow

open class Node(name: String) : Container<Table>() {

    val text = VisLabel(name)

    private val table = Table()

    init {
        table.add(text).top().left()
        this.actor = table
    }

}