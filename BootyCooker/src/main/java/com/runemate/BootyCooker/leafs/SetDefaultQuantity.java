package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class SetDefaultQuantity extends LeafTask {
    @Override
    public void execute() {
        Bank.setDefaultQuantity(Bank.DefaultQuantity.ALL);
    }
}
