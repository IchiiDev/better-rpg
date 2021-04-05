package xyz.ichiidev.betterrpg.utils.enums;

import org.bukkit.Sound;

public enum Achievements {

    FIRST_STEPS(0, "First Steps", "You've got a long way to go !", AchievementTypes.LEGENDARY);

    public final int id;
    public final String title;
    public final String subtitle;
    public final AchievementTypes type;

    Achievements(int ID, String title, String subtitle, AchievementTypes type) {
        this.id = ID;
        this.title = title;
        this.subtitle = subtitle;
        this.type = type;
    }

    public enum AchievementTypes {

        COMMON("Common", "§7", Sound.ENTITY_PLAYER_LEVELUP),
        RARE("Rare", "§2", Sound.ENTITY_VILLAGER_YES),
        LEGENDARY("Legendary !", "§6", Sound.UI_TOAST_CHALLENGE_COMPLETE);

        public final String title;
        public final String color;
        public final Sound sound;

        AchievementTypes(String title, String color, Sound sound) {
            this.title = title;
            this.color = color;
            this.sound = sound;
        }

    }

}
