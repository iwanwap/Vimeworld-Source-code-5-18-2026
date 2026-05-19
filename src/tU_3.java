/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NCa
 *  Nw
 *  QFa
 *  Waa
 *  XTa
 *  Xv
 *  pPa
 *  vRa
 *  vpa
 *  waa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class tU_3
extends uU {
    private List<Xv> roomsLinkedToTheRoom;

    public tU_3() {
        tU_3 a2;
        a2.roomsLinkedToTheRoom = Lists.newLinkedList();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4) {
        Object d2;
        void a2;
        void b2;
        void c2;
        tU_3 tU_32;
        tU_3 tU_33 = tU_32 = this;
        super.J((int)c2, (int)b2, (int)a2);
        Object object = d2 = tU_33.roomsLinkedToTheRoom.iterator();
        while (object.hasNext()) {
            ((Xv)d2.next()).J((int)c2, (int)b2, (int)a2);
            object = d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, Random random, Xv xv2) {
        Iterator<Xv> b2;
        void c2;
        tU_3 a2 = this;
        tU_3 d2 = xv2;
        if (a2.J((Gg)c2, (Xv)d2)) {
            return uSa.E != 0;
        }
        tU_3 tU_32 = a2;
        tU_32.J((Gg)c2, (Xv)d2, a2.boundingBox.minX, a2.boundingBox.minY, a2.boundingBox.minZ, a2.boundingBox.maxX, a2.boundingBox.minY, a2.boundingBox.maxZ, QFa.Bc.J(), QFa.HF.J(), vRa.d != 0);
        tU_32.J((Gg)c2, (Xv)d2, a2.boundingBox.minX, a2.boundingBox.minY + vRa.d, a2.boundingBox.minZ, a2.boundingBox.maxX, Math.min(a2.boundingBox.minY + yRa.d, a2.boundingBox.maxY), a2.boundingBox.maxZ, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        Iterator<Xv> iterator = b2 = a2.roomsLinkedToTheRoom.iterator();
        while (iterator.hasNext()) {
            Xv xv3 = b2.next();
            iterator = b2;
            Xv xv4 = xv3;
            Xv xv5 = xv3;
            Xv xv6 = xv3;
            a2.J((Gg)c2, (Xv)d2, xv4.minX, xv4.maxY - uqa.g, xv5.minZ, xv5.maxX, xv6.maxY, xv6.maxZ, QFa.HF.J(), QFa.HF.J(), uSa.E != 0);
        }
        a2.J((Gg)c2, (Xv)d2, a2.boundingBox.minX, a2.boundingBox.minY + AQa.P, a2.boundingBox.minZ, a2.boundingBox.maxX, a2.boundingBox.maxY, a2.boundingBox.maxZ, QFa.HF.J(), uSa.E != 0);
        return vRa.d != 0;
    }

    @Override
    public void J(Waa waa2) {
        int n2;
        tU_3 b2 = waa2;
        tU_3 a2 = this;
        b2 = b2.J(Fua.f, pPa.f);
        int n3 = n2 = uSa.E;
        while (n3 < b2.J()) {
            a2.roomsLinkedToTheRoom.add(new Xv(b2.J(n2++)));
            n3 = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(uU uU2, List<uU> list, Random random) {
        Xv xv2;
        uU uU3;
        void b2;
        void c2;
        void a2;
        int d2;
        tU_3 tU_32;
        tU_3 tU_33 = tU_32 = this;
        int n2 = tU_33.J();
        int n3 = tU_33.boundingBox.f() - yRa.d - vRa.d;
        if (n3 <= 0) {
            n3 = vRa.d;
        }
        int n4 = d2 = uSa.E;
        while (n4 < tU_32.boundingBox.J() && (d2 += a2.nextInt(tU_32.boundingBox.J())) + yRa.d <= tU_32.boundingBox.J()) {
            void v2 = a2;
            uU3 = Nw.f((uU)c2, (List)b2, (Random)v2, (int)(tU_32.boundingBox.minX + d2), (int)(tU_32.boundingBox.minY + v2.nextInt(n3) + vRa.d), (int)(tU_32.boundingBox.minZ - vRa.d), (DZ)DZ.NORTH, (int)n2);
            if (uU3 != null) {
                Xv xv3 = xv2 = uU3.J();
                Xv xv4 = xv2;
                tU_32.roomsLinkedToTheRoom.add(new Xv(xv3.minX, xv3.minY, tU_32.boundingBox.minZ, xv4.maxX, xv4.maxY, tU_32.boundingBox.minZ + vRa.d));
            }
            n4 = d2 = d2 + AQa.P;
        }
        int n5 = d2 = uSa.E;
        while (n5 < tU_32.boundingBox.J() && (d2 += a2.nextInt(tU_32.boundingBox.J())) + yRa.d <= tU_32.boundingBox.J()) {
            void v6 = a2;
            uU3 = Nw.f((uU)c2, (List)b2, (Random)v6, (int)(tU_32.boundingBox.minX + d2), (int)(tU_32.boundingBox.minY + v6.nextInt(n3) + vRa.d), (int)(tU_32.boundingBox.maxZ + vRa.d), (DZ)DZ.SOUTH, (int)n2);
            if (uU3 != null) {
                Xv xv5 = xv2 = uU3.J();
                Xv xv6 = xv2;
                tU_32.roomsLinkedToTheRoom.add(new Xv(xv5.minX, xv5.minY, tU_32.boundingBox.maxZ - vRa.d, xv6.maxX, xv6.maxY, tU_32.boundingBox.maxZ));
            }
            n5 = d2 = d2 + AQa.P;
        }
        int n6 = d2 = uSa.E;
        while (n6 < tU_32.boundingBox.l() && (d2 += a2.nextInt(tU_32.boundingBox.l())) + yRa.d <= tU_32.boundingBox.l()) {
            void v10 = a2;
            uU3 = Nw.f((uU)c2, (List)b2, (Random)v10, (int)(tU_32.boundingBox.minX - vRa.d), (int)(tU_32.boundingBox.minY + v10.nextInt(n3) + vRa.d), (int)(tU_32.boundingBox.minZ + d2), (DZ)DZ.WEST, (int)n2);
            if (uU3 != null) {
                Xv xv7 = xv2 = uU3.J();
                Xv xv8 = xv2;
                tU_32.roomsLinkedToTheRoom.add(new Xv(tU_32.boundingBox.minX, xv7.minY, xv7.minZ, tU_32.boundingBox.minX + vRa.d, xv8.maxY, xv8.maxZ));
            }
            n6 = d2 = d2 + AQa.P;
        }
        int n7 = d2 = uSa.E;
        while (n7 < tU_32.boundingBox.l()) {
            if ((d2 += a2.nextInt(tU_32.boundingBox.l())) + yRa.d > tU_32.boundingBox.l()) {
                return;
            }
            void v14 = a2;
            uU3 = Nw.f((uU)c2, (List)b2, (Random)v14, (int)(tU_32.boundingBox.maxX + vRa.d), (int)(tU_32.boundingBox.minY + v14.nextInt(n3) + vRa.d), (int)(tU_32.boundingBox.minZ + d2), (DZ)DZ.EAST, (int)n2);
            if (uU3 != null) {
                Xv xv9 = xv2 = uU3.J();
                Xv xv10 = xv2;
                tU_32.roomsLinkedToTheRoom.add(new Xv(tU_32.boundingBox.maxX - vRa.d, xv9.minY, xv9.minZ, tU_32.boundingBox.maxX, xv10.maxY, xv10.maxZ));
            }
            n7 = d2 = d2 + AQa.P;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Waa waa2) {
        void a2;
        Object b2;
        tU_3 tU_32 = this;
        waa waa3 = new waa();
        Object object = b2 = tU_32.roomsLinkedToTheRoom.iterator();
        while (object.hasNext()) {
            Xv xv2 = (Xv)b2.next();
            object = b2;
            waa3.J((NCa)xv2.J());
        }
        a2.J(Fua.f, (NCa)waa3);
    }

    /*
     * WARNING - void declaration
     */
    public tU_3(int n2, Random random, int n3, int n4) {
        void a2;
        void b2;
        void d2;
        Random e2 = random;
        tU_3 c2 = this;
        super((int)d2);
        c2.roomsLinkedToTheRoom = Lists.newLinkedList();
        tU_3 tU_32 = c2;
        void v1 = b2;
        tU_32.boundingBox = new Xv((int)v1, vpa.o, (int)a2, (int)(v1 + XTa.W + e2.nextInt(uua.p)), GPa.C + e2.nextInt(uua.p), (int)(a2 + XTa.W + e2.nextInt(uua.p)));
    }
}

