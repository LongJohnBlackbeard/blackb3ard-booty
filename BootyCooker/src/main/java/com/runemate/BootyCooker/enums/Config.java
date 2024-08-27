package com.runemate.BootyCooker.enums;

import com.runemate.BootyCooker.enums.CookTypes.CookTypes;
import com.runemate.BootyCooker.enums.CookTypes.Meats;
import com.runemate.ui.setting.annotation.open.DependsOn;
import com.runemate.ui.setting.annotation.open.Setting;
import com.runemate.ui.setting.annotation.open.SettingsGroup;
import com.runemate.ui.setting.open.Settings;

@SettingsGroup(group = "Cooking")
public interface Config extends Settings {

    @Setting(key = "cookType", title = "Cook Type", order = 1)
    default CookTypes cookType(){
        return CookTypes.MEATS;
    }

    @DependsOn(group = "Cooking", key = "cookType", value = "Lobster")
    @Setting(key = "Meats", title = "Meats", order = 2)
    default Meats meats(){
        return Meats.LOBSTER;
    }

    @Setting(key = "gauntlets", title = "Cooking Guantlets?", order = 3)
    default boolean gauntlets(){
        return true;
    }

}
