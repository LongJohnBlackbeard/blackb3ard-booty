package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.SetWithdrawMode;
import com.runemate.BootyCooker.leafs.WithDrawRawFood;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class IsWithdrawModeItem extends BranchTask {

    private WithDrawRawFood withDrawRawFood = new WithDrawRawFood();
    private SetWithdrawMode setWithdrawMode = new SetWithdrawMode();

    @Override
    public boolean validate() {
        return Bank.getWithdrawMode() == Bank.WithdrawMode.ITEM;
    }

    @Override
    public TreeTask successTask() {
        return withDrawRawFood;
    }

    @Override
    public TreeTask failureTask() {
        return setWithdrawMode;
    }
}
