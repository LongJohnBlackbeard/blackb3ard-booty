package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.Closebank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class HaveRawFoodInv extends BranchTask {
    private Closebank closebank = new Closebank();
    private IsCookedFoodInv isCookedFoodInv = new IsCookedFoodInv();

    @Getter
    @SettingsProvider
    private Config config;

    @Override
    public boolean validate() {
        final String rawFood = config.meats().getFirstItem();
        return Inventory.getQuantity(rawFood) > 27;
    }

    @Override
    public TreeTask successTask() {
        return closebank;
    }

    @Override
    public TreeTask failureTask() {
        return isCookedFoodInv;
    }
}
