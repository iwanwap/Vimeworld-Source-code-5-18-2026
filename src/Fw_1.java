/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Nw
 *  QFa
 *  Waa
 *  Wsa
 *  Xv
 *  dpa
 *  lx
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.material.Material;

public final class Fw_1
extends uU {
    private DZ corridorDirection;
    private boolean isMultipleFloors;

    public Fw_1() {
        Fw_1 a2;
    }

    @Override
    public void J(Waa waa2) {
        Fw_1 a2;
        Fw_1 b2 = waa2;
        Fw_1 fw_1 = a2 = this;
        fw_1.isMultipleFloors = b2.f(Wsa.d);
        fw_1.corridorDirection = DZ.getHorizontal(b2.J(dpa.ga));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, Random random, Xv xv2) {
        int b2;
        Fw_1 fw_1;
        void c2;
        Fw_1 a2 = this;
        Fw_1 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        if (a2.isMultipleFloors) {
            Fw_1 fw_12 = a2;
            fw_1 = fw_12;
            void v2 = c2;
            Fw_1 fw_13 = d2;
            Fw_1 fw_14 = a2;
            fw_14.J((Gg)c2, (Xv)d2, fw_14.boundingBox.minX + vRa.d, a2.boundingBox.minY, a2.boundingBox.minZ, a2.boundingBox.maxX - vRa.d, a2.boundingBox.minY + yRa.d - vRa.d, a2.boundingBox.maxZ, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            a2.J((Gg)c2, (Xv)fw_13, a2.boundingBox.minX, a2.boundingBox.minY, a2.boundingBox.minZ + vRa.d, a2.boundingBox.maxX, a2.boundingBox.minY + yRa.d - vRa.d, a2.boundingBox.maxZ - vRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            a2.J((Gg)v2, (Xv)fw_13, a2.boundingBox.minX + vRa.d, a2.boundingBox.maxY - uqa.g, a2.boundingBox.minZ, a2.boundingBox.maxX - vRa.d, a2.boundingBox.maxY, a2.boundingBox.maxZ, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            fw_12.J((Gg)v2, (Xv)d2, a2.boundingBox.minX, a2.boundingBox.maxY - uqa.g, a2.boundingBox.minZ + vRa.d, a2.boundingBox.maxX, a2.boundingBox.maxY, a2.boundingBox.maxZ - vRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            fw_12.J((Gg)c2, (Xv)d2, a2.boundingBox.minX + vRa.d, a2.boundingBox.minY + yRa.d, a2.boundingBox.minZ + vRa.d, a2.boundingBox.maxX - vRa.d, a2.boundingBox.minY + yRa.d, a2.boundingBox.maxZ - vRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        } else {
            fw_1 = a2;
            Fw_1 fw_15 = a2;
            fw_15.J((Gg)c2, (Xv)d2, a2.boundingBox.minX + vRa.d, a2.boundingBox.minY, a2.boundingBox.minZ, a2.boundingBox.maxX - vRa.d, a2.boundingBox.maxY, a2.boundingBox.maxZ, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
            fw_15.J((Gg)c2, (Xv)d2, a2.boundingBox.minX, a2.boundingBox.minY, a2.boundingBox.minZ + vRa.d, a2.boundingBox.maxX, a2.boundingBox.maxY, a2.boundingBox.maxZ - vRa.d, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        fw_1.J((Gg)c2, (Xv)d2, a2.boundingBox.minX + vRa.d, a2.boundingBox.minY, a2.boundingBox.minZ + vRa.d, a2.boundingBox.minX + vRa.d, a2.boundingBox.maxY, a2.boundingBox.minZ + vRa.d, QFa.L.J(), QFa.HF.J(), uSa.E != 0);
        Fw_1 fw_16 = a2;
        void v7 = c2;
        a2.J((Gg)v7, (Xv)d2, a2.boundingBox.minX + vRa.d, a2.boundingBox.minY, a2.boundingBox.maxZ - vRa.d, a2.boundingBox.minX + vRa.d, a2.boundingBox.maxY, a2.boundingBox.maxZ - vRa.d, QFa.L.J(), QFa.HF.J(), uSa.E != 0);
        fw_16.J((Gg)v7, (Xv)d2, a2.boundingBox.maxX - vRa.d, a2.boundingBox.minY, a2.boundingBox.minZ + vRa.d, a2.boundingBox.maxX - vRa.d, a2.boundingBox.maxY, a2.boundingBox.minZ + vRa.d, QFa.L.J(), QFa.HF.J(), uSa.E != 0);
        fw_16.J((Gg)c2, (Xv)d2, a2.boundingBox.maxX - vRa.d, a2.boundingBox.minY, a2.boundingBox.maxZ - vRa.d, a2.boundingBox.maxX - vRa.d, a2.boundingBox.maxY, a2.boundingBox.maxZ - vRa.d, QFa.L.J(), QFa.HF.J(), uSa.E != 0);
        int n2 = b2 = fw_16.boundingBox.minX;
        while (n2 <= a2.boundingBox.maxX) {
            int n3 = a2.boundingBox.minZ;
            while (n3 <= a2.boundingBox.maxZ) {
                int n4;
                Fw_1 fw_17 = a2;
                if (fw_17.J((Gg)c2, b2, fw_17.boundingBox.minY - vRa.d, n4, (Xv)d2).J().J() == Material.air) {
                    a2.f((Gg)c2, QFa.L.J(), b2, a2.boundingBox.minY - vRa.d, n4, (Xv)d2);
                }
                n3 = ++n4;
            }
            n2 = ++b2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void J(uU uU2, List<uU> list, Random random) {
        Fw_1 fw_1;
        void b2;
        void c2;
        Random d2 = random;
        Fw_1 a2 = this;
        int n2 = a2.J();
        switch (lx.$SwitchMap$net$minecraft$util$EnumFacing[a2.corridorDirection.ordinal()]) {
            case 1: {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX - vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.WEST, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.maxX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.EAST, (int)n2);
                fw_1 = a2;
                break;
            }
            case 2: {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX - vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.WEST, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.maxX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.EAST, (int)n2);
                fw_1 = a2;
                break;
            }
            case 3: {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX - vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.WEST, (int)n2);
                fw_1 = a2;
                break;
            }
            case 4: {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)n2);
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.maxX + vRa.d), (int)a2.boundingBox.minY, (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.EAST, (int)n2);
            }
            default: {
                fw_1 = a2;
            }
        }
        if (fw_1.isMultipleFloors) {
            if (d2.nextBoolean()) {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)(a2.boundingBox.minY + yRa.d + vRa.d), (int)(a2.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)n2);
            }
            if (d2.nextBoolean()) {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX - vRa.d), (int)(a2.boundingBox.minY + yRa.d + vRa.d), (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.WEST, (int)n2);
            }
            if (d2.nextBoolean()) {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.maxX + vRa.d), (int)(a2.boundingBox.minY + yRa.d + vRa.d), (int)(a2.boundingBox.minZ + vRa.d), (DZ)DZ.EAST, (int)n2);
            }
            if (d2.nextBoolean()) {
                Nw.f((uU)c2, (List)b2, (Random)d2, (int)(a2.boundingBox.minX + vRa.d), (int)(a2.boundingBox.minY + yRa.d + vRa.d), (int)(a2.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)n2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Fw_1(int n2, Random random, Xv xv2, DZ dZ2) {
        void a2;
        void d2;
        Fw_1 b2;
        Fw_1 e2 = xv2;
        Fw_1 fw_1 = b2 = this;
        super((int)d2);
        b2.corridorDirection = a2;
        fw_1.boundingBox = e2;
        fw_1.isMultipleFloors = e2.f() > yRa.d ? vRa.d : uSa.E;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Xv J(List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2) {
        List<uU> list2;
        void a2;
        void e2;
        void b2;
        void d2;
        int f22 = n3;
        List<uU> c2 = list;
        void v0 = d2;
        Xv f22 = new Xv((int)v0, f22, (int)b2, (int)v0, f22 + uqa.g, (int)b2);
        if (e2.nextInt(AQa.P) == 0) {
            f22.maxY += AQa.P;
        }
        switch (lx.$SwitchMap$net$minecraft$util$EnumFacing[a2.ordinal()]) {
            case 1: {
                Xv xv2 = f22;
                xv2.minX = d2 - vRa.d;
                xv2.maxX = d2 + yRa.d;
                f22.minZ = b2 - AQa.P;
                list2 = c2;
                break;
            }
            case 2: {
                Xv xv3 = f22;
                xv3.minX = d2 - vRa.d;
                xv3.maxX = d2 + yRa.d;
                f22.maxZ = b2 + AQa.P;
                list2 = c2;
                break;
            }
            case 3: {
                Xv xv4 = f22;
                void v5 = b2;
                f22.minX = d2 - AQa.P;
                xv4.minZ = v5 - vRa.d;
                xv4.maxZ = v5 + yRa.d;
                list2 = c2;
                break;
            }
            case 4: {
                Xv xv5 = f22;
                void v7 = b2;
                f22.maxX = d2 + AQa.P;
                xv5.minZ = v7 - vRa.d;
                xv5.maxZ = v7 + yRa.d;
            }
            default: {
                list2 = c2;
            }
        }
        if (uU.J(list2, f22) != null) {
            return null;
        }
        return f22;
    }

    @Override
    public void f(Waa waa2) {
        Fw_1 b2 = waa2;
        Fw_1 a2 = this;
        Fw_1 fw_1 = b2;
        fw_1.J(Wsa.d, a2.isMultipleFloors);
        fw_1.J(dpa.ga, a2.corridorDirection.getHorizontalIndex());
    }
}

