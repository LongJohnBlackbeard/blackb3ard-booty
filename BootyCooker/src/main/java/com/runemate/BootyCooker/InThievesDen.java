package com.runemate.BootyCooker;
import com.runemate.BootyCooker.branches.IsFoodCooked;
import com.runemate.BootyCooker.enums.PolygonAreas;
import com.runemate.game.api.hybrid.entities.Player;
import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.location.Coordinate;
import com.runemate.game.api.hybrid.region.Players;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

/**
 * NOTES:
 * Checks if we are in the thieves den
 * **/

public class InThievesDen extends BranchTask {

    private static final Area.Polygonal CookArea = PolygonAreas.ROGUES_DEN.getArea();
    IsFoodCooked isFoodCooked = new IsFoodCooked();

    private Player player;

    @Override
    public boolean validate() {
        return (player = Players.getLocal()) != null && CookArea.contains(player);
    }

    @Override
    public TreeTask successTask() {
        return isFoodCooked;
    }

    @Override
    public TreeTask failureTask() {
        return null;
    }
}
