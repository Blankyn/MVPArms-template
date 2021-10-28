package com.github.blankyn.mvparmstemplate.services

import com.intellij.openapi.project.Project
import com.github.blankyn.mvparmstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
