package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.OpenBank;
import com.runemate.BootyCooker.leafs.Stop;
import com.runemate.game.api.hybrid.region.Npcs;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

import lombok.extern.log4j.Log4j2;

@Log4j2(topic = "BootyCooker")
public class BankerNearby extends BranchTask {

    private OpenBank openBank = new OpenBank();
    private Stop stop = new Stop();

    @Override
    public boolean validate() {
        return Npcs.getLoaded("Emerald Benedict").stream().count() >= 1;
    }

    @Override
    public TreeTask successTask() {
        return openBank;
    }

    @Override
    public TreeTask failureTask() {
        log.debug("Could not find banker.");
        return stop;
    }
}
