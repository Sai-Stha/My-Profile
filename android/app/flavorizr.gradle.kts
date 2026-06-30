import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("flavor-type")

    productFlavors {
        create("dev") {
            dimension = "flavor-type"
            applicationId = "com.example.myprofile.dev"
            resValue(type = "string", name = "app_name", value = "MyApp Dev")
        }
        create("staging") {
            dimension = "flavor-type"
            applicationId = "com.example.myprofile.staging"
            resValue(type = "string", name = "app_name", value = "MyApp Staging")
        }
        create("prod") {
            dimension = "flavor-type"
            applicationId = "com.example.myprofile"
            resValue(type = "string", name = "app_name", value = "MyApp Prod")
        }
    }

    buildFeatures.resValues = true
}