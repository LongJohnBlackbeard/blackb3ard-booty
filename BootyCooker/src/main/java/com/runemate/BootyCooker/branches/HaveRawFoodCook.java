package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.OpenBank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class HaveRawFoodCook extends BranchTask {

    private OpenBank openBank = new OpenBank();
    private IsCookDialogue isCookDialogue = new IsCookDialogue();

    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    @Override
    public boolean validate() {
        final String rawFood = config.meats().getFirstItem();
        return Inventory.getQuantity(rawFood) > 27;
    }

    @Override
    public TreeTask successTask() {
        return isCookDialogue;
    }

    @Override
    public TreeTask failureTask() {
        return openBank;
    }
}
