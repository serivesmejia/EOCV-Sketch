package com.github.serivesmejia.eocvsketch.pipeline

import com.github.serivesmejia.ducto.serialization.DuctoSerializer
import org.opencv.core.Mat
import org.openftc.easyopencv.OpenCvPipeline

class SketchedPipeline(json: String) : OpenCvPipeline() {

    val ducto = DuctoSerializer.parseJsonToDucto<Mat, Mat>(json)

    override fun processFrame(input: Mat) = ducto?.process(input)

}