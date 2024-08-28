package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.ClickFire;
import com.runemate.BootyCooker.leafs.CloseLevelUp;
import com.runemate.game.api.hybrid.local.hud.interfaces.ChatDialog;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class IsLevelUpChat extends BranchTask {
    private ClickFire clickFire = new ClickFire();
    private CloseLevelUp closeLevelUp = new CloseLevelUp();

    @Override
    public boolean validate() {
        return ChatDialog.isOpen() && ChatDialog.hasText("level");
    }

    @Override
    public TreeTask successTask() {
        // Close Dialogue
        return closeLevelUp;
    }

    @Override
    public TreeTask failureTask() {
        // click fire
        return clickFire;
    }
}
