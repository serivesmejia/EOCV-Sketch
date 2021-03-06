package com.github.serivesmejia.eocvsketch.ui.widgets.editor

import com.badlogic.gdx.scenes.scene2d.ui.Container
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.kotcrab.vis.ui.layout.DragPane
import com.kotcrab.vis.ui.layout.FloatingGroup
import com.kotcrab.vis.ui.layout.FlowGroup
import com.kotcrab.vis.ui.layout.GridGroup
import com.kotcrab.vis.ui.widget.Draggable

class Editor : DragPane(FlowGroup(false)) {

    init {
        setFillParent(true)

        val draggable = Draggable()
        draggable.setKeepWithinParent(false)
        draggable.setBlockInput(true)
        draggable.isInvisibleWhenDragged = true

        this.draggable = draggable

        addActor(Node("TestNode"))
        setListener(DragPaneListener.AcceptOwnChildren())
    }

}