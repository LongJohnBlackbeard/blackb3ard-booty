package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.DepositCooked;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class IsCookedFoodInv extends BranchTask {

    private DepositCooked depositCooked = new DepositCooked();
    private IsBurntFoodInv isBurntFoodInv = new IsBurntFoodInv();

    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    @Override
    public boolean validate() {
        return (Inventory.getQuantity(config.meats().getGameName()) > 1);

    }

    @Override
    public TreeTask successTask() {
        return depositCooked;
    }

    @Override
    public TreeTask failureTask() {
        return isBurntFoodInv;
    }
}
