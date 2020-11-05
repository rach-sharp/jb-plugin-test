package com.github.rach-sharp.jbplugintest.services

import com.intellij.openapi.project.Project
import com.github.rach-sharp.jbplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
