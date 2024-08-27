package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.Stop;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2(topic = "BootyCooker")
public class HaveRawFoodInBank extends BranchTask {
    private IsWithdrawQuantitySet isWithdrawQuantitySet = new IsWithdrawQuantitySet();
    private Stop stop = new Stop();


    @Getter
    @SettingsProvider
    private Config config;

    @Override
    public boolean validate() {
        return (Bank.contains(config.meats().getFirstItem()));
    }

    @Override
    public TreeTask successTask() {
        return isWithdrawQuantitySet;
    }

    @Override
    public TreeTask failureTask() {
        log.debug("Missing Required Items");
        return stop;
    }
}
