/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  CZ
 *  Cta
 *  EY
 *  Epa
 *  FBa
 *  FPa
 *  Gg
 *  ISa
 *  IZ
 *  JPa
 *  Jaa
 *  LZ
 *  MQa
 *  Mba
 *  NPa
 *  NTa
 *  OCa
 *  Oz
 *  PIa
 *  PTa
 *  Pca
 *  QY
 *  SOa
 *  SRa
 *  Ssa
 *  Tf
 *  Tz
 *  UX
 *  Waa
 *  Wca
 *  XCa
 *  XTa
 *  Yaa
 *  Zta
 *  asa
 *  ay
 *  bFa
 *  bqa
 *  cZ
 *  cca
 *  cra
 *  fAa
 *  ica
 *  isa
 *  kba
 *  kpa
 *  ld
 *  ly
 *  lz
 *  mBa
 *  mca
 *  mda
 *  nQa
 *  oba
 *  pY
 *  pqa
 *  psa
 *  pua
 *  qta
 *  raa
 *  vL
 *  vRa
 *  vaa
 *  wOa
 *  zZ
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Cba {
    private boolean d;
    private final Map<UUID, UX> a;
    private Ec b;
    public static final File l = new File(FPa.fa);
    private static final SimpleDateFormat e;
    private boolean G;
    private final NX D;
    private final IZ f;
    private int F;
    public static final File g;
    private Daa L;
    private final OCa E;
    private final Map<UUID, bFa> m;
    private final LZ C;
    private int i;
    private final List<bFa> M;
    public int k;
    private static final Logger j;
    public static final File J;
    public static final File A;
    private final ly I;

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, double d5, int n2, KC kC) {
        KC g;
        void b2;
        void c2;
        void d6;
        void e2;
        void f2;
        Cba cba = kC2;
        KC kC2 = kC;
        Cba a2 = cba;
        a2.J(null, (double)f2, (double)e2, (double)d6, (double)c2, (int)b2, g);
    }

    public void C(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Cba a2 = this;
        Object object = b2;
        a2.C.J((ay)new cZ((GameProfile)object, a2.E.f(), a2.C.J((GameProfile)object)));
    }

    /*
     * WARNING - void declaration
     */
    public void f(Sx sx, ld ld2) {
        void b2;
        Cba cba = this;
        Yaa yaa = b2.J();
        if (yaa != null) {
            for (Object c2 : yaa.J()) {
                void a2;
                if ((c2 = cba.J((String)c2)) == null || c2 == b2) continue;
                c2.J((ld)a2);
            }
        }
    }

    public void l(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Cba a2 = this;
        a2.C.J((Object)b2);
    }

    public String[] C() {
        Cba a2;
        return a2.f.J();
    }

    public void d(bFa bFa2) {
        Cba b2 = bFa2;
        Cba a2 = this;
        Cba cba = b2;
        b2.J(Tz.C);
        a2.l((bFa)cba);
        Object object = cba.J();
        if (((bFa)cba).ja != null) {
            object.e(((bFa)b2).ja);
            j.debug(isa.P);
        }
        Tf tf = object;
        tf.C((vL)b2);
        tf.J().f((bFa)b2);
        Cba cba2 = a2;
        cba2.M.remove(b2);
        object = b2.J();
        if (cba2.m.get(object) == b2) {
            a2.m.remove(object);
            a2.a.remove(object);
        }
        bFa[] bFaArray = new bFa[vRa.d];
        bFaArray[uSa.E] = b2;
        a2.J(new bda(gba.REMOVE_PLAYER, bFaArray));
    }

    public NX J() {
        Cba a2;
        return a2.D;
    }

    /*
     * WARNING - void declaration
     */
    public void f(bFa bFa2, Tf tf) {
        void b2;
        Cba c2 = tf;
        Cba a2 = this;
        PX pX = a2.E.G[uSa.E].J();
        void v0 = b2;
        v0.I.J(new Oca(pX, Pca.INITIALIZE));
        v0.I.J((KC)new Mba(c2.l(), c2.f(), c2.J().f(PTa.Ka)));
        if (c2.l()) {
            void v1 = b2;
            v1.I.J((KC)new FBa(vRa.d, JPa.N));
            v1.I.J((KC)new FBa(XTa.W, c2.J(pqa.r)));
            v1.I.J((KC)new FBa(Yqa.i, c2.f(pqa.r)));
        }
    }

    public void C() {
        int a2;
        Cba cba = this;
        int n2 = a2 = uSa.E;
        while (n2 < cba.M.size()) {
            cba.M.get((int)(++a2)).I.f(Jra.X);
            n2 = a2;
        }
    }

    public void f(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Cba a2 = this;
        a2.f.J((Object)b2);
    }

    /*
     * WARNING - void declaration
     */
    public List<bFa> J(String string) {
        Cba cba = this;
        ArrayList<bFa> arrayList = Lists.newArrayList();
        for (bFa bFa2 : cba.M) {
            void a2;
            if (!bFa2.l().equals(a2)) continue;
            arrayList.add(bFa2);
        }
        return arrayList;
    }

    public void J(Tf[] tfArray) {
        Tf[] b2 = tfArray;
        Tf[] a2 = this;
        a2.b = b2[uSa.E].J().J();
        b2[uSa.E].J().J((cd)new lz((Cba)a2));
    }

    public void J(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Cba a2 = this;
        a2.f.J((ay)new Jaa(b2));
    }

    static {
        A = new File(cra.W);
        g = new File(qta.h);
        J = new File(kpa.Ja);
        j = LogManager.getLogger();
        e = new SimpleDateFormat(SRa.E);
    }

    public GameProfile[] J() {
        int a2;
        Cba cba = this;
        GameProfile[] gameProfileArray = new GameProfile[cba.M.size()];
        int n2 = a2 = uSa.E;
        while (n2 < cba.M.size()) {
            int n3 = a2++;
            gameProfileArray[n3] = cba.M.get(n3).J();
            n2 = a2;
        }
        return gameProfileArray;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        Cba a2 = this;
        a2.G = b2;
    }

    public void C(bFa bFa2) {
        int n2;
        Cba b2 = bFa2;
        Cba a2 = this;
        a2.M.add((bFa)b2);
        a2.m.put(b2.J(), (bFa)b2);
        bFa[] bFaArray = new bFa[vRa.d];
        bFaArray[uSa.E] = b2;
        a2.J(new bda(gba.ADD_PLAYER, bFaArray));
        Cba cba = a2;
        cba.E.J(((bFa)b2).Ha).f((vL)b2);
        cba.J((bFa)b2, (Tf)null);
        int n3 = n2 = uSa.E;
        while (n3 < a2.M.size()) {
            bFa bFa3 = a2.M.get(n2);
            bFa[] bFaArray2 = new bFa[vRa.d];
            bFaArray2[uSa.E] = bFa3;
            ((bFa)b2).I.J(new bda(gba.ADD_PLAYER, bFaArray2));
            n3 = ++n2;
        }
    }

    public boolean l(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Cba a2 = this;
        if (!a2.G || a2.C.J((Object)b2) || a2.f.J((Object)b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Cba a2 = this;
        if (a2.C.J((Object)b2) || a2.E.E() && a2.E.G[uSa.E].J().M() && a2.E.e().equalsIgnoreCase(b2.getName()) || a2.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public OCa J() {
        Cba a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        void a2;
        Cba cba = this;
        cba.i = a2;
        if (cba.E.G != null) {
            int b2;
            Tf[] tfArray = cba.E.G;
            int n3 = cba.E.G.length;
            int n4 = b2 = uSa.E;
            while (n4 < n3) {
                Tf tf = tfArray[b2];
                if (tf != null) {
                    tf.J().J((int)a2);
                }
                n4 = ++b2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public bFa J(String string) {
        Cba cba = this;
        for (bFa bFa2 : cba.M) {
            void a2;
            if (!bFa2.J().equalsIgnoreCase((String)a2)) continue;
            return bFa2;
        }
        return null;
    }

    public bFa J(UUID uUID) {
        UUID b2 = uUID;
        Cba a2 = this;
        return a2.m.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, int n2, Tf tf, Tf tf2) {
        void c2;
        void v4;
        void a2;
        void b2;
        float f2;
        double d2;
        double d3;
        Cba e2;
        block5: {
            block4: {
                XF xF;
                block6: {
                    double d4;
                    block3: {
                        e2 = vL2;
                        Cba d5 = this;
                        Cba cba = e2;
                        d3 = ((vL)e2).la;
                        d2 = ((vL)cba).A;
                        d4 = Wqa.Z;
                        f2 = ((vL)cba).X;
                        b2.H.J(wta.P);
                        if (((vL)cba).Ha != pua.o) break block3;
                        d3 = Oz.J((double)(d3 / d4), (double)(a2.J().J() + Zta.ba), (double)(a2.J().i() - Zta.ba));
                        d2 = Oz.J((double)(d2 / d4), (double)(a2.J().e() + Zta.ba), (double)(a2.J().d() - Zta.ba));
                        Cba cba2 = e2;
                        Cba cba3 = e2;
                        cba2.f(d3, ((vL)cba2).Z, d2, ((vL)cba3).X, ((vL)cba3).d);
                        if (!cba2.K()) break block4;
                        void v3 = b2;
                        v4 = v3;
                        v3.J((vL)e2, uSa.E != 0);
                        break block5;
                    }
                    if (((vL)e2).Ha != 0) break block6;
                    d3 = Oz.J((double)(d3 * d4), (double)(a2.J().J() + Zta.ba), (double)(a2.J().i() - Zta.ba));
                    d2 = Oz.J((double)(d2 * d4), (double)(a2.J().e() + Zta.ba), (double)(a2.J().d() - Zta.ba));
                    Cba cba = e2;
                    Cba cba4 = e2;
                    cba.f(d3, ((vL)cba).Z, d2, ((vL)cba4).X, ((vL)cba4).d);
                    if (!cba.K()) break block4;
                    void v7 = b2;
                    v4 = v7;
                    v7.J((vL)e2, uSa.E != 0);
                    break block5;
                }
                d3 = (c2 == vRa.d ? (xF = a2.J()) : (xF = a2.f())).getX();
                Cba cba = e2;
                ((vL)cba).Z = xF.getY();
                d2 = xF.getZ();
                cba.f(d3, ((vL)e2).Z, d2, ISa.a, JPa.N);
                if (cba.K()) {
                    b2.J((vL)e2, uSa.E != 0);
                }
            }
            v4 = b2;
        }
        v4.H.f();
        if (c2 != vRa.d) {
            b2.H.J(Cta.b);
            d3 = Oz.f((int)((int)d3), (int)QTa.m, (int)Jpa.d);
            d2 = Oz.f((int)((int)d2), (int)QTa.m, (int)Jpa.d);
            if (e2.K()) {
                Cba cba = e2;
                Cba cba5 = e2;
                cba.f(d3, ((vL)cba).Z, d2, ((vL)cba5).X, ((vL)cba5).d);
                void v11 = a2;
                v11.J().J((vL)e2, f2);
                v11.f((vL)cba);
                a2.J((vL)e2, uSa.E != 0);
            }
            b2.H.f();
        }
        e2.J((Gg)a2);
    }

    public String[] l() {
        int a2;
        Cba cba = this;
        String[] stringArray = new String[cba.M.size()];
        int n2 = a2 = uSa.E;
        while (n2 < cba.M.size()) {
            int n3 = a2++;
            stringArray[n3] = cba.M.get(n3).J();
            n2 = a2;
        }
        return stringArray;
    }

    public int C() {
        Cba a2;
        return a2.k;
    }

    public Cba(OCa oCa) {
        Cba b2 = oCa;
        Cba a2 = this;
        a2.M = Lists.newArrayList();
        a2.m = Maps.newHashMap();
        Cba cba = a2;
        a2.I = new ly(l);
        a2.D = new NX(A);
        a2.C = new LZ(g);
        a2.f = new IZ(J);
        a2.a = Maps.newHashMap();
        a2.E = b2;
        a2.I.J(uSa.E != 0);
        a2.D.J(uSa.E != 0);
        a2.k = Yqa.i;
    }

    public ly J() {
        Cba a2;
        return a2.I;
    }

    public void l(bFa bFa2) {
        Cba a2;
        Cba b2 = bFa2;
        Cba cba = a2 = this;
        cba.b.J((Sx)((Object)b2));
        b2 = cba.a.get(b2.J());
        if (b2 != null) {
            b2.f();
        }
    }

    public IZ J() {
        Cba a2;
        return a2.f;
    }

    public void J(uba uba2, bFa bFa2) {
        Object object;
        XBa b2;
        Cba c2 = bFa2;
        Cba a2 = this;
        GameProfile gameProfile = c2.J();
        Object object2 = a2.E.J();
        Object object3 = object2.J(gameProfile.getId());
        String string = object3 == null ? gameProfile.getName() : ((GameProfile)object3).getName();
        object2.J(gameProfile);
        gameProfile = a2.J((bFa)c2);
        Cba cba = c2;
        cba.J((Gg)a2.E.J(((bFa)cba).Ha));
        ((bFa)cba).s.J((Tf)((bFa)c2).j);
        object2 = Lsa.Ja;
        if (((uba)((Object)b2)).J() != null) {
            object2 = ((uba)((Object)b2)).J().toString();
        }
        j.info(new StringBuilder().insert(5 >> 3, c2.J()).append(dqa.X).append((String)object2).append(nQa.s).append(c2.M()).append(Ssa.G).append(((bFa)c2).la).append(TOa.n).append(((bFa)c2).Z).append(TOa.n).append(((bFa)c2).A).append(hpa.b).toString());
        Cba cba2 = a2;
        object2 = cba2.E.J(((bFa)c2).Ha);
        object3 = object2.J();
        XF xF = object2.J();
        cba2.J((bFa)c2, null, (Gg)object2);
        b2 = new XBa(a2.E, (uba)((Object)b2), (bFa)c2);
        Cba cba3 = c2;
        XBa xBa = b2;
        xBa.J((KC)new cca(c2.M(), ((bFa)c2).s.J(), object3.d(), object2.F.J(), object2.J(), a2.C(), object3.J(), object2.J().f(oQa.Aa)));
        b2.J(new Cda(xSa.Ja, new Lca(Unpooled.buffer()).writeString(a2.J().C())));
        xBa.J((KC)new oba(object3.J(), object3.C()));
        xBa.J(new nba(xF));
        xBa.J((KC)new fAa(((bFa)c2).h));
        xBa.J((KC)new mda(((bFa)c2).K.J));
        cba3.J().l();
        cba3.J().J((bFa)c2);
        a2.J((Wca)object2.J(), (bFa)c2);
        a2.E.G();
        if (!c2.J().equalsIgnoreCase(string)) {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = c2.J();
            objectArray[vRa.d] = string;
            object3 = new CZ(bqa.Ia, objectArray);
            object = object3;
        } else {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = c2.J();
            object3 = new CZ(PTa.H, objectArray);
            object = object3;
        }
        object.J().J(pY.YELLOW);
        Cba cba4 = c2;
        Cba cba5 = a2;
        cba5.J((ld)object3);
        cba5.C((bFa)c2);
        Cba cba6 = c2;
        b2.J(((bFa)cba4).la, ((bFa)c2).Z, ((bFa)c2).A, ((bFa)cba6).X, ((bFa)cba6).d);
        a2.f((bFa)cba4, (Tf)object2);
        if (a2.E.D().length() > 0) {
            c2.J(a2.E.D(), a2.E.d());
        }
        Object object4 = object3 = c2.J().iterator();
        while (object4.hasNext()) {
            string = (kba)object3.next();
            object4 = object3;
            b2.J(new cCa(c2.M(), (kba)string));
        }
        c2.O();
        if (gameProfile != null && gameProfile.J(SOa.Ga, NTa.C) && (object3 = PIa.J((Waa)gameProfile.J(SOa.Ga), (Gg)object2)) != null) {
            ((vL)object3).k = vRa.d;
            object2.f((vL)object3);
            c2.l((vL)object3);
            ((vL)object3).k = uSa.E;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public bFa J(bFa var1_3, int var2_4, boolean var3_6) {
        d = var2_4;
        v0 = b = this;
        v1 = c;
        v2 = c;
        v1.J().J().J((bFa)v2);
        v1.J().J().f((vL)c);
        v2.J().J().f((bFa)c);
        v0.M.remove(c);
        v3 = c;
        b.E.J(v3.Ha).e((vL)c);
        var4_8 = c.f();
        var5_9 = v3.r();
        v3.Ha = d;
        d /* !! */  = v0.E.d() != false ? new zZ((Gg)b.E.J(c.Ha)) : new QY((Gg)b.E.J(c.Ha));
        v4 = b;
        d /* !! */  = new bFa(v4.E, v4.E.J(c.Ha), c.J(), (QY)d /* !! */ );
        v5 = b;
        v6 = d /* !! */ ;
        v7 = c;
        d /* !! */ .I = c.I;
        d /* !! */ .J((Sx)v7, (boolean)a);
        v6.l(v7.M());
        v6.C((vL)c);
        a = v5.E.J(c.Ha);
        v5.J((bFa)d /* !! */ , (bFa)c, (Gg)a);
        if (var4_8 == null) ** GOTO lbl36
        var6_10 = Sx.J((Gg)b.E.J(c.Ha), var4_8, var5_9);
        if (var6_10 != null) {
            v8 = a;
            v9 = d /* !! */ ;
            v9.f((double)((float)var6_10.getX() + MQa.L), (double)((float)var6_10.getY() + Nra.e), (double)((float)var6_10.getZ() + MQa.L), JPa.N, JPa.N);
            v9.J(var4_8, var5_9);
        } else {
            d /* !! */ .I.J((KC)new FBa(uSa.E, JPa.N));
lbl36:
            // 2 sources

            v8 = a;
        }
        v8.f.l((int)d /* !! */ .la >> AQa.P, (int)d /* !! */ .A >> AQa.P);
        v10 = a;
        while (true) {
            v11 = d /* !! */ ;
            if (v10.J((vL)v11, v11.J()).isEmpty() || !(d /* !! */ .Z < ZSa.o)) break;
            v10 = a;
            v12 = d /* !! */ ;
            v12.l(d /* !! */ .la, v12.Z + oua.i, d /* !! */ .A);
        }
        v13 = d /* !! */ ;
        v14 = d /* !! */ ;
        v15 = d /* !! */ ;
        v14.I.J((KC)new mBa(v15.Ha, v15.j.J(), d /* !! */ .j.J().J(), d /* !! */ .s.J()));
        var6_10 = a.J();
        v16 = d /* !! */ ;
        v17 = d /* !! */ ;
        v14.I.J(v16.la, d /* !! */ .Z, d /* !! */ .A, v17.X, v17.d);
        v13.I.J(new nba(var6_10));
        v18 = d /* !! */ ;
        v16.I.J((KC)new vaa(v18.A, v18.Aa, d /* !! */ .j));
        v19 = d /* !! */ ;
        b.f((bFa)v19, a);
        v20 = a;
        v20.J().l((bFa)d /* !! */ );
        v20.f((vL)v19);
        b.M.add((bFa)d /* !! */ );
        b.m.put(d /* !! */ .J(), (bFa)d /* !! */ );
        v21 = d /* !! */ ;
        v21.O();
        v21.A(v21.f());
        return v13;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Cba a2 = this;
        a2.d = b2;
    }

    public void l() {
        if ((a2.F += vRa.d) > Jpa.z) {
            Cba a2;
            a2.J(new bda(gba.UPDATE_LATENCY, a2.M));
            a2.F = uSa.E;
        }
    }

    public void f() {
        int a2;
        Cba cba = this;
        int n2 = a2 = uSa.E;
        while (n2 < cba.M.size()) {
            Cba cba2 = cba;
            cba2.l(cba2.M.get(a2++));
            n2 = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx, ld ld2) {
        int c2;
        void a2;
        Yaa b2;
        Cba cba = this;
        if ((b2 = b2.J()) == null) {
            cba.J((ld)a2);
            return;
        }
        int n2 = c2 = uSa.E;
        while (n2 < cba.M.size()) {
            bFa bFa2 = cba.M.get(c2);
            if (bFa2.J() != b2) {
                bFa2.J((ld)a2);
            }
            n2 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public String J(boolean bl) {
        int n2;
        Cba cba = this;
        Object b2 = Mqa.y;
        ArrayList<bFa> arrayList = Lists.newArrayList(cba.M);
        int n3 = n2 = uSa.E;
        while (n3 < arrayList.size()) {
            void a2;
            if (n2 > 0) {
                b2 = new StringBuilder().insert(3 & 4, (String)b2).append(TOa.n).toString();
            }
            b2 = new StringBuilder().insert(3 & 4, (String)b2).append(((bFa)arrayList.get(n2)).J()).toString();
            if (a2 != false) {
                b2 = new StringBuilder().insert(3 & 4, (String)b2).append(nQa.T).append(((bFa)arrayList.get(n2)).J().toString()).append(hpa.b).toString();
            }
            n3 = ++n2;
        }
        return b2;
    }

    public String[] f() {
        Cba a2;
        return a2.E.G[uSa.E].J().J().J();
    }

    public boolean J(GameProfile gameProfile) {
        GameProfile b2 = gameProfile;
        Cba a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(KC kC, int n2) {
        int c2;
        Cba cba = this;
        int n3 = c2 = uSa.E;
        while (n3 < cba.M.size()) {
            void a2;
            bFa bFa2 = cba.M.get(c2);
            if (bFa2.Ha == a2) {
                void b2;
                bFa2.I.J((KC)b2);
            }
            n3 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public bFa J(GameProfile gameProfile) {
        Object b2;
        int n2;
        void a2;
        Cba cba = this;
        UUID uUID = Sx.J((GameProfile)a2);
        ArrayList<Cba> arrayList = Lists.newArrayList();
        int n3 = n2 = uSa.E;
        while (n3 < cba.M.size()) {
            b2 = cba.M.get(n2);
            if (b2.J().equals(uUID)) {
                arrayList.add((Cba)b2);
            }
            n3 = ++n2;
        }
        bFa bFa2 = cba.m.get(a2.getId());
        if (bFa2 != null && !arrayList.contains(bFa2)) {
            arrayList.add((Cba)bFa2);
        }
        Object object = b2 = arrayList.iterator();
        while (object.hasNext()) {
            ((bFa)b2.next()).I.f(NPa.c);
            object = b2;
        }
        b2 = cba.E.d() ? new zZ((Gg)cba.E.J(uSa.E)) : new QY((Gg)cba.E.J(uSa.E));
        Cba cba2 = cba;
        return new bFa(cba2.E, cba2.E.J(uSa.E), (GameProfile)a2, (QY)b2);
    }

    public String[] J() {
        Cba a2;
        return a2.C.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(ld ld2, boolean by) {
        void b2;
        byte c2 = by;
        Cba a2 = this;
        a2.E.J((ld)b2);
        c2 = (byte)(c2 != 0 ? vRa.d : uSa.E);
        a2.J((KC)new XCa((ld)b2, c2));
    }

    public UX J(Sx sx) {
        Cba b2;
        File a2;
        Cba cba = this;
        UUID uUID = a2.J();
        Object object = b2 = uUID == null ? null : cba.a.get(uUID);
        if (b2 == null) {
            File file = new File(cba.E.J(uSa.E).J().J(), Eqa.K);
            File file2 = new File(file, uUID.toString() + Epa.k);
            if (!file2.exists() && (a2 = new File(file, new StringBuilder().insert(2 & 5, ((Sx)((Object)a2)).J()).append(Epa.k).toString())).exists() && a2.isFile()) {
                a2.renameTo(file2);
            }
            b2 = new UX(cba.E, file2);
            b2.J();
            cba.a.put(uUID, (UX)b2);
        }
        return b2;
    }

    public void J() {
    }

    /*
     * WARNING - void declaration
     */
    public void J(bFa bFa2, int n2) {
        void a22;
        Cba c2 = bFa2;
        Cba b2 = this;
        Cba cba = c2;
        int n3 = ((bFa)c2).Ha;
        Tf tf = b2.E.J(((bFa)c2).Ha);
        ((bFa)c2).Ha = a22;
        Object a22 = b2.E.J(((bFa)c2).Ha);
        Cba cba2 = c2;
        ((bFa)cba).I.J((KC)new mBa(((bFa)cba2).Ha, ((bFa)cba2).j.J(), ((bFa)c2).j.J().J(), ((bFa)c2).s.J()));
        tf.e((vL)c2);
        ((bFa)c2).J = uSa.E;
        Cba cba3 = b2;
        cba3.J((vL)c2, n3, tf, (Tf)a22);
        cba3.J((bFa)c2, tf);
        Cba cba4 = c2;
        ((bFa)cba).I.J(((bFa)c2).la, ((bFa)c2).Z, ((bFa)c2).A, ((bFa)cba4).X, ((bFa)cba4).d);
        ((bFa)cba).s.J((Tf)a22);
        Cba cba5 = b2;
        cba5.f((bFa)c2, (Tf)a22);
        cba5.f((bFa)c2);
        a22 = cba.J().iterator();
        Iterator iterator = a22;
        while (iterator.hasNext()) {
            kba kba2 = (kba)a22.next();
            iterator = a22;
            ((bFa)c2).I.J(new cCa(c2.M(), kba2));
        }
    }

    public int l() {
        Cba a2;
        return EY.J((int)a2.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx, double d2, double d3, double d4, double d5, int n2, KC kC) {
        int n3;
        Cba cba = this;
        int n4 = n3 = uSa.E;
        while (n4 < cba.M.size()) {
            void b2;
            void g;
            Cba h = cba.M.get(n3);
            if (h != g && ((bFa)h).Ha == b2) {
                void c2;
                void d6;
                void e2;
                void f2;
                void var14_10 = f2 - ((bFa)h).la;
                void var16_11 = e2 - ((bFa)h).Z;
                void var18_12 = d6 - ((bFa)h).A;
                void v1 = var14_10;
                void v2 = var16_11;
                void v3 = var18_12;
                void v4 = c2;
                if (v1 * v1 + v2 * v2 + v3 * v3 < v4 * v4) {
                    void a2;
                    ((bFa)h).I.J((KC)a2);
                }
            }
            n4 = ++n3;
        }
    }

    public Waa J() {
        return null;
    }

    public int f() {
        Cba a2;
        return a2.M.size();
    }

    public void f(bFa bFa2) {
        Cba b2 = bFa2;
        Cba a2 = this;
        Cba cba = b2;
        cba.J(((bFa)cba).x);
        cba.T();
        ((bFa)cba).I.J((KC)new mda(((bFa)b2).K.J));
    }

    public LZ J() {
        Cba a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    public void J(KC kC) {
        int b2;
        Cba cba = this;
        int n2 = b2 = uSa.E;
        while (n2 < cba.M.size()) {
            void a2;
            cba.M.get((int)(++b2)).I.J((KC)a2);
            n2 = b2;
        }
    }

    public List<bFa> J() {
        Cba a2;
        return a2.M;
    }

    public int J() {
        Cba a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public String J(SocketAddress socketAddress, GameProfile gameProfile) {
        void b2;
        Object c2;
        void a2;
        Cba cba = this;
        if (cba.I.J((GameProfile)a2)) {
            Vy vy = (Vy)cba.I.J((Object)a2);
            c2 = new StringBuilder().insert(3 & 4, asa.P).append(vy.J()).toString();
            if (vy.J() != null) {
                c2 = new StringBuilder().insert(3 >> 2, (String)c2).append(BRa.i).append(e.format(vy.J())).toString();
            }
            return c2;
        }
        if (!cba.l((GameProfile)a2)) {
            return fta.I;
        }
        if (cba.D.J((SocketAddress)b2)) {
            raa raa2 = cba.D.J((SocketAddress)b2);
            c2 = new StringBuilder().insert(3 ^ 3, Ata.o).append(raa2.J()).toString();
            if (raa2.J() != null) {
                c2 = new StringBuilder().insert(3 & 4, (String)c2).append(BRa.i).append(e.format(raa2.J())).toString();
            }
            return c2;
        }
        if (cba.M.size() >= cba.k && !cba.J((GameProfile)a2)) {
            return Wqa.D;
        }
        return null;
    }

    public void J(bFa bFa2) {
        Cba b2 = bFa2;
        Cba a2 = this;
        b2.J().J().C((bFa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(bFa bFa2, Tf tf) {
        void a2;
        Cba c2 = bFa2;
        Cba b2 = this;
        Tf tf2 = c2.J();
        if (a2 != null) {
            a2.J().f((bFa)c2);
        }
        Tf tf3 = tf2;
        tf3.J().l((bFa)c2);
        tf3.f.l((int)((bFa)c2).la >> AQa.P, (int)((bFa)c2).A >> AQa.P);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Wca wca2, bFa bFa2) {
        void a2;
        mca mca2;
        void b2;
        Object c2;
        Cba cba = this;
        HashSet<mca> hashSet = Sets.newHashSet();
        Object object = c2 = b2.l().iterator();
        while (object.hasNext()) {
            mca2 = (mca)c2.next();
            object = c2;
            a2.I.J(new Dca(mca2, uSa.E));
        }
        int n2 = c2 = uSa.E;
        while (n2 < wOa.t) {
            mca2 = b2.J(c2);
            if (mca2 != null && !hashSet.contains(mca2)) {
                Iterator iterator = b2.f((ica)mca2).iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2;
                    KC kC = (KC)iterator2.next();
                    iterator = iterator2;
                    a2.I.J(kC);
                }
                hashSet.add(mca2);
            }
            n2 = ++c2;
        }
    }

    public void J(Daa daa) {
        Object b2 = daa;
        Cba a2 = this;
        a2.L = b2;
    }

    public void J(ld ld2) {
        Cba b2 = ld2;
        Cba a2 = this;
        a2.J((ld)b2, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    private void J(bFa bFa2, bFa bFa3, Gg gg2) {
        void a2;
        Cba cba;
        void b2;
        Cba d2 = bFa2;
        Cba c2 = this;
        if (b2 != null) {
            Cba cba2 = d2;
            cba = cba2;
            ((bFa)cba2).s.f(b2.s.J());
        } else {
            if (c2.L != null) {
                ((bFa)d2).s.f(c2.L);
            }
            cba = d2;
        }
        ((bFa)cba).s.J(a2.J().J());
    }

    /*
     * WARNING - void declaration
     */
    public Waa J(bFa bFa2) {
        Cba b2;
        void a2;
        Cba cba = this;
        Waa waa = cba.E.G[uSa.E].J().f();
        if (a2.J().equals(cba.E.e()) && waa != null) {
            Waa waa2 = waa;
            a2.l(waa2);
            b2 = waa2;
            j.debug(psa.O);
            return b2;
        }
        b2 = cba.b.J((Sx)a2);
        return b2;
    }
}

