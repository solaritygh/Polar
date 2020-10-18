package com.hpfxd.polar.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Sound {
    AMBIENT_CAVE("ambient.cave"),
    AMBIENT_WEATHER_RAIN("ambient.weather.rain"),
    AMBIENT_WEATHER_THUNDER("ambient.weather.thunder"),
    DAMAGE_FALL_BIG("damage.fall.big"),
    DAMAGE_FALL_SMALL("damage.fall.small"),
    DAMAGE_HIT("damage.hit"),
    DIG_CLOTH("dig.cloth"),
    DIG_GRASS("dig.grass"),
    DIG_GRAVEL("dig.gravel"),
    DIG_SAND("dig.sand"),
    DIG_SNOW("dig.snow"),
    DIG_STONE("dig.stone"),
    DIG_WOOD("dig.wood"),
    FIRE_ACTIVE("fire.active"),
    FIRE_IGNITE("fire.ignite"),
    LIQUID_LAVA("liquid.lava"),
    LIQUID_LAVA_POP("liquid.lava.pop"),
    LIQUID_SPLASH("liquid.splash"),
    LIQUID_SWIM("liquid.swim"),
    LIQUID_WATER("liquid.water"),
    MINECART_BASE("minecart.base"),
    MINECART_INSIDE("minecart.inside"),
    MOB_BAT_DEATH("mob.bat.death"),
    MOB_BAT_HURT("mob.bat.hurt"),
    MOB_BAT_IDLE("mob.bat.idle"),
    MOB_BAT_TAKEOFF("mob.bat.takeoff"),
    MOB_BLAZE_BREATHE("mob.blaze.breathe"),
    MOB_BLAZE_DEATH("mob.blaze.death"),
    MOB_BLAZE_HIT("mob.blaze.hit"),
    MOB_CAT_HISS("mob.cat.hiss"),
    MOB_CAT_HITT("mob.cat.hitt"),
    MOB_CAT_MEOW("mob.cat.meow"),
    MOB_CAT_PURR("mob.cat.purr"),
    MOB_CAT_PURREOW("mob.cat.purreow"),
    MOB_CHICKEN_HURT("mob.chicken.hurt"),
    MOB_CHICKEN_PLOP("mob.chicken.plop"),
    MOB_CHICKEN_SAY("mob.chicken.say"),
    MOB_CHICKEN_STEP("mob.chicken.step"),
    MOB_COW_HURT("mob.cow.hurt"),
    MOB_COW_SAY("mob.cow.say"),
    MOB_COW_STEP("mob.cow.step"),
    MOB_CREEPER("mob.creeper"),
    MOB_CREEPER_DEATH("mob.creeper.death"),
    MOB_CREEPER_SAY("mob.creeper.say"),
    MOB_ENDERDRAGON_END("mob.enderdragon.end"),
    MOB_ENDERDRAGON_GROWL("mob.enderdragon.growl"),
    MOB_ENDERDRAGON_HIT("mob.enderdragon.hit"),
    MOB_ENDERDRAGON_WINGS("mob.enderdragon.wings"),
    MOB_ENDERMEN_DEATH("mob.endermen.death"),
    MOB_ENDERMEN_HIT("mob.endermen.hit"),
    MOB_ENDERMEN_IDLE("mob.endermen.idle"),
    MOB_ENDERMEN_PORTAL("mob.endermen.portal"),
    MOB_ENDERMEN_SCREAM("mob.endermen.scream"),
    MOB_ENDERMEN_STARE("mob.endermen.stare"),
    MOB_GHAST_AFFECTIONATE_SCREAM("mob.ghast.affectionate.scream"),
    MOB_GHAST_CHARGE("mob.ghast.charge"),
    MOB_GHAST_DEATH("mob.ghast.death"),
    MOB_GHAST_FIREBALL("mob.ghast.fireball"),
    MOB_GHAST_MOAN("mob.ghast.moan"),
    MOB_GHAST_SCREAM("mob.ghast.scream"),
    MOB_IRONGOLEM_DEATH("mob.irongolem.death"),
    MOB_IRONGOLEM_HIT("mob.irongolem.hit"),
    MOB_IRONGOLEM_THROW("mob.irongolem.throw"),
    MOB_IRONGOLEM_WALK("mob.irongolem.walk"),
    MOB_MAGMACUBE_BIG("mob.magmacube.big"),
    MOB_MAGMACUBE_JUMP("mob.magmacube.jump"),
    MOB_MAGMACUBE_SMALL("mob.magmacube.small"),
    MOB_PIG_DEATH("mob.pig.death"),
    MOB_PIG_SAY("mob.pig.say"),
    MOB_PIG_STEP("mob.pig.step"),
    MOB_PIGDEATH("mob.pigdeath"),
    MOB_SHEEP_SAY("mob.sheep.say"),
    MOB_SHEEP_SHEAR("mob.sheep.shear"),
    MOB_SHEEP_STEP("mob.sheep.step"),
    MOB_SILVERFISH_HIT("mob.silverfish.hit"),
    MOB_SILVERFISH_KILL("mob.silverfish.kill"),
    MOB_SILVERFISH_SAY("mob.silverfish.say"),
    MOB_SILVERFISH_STEP("mob.silverfish.step"),
    MOB_SKELETON_DEATH("mob.skeleton.death"),
    MOB_SKELETON_HURT("mob.skeleton.hurt"),
    MOB_SKELETON_SAY("mob.skeleton.say"),
    MOB_SKELETON_STEP("mob.skeleton.step"),
    MOB_SLIME_ATTACK("mob.slime.attack"),
    MOB_SLIME_BIG("mob.slime.big"),
    MOB_SLIME_SMALL("mob.slime.small"),
    MOB_SLIMEATTACK("mob.slimeattack"),
    MOB_SPIDER_DEATH("mob.spider.death"),
    MOB_SPIDER_SAY("mob.spider.say"),
    MOB_SPIDER_STEP("mob.spider.step"),
    MOB_WITHER_DEATH("mob.wither.death"),
    MOB_WITHER_HURT("mob.wither.hurt"),
    MOB_WITHER_IDLE("mob.wither.idle"),
    MOB_WITHER_SHOOT("mob.wither.shoot"),
    MOB_WITHER_SPAWN("mob.wither.spawn"),
    MOB_WOLF_BARK("mob.wolf.bark"),
    MOB_WOLF_DEATH("mob.wolf.death"),
    MOB_WOLF_GROWL("mob.wolf.growl"),
    MOB_WOLF_HOWL("mob.wolf.howl"),
    MOB_WOLF_HURT("mob.wolf.hurt"),
    MOB_WOLF_PANTING("mob.wolf.panting"),
    MOB_WOLF_SHAKE("mob.wolf.shake"),
    MOB_WOLF_STEP("mob.wolf.step"),
    MOB_WOLF_WHINE("mob.wolf.whine"),
    MOB_ZOMBIE("mob.zombie"),
    MOB_ZOMBIE_DEATH("mob.zombie.death"),
    MOB_ZOMBIE_HURT("mob.zombie.hurt"),
    MOB_ZOMBIE_INFECT("mob.zombie.infect"),
    MOB_ZOMBIE_METAL("mob.zombie.metal"),
    MOB_ZOMBIE_REMEDY("mob.zombie.remedy"),
    MOB_ZOMBIE_SAY("mob.zombie.say"),
    MOB_ZOMBIE_STEP("mob.zombie.step"),
    MOB_ZOMBIE_UNFECT("mob.zombie.unfect"),
    MOB_ZOMBIE_WOOD("mob.zombie.wood"),
    MOB_ZOMBIE_WOODBREAK("mob.zombie.woodbreak"),
    MOB_ZOMBIEDEATH("mob.zombiedeath"),
    MOB_ZOMBIEHURT("mob.zombiehurt"),
    MOB_ZOMBIEPIG_ZPIG("mob.zombiepig.zpig"),
    MOB_ZOMBIEPIG_ZPIGANGRY("mob.zombiepig.zpigangry"),
    MOB_ZOMBIEPIG_ZPIGDEATH("mob.zombiepig.zpigdeath"),
    MOB_ZOMBIEPIG_ZPIGHURT("mob.zombiepig.zpighurt"),
    NOTE_BASS("note.bass"),
    NOTE_BASS_ATTACK("note.bass.attack"),
    NOTE_BD("note.bd"),
    NOTE_HARP("note.harp"),
    NOTE_HAT("note.hat"),
    NOTE_PLING("note.pling"),
    NOTE_SNARE("note.snare"),
    PORTAL_NEAR("portal.near"),
    PORTAL_TRAVEL("portal.travel"),
    PORTAL_TRIGGER("portal.trigger"),
    RANDOM_ANVIL_BREAK("random.anvil.break"),
    RANDOM_ANVIL_LAND("random.anvil.land"),
    RANDOM_ANVIL_USE("random.anvil.use"),
    RANDOM_BOW("random.bow"),
    RANDOM_BOWHIT("random.bowhit"),
    RANDOM_BREAK("random.break"),
    RANDOM_BREATH("random.breath"),
    RANDOM_BURP("random.burp"),
    RANDOM_CHESTCLOSED("random.chestclosed"),
    RANDOM_CHESTOPEN("random.chestopen"),
    RANDOM_CLASSIC_HURT("random.classic.hurt"),
    RANDOM_CLICK("random.click"),
    RANDOM_DOOR_CLOSE("random.door.close"),
    RANDOM_DOOR_OPEN("random.door.open"),
    RANDOM_DRINK("random.drink"),
    RANDOM_EAT("random.eat"),
    RANDOM_EXPLODE("random.explode"),
    RANDOM_FIZZ("random.fizz"),
    RANDOM_FUSE("random.fuse"),
    RANDOM_GLASS("random.glass"),
    RANDOM_LEVELUP("random.levelup"),
    RANDOM_OLD_EXPLODE("random.old.explode"),
    RANDOM_ORB("random.orb"),
    RANDOM_POP("random.pop"),
    RANDOM_SPLASH("random.splash"),
    RANDOM_WOOD_CLICK("random.wood.click"),
    STEP_CLOTH("step.cloth"),
    STEP_GRASS("step.grass"),
    STEP_GRAVEL("step.gravel"),
    STEP_LADDER("step.ladder"),
    STEP_SAND("step.sand"),
    STEP_SNOW("step.snow"),
    STEP_STONE("step.stone"),
    STEP_WOOD("step.wood"),
    TILE_PISTON_IN("tile.piston.in"),
    TILE_PISTON_OUT("tile.piston.out")
    ;
    private final String name;
}
