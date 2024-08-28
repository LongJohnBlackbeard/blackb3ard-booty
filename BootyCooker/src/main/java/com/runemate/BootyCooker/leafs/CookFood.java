package com.runemate.BootyCooker.leafs;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.game.api.osrs.local.hud.interfaces.MakeAllInterface;
import com.runemate.game.api.script.framework.tree.LeafTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class CookFood extends LeafTask {

    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    @Override
    public void execute() {
        MakeAllInterface.selectItem(config.meats().getFirstItem());
    }
}
