/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Nw
 *  QFa
 *  Waa
 *  XTa
 *  Xv
 *  lx
 *  vRa
 */
import java.util.List;
import java.util.Random;

public final class EV_2
extends uU {
    @Override
    public void f(Waa object) {
        EV_2 b2 = object;
        object = this;
    }

    public EV_2() {
        EV_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, Random random, Xv xv2) {
        void a2;
        void c2;
        Random d2 = random;
        Object b2 = this;
        if (((uU)b2).J((Gg)c2, (Xv)a2)) {
            return uSa.E != 0;
        }
        void v0 = c2;
        ((uU)b2).J((Gg)v0, (Xv)a2, uSa.E, tTa.h, uSa.E, uqa.g, XTa.W, vRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        ((uU)b2).J((Gg)v0, (Xv)a2, uSa.E, uSa.E, XTa.W, uqa.g, uqa.g, Yqa.i, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        int n2 = d2 = uSa.E;
        while (n2 < tTa.h) {
            int n3 = tTa.h - d2 - (d2 < AQa.P ? vRa.d : uSa.E);
            int n4 = uqa.g + d2;
            int n5 = XTa.W - d2;
            int n6 = uqa.g + d2;
            ((uU)b2).J((Gg)c2, (Xv)a2, uSa.E, n3, n4, uqa.g, n5, n6, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            n2 = ++d2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Xv J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2) {
        List<uU> list2;
        void a2;
        void b2;
        void c2;
        void d2;
        Object f2 = random;
        List<uU> e2 = list;
        void v0 = d2;
        f2 = new Xv((int)v0, (int)(c2 - tTa.h), (int)b2, (int)v0, (int)(c2 + uqa.g), (int)b2);
        switch (lx.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                ((Xv)f2).maxX = d2 + uqa.g;
                ((Xv)f2).minZ = b2 - Yqa.i;
                list2 = e2;
                break;
            }
            case 2: {
                ((Xv)f2).maxX = d2 + uqa.g;
                ((Xv)f2).maxZ = b2 + Yqa.i;
                list2 = e2;
                break;
            }
            case 3: {
                ((Xv)f2).minX = d2 - Yqa.i;
                ((Xv)f2).maxZ = b2 + uqa.g;
                list2 = e2;
                break;
            }
            case 4: {
                ((Xv)f2).maxX = d2 + Yqa.i;
                ((Xv)f2).maxZ = b2 + uqa.g;
            }
            default: {
                list2 = e2;
            }
        }
        if (uU.J(list2, (Xv)f2) != null) {
            return null;
        }
        return f2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void J(uU uU2, List<uU> list, Random random) {
        EV_2 eV_2;
        EV_2 eV_22 = eV_2 = this;
        int d2 = eV_22.J();
        if (eV_22.coordBaseMode == null) return;
        switch (lx.$SwitchMap$net$minecraft$util$EnumFacing[eV_2.coordBaseMode.ordinal()]) {
            case 1: {
                void a2;
                void b2;
                void c2;
                Nw.f((uU)c2, (List)b2, (Random)a2, (int)eV_2.boundingBox.minX, (int)eV_2.boundingBox.minY, (int)(eV_2.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)d2);
                return;
            }
            case 2: {
                void a2;
                void b2;
                void c2;
                Nw.f((uU)c2, (List)b2, (Random)a2, (int)eV_2.boundingBox.minX, (int)eV_2.boundingBox.minY, (int)(eV_2.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)d2);
                return;
            }
            case 3: {
                void a2;
                void b2;
                void c2;
                Nw.f((uU)c2, (List)b2, (Random)a2, (int)(eV_2.boundingBox.minX - vRa.d), (int)eV_2.boundingBox.minY, (int)eV_2.boundingBox.minZ, (DZ)DZ.WEST, (int)d2);
                return;
            }
            case 4: {
                void a2;
                void b2;
                void c2;
                Nw.f((uU)c2, (List)b2, (Random)a2, (int)(eV_2.boundingBox.maxX + vRa.d), (int)eV_2.boundingBox.minY, (int)eV_2.boundingBox.minZ, (DZ)DZ.EAST, (int)d2);
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public EV_2(int n2, Random random, Xv xv2, DZ dZ2) {
        void b2;
        Object e2;
        void d2;
        EV_2 a2;
        EV_2 eV_2 = object;
        Object object = dZ2;
        EV_2 eV_22 = a2 = eV_2;
        super((int)d2);
        eV_22.coordBaseMode = e2;
        eV_22.boundingBox = b2;
    }

    @Override
    public void J(Waa object) {
        EV_2 b2 = object;
        object = this;
    }
}

