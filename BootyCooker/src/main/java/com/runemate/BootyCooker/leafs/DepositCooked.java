package com.runemate.BootyCooker.leafs;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.LeafTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class DepositCooked extends LeafTask {

    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    @Override
    public void execute() {
        Bank.deposit(config.meats().getFirstItem(), Inventory.getQuantity(config.meats().getFirstItem()));
    }
}
