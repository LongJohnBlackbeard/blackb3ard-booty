package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.WalkToCookArea;
import com.runemate.game.api.hybrid.entities.Player;
import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.location.Coordinate;
import com.runemate.game.api.hybrid.region.Players;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class InCookArea extends BranchTask {

    private Area cookArea = new Area.Rectangular(new Coordinate(3040,4975,1), new Coordinate(3047,4969, 1));
    private Player player;
    private WalkToCookArea walkToCookArea = new WalkToCookArea();
    private IsRequirementsMet requirementsMet = new IsRequirementsMet();

    @Override
    public boolean validate() {
        return (player = Players.getLocal()) != null && cookArea.contains(player);
    }

    @Override
    public TreeTask successTask() {
        return requirementsMet;
    }

    @Override
    public TreeTask failureTask() {
        // Walk to cook area
        return walkToCookArea;
    }
}
