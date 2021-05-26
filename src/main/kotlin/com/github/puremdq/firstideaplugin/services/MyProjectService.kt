package com.github.puremdq.firstideaplugin.services

import com.github.puremdq.firstideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
