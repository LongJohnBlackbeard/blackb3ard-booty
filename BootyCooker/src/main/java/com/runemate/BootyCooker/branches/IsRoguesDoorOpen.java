package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.leafs.OpenRoguesDenDoor;
import com.runemate.BootyCooker.leafs.WalkToCookArea;
import com.runemate.game.api.hybrid.entities.GameObject;
import com.runemate.game.api.hybrid.location.Coordinate;
import com.runemate.game.api.hybrid.region.GameObjects;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;

public class IsRoguesDoorOpen extends BranchTask {

    private Coordinate doorOpenCoord = new Coordinate(3061, 4983, 1);
    private OpenRoguesDenDoor openRoguesDenDoor = new OpenRoguesDenDoor();
    private WalkToCookArea walkToCookArea = new WalkToCookArea();

    @Override
    public boolean validate() {
        GameObject door = GameObjects.newQuery().names("Door").actions("Open").on(doorOpenCoord).results().first();
        return door != null;
    }

    @Override
    public TreeTask successTask() {
        // Door Open, move to cooking area
        return walkToCookArea;
    }

    @Override
    public TreeTask failureTask() {
        // Door Closed
        return openRoguesDenDoor;
    }
}
