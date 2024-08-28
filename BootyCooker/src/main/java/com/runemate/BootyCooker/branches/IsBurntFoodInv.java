package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.DepositBurnt;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class IsBurntFoodInv extends BranchTask {

    private DepositBurnt depositBurnt = new DepositBurnt();

    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    @Override
    public boolean validate() {
        return (Inventory.getQuantity(config.meats().getBurnt())> 1);
    }

    @Override
    public TreeTask successTask() {
        return depositBurnt;
    }

    @Override
    public TreeTask failureTask() {
        return null;
    }
}
