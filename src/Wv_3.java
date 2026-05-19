/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  QFa
 *  TV
 *  Waa
 *  Xv
 *  lW
 *  pQa
 *  vRa
 */
import java.util.List;
import java.util.Random;

public abstract class Wv_3
extends uU {
    public nw field_143013_d;

    @Override
    public void J(Waa waa2) {
        Wv_3 b2 = waa2;
        Wv_3 a2 = this;
        a2.field_143013_d = nw.valueOf(b2.J(pQa.O));
    }

    public static boolean J(Xv a2) {
        if (a2 != null && a2.minY > NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void f(Waa waa2) {
        Wv_3 b2 = waa2;
        Wv_3 a2 = this;
        b2.J(pQa.O, a2.field_143013_d.name());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU l(lW lW2, List<uU> list, Random random, int n2, int n3) {
        int n4 = n3;
        Wv_3 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (TV.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 4: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.WEST, a2.J());
                }
                case 1: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.WEST, a2.J());
                }
                case 2: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.minZ - vRa.d, DZ.NORTH, a2.J());
                }
                case 3: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.minZ - vRa.d, DZ.NORTH, a2.J());
                }
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(Gg gg2, Random random, Xv xv2, nw nw2, int n2, int n3, int n4) {
        void h2;
        void b2;
        void e2;
        void g2;
        void c2;
        void d2;
        int n5 = n4;
        Wv_3 a2 = this;
        switch (TV.$SwitchMap$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door[d2.ordinal()]) {
            default: {
                void v0 = c2;
                a2.J((Gg)g2, (Xv)e2, (int)v0, (int)b2, (int)h2, (int)(v0 + yRa.d - vRa.d), (int)(b2 + yRa.d - vRa.d), (int)h2, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
                return;
            }
            case 2: {
                Wv_3 wv_3 = a2;
                void v2 = g2;
                Wv_3 wv_32 = a2;
                void v4 = g2;
                Wv_3 wv_33 = a2;
                void v6 = g2;
                a2.f((Gg)g2, QFa.v.J(), (int)c2, (int)b2, (int)h2, (Xv)e2);
                a2.f((Gg)v6, QFa.v.J(), (int)c2, (int)(b2 + vRa.d), (int)h2, (Xv)e2);
                wv_33.f((Gg)v6, QFa.v.J(), (int)c2, (int)(b2 + uqa.g), (int)h2, (Xv)e2);
                wv_33.f((Gg)g2, QFa.v.J(), (int)(c2 + vRa.d), (int)(b2 + uqa.g), (int)h2, (Xv)e2);
                a2.f((Gg)v4, QFa.v.J(), (int)(c2 + uqa.g), (int)(b2 + uqa.g), (int)h2, (Xv)e2);
                wv_32.f((Gg)v4, QFa.v.J(), (int)(c2 + uqa.g), (int)(b2 + vRa.d), (int)h2, (Xv)e2);
                wv_32.f((Gg)g2, QFa.v.J(), (int)(c2 + uqa.g), (int)b2, (int)h2, (Xv)e2);
                wv_3.f((Gg)v2, QFa.UB.J(), (int)(c2 + vRa.d), (int)b2, (int)h2, (Xv)e2);
                wv_3.f((Gg)v2, QFa.UB.J(Yqa.i), (int)(c2 + vRa.d), (int)(b2 + vRa.d), (int)h2, (Xv)e2);
                return;
            }
            case 3: {
                Wv_3 wv_3 = a2;
                void v8 = g2;
                Wv_3 wv_34 = a2;
                void v10 = g2;
                Wv_3 wv_35 = a2;
                void v12 = g2;
                a2.f((Gg)g2, QFa.HF.J(), (int)(c2 + vRa.d), (int)b2, (int)h2, (Xv)e2);
                a2.f((Gg)v12, QFa.HF.J(), (int)(c2 + vRa.d), (int)(b2 + vRa.d), (int)h2, (Xv)e2);
                wv_35.f((Gg)v12, QFa.u.J(), (int)c2, (int)b2, (int)h2, (Xv)e2);
                wv_35.f((Gg)g2, QFa.u.J(), (int)c2, (int)(b2 + vRa.d), (int)h2, (Xv)e2);
                a2.f((Gg)v10, QFa.u.J(), (int)c2, (int)(b2 + uqa.g), (int)h2, (Xv)e2);
                wv_34.f((Gg)v10, QFa.u.J(), (int)(c2 + vRa.d), (int)(b2 + uqa.g), (int)h2, (Xv)e2);
                wv_34.f((Gg)g2, QFa.u.J(), (int)(c2 + uqa.g), (int)(b2 + uqa.g), (int)h2, (Xv)e2);
                wv_3.f((Gg)v8, QFa.u.J(), (int)(c2 + uqa.g), (int)(b2 + vRa.d), (int)h2, (Xv)e2);
                wv_3.f((Gg)v8, QFa.u.J(), (int)(c2 + uqa.g), (int)b2, (int)h2, (Xv)e2);
                return;
            }
            case 4: 
        }
        Wv_3 wv_3 = a2;
        void v14 = g2;
        Wv_3 wv_36 = a2;
        void v16 = g2;
        Wv_3 wv_37 = a2;
        void v18 = g2;
        Wv_3 wv_38 = a2;
        void v20 = g2;
        a2.f((Gg)v20, QFa.v.J(), (int)c2, (int)b2, (int)h2, (Xv)e2);
        wv_38.f((Gg)v20, QFa.v.J(), (int)c2, (int)(b2 + vRa.d), (int)h2, (Xv)e2);
        wv_38.f((Gg)g2, QFa.v.J(), (int)c2, (int)(b2 + uqa.g), (int)h2, (Xv)e2);
        a2.f((Gg)v18, QFa.v.J(), (int)(c2 + vRa.d), (int)(b2 + uqa.g), (int)h2, (Xv)e2);
        wv_37.f((Gg)v18, QFa.v.J(), (int)(c2 + uqa.g), (int)(b2 + uqa.g), (int)h2, (Xv)e2);
        wv_37.f((Gg)g2, QFa.v.J(), (int)(c2 + uqa.g), (int)(b2 + vRa.d), (int)h2, (Xv)e2);
        a2.f((Gg)v16, QFa.v.J(), (int)(c2 + uqa.g), (int)b2, (int)h2, (Xv)e2);
        wv_36.f((Gg)v16, QFa.oC.J(), (int)(c2 + vRa.d), (int)b2, (int)h2, (Xv)e2);
        wv_36.f((Gg)g2, QFa.oC.J(Yqa.i), (int)(c2 + vRa.d), (int)(b2 + vRa.d), (int)h2, (Xv)e2);
        wv_3.f((Gg)v14, QFa.Hd.J(a2.J(QFa.Hd, AQa.P)), (int)(c2 + uqa.g), (int)(b2 + vRa.d), (int)(h2 + vRa.d), (Xv)e2);
        wv_3.f((Gg)v14, QFa.Hd.J(a2.J(QFa.Hd, yRa.d)), (int)(c2 + uqa.g), (int)(b2 + vRa.d), (int)(h2 - vRa.d), (Xv)e2);
    }

    public Wv_3() {
        Wv_3 a2;
        a2.field_143013_d = nw.OPENING;
    }

    public Wv_3(int n2) {
        int b2 = n2;
        Wv_3 a2 = this;
        super(b2);
        a2.field_143013_d = nw.OPENING;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU f(lW lW2, List<uU> list, Random random, int n2, int n3) {
        int n4 = n3;
        Wv_3 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (TV.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 4: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX + b2, a2.boundingBox.minY + f2, a2.boundingBox.minZ - vRa.d, a2.coordBaseMode, a2.J());
                }
                case 1: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX + b2, a2.boundingBox.minY + f2, a2.boundingBox.maxZ + vRa.d, a2.coordBaseMode, a2.J());
                }
                case 2: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX - vRa.d, a2.boundingBox.minY + f2, a2.boundingBox.minZ + b2, a2.coordBaseMode, a2.J());
                }
                case 3: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + f2, a2.boundingBox.minZ + b2, a2.coordBaseMode, a2.J());
                }
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public uU J(lW lW2, List<uU> list, Random random, int n2, int n3) {
        int n4 = n3;
        Wv_3 a2 = this;
        if (a2.coordBaseMode != null) {
            switch (TV.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
                case 4: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.EAST, a2.J());
                }
                case 1: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.maxX + vRa.d, a2.boundingBox.minY + b2, a2.boundingBox.minZ + f2, DZ.EAST, a2.J());
                }
                case 2: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.maxZ + vRa.d, DZ.SOUTH, a2.J());
                }
                case 3: {
                    void f2;
                    void b2;
                    void c2;
                    void d2;
                    void e2;
                    return LV.f((lW)e2, (List)d2, (Random)c2, a2.boundingBox.minX + f2, a2.boundingBox.minY + b2, a2.boundingBox.maxZ + vRa.d, DZ.SOUTH, a2.J());
                }
            }
        }
        return null;
    }

    public nw J(Random random) {
        Random b2 = random;
        Wv_3 a2 = this;
        switch (b2.nextInt(tTa.h)) {
            default: {
                return nw.OPENING;
            }
            case 2: {
                while (false) {
                }
                return nw.WOOD_DOOR;
            }
            case 3: {
                return nw.GRATES;
            }
            case 4: {
                return nw.IRON_DOOR;
            }
        }
    }
}

