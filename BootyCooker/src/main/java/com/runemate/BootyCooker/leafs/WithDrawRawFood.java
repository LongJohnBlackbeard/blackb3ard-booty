package com.runemate.BootyCooker.leafs;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.game.api.script.framework.tree.LeafTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class WithDrawRawFood extends LeafTask {

    @Getter
    @SettingsProvider
    private Config config;

    @Override
    public void execute() {

    }
}
