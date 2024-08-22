import com.runemate.game.api.bot.data.FeatureType
import com.runemate.gradle.RuneMatePlugin

plugins {
    id("java")
    id("com.runemate") version "1.4.1"
}

repositories {
    mavenCentral()
}

subprojects {
    apply<JavaPlugin>()
    apply<RuneMatePlugin>()

    tasks.runClient {
        enabled = false
    }
}

runemate {
    devMode = true
    autoLogin = true
}


