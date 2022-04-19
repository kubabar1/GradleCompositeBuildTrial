package com.example.project2

import org.gradle.api.Project

class CompositeBuildUtils {

    static def resolveProjectDependency(Project project, String projectPath, String group, String name, String version) {
        def tmp = project.findProject(projectPath)
        if (tmp != null) {
            return tmp
        } else {
            return "${group}:${name}:${version}"
        }
    }
}
