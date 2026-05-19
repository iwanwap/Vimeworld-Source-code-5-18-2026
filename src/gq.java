/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  XTa
 *  pPa
 *  vRa
 */
public final class gq
extends Enum<gq> {
    public static final /* enum */ gq CUSTOM_ANIMATION;
    public static final /* enum */ gq JUMP;
    public static final /* enum */ gq SHOOT;
    public static final /* enum */ gq LAND;
    public static final /* enum */ gq DAMAGED;
    public static final /* enum */ gq SPAWN;
    private final boolean looped;
    public static final /* enum */ gq DEATH;
    private static final /* synthetic */ gq[] $VALUES;
    public static final /* enum */ gq ATTACK;
    private final int priority;
    public static final /* enum */ gq WALK;
    public static final /* enum */ gq IDLE;
    public static final /* enum */ gq FALL;

    public boolean isLooped() {
        gq a2;
        return a2.looped;
    }

    /*
     * WARNING - void declaration
     */
    private gq(int n3, boolean bl) {
        void c2;
        void b2;
        gq a2;
        boolean bl2 = bl;
        gq gq2 = a2 = this;
        gq2.priority = b2;
        gq2.looped = c2;
    }

    public int getPriority() {
        gq a2;
        return a2.priority;
    }

    static {
        SPAWN = new gq(AQa.P, uSa.E != 0);
        DEATH = new gq(yRa.d, uSa.E != 0);
        CUSTOM_ANIMATION = new gq(uqa.g, uSa.E != 0);
        IDLE = new gq(uSa.E, vRa.d != 0);
        WALK = new gq(uSa.E, vRa.d != 0);
        JUMP = new gq(vRa.d, uSa.E != 0);
        FALL = new gq(uSa.E, vRa.d != 0);
        LAND = new gq(vRa.d, uSa.E != 0);
        ATTACK = new gq(uqa.g, uSa.E != 0);
        SHOOT = new gq(uqa.g, uSa.E != 0);
        DAMAGED = new gq(uqa.g, uSa.E != 0);
        gq[] gqArray = new gq[pPa.f];
        gqArray[uSa.E] = SPAWN;
        gqArray[vRa.d] = DEATH;
        gqArray[uqa.g] = CUSTOM_ANIMATION;
        gqArray[yRa.d] = IDLE;
        gqArray[AQa.P] = WALK;
        gqArray[tTa.h] = JUMP;
        gqArray[uua.p] = FALL;
        gqArray[XTa.W] = LAND;
        gqArray[Yqa.i] = ATTACK;
        gqArray[WOa.fa] = SHOOT;
        gqArray[NTa.C] = DAMAGED;
        $VALUES = gqArray;
    }

    public static gq valueOf(String a2) {
        return Enum.valueOf(gq.class, a2);
    }

    public static gq[] values() {
        return (gq[])$VALUES.clone();
    }
}

