package com.runemate.BootyCooker;

import com.runemate.game.api.script.framework.tree.TreeBot;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class BootyCooker extends TreeBot {

    @Override
    public TreeTask createRootTask() {
        return new InThievesDenEntrance();
    }

}
