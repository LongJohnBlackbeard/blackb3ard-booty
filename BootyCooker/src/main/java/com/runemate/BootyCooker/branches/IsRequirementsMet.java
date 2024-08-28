package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.Stop;
import com.runemate.game.api.hybrid.local.Quest;
import com.runemate.game.api.hybrid.local.Quests;
import com.runemate.game.api.hybrid.local.Skill;
import com.runemate.game.api.hybrid.region.Players;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

import java.util.List;

public class IsRequirementsMet extends BranchTask {

    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    private Skill skill;
    private Players player;

    private Stop stop;
    private IsBankOpen isBankOpen;

    @Override
    public boolean validate() {
       int cookingLevel =  skill.COOKING.getCurrentLevel();
       int reqCookLevel = config.meats().getRequiredLevel();
       List<String> reqQuests = config.meats().getQuests();
       boolean meetLevelReq = cookingLevel >= reqCookLevel;
       boolean meetQuest = true;
       for(String reqQuest : reqQuests){
           meetQuest = Quests.get(reqQuest) != null && Quests.get(reqQuest).getStatus() == Quest.Status.COMPLETE;
       }
       return meetLevelReq && meetQuest;
    }

    @Override
    public TreeTask successTask() {
        return isBankOpen;
    }

    @Override
    public TreeTask failureTask() {
        return stop;
    }
}
