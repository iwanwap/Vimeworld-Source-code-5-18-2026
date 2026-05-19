/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  DEa
 *  JPa
 *  JTa
 *  Ppa
 *  WSa
 *  Xq
 *  Yp
 *  Ypa
 *  ZQ
 *  dQa
 *  k
 *  lPa
 *  vP
 *  vQa
 *  vRa
 *  wPa
 *  wra
 *  xh
 *  yra
 *  zTa
 */
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;

public final class fr
extends Bp {
    private final Cache<String, List<DEa<String, b>>> k;
    private int j;
    private long J;
    private final P A;
    private final List<Yp> I;

    @Override
    public float d() {
        fr a2;
        fr fr2 = a2;
        fr2.A();
        return fr2.j * a2.I.size();
    }

    @Override
    public void J(long l2) {
        fr fr2;
        fr fr3 = fr2 = this;
        fr3.A();
        fr3.o += dQa.Ga;
        Iterator<Yp> a2 = fr3.I.iterator();
        while (a2.hasNext()) {
            ZQ[] zQArray = a2.next().I;
            int n2 = a2.next().I.length;
            int n3 = uSa.E;
            while (n3 < n2) {
                int b2;
                ZQ zQ2;
                ZQ zQ3 = zQ2 = zQArray[b2];
                ZQ zQ4 = zQ2;
                fr2.A.J(zQ3.j, zQ3.A, zQ4.M, zQ4.I, uSa.E != 0);
                n3 = ++b2;
            }
        }
    }

    @Override
    public float e() {
        fr a2;
        return a2.s.J();
    }

    private void A() {
        fr fr2;
        fr fr3;
        fr fr4 = this;
        if (fr4.J == OT.e) {
            return;
        }
        fr4.J = OT.e;
        fr4.I.clear();
        Bp a22 = OT.i.k.J();
        if (a22 == null) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = xra.s;
            fr4.I.add(new Yp(objectArray));
            return;
        }
        Object object = new StringBuilder(WSa.f);
        Object object2 = a22.s;
        Object object3 = object2;
        while (object3 instanceof Bp) {
            ((StringBuilder)object).insert(vRa.d, (String)((Bp)object2).I + WSa.f);
            object3 = ((Bp)object2).s;
        }
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = zTa.Q;
        objectArray[vRa.d] = object;
        fr4.I.add(new Yp(objectArray));
        Object[] objectArray2 = new Object[uqa.g];
        objectArray2[uSa.E] = lPa.V;
        objectArray2[vRa.d] = a22.I;
        fr4.I.add(new Yp(objectArray2));
        Object[] objectArray3 = new Object[uqa.g];
        objectArray3[uSa.E] = JTa.Ga;
        objectArray3[vRa.d] = new ZQ(a22.getClass().getSimpleName()).J(vP.J((Bp)a22));
        fr4.I.add(new Yp(objectArray3));
        fr fr5 = fr4;
        if (a22.v != null) {
            Object[] objectArray4 = new Object[uqa.g];
            objectArray4[uSa.E] = Ypa.la;
            objectArray4[vRa.d] = a22.v.A;
            fr5.I.add(new Yp(objectArray4));
            fr3 = fr4;
        } else {
            Object[] objectArray5 = new Object[uqa.g];
            objectArray5[uSa.E] = wPa.Ga;
            objectArray5[vRa.d] = a22.c.name();
            fr5.I.add(new Yp(objectArray5));
            fr3 = fr4;
        }
        Object[] objectArray6 = new Object[uqa.g];
        objectArray6[uSa.E] = JPa.ca;
        objectArray6[vRa.d] = new StringBuilder().insert(3 ^ 3, yra.Ka).append(StringUtils.leftPad(Integer.toHexString(a22.x.J()), Yqa.i, GPa.J)).toString();
        fr3.I.add(new Yp(objectArray6));
        Object[] objectArray7 = new Object[AQa.P];
        objectArray7[uSa.E] = sqa.R;
        Bp bp = a22;
        objectArray7[vRa.d] = fr4.J(bp, bp.d);
        objectArray7[uqa.g] = lQa.Q;
        Bp bp2 = a22;
        objectArray7[yRa.d] = fr4.J(bp2, bp2.b);
        fr4.I.add(new Yp(objectArray7));
        if (a22 instanceof nP) {
            object = (nP)a22;
            Object[] objectArray8 = new Object[AQa.P];
            objectArray8[uSa.E] = Upa.K;
            objectArray8[vRa.d] = fr4.J(a22, ((nP)object).M);
            objectArray8[uqa.g] = lQa.Q;
            objectArray8[yRa.d] = fr4.J(a22, ((nP)object).i);
            fr4.I.add(new Yp(objectArray8));
            fr2 = fr4;
        } else {
            Object[] objectArray9 = new Object[uqa.g];
            objectArray9[uSa.E] = Upa.K;
            objectArray9[vRa.d] = a22.J() + lQa.Q + a22.f();
            fr4.I.add(new Yp(objectArray9));
            fr2 = fr4;
        }
        Object[] objectArray10 = new Object[AQa.P];
        objectArray10[uSa.E] = Ira.S;
        Bp bp3 = a22;
        objectArray10[vRa.d] = fr4.J(bp3, bp3.k);
        objectArray10[uqa.g] = lQa.Q;
        Bp bp4 = a22;
        objectArray10[yRa.d] = fr4.J(bp4, bp4.J);
        fr2.I.add(new Yp(objectArray10));
        if (a22.C.f() != JPa.N) {
            Object[] objectArray11 = new Object[uqa.g];
            objectArray11[uSa.E] = Tqa.n;
            Bp bp5 = a22;
            objectArray11[vRa.d] = fr4.J(bp5, (kL)bp5.C);
            fr4.I.add(new Yp(objectArray11));
        }
        int n2 = wra.P;
        int a22 = uSa.E;
        object2 = fr4.I.iterator();
        Iterator<Object> iterator = object2;
        while (iterator.hasNext()) {
            Yp yp = (Yp)object2.next();
            int n3 = uSa.E;
            int n4 = uSa.E;
            while (n4 < yp.I.length) {
                int n5;
                ZQ zQ2;
                ZQ zQ3 = zQ2 = yp.I[n5];
                zQ3.A = n3;
                zQ3.M = a22;
                zQ2.J = fr4.A.f(zQ2.j);
                int n6 = n3;
                n3 = n5 == 0 ? n6 + n2 : n6 + zQ2.J;
                n4 = ++n5;
            }
            yp.A = a22;
            a22 += fr4.j;
            iterator = object2;
        }
    }

    public static /* synthetic */ List J(xh a2) throws Exception {
        return RJ.M.J(a2.J(), a2.J());
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(int var1_1, int var2_2, long var3_3) {
        v0 = var8_5 = this;
        super.J((int)c, (int)b, (long)a);
        if (v0.e) {
            a = var8_5.I.iterator();
            block0: while (true) {
                v1 = a;
                while (v1.hasNext()) {
                    var4_6 = a.next();
                    if (b < var4_6.A) continue block0;
                    if (b >= var4_6.A + var8_5.j) {
                        v1 = a;
                        continue;
                    }
                    var5_7 = var4_6.I;
                    var6_8 = var4_6.I.length;
                    v2 = uSa.E;
                    while (true) {
                        if (v2 < var6_8) ** break;
                        continue block0;
                        d = var5_7[var7_9];
                        if (d.k != null && c >= d.A) {
                            v3 = d;
                            if (c < v3.A + v3.J && b >= d.M && b < d.M + var8_5.j) {
                                OT.i.F.J(d.k);
                                return;
                            }
                        }
                        v2 = ++var7_9;
                    }
                }
                break;
            }
        }
    }

    @Override
    public void f() {
        fr a2;
        fr fr2 = a2;
        super.f();
        fr2.j = fr2.A.J(Mqa.y);
    }

    /*
     * WARNING - void declaration
     */
    private ZQ J(Bp bp, kL kL2) {
        Object c2 = kL2;
        fr a2 = this;
        ZQ zQ2 = new ZQ(((kL)c2).f() + Mqa.y);
        if (((kL)c2).J() instanceof xh) {
            zQ2.I = Ata.M;
            c2 = (xh)((kL)c2).J();
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add(WOa.Ka + c2.J());
            try {
                List<DEa<String, b>> list = a2.k.get(new StringBuilder().insert(3 >> 2, c2.J()).append(UOa.t).append(c2.J()).toString(), Xq.J((xh)c2));
                for (DEa<String, b> dEa : list) {
                    void b2;
                    arrayList.add((String)dEa.J() + Ppa.B + RJ.M.J((b)dEa.f(), (Bp)b2));
                }
            }
            catch (ExecutionException executionException) {
                OT.b.warn(new StringBuilder().insert(3 ^ 3, vQa.ga).append(c2.J()).toString(), (Throwable)executionException);
            }
            zQ2.k = arrayList.toArray(new String[uSa.E]);
        }
        return zQ2;
    }

    /*
     * WARNING - void declaration
     */
    public fr(k k2, String string) {
        void b2;
        fr a2;
        String c2 = string;
        fr fr2 = a2 = this;
        super((k)b2, c2);
        fr2.k = CacheBuilder.newBuilder().expireAfterAccess(dQa.Ga, TimeUnit.SECONDS).maximumSize(WSa.Ia).build();
        fr fr3 = a2;
        fr3.I = new ArrayList<Yp>();
        fr2.j = vRa.d;
        fr2.A = new Eh();
        fr2.f();
    }
}

