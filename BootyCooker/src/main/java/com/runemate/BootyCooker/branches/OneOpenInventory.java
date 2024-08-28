package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.DepositAll;
import com.runemate.BootyCooker.leafs.WithdrawGauntlets;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class OneOpenInventory extends BranchTask {
    private IsGauntletsInBank isGauntletsInBank = new IsGauntletsInBank();
    private DepositAll depositAll = new DepositAll();

    @Override
    public boolean validate() {
        return !Inventory.isFull();
    }

    @Override
    public TreeTask successTask() {
        return isGauntletsInBank;
    }

    @Override
    public TreeTask failureTask() {
        // Deposit All
        return depositAll;
    }
}
