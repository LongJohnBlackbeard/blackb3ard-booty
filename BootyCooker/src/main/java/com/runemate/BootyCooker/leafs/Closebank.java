package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class Closebank extends LeafTask {
    @Override
    public void execute() {
        Bank.close();
    }
}
