package com.github.sergioppires.asnifferintelijplugin.services

import com.github.sergioppires.asnifferintelijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
