/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gua
 *  JPa
 *  Jh
 *  Kpa
 *  Mda
 *  NCa
 *  Pqa
 *  Rua
 *  TQa
 *  Tpa
 *  UG
 *  Waa
 *  XTa
 *  eAa
 *  iJa
 *  jRa
 *  kta
 *  nLa
 *  pua
 *  rba
 *  rh
 *  rr
 *  uKa
 *  ui
 *  ura
 *  vRa
 *  waa
 *  xKa
 *  yra
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import org.lwjgl.util.vector.Vector3f;

public final class qH_2
extends UG {
    private Mda A;
    private iJa I;

    /*
     * Enabled aggressive block sorting
     */
    public static Jh J(String string) {
        eAa eAa2;
        eAa eAa3;
        Mda mda2;
        String string2 = string;
        String[] stringArray = string2.trim().split(Tpa.E);
        int n2 = uSa.E;
        if (stringArray[uSa.E].contains(Era.Aa)) {
            mda2 = stringArray[uSa.E].split(Era.Aa);
            eAa3 = eAa.l((String)mda2[uSa.E]);
            n2 = Integer.parseInt(mda2[vRa.d]);
            eAa2 = eAa3;
        } else {
            eAa2 = eAa3 = eAa.l((String)stringArray[uSa.E]);
        }
        if (eAa2 == null) {
            OT.b.warn(new StringBuilder().insert(2 & 5, ura.L).append(string2).append(XTa.Z).toString());
            return null;
        }
        mda2 = new Mda(eAa3, vRa.d, n2);
        eAa3 = new Jh(mda2);
        if (stringArray.length == vRa.d) {
            return eAa3;
        }
        Waa waa2 = new Waa();
        mda2.J(waa2);
        Waa waa3 = new Waa();
        int n3 = vRa.d;
        int n4 = n3;
        while (n4 < stringArray.length) {
            block27: {
                int n5;
                String string3;
                String[] stringArray2;
                block28: {
                    block26: {
                        stringArray2 = stringArray[n3].split(vTa.S, uqa.g);
                        if (stringArray2.length != vRa.d) break block26;
                        if (mSa.Da.equals(stringArray2[uSa.E])) {
                            waa3.J(Nta.ga, (NCa)new waa());
                        }
                        break block27;
                    }
                    string3 = stringArray2[uSa.E];
                    int n6 = pua.o;
                    switch (string3.hashCode()) {
                        case 94842723: {
                            if (!string3.equals(Zra.L)) break;
                            n5 = n6 = uSa.E;
                            break block28;
                        }
                        case 106164915: {
                            if (!string3.equals(sra.z)) break;
                            n5 = n6 = vRa.d;
                            break block28;
                        }
                        case 1407228648: {
                            if (!string3.equals(VPa.Q)) break;
                            n5 = n6 = uqa.g;
                            break block28;
                        }
                        case 116: {
                            if (!string3.equals(xra.d)) break;
                            n5 = n6 = yRa.d;
                            break block28;
                        }
                        case -925180581: {
                            if (!string3.equals(Zqa.n)) break;
                            n5 = n6 = AQa.P;
                            break block28;
                        }
                        case 1052832078: {
                            if (!string3.equals(Gua.x)) break;
                            n5 = n6 = tTa.h;
                            break block28;
                        }
                        case 109250890: {
                            if (!string3.equals(Rua.C)) break;
                            n6 = uua.p;
                        }
                    }
                    n5 = n6;
                }
                switch (n5) {
                    case 0: {
                        if (!waa3.J(Jpa.q, ERa.C)) {
                            waa3.J(Jpa.q, (NCa)new Waa());
                        }
                        waa3.J(Jpa.q).J(Zra.L, Integer.parseInt(stringArray2[vRa.d].charAt(uSa.E) == TQa.ca ? stringArray2[vRa.d].substring(vRa.d) : stringArray2[vRa.d], ERa.C));
                        break;
                    }
                    case 1: {
                        waa3.J(Pqa.Aa, stringArray2[vRa.d]);
                        break;
                    }
                    case 2: {
                        GameProfile a2 = new GameProfile(UUID.randomUUID(), Mqa.y);
                        a2.getProperties().put(oua.D, new Property(oua.D, stringArray2[vRa.d]));
                        string3 = new Waa();
                        rba.J((Waa)string3, (GameProfile)a2);
                        waa3.J(Pqa.Aa, (NCa)string3);
                        break;
                    }
                    case 3: {
                        waa3.J(xra.d, stringArray2[vRa.d]);
                        break;
                    }
                    case 4: {
                        String[] a2 = stringArray2[vRa.d].split(yra.t);
                        Jh.J((Jh)eAa3, (Vector3f)new Vector3f(Float.parseFloat(a2[uSa.E]), Float.parseFloat(a2[vRa.d]), Float.parseFloat(a2[uqa.g])));
                        break;
                    }
                    case 5: {
                        String[] a2 = stringArray2[vRa.d].split(yra.t);
                        Jh.f((Jh)eAa3, (Vector3f)new Vector3f(Float.parseFloat(a2[uSa.E]), Float.parseFloat(a2[vRa.d]), Float.parseFloat(a2[uqa.g])));
                        break;
                    }
                    case 6: {
                        String[] a2 = stringArray2[vRa.d].split(yra.t);
                        Jh.l((Jh)eAa3, (Vector3f)new Vector3f(Float.parseFloat(a2[uSa.E]), Float.parseFloat(a2[vRa.d]), Float.parseFloat(a2[uqa.g])));
                        break;
                    }
                }
            }
            n4 = ++n3;
        }
        if (!waa3.J()) {
            Waa waa4 = waa2;
            waa4.J(kTa.Aa, (NCa)waa3);
            mda2.f(waa4);
        }
        return eAa3;
    }

    public qH_2(String string) {
        Object b2 = string;
        qH_2 a2 = this;
        b2 = qH_2.J((String)b2);
        if (b2 == null) {
            a2.I = rh.ERROR;
            return;
        }
        qH_2 qH_22 = a2;
        Object object = b2;
        a2.I = rh.READY;
        qH_22.A = ((Jh)object).j;
        qH_22.I = object.J();
    }

    public int J() {
        return ERa.C;
    }

    public int f() {
        return ERa.C;
    }

    public ui J(PG pG2) {
        Object b2 = pG2;
        qH_2 a2 = this;
        return ui.M;
    }

    public void J(rr rr2) {
        qH_2 b2 = rr2;
        qH_2 a2 = this;
        uKa.l((float)(b2.J() / (float)a2.J()), (float)(b2.f() / (float)a2.f()), (float)(((rr)b2).A ? JPa.N : kta.v));
        xKa xKa2 = Kpa.J().J();
        if (((rr)b2).A && xKa2.J().J(a2.A).l()) {
            return;
        }
        boolean bl2 = uKa.J();
        uKa.J();
        nLa.J();
        uKa.h();
        xKa.k = vRa.d;
        xKa.I = ((rr)b2).x.J;
        xKa2.f(a2.A, uSa.E, uSa.E, a2.I);
        uKa.J((int)jRa.m, (float)Jpa.B);
        xKa.k = uSa.E;
        uKa.m();
        nLa.C();
        uKa.K();
        if (!bl2) {
            uKa.u();
        }
    }
}

