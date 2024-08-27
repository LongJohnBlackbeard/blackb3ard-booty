package com.runemate.BootyCooker.enums.CookTypes;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum Meats {

    LOBSTER("Lobster", "Raw Lobster", "Burnt lobster", 40, new ArrayList<String>());

    private final String gameName, firstItem, burnt;
    private final int requiredLevel;
    private final List<String> quests;
}
