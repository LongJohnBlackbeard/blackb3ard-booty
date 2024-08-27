package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.DepositAll;
import com.runemate.game.api.hybrid.local.hud.interfaces.Equipment;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class HaveGauntlets extends BranchTask {
    private OneOpenInventory oneOpenInventory = new OneOpenInventory();
    private HaveRawFoodInv haveRawFoodInv = new HaveRawFoodInv();

    @Getter
    @SettingsProvider
    private Config config;

    private DepositAll depositAll = new DepositAll();

    @Override
    public boolean validate() {
        boolean useGauntlets = config.gauntlets();

        return (useGauntlets && Inventory.contains("Cooking gauntlets") ||
                (useGauntlets && Equipment.contains("Cooking gauntlets"))) || (!useGauntlets);
    }

    @Override
    public TreeTask successTask() {
        return haveRawFoodInv;
    }

    @Override
    public TreeTask failureTask() {
        return oneOpenInventory;
    }
}
