/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cla
 *  Gg
 *  ZJa
 *  cja
 *  ez
 *  pua
 *  xJa
 */
public final class wKa_3
extends Cla {
    private final int I;

    /*
     * WARNING - void declaration
     */
    public wKa_3(Gg gg2, ZJa zJa2, XF xF2, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n3 = n2;
        wKa_3 a2 = this;
        super((Gg)d2, (ZJa)c2, (XF)b2, (int)e2);
        a2.I = xJa.J((int)ez.values().length);
    }

    public void f() {
        wKa_3 a2;
        wKa_3 wKa_32 = a2;
        super.f();
        xJa.J((int)wKa_32.I, (int)ez.values().length);
    }

    /*
     * WARNING - void declaration
     */
    public int J(ez ez2, cja cja2) {
        void a2;
        wKa_3 c2 = ez2;
        wKa_3 b2 = this;
        if (!a2.J((ez)c2)) {
            return b2.I + c2.ordinal();
        }
        return pua.o;
    }
}

