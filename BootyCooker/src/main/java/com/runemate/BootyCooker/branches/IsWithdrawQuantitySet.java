package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.SetDefaultQuantity;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class IsWithdrawQuantitySet extends BranchTask {

    private IsWithdrawModeItem isWithdrawModeItem = new IsWithdrawModeItem();
    private SetDefaultQuantity setDefaultQuantity = new SetDefaultQuantity();

    @Override
    public boolean validate() {
        return (Bank.getDefaultQuantity() == Bank.DefaultQuantity.ALL);
    }

    @Override
    public TreeTask successTask() {
        return isWithdrawModeItem;
    }

    @Override
    public TreeTask failureTask() {
        return setDefaultQuantity;
    }
}
