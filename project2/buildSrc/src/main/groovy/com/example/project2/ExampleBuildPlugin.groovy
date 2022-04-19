import com.example.project2.ExampleBuildPluginExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class ExampleBuildPlugin implements Plugin<Project> {

    void apply(Project project) {
        def extension = project.extensions.create('greeting', ExampleBuildPluginExtension)
        project.task('hello') {
            doLast {
                println extension.message.get()
            }
        }
    }
}