package com.runemate.BootyCooker;
import com.runemate.BootyCooker.branches.InRoguesDen;
import com.runemate.BootyCooker.branches.IsRoguesDoorOpen;
import com.runemate.BootyCooker.enums.PolygonAreas;
import com.runemate.game.api.hybrid.entities.Player;
import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.region.Players;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

import java.util.EventListener;

/**
 * NOTES:
 * Checks if we are in the thieves den
 * **/

public class InThievesDenEntrance extends BranchTask {

    private static final Area.Polygonal roguesDenEntrance = PolygonAreas.ROGUES_DEN_ENTRANCE.getArea();
    IsRoguesDoorOpen isRoguesDoorOpen = new IsRoguesDoorOpen();
    InRoguesDen inRoguesDen = new InRoguesDen();

    private Player player;

    @Override
    public boolean validate() {
        return (player = Players.getLocal()) != null && roguesDenEntrance.contains(player);
    }

    @Override
    public TreeTask successTask() {
        return isRoguesDoorOpen;
    }

    @Override
    public TreeTask failureTask() {
        return inRoguesDen;
    }
}
