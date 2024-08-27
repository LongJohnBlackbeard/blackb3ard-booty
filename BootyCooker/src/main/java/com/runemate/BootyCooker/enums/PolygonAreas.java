package com.runemate.BootyCooker.enums;

import com.runemate.game.api.hybrid.location.Area;
import com.runemate.game.api.hybrid.location.Coordinate;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum PolygonAreas {
    ROGUES_DEN(new Area.Polygonal(
        new Coordinate(3061, 4983, 1),
        new Coordinate(3065, 4983, 1),
        new Coordinate(3065, 4960, 1),
        new Coordinate(3037, 4960, 1),
        new Coordinate(3037, 4980, 1),
        new Coordinate(3044, 4980, 1),
        new Coordinate(3044, 4986, 1),
        new Coordinate(3054, 4988, 1),
        new Coordinate(3054, 4991, 1),
        new Coordinate(3058, 4991, 1),
        new Coordinate(3058, 4983, 1))
    ),
    ROGUES_DEN_ENTRANCE(new Area.Polygonal(
        new Coordinate(3059, 4986, 1),
        new Coordinate(3063, 4986, 1),
        new Coordinate(3063, 4984, 1),
        new Coordinate(3059, 4984, 1)
    ));

    private final Area.Polygonal area;
}
