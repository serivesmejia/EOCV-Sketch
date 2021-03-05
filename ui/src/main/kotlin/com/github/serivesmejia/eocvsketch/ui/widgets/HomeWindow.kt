package com.github.serivesmejia.eocvsketch.ui.widgets

import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.kotcrab.vis.ui.widget.VisTextButton
import com.kotcrab.vis.ui.widget.VisWindow

class HomeWindow : VisWindow("Home") {

    val createButton = VisTextButton("Create new sketch")
    val loadButton = VisTextButton("Load from file")

    val buttonsTable = Table()

    init {
        addCloseButton()
        centerWindow()
        setSize(180f, 140f)

        buttonsTable.add(createButton).center().top()
        buttonsTable.row().space(10f)
        buttonsTable.add(loadButton).center().bottom()

        add(buttonsTable)
    }

}