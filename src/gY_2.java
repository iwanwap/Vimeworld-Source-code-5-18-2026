/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Ey
 *  Kb
 *  Mda
 *  OC
 *  aX
 *  eAa
 *  gY
 *  ld
 *  pY
 *  vRa
 *  zTa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gY_2
extends aX {
    public final gY parentAchievement;
    private OC statStringFormatter;
    public final int displayRow;
    private boolean isSpecial;
    public final int displayColumn;
    private final String achievementDescription;
    public final Mda theItemStack;

    public boolean f() {
        gY_2 a2;
        return a2.isSpecial;
    }

    public gY l() {
        gY_2 a2;
        a2.isSpecial = vRa.d;
        return a2;
    }

    public gY J(Class<? extends Kb> clazz) {
        Object b2 = clazz;
        gY_2 a2 = this;
        return (gY_2)super.J((Class)b2);
    }

    /*
     * WARNING - void declaration
     */
    public gY_2(String string, String string2, int n2, int n3, Block block, gY gY2) {
        gY_2 g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        gY_2 gY_22 = gY_23;
        gY_2 gY_23 = gY2;
        gY_2 a2 = gY_22;
        a2((String)f2, (String)e2, (int)d2, (int)c2, new Mda((Block)b2), (gY)g2);
    }

    /*
     * WARNING - void declaration
     */
    public gY_2(String string, String string2, int n2, int n3, eAa eAa2, gY gY2) {
        gY_2 g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        gY_2 gY_22 = gY_23;
        gY_2 gY_23 = gY2;
        gY_2 a2 = gY_22;
        a2((String)f2, (String)e2, (int)d2, (int)c2, new Mda((eAa)b2), (gY)g2);
    }

    public ld f() {
        gY_2 gY_22 = this;
        gY_2 a2 = super.f();
        a2.J().J(gY_22.f() ? pY.DARK_PURPLE : pY.GREEN);
        return a2;
    }

    public gY J(OC oC2) {
        gY_2 b2 = oC2;
        gY_2 a2 = this;
        a2.statStringFormatter = b2;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gY_2(String string, String string2, int n2, int n3, Mda mda2, gY gY2) {
        void a2;
        void g2;
        void d2;
        void b2;
        void e2;
        void f2;
        int n4 = n3;
        gY_2 c2 = this;
        super((String)f2, (ld)new CZ(new StringBuilder().insert(2 & 5, zTa.G).append((String)e2).toString(), new Object[uSa.E]));
        gY_2 gY_22 = c2;
        gY_2 gY_23 = c2;
        gY_23.theItemStack = b2;
        gY_23.achievementDescription = new StringBuilder().insert(3 ^ 3, zTa.G).append((String)e2).append(kra.Ca).toString();
        gY_22.displayColumn = d2;
        gY_22.displayRow = g2;
        if (d2 < mY.M) {
            mY.M = d2;
        }
        if (g2 < mY.Q) {
            mY.Q = g2;
        }
        if (d2 > mY.s) {
            mY.s = d2;
        }
        if (g2 > mY.d) {
            mY.d = g2;
        }
        c2.parentAchievement = a2;
    }

    public boolean J() {
        return vRa.d != 0;
    }

    public gY f() {
        gY_2 a2;
        gY_2 gY_22 = a2;
        super.J();
        mY.m.add((gY)gY_22);
        return gY_22;
    }

    public gY J() {
        gY_2 a2;
        a2.isIndependent = vRa.d;
        return a2;
    }

    public String J() {
        gY_2 a2;
        if (a2.statStringFormatter != null) {
            gY_2 gY_22 = a2;
            return gY_22.statStringFormatter.J(Ey.f((String)gY_22.achievementDescription));
        }
        return Ey.f((String)a2.achievementDescription);
    }
}

