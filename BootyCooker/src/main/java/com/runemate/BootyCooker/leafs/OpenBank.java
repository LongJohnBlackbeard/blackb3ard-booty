package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.region.Npcs;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class OpenBank extends LeafTask {
    @Override
    public void execute() {
        var banker = Npcs.getLoaded("Emerald Benedict").first();
        banker.interact("Bank");
    }
}
