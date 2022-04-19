package com.example.project2

import org.gradle.api.provider.Property

abstract class ExampleBuildPluginExtension {
    abstract Property<String> getMessage()

    ExampleBuildPluginExtension() {
        message.convention('Hello from GreetingPlugin')
    }
}