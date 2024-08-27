package com.runemate.BootyCooker.branches;

import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class IsBankOpen extends BranchTask {

    private IsGauntletEquipped isGauntletEquipped = new IsGauntletEquipped();
    private HaveGauntlets haveGauntlets = new HaveGauntlets();

    @Override
    public boolean validate() {
        return Bank.isOpen();
    }

    @Override
    public TreeTask successTask() {
        // Do we use Cooking Gauntlets
        return haveGauntlets;
    }

    @Override
    public TreeTask failureTask() {
        //
        return isGauntletEquipped;
    }
}
