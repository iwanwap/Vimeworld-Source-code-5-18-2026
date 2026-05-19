/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  BRa
 *  DDa
 *  DQa
 *  ERa
 *  Gg
 *  Gl
 *  I
 *  Lqa
 *  Lz
 *  MD
 *  NCa
 *  NTa
 *  OCa
 *  Oz
 *  Pqa
 *  URa
 *  WQa
 *  Waa
 *  Zy
 *  fpa
 *  hra
 *  jy
 *  kta
 *  mFa
 *  pQa
 *  vL
 *  vRa
 *  vpa
 *  wPa
 *  waa
 *  xy
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Aaa_2 {
    private List<Zy> g;
    private int L;
    private XF E;
    private final List<jy> m;
    private int C;
    private int i;
    private TreeMap<String, Integer> M;
    private int k;
    private int j;
    private int J;
    private XF A;
    private Gg I;

    private void e() {
        Aaa_2 aaa_2 = this;
        Iterator<Zy> a2 = aaa_2.g.iterator();
        while (a2.hasNext()) {
            Zy zy2 = (Zy)a2.next();
            if (zy2.I.K() && Math.abs(aaa_2.L - zy2.J) <= vpa.Ja) continue;
            a2.remove();
        }
    }

    /*
     * WARNING - void declaration
     */
    public jy l(XF xF2) {
        void a2;
        Aaa_2 aaa_2;
        Aaa_2 aaa_22 = aaa_2 = this;
        if (aaa_2.A.distanceSq((MD)a2) > (double)(aaa_22.j * aaa_22.j)) {
            return null;
        }
        for (jy b2 : aaa_2.m) {
            if (b2.f().getX() != a2.getX() || b2.f().getZ() != a2.getZ() || Math.abs(b2.f().getY() - a2.getY()) > vRa.d) continue;
            return b2;
        }
        return null;
    }

    private void d() {
        Aaa_2 aaa_2 = this;
        int n2 = uSa.E;
        int n3 = aaa_2.I.v.nextInt(vpa.o) == 0 ? vRa.d : uSa.E;
        Iterator<jy> iterator = aaa_2.m.iterator();
        while (iterator.hasNext()) {
            Aaa_2 a2 = iterator.next();
            if (n3 != 0) {
                a2.f();
            }
            if (aaa_2.f(a2.f()) && Math.abs(aaa_2.L - a2.C()) <= PRa.ga) continue;
            aaa_2.E = aaa_2.E.subtract(a2.f());
            n2 = vRa.d;
            a2.J(vRa.d != 0);
            iterator.remove();
        }
        if (n2 != 0) {
            aaa_2.l();
        }
    }

    public void J(jy jy2) {
        Aaa_2 b2 = jy2;
        Aaa_2 a2 = this;
        a2.m.add((jy)b2);
        a2.E = a2.E.add(b2.f());
        a2.l();
        a2.J = b2.C();
    }

    public int C() {
        Aaa_2 a2;
        return a2.m.size();
    }

    public void f(int n2) {
        Aaa_2 a2;
        int b22 = n2;
        Aaa_2 aaa_2 = a2 = this;
        aaa_2.L = b22;
        aaa_2.d();
        aaa_2.e();
        if (b22 % kTa.j == 0) {
            a2.J();
        }
        if (b22 % Fsa.d == 0) {
            a2.f();
        }
        Aaa_2 aaa_22 = a2;
        b22 = aaa_22.i / NTa.C;
        if (aaa_22.C < b22 && a2.m.size() > kTa.j && a2.I.v.nextInt(wPa.d) == 0) {
            Aaa_2 aaa_23 = a2;
            Lz b22 = aaa_23.J(aaa_23.A, uqa.g, AQa.P, uqa.g);
            if (b22 != null) {
                DDa dDa2 = new DDa(a2.I);
                dDa2.l(b22.A, b22.j, b22.J);
                a2.I.f((vL)dDa2);
                a2.C += vRa.d;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Sx J(Gl gl2) {
        Aaa_2 aaa_2 = this;
        double d2 = Bra.o;
        Sx sx2 = null;
        for (String b2 : aaa_2.M.keySet()) {
            double d3;
            void a2;
            if (!aaa_2.J(b2) || (b2 = aaa_2.I.J(b2)) == null) continue;
            double d4 = b2.J((vL)a2);
            if (!(d3 <= d2)) continue;
            sx2 = b2;
            d2 = d4;
        }
        return sx2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        Object b2;
        Aaa_2 aaa_2 = this;
        Object object = b2 = aaa_2.M.keySet().iterator();
        while (object.hasNext()) {
            void a2;
            String string = (String)b2.next();
            object = b2;
            aaa_2.J(string, (int)a2);
        }
    }

    public boolean f() {
        Aaa_2 a2;
        return a2.m.isEmpty();
    }

    public void C() {
        Aaa_2 a2;
        a2.k = a2.L;
    }

    public int l() {
        Aaa_2 a2;
        return a2.j;
    }

    public void J(Gg gg2) {
        Aaa_2 b2 = gg2;
        Aaa_2 a2 = this;
        a2.I = b2;
    }

    private void l() {
        Iterator<jy> iterator;
        Aaa_2 aaa_2 = this;
        int a2 = aaa_2.m.size();
        if (a2 == 0) {
            Aaa_2 aaa_22 = aaa_2;
            aaa_22.A = new XF(uSa.E, uSa.E, uSa.E);
            aaa_22.j = uSa.E;
            return;
        }
        aaa_2.A = new XF(aaa_2.E.getX() / a2, aaa_2.E.getY() / a2, aaa_2.E.getZ() / a2);
        a2 = uSa.E;
        Iterator<jy> iterator2 = iterator = aaa_2.m.iterator();
        while (iterator2.hasNext()) {
            a2 = Math.max(iterator.next().J(aaa_2.A), a2);
            iterator2 = iterator;
        }
        aaa_2.j = Math.max(fPa.i, (int)Math.sqrt(a2) + vRa.d);
    }

    public Aaa_2() {
        Aaa_2 a2;
        a2.m = Lists.newArrayList();
        a2.E = XF.ORIGIN;
        a2.A = XF.ORIGIN;
        Aaa_2 aaa_2 = a2;
        a2.M = new TreeMap();
        a2.g = Lists.newArrayList();
    }

    private void f() {
        Aaa_2 a2;
        a2.C = a2.I.J(DDa.class, new xy((double)(a2.A.getX() - a2.j), (double)(a2.A.getY() - AQa.P), (double)(a2.A.getZ() - a2.j), (double)(a2.A.getX() + a2.j), (double)(a2.A.getY() + AQa.P), (double)(a2.A.getZ() + a2.j))).size();
    }

    public int f() {
        Aaa_2 a2;
        Aaa_2 aaa_2 = a2;
        return aaa_2.L - aaa_2.J;
    }

    /*
     * WARNING - void declaration
     */
    public jy f(XF xF2) {
        Aaa_2 aaa_2 = this;
        jy jy2 = null;
        int n2 = vqa.F;
        for (jy jy3 : aaa_2.m) {
            void a2;
            int n3 = jy3.J((XF)a2);
            if (n3 >= n2) continue;
            jy2 = jy3;
            n2 = n3;
        }
        return jy2;
    }

    private boolean f(XF xF2) {
        Object b2 = xF2;
        Aaa_2 a2 = this;
        if ((b2 = a2.I.J((XF)((Object)b2)).J()) instanceof BlockDoor) {
            if (((Block)b2).J() == Material.wood) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Gl J(Gl gl2) {
        int n2;
        Aaa_2 aaa_2 = this;
        double d2 = Bra.o;
        Aaa_2 b2 = null;
        int n3 = n2 = uSa.E;
        while (n3 < aaa_2.g.size()) {
            double d3;
            void a2;
            Zy zy2 = aaa_2.g.get(n2);
            double d4 = zy2.I.J((vL)a2);
            if (d3 <= d2) {
                b2 = zy2;
                d2 = d4;
            }
            n3 = ++n2;
        }
        if (b2 != null) {
            return ((Zy)b2).I;
        }
        return null;
    }

    public int J(String string) {
        Object b2 = string;
        Aaa_2 a2 = this;
        if ((b2 = a2.M.get(b2)) != null) {
            return (Integer)b2;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        waa waa3;
        void a2;
        Aaa_2 aaa_2 = this;
        void v0 = a2;
        v0.J(vqa.Q, aaa_2.i);
        v0.J(Pqa.Ka, aaa_2.j);
        v0.J(MTa.ga, aaa_2.C);
        v0.J(uSa.la, aaa_2.J);
        v0.J(rSa.G, aaa_2.L);
        v0.J(BRa.O, aaa_2.k);
        v0.J(ATa.fa, aaa_2.A.getX());
        v0.J(Lqa.L, aaa_2.A.getY());
        v0.J(fpa.B, aaa_2.A.getZ());
        v0.J(pQa.B, aaa_2.E.getX());
        v0.J(Zra.la, aaa_2.E.getY());
        v0.J(WQa.k, aaa_2.E.getZ());
        waa waa4 = new waa();
        waa waa5 = waa3 = aaa_2.m.iterator();
        while (waa5.hasNext()) {
            jy b2 = waa3.next();
            Waa object = new Waa();
            waa5 = waa3;
            Waa waa6 = object;
            waa6.J(DPa.ba, b2.f().getX());
            waa6.J(wua.q, b2.f().getY());
            waa6.J(Psa.V, b2.f().getZ());
            waa6.J(Lqa.s, b2.l());
            waa6.J(zua.o, b2.f());
            waa6.J(Pqa.f, b2.C());
            waa4.J((NCa)waa6);
        }
        a2.J(PQa.y, (NCa)waa4);
        waa3 = new waa();
        for (String string : aaa_2.M.keySet()) {
            waa4 = new Waa();
            GameProfile gameProfile = OCa.J().J().J(string);
            if (gameProfile == null) continue;
            waa waa7 = waa4;
            waa7.J(URa.V, gameProfile.getId().toString());
            waa7.J(Iqa.W, aaa_2.M.get(string).intValue());
            waa3.J((NCa)waa4);
        }
        a2.J(kta.e, (NCa)waa3);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2) {
        void a2;
        Aaa_2 aaa_2 = this;
        for (Zy zy2 : aaa_2.g) {
            if (zy2.I != a2) continue;
            zy2.J = aaa_2.L;
            return;
        }
        Aaa_2 aaa_22 = aaa_2;
        aaa_2.g.add(new Zy((Aaa)aaa_22, (Gl)a2, aaa_22.L));
    }

    /*
     * WARNING - void declaration
     */
    public jy J(XF xF2) {
        Aaa_2 aaa_2 = this;
        jy jy2 = null;
        int n2 = vqa.F;
        for (jy jy3 : aaa_2.m) {
            void a2;
            int b2 = jy3.J((XF)a2);
            if ((b2 > hra.Ja ? (b2 = b2 * PRa.U) : (b2 = jy3.J())) >= n2) continue;
            jy2 = jy3;
            n2 = b2;
        }
        return jy2;
    }

    public boolean J(XF xF2) {
        Aaa_2 a2;
        Object b2 = xF2;
        Aaa_2 aaa_2 = a2 = this;
        if (a2.A.distanceSq((MD)b2) < (double)(aaa_2.j * aaa_2.j)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Lz J(XF xF2, int n2, int n3, int n4) {
        int n5;
        Aaa_2 aaa_2 = this;
        int n6 = n5 = uSa.E;
        while (n6 < NTa.C) {
            void d2;
            Object e2 = d2.add(aaa_2.I.v.nextInt(ERa.C) - Yqa.i, aaa_2.I.v.nextInt(uua.p) - yRa.d, aaa_2.I.v.nextInt(ERa.C) - Yqa.i);
            if (aaa_2.J((XF)((Object)e2))) {
                void a2;
                void b2;
                void c2;
                if (aaa_2.J(new XF((int)c2, (int)b2, (int)a2), (XF)((Object)e2))) {
                    return new Lz((double)e2.getX(), (double)e2.getY(), (double)e2.getZ());
                }
            }
            n6 = ++n5;
        }
        return null;
    }

    public Aaa_2(Gg gg2) {
        Aaa_2 a2;
        Aaa_2 b2 = gg2;
        Aaa_2 aaa_2 = a2 = this;
        a2.m = Lists.newArrayList();
        a2.E = XF.ORIGIN;
        a2.A = XF.ORIGIN;
        Aaa_2 aaa_22 = a2;
        aaa_2.M = new TreeMap();
        aaa_2.g = Lists.newArrayList();
        aaa_2.I = b2;
    }

    public boolean J() {
        block3: {
            block2: {
                Aaa_2 a2;
                if (a2.k == 0) break block2;
                Aaa_2 aaa_2 = a2;
                if (aaa_2.L - aaa_2.k < csa.W) break block3;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(XF xF2, XF xF3) {
        int n2;
        void a2;
        Object c2 = xF2;
        Aaa_2 b2 = this;
        if (!Gg.J((I)b2.I, (XF)a2.down())) {
            return uSa.E != 0;
        }
        void v0 = a2;
        int n3 = v0.getX() - c2.getX() / uqa.g;
        int n4 = v0.getZ() - c2.getZ() / uqa.g;
        int n5 = n2 = n3;
        while (n5 < n3 + c2.getX()) {
            int n6 = a2.getY();
            while (n6 < a2.getY() + c2.getY()) {
                int n7;
                int n8 = n4;
                while (n8 < n4 + c2.getZ()) {
                    int n9;
                    if (b2.I.J(new XF(n2, n7, n9)).J().A()) {
                        return uSa.E != 0;
                    }
                    n8 = ++n9;
                }
                n6 = ++n7;
            }
            n5 = ++n2;
        }
        return vRa.d != 0;
    }

    public void J(Waa waa2) {
        int n2;
        Waa waa3;
        int n3;
        Object b2 = waa2;
        Aaa_2 a2 = this;
        Aaa_2 aaa_2 = b2;
        Aaa_2 aaa_22 = a2;
        Aaa_2 aaa_23 = b2;
        Aaa_2 aaa_24 = a2;
        Aaa_2 aaa_25 = b2;
        a2.i = aaa_25.J(vqa.Q);
        aaa_24.j = aaa_25.J(Pqa.Ka);
        aaa_24.C = b2.J(MTa.ga);
        a2.J = aaa_23.J(uSa.la);
        aaa_22.L = aaa_23.J(rSa.G);
        aaa_22.k = aaa_2.J(BRa.O);
        Aaa_2 aaa_26 = a2;
        a2.A = new XF(b2.J(ATa.fa), b2.J(Lqa.L), b2.J(fpa.B));
        aaa_26.E = new XF(b2.J(pQa.B), b2.J(Zra.la), b2.J(WQa.k));
        waa waa4 = aaa_2.J(PQa.y, NTa.C);
        int n4 = n3 = uSa.E;
        while (n4 < waa4.J()) {
            Waa waa5 = waa4.J(n3);
            waa3 = new jy(new XF(waa5.J(DPa.ba), waa5.J(wua.q), waa5.J(Psa.V)), waa5.J(Lqa.s), waa5.J(zua.o), waa5.J(Pqa.f));
            a2.m.add((jy)waa3);
            n4 = ++n3;
        }
        waa waa6 = b2.J(kta.e, NTa.C);
        int n5 = n2 = uSa.E;
        while (n5 < waa6.J()) {
            waa3 = waa6.J(n2);
            if (waa3.J(URa.V)) {
                b2 = OCa.J().J().J(UUID.fromString(waa3.J(URa.V)));
                if (b2 != null) {
                    a2.M.put(((GameProfile)b2).getName(), waa3.J(Iqa.W));
                }
            } else {
                a2.M.put(waa3.J(DQa.N), waa3.J(Iqa.W));
            }
            n5 = ++n2;
        }
    }

    private void J() {
        Aaa_2 a2;
        Aaa_2 aaa_2 = a2;
        aaa_2.i = aaa_2.I.J(mFa.class, new xy((double)(a2.A.getX() - a2.j), (double)(a2.A.getY() - AQa.P), (double)(a2.A.getZ() - a2.j), (double)(a2.A.getX() + a2.j), (double)(a2.A.getY() + AQa.P), (double)(a2.A.getZ() + a2.j))).size();
        if (aaa_2.i == 0) {
            a2.M.clear();
        }
    }

    public List<jy> J() {
        Aaa_2 a2;
        return a2.m;
    }

    public XF J() {
        Aaa_2 a2;
        return a2.A;
    }

    public boolean J(String string) {
        Object a2 = this;
        String b2 = string;
        if (((Aaa_2)a2).J(b2) <= TOa.V) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(String string, int n2) {
        void b2;
        Aaa_2 a2;
        int c2 = n2;
        Aaa_2 aaa_2 = a2 = this;
        c2 = Oz.f((int)(aaa_2.J((String)b2) + c2), (int)SPa.S, (int)NTa.C);
        aaa_2.M.put((String)b2, c2);
        return c2;
    }

    public int J() {
        Aaa_2 a2;
        return a2.i;
    }
}

