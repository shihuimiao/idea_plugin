package com.github.shihuimiao.ideaplugin.services

import com.github.shihuimiao.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
