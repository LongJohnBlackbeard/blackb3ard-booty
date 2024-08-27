package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.Environment;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class Stop extends LeafTask {

    @Override
    public void execute() {
        Environment.getBot().stop();
    }
}
