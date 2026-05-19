/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CV
 *  pda
 *  pqa
 *  rt
 *  vRa
 */
import net.minecraft.client.model.ModelPlayer;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dT_2 {
    public ModelPlayer model;
    public float time;
    public MiniDotItem item;
    public int numberInList;
    public gt view;
    public rt options;
    public Sx player;
    public jU pi;

    public boolean e() {
        dT_2 a2;
        if (a2.player != null && a2.player.J(uSa.E) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean d() {
        dT_2 a2;
        if (a2.player != null && a2.player.J(yRa.d) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float f() {
        dT_2 a2;
        return a2.player.i;
    }

    public dT_2() {
        dT_2 a2;
    }

    public boolean C() {
        dT_2 a2;
        if (a2.player != null && a2.player.J(vRa.d) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean l() {
        dT_2 a2;
        if (a2.player != null && a2.player.J(uqa.g) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(pda pda2) {
        dT_2 b2 = pda2;
        dT_2 a2 = this;
        if (a2.player != null && a2.player.J((pda)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        dT_2 a2;
        if (a2.model != null && a2.model.isSneak) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        dT_2 a2;
        return (boolean)a2.player.V;
    }

    public float J() {
        dT_2 a2;
        return Math.min((float)(a2.player.z + (a2.player.U - a2.player.z) * CV.M), pqa.r);
    }
}

