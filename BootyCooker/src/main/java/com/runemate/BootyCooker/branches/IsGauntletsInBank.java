package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.Stop;
import com.runemate.BootyCooker.leafs.WithdrawGauntlets;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

import lombok.extern.log4j.Log4j2;

@Log4j2(topic = "BootyCooker")
public class IsGauntletsInBank extends BranchTask {
    private WithdrawGauntlets withdrawGauntlets = new WithdrawGauntlets();
    private Stop stop;

    @Override
    public boolean validate() {
        if(Bank.isOpen()){
            return Bank.contains("Cooking gauntlets");
        } else {
            return false;
        }
    }

    @Override
    public TreeTask successTask() {
        // Withdrawal gauntlets
        return withdrawGauntlets;
    }

    @Override
    public TreeTask failureTask() {
        log.debug("Config item (Cooking Guantlets) not equipped, in inventory, or in bank. Stopping");
        return stop;
    }
}
