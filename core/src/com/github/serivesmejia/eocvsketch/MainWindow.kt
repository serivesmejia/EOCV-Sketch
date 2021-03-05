package com.github.serivesmejia.eocvsketch

import com.badlogic.gdx.Gdx
import com.kotcrab.vis.ui.widget.VisTable
import com.kotcrab.vis.ui.widget.VisTextButton
import com.kotcrab.vis.ui.widget.VisWindow

class MainWindow : VisWindow("", false) {

    val win = VisWindow("Home")

    init {


        win.add(VisTextButton("Hello!"))
        win.add(VisTextButton("Byeee!"))
        add(win)

        add(VisTextButton("Maybe outside!"))

        setSize(Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat())
    }

}