package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class SetWithdrawMode extends LeafTask {

    @Override
    public void execute() {
        Bank.setWithdrawMode(Bank.WithdrawMode.ITEM);
    }
}
