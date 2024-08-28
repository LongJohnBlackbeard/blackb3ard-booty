package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.entities.GameObject;
import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.location.Coordinate;
import com.runemate.game.api.hybrid.region.GameObjects;
import com.runemate.game.api.script.framework.tree.LeafTask;

public class ClickFire extends LeafTask {

    private Area cookArea = new Area.Rectangular(new Coordinate(3040,4975,1), new Coordinate(3047,4969, 1));

    @Override
    public void execute() {
        GameObject cookFire = GameObjects.newQuery().names("Fire").within(cookArea).results().nearest();
        cookFire.interact("Cook");
    }
}
