package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.local.hud.interfaces.ChatDialog;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class CloseLevelUp extends LeafTask {
    @Override
    public void execute() {
        ChatDialog.getContinue();
    }
}
