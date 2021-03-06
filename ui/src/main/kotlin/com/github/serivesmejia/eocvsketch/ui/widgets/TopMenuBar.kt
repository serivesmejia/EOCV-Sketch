package com.github.serivesmejia.eocvsketch.ui.widgets

import com.kotcrab.vis.ui.widget.Menu
import com.kotcrab.vis.ui.widget.MenuBar
import com.kotcrab.vis.ui.widget.MenuItem

class TopMenuBar : MenuBar() {

    val fileMenu = Menu("File")
    val editMenu = Menu("Edit")

    init {
        addMenu(fileMenu)
        addMenu(editMenu)
    }


}