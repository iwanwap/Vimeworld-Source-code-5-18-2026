/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ez
 *  Gl
 *  JPa
 *  Kpa
 *  Mda
 *  NCa
 *  NPa
 *  NTa
 *  Pqa
 *  Waa
 *  Xja
 *  Yra
 *  aka
 *  cT
 *  fy
 *  id
 *  kta
 *  mFa
 *  nda
 *  pqa
 *  psa
 *  pua
 *  rba
 *  uKa
 *  uOa
 *  vPa
 *  vRa
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class CJa
implements id<Gl> {
    private static final LoadingCache<Waa, GameProfile> A = CacheBuilder.newBuilder().expireAfterAccess(kra.G, TimeUnit.SECONDS).weakKeys().build(new aka());
    private final cT I;

    public CJa(cT cT2) {
        CJa b2 = cT2;
        CJa a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        CJa i2 = gl2;
        CJa h = this;
        Mda g = i2.J(yRa.d);
        if (g != null && g.J() != null) {
            float c2;
            int d2;
            Object f92 = g.J();
            Kpa e2 = Kpa.J();
            uKa.e();
            if (i2.q()) {
                uKa.J((float)JPa.N, (float)psa.N, (float)JPa.N);
            }
            int n2 = d2 = i2 instanceof mFa || i2 instanceof nda && ((nda)i2).Fa() ? vRa.d : uSa.E;
            if (d2 == 0 && i2.Y()) {
                void a2;
                c2 = kta.v;
                float b2 = NPa.B;
                uKa.l((float)(b2 / c2), (float)(b2 / c2), (float)(b2 / c2));
                uKa.J((float)JPa.N, (float)(Yra.i * a2), (float)JPa.N);
            }
            h.I.l(rRa.T);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            if (f92 instanceof kda) {
                c2 = Jpa.y;
                uKa.J((float)JPa.N, (float)lTa.Z, (float)JPa.N);
                uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
                float f10 = c2;
                uKa.l((float)f10, (float)(-c2), (float)(-f10));
                if (d2 != 0) {
                    uKa.J((float)JPa.N, (float)sqa.Z, (float)JPa.N);
                }
                e2.J().J((Gl)i2, g, Xja.HEAD);
            } else if (f92 == Gea.GB) {
                float f11 = c2 = uOa.R;
                uKa.l((float)f11, (float)(-c2), (float)(-f11));
                if (d2 != 0) {
                    uKa.J((float)JPa.N, (float)rRa.T, (float)JPa.N);
                }
                GameProfile b2 = null;
                if (g.M()) {
                    i2 = g.J();
                    if (i2.J(Pqa.Aa, NTa.C)) {
                        try {
                            b2 = A.get(i2.J(Pqa.Aa));
                        }
                        catch (ExecutionException f92) {}
                    } else if (i2.J(Pqa.Aa, Yqa.i) && !Ez.J((String)(f92 = i2.J(Pqa.Aa)))) {
                        b2 = fy.J((GameProfile)new GameProfile(null, (String)f92));
                        i2.J(Pqa.Aa, (NCa)rba.J((Waa)new Waa(), (GameProfile)b2));
                    }
                }
                Mka.A.J(vPa.b, JPa.N, vPa.b, DZ.UP, Hra.Ga, g.J(), b2, pua.o);
            }
            uKa.D();
        }
    }

    public boolean J() {
        return vRa.d != 0;
    }
}

