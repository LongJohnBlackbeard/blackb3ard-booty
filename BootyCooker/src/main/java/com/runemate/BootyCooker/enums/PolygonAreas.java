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
        new Coordinate(3057, 4991, 0),
        new Coordinate(3057, 4986, 0),
        new Coordinate(3063, 4986, 0),
        new Coordinate(3066, 4979, 0),
        new Coordinate(3066, 4959, 0),
        new Coordinate(3036, 4959, 0),
        new Coordinate(3038, 4979, 0),
        new Coordinate(3045, 4985, 0))
    );

    private final Area.Polygonal area;
}
