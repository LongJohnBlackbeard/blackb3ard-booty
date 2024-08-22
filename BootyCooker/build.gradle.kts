import com.runemate.game.api.bot.data.FeatureType
import java.time.Duration

runemate {
    manifests {
        create("BootyCooker") {
            mainClass = "com.runemate.blackb3ard-booty.BootyCooker"
            tagline = "Cooking)"
            description = "Simple Thieves Den Cooker"
            version = "1.0"
            internalId = "booty-cooker-1"

            obfuscation {
                +"obfuscation rule"
                exclude("obfuscation rule")
                exclude { "obfuscation rule" }
            }
            features {
                required(FeatureType.DIRECT_INPUT)
            }
            resources {
                +"resource rule"
                include("resource rule")
                include { "resource rule" }
            }
            price(0.20)
            trial {
                window = Duration.ofDays(7)
                allowance = Duration.ofHours(3)
            }
        }
    }
}
