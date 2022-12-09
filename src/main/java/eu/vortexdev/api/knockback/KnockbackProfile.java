package eu.vortexdev.api.knockback;

import eu.vortexdev.api.config.Setting;

import java.util.List;

public class KnockbackProfile {

    public final Setting<Double> horizontal = new Setting<>("horizontal", "Horizontal knockback: horizontal = value", 0.43D);
    public final Setting<Double> horizontalOnGround = new Setting<>("horizontalOnGround", "On ground horizontal kb modifier: horizontal *= multiplier", 1.1D);
    public final Setting<Double> horizontalSprinting = new Setting<>("horizontalSprinting", "Sprinting horizontal kb modifier: horizontal *= multiplier", 1.2D);
    public final Setting<Double> horizontalKnockbackDeduction = new Setting<>("horizontalKnockbackDeduction", "Knockback enchantment modifier: horizontal *= ((enchLevel + 1) - kbDeductionValue)", 0.8D);

    public final Setting<Double> vertical = new Setting<>("vertical", "Vertical knockback. vertical = value", 0.33D);
    public final Setting<Double> verticalOnGround = new Setting<>("verticalOnGround", "On ground vertical kb modifier: vertical *= multiplier", 1.0D);
    public final Setting<Double> verticalSprinting = new Setting<>("verticalSprinting", "Sprinting vertical kb modifier: vertical *= multiplier", 1.0D);

    public final Setting<Boolean> inheritHorizontal = new Setting<>("inheritHorizontal", "Inherit victim motion", true);
    public final Setting<Double> frictionHorizontal = new Setting<>("frictionHorizontal", "Horizontal friction: horizontal = (motion * frictionHorizontal) + victimYaw", 1.0D);

    public final Setting<Boolean> inheritVertical = new Setting<>("inheritVertical", "Inherit victim vertical motion", false);
    public final Setting<Double> frictionVertical = new Setting<>("frictionVertical", "Vertical friction: vertical += (motion * frictionHorizontal)", 1.0D);

    public final Setting<Boolean> onePointSevenKb = new Setting<>("onePointSevenKb", "Help players with victim chasing", false);
    public final Setting<Double> onePointSevenHorizontal = new Setting<>("onePointSevenHorizontal", "Horizontal knockback on back-hit: horizontal = value", 0.25);

    public final Setting<Boolean> limitVertical = new Setting<>("limitVertical", "Limit vertical if it exceeds yLimit", false);
    public final Setting<Double> yLimit = new Setting<>("yLimit", "Vertical limit: vertical = 0", 1.2D);

    public final Setting<Boolean> comboMode = new Setting<>("comboMode", "Enable combo mode", false);
    public final Setting<Double> comboHeight = new Setting<>("comboHeight", "Maximum height of combo", 2.3D);
    public final Setting<Integer> comboTicks = new Setting<>("comboTicks", "Maximum combo ticks", 10);
    public final Setting<Double> comboVelocity = new Setting<>("comboVelocity", "Vertical deduction on hit", -0.05D);

    public final Setting<Boolean> overrideRodKb = new Setting<>("overrideRodKb", "Use our custom fishing rod kb", true);
    public final Setting<Double> rodHorizontal = new Setting<>("rodHorizontal", "Horizontal fishing rod knockback", 1.1);
    public final Setting<Double> rodVertical = new Setting<>("rodVertical", "Vertical fishing rod knockback", 1.0D);
    public final Setting<Double> rodMultiplier = new Setting<>("rodMultiplier", "Multiplies the number given with the rod's vector magnitude", 1.0D);

    public final Setting<Boolean> overrideBowKb = new Setting<>("overrideBowKb", "Use our custom bow kb", true);
    public final Setting<Double> bowHorizontal = new Setting<>("bowHorizontal", "Horizontal bow knockback", 0.9);
    public final Setting<Double> bowVertical = new Setting<>("bowVertical", "Horizontal vertical knockback", 1.0D);
    public final Setting<Double> bowPunchMultiplier = new Setting<>("bowPunchMultiplier", "Punch enchantment modifier: horizontal *= (punchLevel + 1) * bowPunchMultiplier", 1.0);

    public final Setting<Double> potionGravity = new Setting<>("potionGravity", "Fall speed value", 0.05);
    public final Setting<Double> potionSpeed = new Setting<>("potionSpeed", "Throwing multiplier value", 0.5);
    public final Setting<Double> potionVerticalOffset = new Setting<>("potionVerticalOffset", "Vertical throwing offset value", -10.0);
    public final Setting<Boolean> potionSmooth = new Setting<>("potionSmooth", "Make heal potions throwing smoother", true);

    public final Setting<Integer> hitDelay = new Setting<>("hitDelay", "Delay between victim can get hit", 19);
    public final Setting<Double> slowdown = new Setting<>("slowdown", "Slowdown player on hit", 0.6D);
    public final Setting<Boolean> cancelSprint = new Setting<>("cancelSprint", "Cancel sprint for player on hit", true);

    public KnockbackProfile(String name) {
    }

    public String getName() {
        return null;
    }

    public List<Setting<?>> getSettings() {
        return null;
    }

    public Setting<?> getSetting(String name) {
        return null;
    }

}
