package com.github.serivesmejia.eocvsketch

import com.badlogic.gdx.Gdx
import com.kotcrab.vis.ui.widget.VisTextButton
import com.kotcrab.vis.ui.widget.VisWindow

class MainWindow : VisWindow("EasyOpenCV Sketching") {

    init {
        add(VisTextButton("Hello!"))
        setSize(Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat())
    }

}