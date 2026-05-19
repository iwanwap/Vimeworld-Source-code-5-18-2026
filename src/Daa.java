/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LEa
 *  QW
 *  aSa
 *  pua
 *  vRa
 */
public final class Daa
extends Enum<Daa> {
    public final QW id;
    public static final /* enum */ Daa SPECTATOR;
    public static final /* enum */ Daa SURVIVAL;
    public static final /* enum */ Daa ADVENTURE;
    public final String name;
    public static final /* enum */ Daa NOT_SET;
    public static final /* enum */ Daa CREATIVE;
    private static final /* synthetic */ Daa[] $VALUES;

    public void configurePlayerCapabilities(LEa lEa2) {
        Daa daa;
        Daa b2 = lEa2;
        Daa a2 = this;
        if (a2 == CREATIVE) {
            Daa daa2 = b2;
            daa = daa2;
            daa2.J(vRa.d != 0);
            daa2.l(vRa.d != 0);
            ((LEa)daa2).M = vRa.d;
        } else if (a2 == SPECTATOR) {
            Daa daa3 = b2;
            daa = daa3;
            daa3.J(vRa.d != 0);
            daa3.l(uSa.E != 0);
            ((LEa)daa3).M = vRa.d;
            daa3.f(vRa.d != 0);
        } else {
            Daa daa4 = b2;
            daa = daa4;
            daa4.J(uSa.E != 0);
            daa4.l(uSa.E != 0);
            ((LEa)daa4).M = uSa.E;
            daa4.f(uSa.E != 0);
        }
        ((LEa)daa).J = !a2.isAdventure() ? vRa.d : uSa.E;
    }

    public boolean isSurvivalOrAdventure() {
        Daa a2;
        if (a2 == SURVIVAL || a2 == ADVENTURE) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getID() {
        Daa a2;
        return a2.id.J();
    }

    public static Daa getByID(int n2) {
        int a2;
        int n3 = n2;
        Daa[] daaArray = Daa.values();
        int n4 = daaArray.length;
        int n5 = a2 = uSa.E;
        while (n5 < n4) {
            Daa daa = daaArray[a2];
            if (daa.id.J() == n3) {
                return daa;
            }
            n5 = ++a2;
        }
        return SURVIVAL;
    }

    public static Daa[] values() {
        return (Daa[])$VALUES.clone();
    }

    static {
        NOT_SET = new Daa(pua.o, Mqa.y);
        SURVIVAL = new Daa(uSa.E, APa.k);
        CREATIVE = new Daa(vRa.d, mPa.P);
        ADVENTURE = new Daa(uqa.g, tSa.G);
        SPECTATOR = new Daa(yRa.d, aSa.N);
        Daa[] daaArray = new Daa[tTa.h];
        daaArray[uSa.E] = NOT_SET;
        daaArray[vRa.d] = SURVIVAL;
        daaArray[uqa.g] = CREATIVE;
        daaArray[yRa.d] = ADVENTURE;
        daaArray[AQa.P] = SPECTATOR;
        $VALUES = daaArray;
    }

    public boolean isCreative() {
        Daa a2;
        if (a2 == CREATIVE) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Daa getByName(String string) {
        int a2;
        String string2 = string;
        Daa[] daaArray = Daa.values();
        int n2 = daaArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Daa daa = daaArray[a2];
            if (daa.name.equals(string2)) {
                return daa;
            }
            n3 = ++a2;
        }
        return SURVIVAL;
    }

    public String getName() {
        Daa a2;
        return a2.name;
    }

    public boolean isAdventure() {
        Daa a2;
        if (a2 == ADVENTURE || a2 == SPECTATOR) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Daa(int n3, String string2) {
        Object c2;
        void b2;
        Daa daa = object;
        Object object = string2;
        Daa a2 = daa;
        Daa daa2 = a2;
        a2.id = new QW((int)b2);
        a2.name = c2;
    }

    public static Daa valueOf(String a2) {
        return Enum.valueOf(Daa.class, a2);
    }
}

