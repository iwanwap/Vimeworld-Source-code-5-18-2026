/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HA
 *  Mda
 *  dZ
 *  dz
 *  eAa
 *  oX
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class baa
extends oX {
    private Mda J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public static void J(Random random, List<baa> list, dz dz2, int n2) {
        void a2;
        int n3;
        Random random2 = random;
        int n4 = n3 = uSa.E;
        while (n4 < a2) {
            void b2;
            void c2;
            baa baa2;
            baa baa3 = baa2 = (baa)dZ.J((Random)random2, (Collection)c2);
            int n5 = baa2.A + random2.nextInt(baa3.I - baa2.A + vRa.d);
            if (baa3.J.e() >= n5) {
                Random d2 = baa2.J.J();
                ((Mda)d2).E = n5;
                void v2 = b2;
                v2.J(random2.nextInt(v2.f()), (Mda)d2);
            } else {
                int n6 = uSa.E;
                while (n6 < n5) {
                    int d2;
                    Mda mda2 = baa2.J.J();
                    mda2.E = vRa.d;
                    void v4 = b2;
                    v4.J(random2.nextInt(v4.f()), mda2);
                    n6 = ++d2;
                }
            }
            n4 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public baa(Mda mda2, int n2, int n3, int n4) {
        void b2;
        void c2;
        void d2;
        void e2;
        baa a2;
        int n5 = n4;
        baa baa2 = a2 = this;
        super((int)e2);
        a2.J = d2;
        baa2.A = c2;
        baa2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Random random, List<baa> list, HA hA2, int n2) {
        void a2;
        int n3;
        Random random2 = random;
        int n4 = n3 = uSa.E;
        while (n4 < a2) {
            void b2;
            void c2;
            baa baa2;
            baa baa3 = baa2 = (baa)dZ.J((Random)random2, (Collection)c2);
            int n5 = baa2.A + random2.nextInt(baa3.I - baa2.A + vRa.d);
            if (baa3.J.e() >= n5) {
                Random d2 = baa2.J.J();
                ((Mda)d2).E = n5;
                void v2 = b2;
                v2.J(random2.nextInt(v2.f()), (Mda)d2);
            } else {
                int n6 = uSa.E;
                while (n6 < n5) {
                    int d2;
                    Mda mda2 = baa2.J.J();
                    mda2.E = vRa.d;
                    void v4 = b2;
                    v4.J(random2.nextInt(v4.f()), mda2);
                    n6 = ++d2;
                }
            }
            n4 = ++n3;
        }
    }

    public static List<baa> J(List<baa> list, baa ... baaArray) {
        baa[] b2 = baaArray;
        List<baa> a2 = list;
        ArrayList<baa> arrayList = Lists.newArrayList(a2);
        Collections.addAll(arrayList, b2);
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public baa(eAa eAa2, int n2, int n3, int n4, int n5) {
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        baa a2;
        int n6 = n5;
        baa baa2 = a2 = this;
        super((int)f2);
        baa baa3 = a2;
        baa3.J = new Mda((eAa)e2, vRa.d, (int)d2);
        baa2.A = c2;
        baa2.I = b2;
    }
}

