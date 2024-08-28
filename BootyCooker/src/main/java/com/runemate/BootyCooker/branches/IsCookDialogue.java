package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.ClickFire;
import com.runemate.game.api.hybrid.local.hud.interfaces.ChatDialog;
import com.runemate.game.api.osrs.local.hud.interfaces.MakeAllInterface;
import com.runemate.game.api.script.framework.listeners.SettingsListener;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class IsCookDialogue extends BranchTask {

    private IsLevelUpChat isLevelUpChat = new IsLevelUpChat();
    private IsAllSelected isAllSelected = new IsAllSelected();

    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    @Override
    public boolean validate() {
        return MakeAllInterface.isOpen() && MakeAllInterface.getSelectableItems().contains(config.meats().getFirstItem());

    }

    @Override
    public TreeTask successTask() {
        return isAllSelected;
    }

    @Override
    public TreeTask failureTask() {
        return isLevelUpChat;
    }
}
