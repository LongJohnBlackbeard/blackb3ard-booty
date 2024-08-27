package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class WithdrawGauntlets extends LeafTask {

    @Override
    public void execute() {
        Bank.withdraw("Cooking gauntlets", 1);
    }
}
