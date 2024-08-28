package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.CookFood;
import com.runemate.BootyCooker.leafs.SetCookQuantity;
import com.runemate.game.api.osrs.local.hud.interfaces.MakeAllInterface;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class IsAllSelected extends BranchTask {

    private CookFood cookFood = new CookFood();
    private SetCookQuantity setCookQuantity = new SetCookQuantity();

    @Override
    public boolean validate() {
        return MakeAllInterface.isOpen() && MakeAllInterface.getSelectedQuantity() == 0;
    }

    @Override
    public TreeTask successTask() {
        // Cook Food
        return cookFood;
    }

    @Override
    public TreeTask failureTask() {
        // Set Cook Quantity
        return setCookQuantity;
    }
}
