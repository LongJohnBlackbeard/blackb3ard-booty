package com.runemate.BootyCooker.branches;

import com.runemate.BootyCooker.enums.Config;
import com.runemate.BootyCooker.leafs.ContinueWait;
import com.runemate.game.api.hybrid.entities.Player;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;
import com.runemate.ui.setting.annotation.open.SettingsProvider;
import lombok.Getter;

public class AreWeCooking extends BranchTask {

    private ContinueWait continueWait = new ContinueWait();
    private HaveRawFoodCook haveRawFoodCook = new HaveRawFoodCook();


    @Getter
    @SettingsProvider(updatable = true)
    private Config config;

    private Player player;

    @Override
    public boolean validate() {
        return Execution.delayUntil(() -> Inventory.contains(config.meats().getFirstItem()), () -> player.getAnimationId() == 897, 500, 1, 3);
    }

    @Override
    public TreeTask successTask() {
        return continueWait;
    }

    @Override
    public TreeTask failureTask() {
        return haveRawFoodCook;
    }
}
