package com.github.serivesmejia.eocvsketch.ui.widgets.editor

import com.kotcrab.vis.ui.widget.VisWindow

open class Node(name: String) : VisWindow(name, true) {

    init {
        this.isKeepWithinParent = false
    }

}