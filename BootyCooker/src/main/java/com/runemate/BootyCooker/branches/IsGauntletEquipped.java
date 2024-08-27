package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.game.api.hybrid.local.hud.interfaces.Equipment;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class IsGauntletEquipped extends BranchTask {
    @Getter
    @SettingsProvider
    private Config config;

    @Override
    public boolean validate() {
        boolean useGauntlets = config.gauntlets();

        if(!useGauntlets) {
            return true;
        } else {
            return (Equipment.contains("Cooking gauntlets"));
        }
    }

    @Override
    public TreeTask successTask() {
        return null;
    }

    @Override
    public TreeTask failureTask() {
        return null;
    }
}
