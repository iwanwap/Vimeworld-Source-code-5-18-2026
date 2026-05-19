/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Baa
 *  JPa
 *  Jy
 *  Nx
 *  Oz
 *  hqa
 *  jpa
 *  kPa
 *  lPa
 *  lW
 *  tx
 *  vRa
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class PU_1
extends RU {
    private List<Jy> field_151546_e;
    private double field_82671_h;
    private int field_82672_i;
    private boolean ranBiomeCheck;
    private Baa[] structureCoords;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3) {
        int n4;
        Object object;
        PU_1 pU_1 = this;
        if (!pU_1.ranBiomeCheck) {
            int n5;
            object = new Random();
            ((Random)object).setSeed(pU_1.worldObj.J());
            double d2 = ((Random)object).nextDouble() * lQa.f * KPa.y;
            int c2 = vRa.d;
            int n6 = n5 = uSa.E;
            while (n6 < pU_1.structureCoords.length) {
                double d3 = (Qpa.Aa * (double)c2 + ((Random)object).nextDouble()) * pU_1.field_82671_h * (double)c2;
                int n7 = (int)Math.round(Math.cos(d2) * d3);
                int n8 = (int)Math.round(Math.sin(d2) * d3);
                XF xF = pU_1.worldObj.J().J((n7 << AQa.P) + Yqa.i, (n8 << AQa.P) + Yqa.i, BRa.E, pU_1.field_151546_e, (Random)object);
                if (xF != null) {
                    XF xF2 = xF;
                    n7 = xF2.getX() >> AQa.P;
                    n8 = xF2.getZ() >> AQa.P;
                }
                pU_1.structureCoords[n5] = new Baa(n7, n8);
                d2 += kPa.Z * (double)c2 / (double)pU_1.field_82672_i;
                if (n5 == pU_1.field_82672_i) {
                    c2 += uqa.g + ((Random)object).nextInt(tTa.h);
                    pU_1.field_82672_i += vRa.d + ((Random)object).nextInt(uqa.g);
                }
                n6 = ++n5;
            }
            pU_1.ranBiomeCheck = vRa.d;
        }
        object = pU_1.structureCoords;
        int n9 = pU_1.structureCoords.length;
        int n10 = n4 = uSa.E;
        while (n10 < n9) {
            void a2;
            void b2;
            PU_1 c2 = object[n4];
            if (b2 == ((Baa)c2).j && a2 == ((Baa)c2).A) {
                return vRa.d != 0;
            }
            n10 = ++n4;
        }
        return uSa.E != 0;
    }

    public PU_1() {
        int a2;
        PU_1 pU_1 = this;
        pU_1.structureCoords = new Baa[yRa.d];
        PU_1 pU_12 = pU_1;
        pU_12.field_82671_h = hqa.ha;
        pU_12.field_82672_i = yRa.d;
        pU_12.field_151546_e = Lists.newArrayList();
        Jy[] jyArray = Jy.J();
        int n2 = jyArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Jy jy = jyArray[a2];
            if (jy != null && jy.Ca > JPa.N) {
                pU_1.field_151546_e.add(jy);
            }
            n3 = ++a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Nx J(int n2, int n3) {
        void a2;
        void b2;
        PU_1 pU_1;
        PU_1 pU_12 = pU_1 = this;
        PU_1 c2 = new tx(pU_12.worldObj, pU_12.rand, (int)b2, (int)a2);
        Object object = c2;
        while (object.J().isEmpty() || ((lW)c2.J().get((int)uSa.E)).strongholdPortalRoom == null) {
            PU_1 pU_13 = pU_1;
            object = new tx(pU_13.worldObj, pU_13.rand, (int)b2, (int)a2);
        }
        return c2;
    }

    @Override
    public List<XF> J() {
        int a2;
        PU_1 pU_1 = this;
        ArrayList<XF> arrayList = Lists.newArrayList();
        Baa[] baaArray = pU_1.structureCoords;
        int n2 = pU_1.structureCoords.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Baa baa2 = baaArray[a2];
            if (baa2 != null) {
                arrayList.add(baa2.J(ysa.s));
            }
            n3 = ++a2;
        }
        return arrayList;
    }

    @Override
    public String J() {
        return zpa.d;
    }

    public PU_1(Map<String, String> map) {
        Iterator a2;
        PU_1 pU_1 = this;
        pU_1();
        for (Map.Entry b2 : a2.entrySet()) {
            if (((String)b2.getKey()).equals(tua.v)) {
                pU_1.field_82671_h = Oz.J((String)((String)b2.getValue()), (double)pU_1.field_82671_h, (double)oua.i);
                continue;
            }
            if (((String)b2.getKey()).equals(jpa.ja)) {
                pU_1.structureCoords = new Baa[Oz.J((String)((String)b2.getValue()), (int)pU_1.structureCoords.length, (int)vRa.d)];
                continue;
            }
            if (!((String)b2.getKey()).equals(lPa.ja)) continue;
            pU_1.field_82672_i = Oz.J((String)((String)b2.getValue()), (int)pU_1.field_82672_i, (int)vRa.d);
        }
    }
}

