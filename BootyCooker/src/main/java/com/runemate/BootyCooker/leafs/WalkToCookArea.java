package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.location.Coordinate;
import com.runemate.game.api.hybrid.location.navigation.cognizant.ScenePath;
import com.runemate.game.api.script.framework.tree.LeafTask;
import lombok.extern.log4j.Log4j2;

@Log4j2(topic = "BootyCooker")
public class WalkToCookArea extends LeafTask {

    private Area cookArea = new Area.Rectangular(new Coordinate(3040,4975,1), new Coordinate(3047,4969, 1));

    @Override
    public void execute() {
        ScenePath toCookArea = ScenePath.buildTo(cookArea.getRandomCoordinate());
        if(toCookArea != null) {
            toCookArea.step();
        } else {
            log.debug("Path cookArea was null in WalkToCookArea");
        }
    }
}
