package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.PolygonAreas;
import com.runemate.BootyCooker.leafs.Stop;
import com.runemate.BootyCooker.leafs.WalkToCookArea;
import com.runemate.game.api.hybrid.entities.Player;
import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.region.Players;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class InRoguesDen extends BranchTask {
    private static final Area.Polygonal roguesDen = PolygonAreas.ROGUES_DEN.getArea();
    private Player player;
    private InCookArea inCookArea = new InCookArea();
    private Stop stop = new Stop();

    @Override
    public boolean validate() {
        return (player = Players.getLocal()) != null && roguesDen.contains(player);
    }

    @Override
    public TreeTask successTask() {
        return inCookArea;
    }

    @Override
    public TreeTask failureTask() {
        return stop;
    }
}
