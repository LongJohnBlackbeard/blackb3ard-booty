package com.runemate.BootyCooker.leafs;

import com.runemate.game.api.hybrid.Environment;
import com.runemate.game.api.hybrid.entities.GameObject;
import com.runemate.game.api.hybrid.local.Camera;
import com.runemate.game.api.hybrid.location.Coordinate;
import com.runemate.game.api.hybrid.region.GameObjects;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.tree.LeafTask;
import lombok.extern.log4j.Log4j2;

@Log4j2(topic = "BootyCooker")
public class OpenRoguesDenDoor extends LeafTask {

    private final Coordinate doorOpenCoord = new Coordinate(3061, 4983, 1);

    @Override
    public void execute() {
        GameObject door = GameObjects.newQuery().names("Door").actions("Open").on(doorOpenCoord).results().first();
        if(door != null) {
            if(door.isVisible()) {
                if(door.interact("Open")){
                    Execution.delayWhile((door::isValid), 1500);
                }
            } else {
                Camera.turnTo(door);
            }
        } else {
            log.debug("Door was null in OpenRoguesDenDoor");
        }
    }
}
