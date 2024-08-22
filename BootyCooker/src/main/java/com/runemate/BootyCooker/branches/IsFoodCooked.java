package com.runemate.BootyCooker.branches;

import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class IsFoodCooked extends BranchTask {

    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public TreeTask successTask() {
        return null;
    }

    @Override
    public TreeTask failureTask() {
        return null;
    }
}
