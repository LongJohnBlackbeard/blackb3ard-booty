package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.osrs.local.hud.interfaces.MakeAllInterface;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class SetCookQuantity extends LeafTask {

    @Override
    public void execute() {
        MakeAllInterface.setSelectedQuantity(0);
    }
}
