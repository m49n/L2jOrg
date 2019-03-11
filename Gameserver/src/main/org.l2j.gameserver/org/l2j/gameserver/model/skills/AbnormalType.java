/*
 * This file is part of the L2J Mobius project.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2j.gameserver.model.skills;

import java.util.logging.Logger;

/**
 * Abnormal type enumerate.
 *
 * @author Zoey76
 */
public enum AbnormalType {
    NONE(-1),
    ABILITY_CHANGE(-1),
    ABSORB(-1),
    ACADEMY_UP(-1),
    ANTI_SUMMON(-1),
    ARCANE_PROTECTION(-1),
    ARMOR_ELEMENT_ALL(-1),
    ATTACK_TIME_DOWN_SPECIAL(-1),
    AURA(-1),
    AVOID_SKILL_SPECIAL(-1),
    BARRIER(-1),
    BATTLE_CRY(-1),
    BATTLE_TOLERANCE(-1),
    BIG_BODY_COMBINATION(-1),
    BLESS_THE_BLOOD(-1),
    BLOCK_ESCAPE(-1),
    BLOCK_RESURRECTION(-1),
    BLOCK_SHIELD_UP(-1),
    BLOCK_SPEED_UP(-1),
    BLOCK_TRANSFORM(-1),
    BODY_DESTRUCTION(-1),
    BOT_PENALTY(-1),
    BR_EVENT_BUF1(-1),
    BR_EVENT_BUF2(-1),
    BR_EVENT_BUF3(-1),
    BR_EVENT_BUF4(-1),
    BR_EVENT_BUF6(-1),
    BR_EVENT_BUF7(-1),
    BRIGHTNESS_BLESS(-1),
    BUFF_MENTEE1(-1),
    BUFF_PCCAFE_EXP1(-1),
    BUFF_SPECIAL_ATTACK(-1),
    BUFF_SPECIAL_AURA(-1),
    BUFF_SPECIAL_CLASS(-1),
    BUFF_SPECIAL_CONDITION(-1),
    BUFF_SPECIAL_CRITICAL(-1),
    BUFF_SPECIAL_DEFENCE(-1),
    BUFF_SPECIAL_HITAVOID(-1),
    BUFF_SPECIAL_MOVE(-1),
    BUFF_SPECIAL_MULTI(-1),
    BUFF_TREE(-1),
    CHANGEBODY(-1),
    CLAN_ADVENT(-1),
    CLAN_BOUNDARY(-1),
    CLAN_FRIEND(-1),
    CLAN_PRISON(-1),
    CLASS_CHANGE(-1),
    CONFUSION(-1),
    COUNTER_CRITICAL(-1),
    COUNTER_CRITICAL_TRIGGER(-1),
    CRIPPLING_DANCE(-1),
    CRITICAL_SPECIAL(-1),
    CURIOUS_HOUSE(-1),
    CURSE_EXPOSURE(-1),
    DAMAGE_AMPLIFY(-1),
    DANCE_OF_BERSERKER(-1),
    DC_MOD(-1),
    DD_RESIST(-1),
    DEATH_PENALTY_BLOCK(-1),
    DEATH_PENALTY_GD(-1),
    DEATHWORM(-1),
    DEPORT(-1),
    DITTY(-1),
    DUAL_ATTACK_UP(-1),
    DUAL_DEFENCE_UP(-1),
    DUAL_DMG_SHIELD(-1),
    DUAL_SKILL_UP(-1),
    DWARF_ATTACK_BUFF(-1),
    DWARF_DEFENCE_BUFF(-1),
    ENCHANTER_MOD(-1),
    ENERGY_OF_TOTEM_1(-1),
    ENERGY_OF_TOTEM_2(-1),
    ENERGY_OF_TOTEM_3(-1),
    ENERGY_OF_TOTEM_4(-1),
    EVENT_GAWI(-1),
    EVENT_SANTA_REWARD(-1),
    EVENT_TERRITORY(-1),
    EVENT_WIN(-1),
    EXP_BOTTLE(-1),
    EXP_SPECIAL(-1),
    FINAL_SECRET(-1),
    FISH_STEW(-1),
    FLAG_BUF(-1),
    FLAG_DEBUF(-1),
    FORCE_HP_UP(-1),
    GREATER_SERVITOR_BUFF(-1),
    HIDE(-1),
    IMPROVE_HIT_DEFENCE_CRT_RATE_UP(-1),
    INSTANT_EV_BUFF1(-1),
    INSTANT_EV_BUFF6(-1),
    INVINCIBILITY_SPECIAL(-1),
    KALIE_BUFF(-1),
    KNIGHT_AURA(-1),
    KNIGHT_SHIELD(-1),
    LIFE_FORCE_HEALER(-1),
    LIFE_FORCE_HEALER_SELF(-1),
    LUMIERE_BUFF(-1),
    MARK_DEBUF_A(-1),
    MARK_DEBUF_B(-1),
    MARK_DEBUF_C(-1),
    MARK_DEBUF_D(-1),
    MARK_OF_LUMI(-1),
    MARK_OF_WEAKNESS(-1),
    MARK_OF_PLAGUE(-1),
    MARK_OF_TRICK(-1),
    MAX_HP_UP_K(-1),
    MORALE_UP(-1),
    MOTION_OF_DEFENCE(-1),
    MOVEMENT(-1),
    MP_SHIELD(-1),
    MULTI_BUFF_A(-1),
    MULTI_DEBUFF_A(-1),
    MULTI_DEBUFF_B(-1),
    MULTI_DEBUFF_C(-1),
    MULTI_DEBUFF_D(-1),
    MULTI_DEBUFF_E(-1),
    MULTI_DEBUFF_F(-1),
    MULTI_DEBUFF_G(-1),
    NOCHAT(-1),
    NOTICE_PORTAL(-1),
    NPC_ATTACK1(-1),
    NPC_ATTACK2(-1),
    NPC_ATTACK3(-1),
    NPC_FURY(-1),
    NPC_MULTI_BUFF1(-1),
    PATIENCE(-1),
    PET_FURY(-1),
    POSSESSION_SPECIAL(-1),
    PVP_WEAPON_BUFF(-1),
    PVP_WEAPON_DEBUFF(-1),
    RACE_DARKELF1(-1),
    RACE_DWAF1(-1),
    RACE_ELF1(-1),
    RACE_HUMAN1(-1),
    RACE_KAMAEL1(-1),
    RACE_ORC1(-1),
    RACE_ORC2(-1),
    REFLECT_MAGIC_DD(-1),
    RESIST_DEATH(-1),
    RHAPSODY(-1),
    SACRIFICE(-1),
    SEED_OF_CRITICAL(-1),
    SEED_TALISMAN1(-1),
    SHIELD_ATTACK(-1),
    SHILLIEN_PROTECTION(-1),
    SHOOTING_STANCE(-1),
    SIGNAL_A(-1),
    SIGNAL_B(-1),
    SIGNAL_C(-1),
    SIGNAL_D(-1),
    SIGNAL_E(-1),
    SKILL_IGNORE(-1),
    SOA_BUFF1(-1),
    SOA_BUFF2(-1),
    SOA_BUFF3(-1),
    SONG_OF_PURIFICATION(-1),
    SONG_OF_THIEF(-1),
    SONG_OF_WISDOM(-1),
    SPECIAL_BERSERKER(-1),
    SPECIAL_MOVE_UP(-1),
    SPECIAL_RIDE(-1),
    SPIRIT_SHARING(-1),
    STAR_AGATHION_EXP_SP_BUFF1(-1),
    STIGMA_A(-1),
    STIGMA_OF_SILEN(-1),
    STORM_SIGN(-1),
    SUBSTITUTE_BUFF(-1),
    SUMMONER_LINK(-1),
    SUPER_AVOID(-1),
    SUPER_BUFF(-1),
    SUPER_MOVE(-1),
    SYNERGY_EOLH(-1),
    SYNERGY_FEOH(-1),
    SYNERGY_IS(-1),
    SYNERGY_LENKER(-1),
    SYNERGY_OTHEL(-1),
    SYNERGY_PARTY_BUF(-1),
    SYNERGY_SEER(-1),
    SYNERGY_SIGEL(-1),
    SYNERGY_TIR(-1),
    SYNERGY_WYNN(-1),
    SYNERGY_YR(-1),
    TIME_BOMB(-1),
    TURN_CRYSTAL(-1),
    VAMPIRIC_ATTACK_SPECIAL(-1),
    VIBRATION(-1),
    VOTE(-1),
    VP_CHANGE(-1),
    VP_KEEP(-1),
    VP_MENTOR_RUNE(-1),
    VP_UP(-1),
    WEAKENED_DEATH_PENALTY(-1),
    WEAPON_MASTER_SPECIAL(-1),
    WISPERING_OF_BATTLE(-1),
    WP_CHANGE_EVENT(-1),
    CLAN_TEAMWORK(-1),
    SONG_OF_ARCHERY(-1),
    DANCE_OF_SAGE(-1),
    SONG_WEAPON(-1), // TODO: need find proper name
    HEAL_RESISTANCE(-1), // TODO: need find proper name
    AB_HAWK_EYE(0),
    ALL_ATTACK_DOWN(1),
    ALL_ATTACK_UP(2),
    ALL_SPEED_DOWN(3),
    ALL_SPEED_UP(4),
    ANTARAS_DEBUFF(5),
    ARMOR_EARTH(6),
    ARMOR_FIRE(7),
    ARMOR_HOLY(8),
    ARMOR_UNHOLY(9),
    ARMOR_WATER(10),
    ARMOR_WIND(11),
    ATTACK_SPEED_UP_BOW(12),
    ATTACK_TIME_DOWN(13),
    ATTACK_TIME_UP(14),
    AVOID_DOWN(15),
    AVOID_UP(16),
    AVOID_UP_SPECIAL(17),
    BERSERKER(18),
    BIG_BODY(19),
    BIG_HEAD(20),
    BLEEDING(21),
    BOW_RANGE_UP(22),
    BUFF_QUEEN_OF_CAT(23),
    BUFF_UNICORN_SERAPHIM(24),
    CANCEL_PROB_DOWN(25),
    CASTING_TIME_DOWN(26),
    CASTING_TIME_UP(27),
    CHEAP_MAGIC(28),
    CRITICAL_DMG_DOWN(29),
    CRITICAL_DMG_UP(30),
    CRITICAL_PROB_DOWN(31),
    CRITICAL_PROB_UP(32),
    DANCE_OF_AQUA_GUARD(33),
    DANCE_OF_CONCENTRATION(34),
    DANCE_OF_EARTH_GUARD(35),
    DANCE_OF_FIRE(36),
    DANCE_OF_FURY(37),
    DANCE_OF_INSPIRATION(38),
    DANCE_OF_LIGHT(39),
    DANCE_OF_MYSTIC(40),
    DANCE_OF_PROTECTION(41),
    DANCE_OF_SHADOW(42),
    DANCE_OF_SIREN(43),
    DANCE_OF_VAMPIRE(44),
    DANCE_OF_WARRIOR(45),
    DEBUFF_NIGHTSHADE(46),
    DEBUFF_SHIELD(47),
    DECREASE_WEIGHT_PENALTY(48),
    DERANGEMENT(49),
    DETECT_WEAKNESS(50),
    DMG_SHIELD(51),
    DOT_ATTR(52),
    DOT_MP(53),
    DRAGON_BREATH(54),
    DUELIST_SPIRIT(55),
    FATAL_POISON(56),
    FISHING_MASTERY_DOWN(57),
    FLY_AWAY(58),
    FOCUS_DAGGER(59),
    HEAL_EFFECT_DOWN(60),
    HEAL_EFFECT_UP(61),
    HERO_BUFF(62),
    HERO_DEBUFF(63),
    HIT_DOWN(64),
    HIT_UP(65),
    HOLY_ATTACK(66),
    HP_RECOVER(67),
    HP_REGEN_DOWN(68),
    HP_REGEN_UP(69),
    LIFE_FORCE_ORC(70),
    LIFE_FORCE_OTHERS(71),
    MAGIC_CRITICAL_UP(72),
    MAJESTY(73),
    MAX_BREATH_UP(74),
    MAX_HP_DOWN(75),
    MAX_HP_UP(76),
    MAX_MP_UP(77),
    MA_DOWN(78),
    MA_UP(79),
    MA_UP_HERB(80),
    MD_DOWN(81),
    MD_UP(82),
    MD_UP_ATTR(83),
    MIGHT_MORTAL(84),
    MP_COST_DOWN(85),
    MP_COST_UP(86),
    MP_RECOVER(87),
    MP_REGEN_UP(88),
    MULTI_BUFF(89),
    MULTI_DEBUFF(90),
    PARALYZE(91),
    PA_DOWN(92),
    PA_PD_UP(93),
    PA_UP(94),
    PA_UP_HERB(95),
    PA_UP_SPECIAL(96),
    PD_DOWN(97),
    PD_UP(98),
    PD_UP_BOW(99),
    PD_UP_SPECIAL(100),
    PINCH(101),
    POISON(102),
    POLEARM_ATTACK(103),
    POSSESSION(104),
    PRESERVE_ABNORMAL(105),
    PUBLIC_SLOT(106),
    RAGE_MIGHT(107),
    REDUCE_DROP_PENALTY(108),
    REFLECT_ABNORMAL(109),
    RESIST_BLEEDING(110),
    RESIST_DEBUFF_DISPEL(111),
    RESIST_DERANGEMENT(112),
    RESIST_HOLY_UNHOLY(113),
    RESIST_POISON(114),
    RESIST_SHOCK(115),
    RESIST_SPIRITLESS(116),
    REUSE_DELAY_DOWN(117),
    REUSE_DELAY_UP(118),
    ROOT_PHYSICALLY(119),
    ROOT_MAGICALLY(120),
    SHIELD_DEFENCE_UP(121),
    SHIELD_PROB_UP(122),
    SILENCE(123),
    SILENCE_ALL(124),
    SILENCE_PHYSICAL(125),
    SLEEP(126),
    SNIPE(127),
    SONG_OF_CHAMPION(128),
    SONG_OF_EARTH(129),
    SONG_OF_FLAME_GUARD(130),
    SONG_OF_HUNTER(131),
    SONG_OF_INVOCATION(132),
    SONG_OF_LIFE(133),
    SONG_OF_MEDITATION(134),
    SONG_OF_RENEWAL(135),
    SONG_OF_STORM_GUARD(136),
    SONG_OF_VENGEANCE(137),
    SONG_OF_VITALITY(138),
    SONG_OF_WARDING(139),
    SONG_OF_WATER(140),
    SONG_OF_WIND(141),
    SPA_DISEASE_A(142),
    SPA_DISEASE_B(143),
    SPA_DISEASE_C(144),
    SPA_DISEASE_D(145),
    SPEED_DOWN(146),
    SPEED_UP(147),
    SPEED_UP_SPECIAL(148),
    SSQ_TOWN_BLESSING(149),
    SSQ_TOWN_CURSE(150),
    STEALTH(151),
    STUN(152),
    THRILL_FIGHT(153),
    TOUCH_OF_DEATH(154),
    TOUCH_OF_LIFE(155),
    TURN_FLEE(156),
    TURN_PASSIVE(157),
    TURN_STONE(158),
    ULTIMATE_BUFF(159),
    ULTIMATE_DEBUFF(160),
    VALAKAS_ITEM(161),
    VAMPIRIC_ATTACK(162),
    WATCHER_GAZE(163),
    RESURRECTION_SPECIAL(164),
    COUNTER_SKILL(165),
    AVOID_SKILL(166),
    CP_UP(167),
    CP_DOWN(168),
    CP_REGEN_UP(169),
    CP_REGEN_DOWN(170),
    INVINCIBILITY(171),
    ABNORMAL_INVINCIBILITY(172),
    PHYSICAL_STANCE(173),
    MAGICAL_STANCE(174),
    COMBINATION(175),
    ANESTHESIA(176),
    CRITICAL_POISON(177),
    SEIZURE_PENALTY(178),
    ABNORMAL_ITEM(179),
    SEIZURE_A(180),
    SEIZURE_B(181),
    SEIZURE_C(182),
    FORCE_MEDITATION(183),
    MIRAGE(184),
    POTION_OF_GENESIS(185),
    PVP_DMG_UP(186),
    PVP_DMG_DOWN(187),
    IRON_SHIELD(188),
    TRANSFER_DAMAGE(189),
    SONG_OF_ELEMENTAL(190),
    DANCE_OF_ALIGNMENT(191),
    ARCHER_SPECIAL(192),
    SPOIL_BOMB(193),
    FIRE_DOT(194),
    WATER_DOT(195),
    WIND_DOT(196),
    EARTH_DOT(197),
    HEAL_POWER_UP(198),
    RECHARGE_UP(199),
    NORMAL_ATTACK_BLOCK(200),
    DISARM(201),
    DEATH_MARK(202),
    KAMAEL_SPECIAL(203),
    TRANSFORM(204),
    DARK_SEED(205),
    REAL_TARGET(206),
    FREEZING(207),
    TIME_CHECK(208),
    MA_MD_UP(209),
    DEATH_CLACK(210),
    HOT_GROUND(211),
    EVIL_BLOOD(212),
    ALL_REGEN_UP(213),
    ALL_REGEN_DOWN(214),
    IRON_SHIELD_I(215),
    ARCHER_SPECIAL_I(216),
    T_CRT_RATE_UP(217),
    T_CRT_RATE_DOWN(218),
    T_CRT_DMG_UP(219),
    T_CRT_DMG_DOWN(220),
    INSTINCT(221),
    OBLIVION(222),
    WEAK_CONSTITUTION(223),
    THIN_SKIN(224),
    ENERVATION(225),
    SPITE(226),
    MENTAL_IMPOVERISH(227),
    ATTRIBUTE_POTION(228),
    TALISMAN(229),
    MULTI_DEBUFF_FIRE(230),
    MULTI_DEBUFF_WATER(231),
    MULTI_DEBUFF_WIND(232),
    MULTI_DEBUFF_EARTH(233),
    MULTI_DEBUFF_HOLY(234),
    MULTI_DEBUFF_UNHOLY(235),
    LIFE_FORCE_KAMAEL(236),
    MA_UP_SPECIAL(237),
    PK_PROTECT(238),
    MAXIMUM_ABILITY(239),
    TARGET_LOCK(240),
    PROTECTION(241),
    WILL(242),
    SEED_OF_KNIGHT(243),
    EXPOSE_WEAK_POINT(244),
    FORCE_OF_DESTRUCTION(245),
    ELEMENTAL_ARMOR(246),
    SUMMON_CONDITION(247),
    IMPROVE_PA_PD_UP(248),
    IMPROVE_MA_MD_UP(249),
    IMPROVE_HP_MP_UP(250),
    IMPROVE_CRT_RATE_DMG_UP(251),
    IMPROVE_SHIELD_RATE_DEFENCE_UP(252),
    IMPROVE_SPEED_AVOID_UP(253),
    LIMIT(254),
    MULTI_DEBUFF_SOUL(255),
    CURSE_LIFE_FLOW(256),
    BETRAYAL_MARK(257),
    TRANSFORM_HANGOVER(258),
    TRANSFORM_SCRIFICE(259),
    SONG_OF_WINDSTORM(260),
    DANCE_OF_BLADESTORM(261),
    IMPROVE_VAMPIRIC_HASTE(262),
    WEAPON_MASTERY(263),
    APELLA(264),
    TRANSFORM_SCRIFICE_P(265),
    SUB_TRIGGER_HASTE(266),
    SUB_TRIGGER_DEFENCE(267),
    SUB_TRIGGER_CRT_RATE_UP(268),
    SUB_TRIGGER_SPIRIT(269),
    MIRAGE_TRAP(270),
    DEATH_PENALTY(271),
    ENTRY_FOR_GAME(272),
    BLOOD_CONSTRACT(273),
    DWARF_BUFF(274),
    EVASION_BUFF(275),
    SOUL_SHIELD(276),
    BR_UTHANKA_BUFF(277),
    FIELD_RAID_BUFF1(278),
    PD_UP_DMAGIC(279),
    PREMIUM_BUFF(280),
    RUNWAY_ARMOR(281),
    RUNWAY_WEAPON(282),
    G_EV_BUFF1(283),
    MAX(284),
    AIRBIND(365),
    KNOCKDOWN(367),
    EARTHWORM_DEBUFF(424),
    AGATHION_SONG_DANCE(444),
    INSIDE_POSITION(593),
    STEEL_MIND(596),
    STRAWBERRY_FRUIT(-1),
    MONGO_FRUIT(-1),
    CHERRY_FRUIT(-1),
    HERB_EXP(-1),
    HERB_SPEED(-1),
    HERB_ACCURANCY(-1);

    protected static final Logger LOGGER = Logger.getLogger(AbnormalType.class.getName());
    private int _clientId;

    AbnormalType(int clientId) {
        _clientId = clientId;
    }

    /**
     * Get the enumerate for the given String.
     *
     * @param type the abnormal type to get
     * @return the abnormal type
     */
    public static AbnormalType getAbnormalType(String type) {
        try {
            return Enum.valueOf(AbnormalType.class, type);
        } catch (Exception e) {
            LOGGER.warning("Unknown AbnormalType requested : " + type);
            return NONE;
        }
    }

    public int getClientId() {
        return _clientId;
    }

    /**
     * Verify if this enumerate is default.
     *
     * @return {@code true} if this enumerate is none, {@code false} otherwise
     */
    public boolean isNone() {
        return this == NONE;
    }
}
