/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  EC
 *  ERa
 *  Kba
 *  Kpa
 *  Lra
 *  NPa
 *  NTa
 *  Toa
 *  XTa
 *  Xc
 *  Ypa
 *  Zta
 *  aA
 *  bqa
 *  cQa
 *  cRa
 *  coa
 *  cra
 *  iMa
 *  kMa
 *  ld
 *  lqa
 *  pPa
 *  pua
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  uOa
 *  vNa
 *  vPa
 *  vRa
 *  wBa
 *  wOa
 *  wra
 *  ysa
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

public final class coa_1
implements Xc {
    private final EC M;
    private final Kpa k;
    private final uba j;
    private GameProfile J;
    private static final Logger A = LogManager.getLogger();
    private static byte[] I;

    public void J(jCa jCa2) {
        jCa b2 = jCa2;
        coa_1 a2 = this;
        a2.J(b2.J(), b2.J(), b2.J().getBytes(StandardCharsets.ISO_8859_1));
    }

    public void J(jAa jAa2) {
        coa_1 a2;
        jAa b2 = jAa2;
        coa_1 coa_12 = a2 = this;
        coa_12.J = b2.J();
        coa_12.j.J(wBa.PLAY);
        coa_1 coa_13 = a2;
        coa_1 coa_14 = a2;
        coa_12.j.J((aA)new iMa(coa_13.k, coa_13.M, coa_14.j, coa_14.J));
    }

    public void J(sBa sBa2) {
        sBa b2 = sBa2;
        coa_1 a2 = this;
        a2.j.J(b2.J());
    }

    private static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return a2 >> b2 & vRa.d;
    }

    public void J(iBa iBa2) {
        iBa b2 = iBa2;
        coa_1 a2 = this;
        if (!a2.j.d()) {
            a2.j.J(b2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ld ld2) {
        void a2;
        int b2;
        coa_1 coa_12 = this;
        if (coa_12.j.C() && coa_12.j.J() != null && (b2 = kMa.J((String)coa_12.j.J().split(Era.Aa)[uSa.E].toLowerCase())) != pua.o) {
            coa_1 coa_13 = coa_12;
            coa_12.k.J((EC)new kMa(coa_13.M, coa_13.k, b2, (ld)a2));
            return;
        }
        coa_12.k.J((EC)new Toa(coa_12.M, xSa.e, (ld)a2));
    }

    public void J(dBa dBa2) {
        int n2;
        Object a2;
        coa_1 coa_12 = this;
        a2 = a2.I;
        int b2 = ByteBuffer.wrap(a2.I).getInt();
        int n3 = I[coa_1.J(b2, Ypa.A) | coa_1.J(b2, AQa.P) << vRa.d | coa_1.J(b2, uqa.g) << uqa.g | coa_1.J(b2, Lra.e) << yRa.d];
        int n4 = n2 = uSa.E;
        while (n4 < ((byte[])a2).length) {
            int n5 = n2++;
            a2[n5] = (byte)(a2[n5] ^ n3);
            n4 = n2;
        }
        n2 = coa_1.J(b2, tTa.h) | coa_1.J(b2, WOa.fa) << vRa.d | coa_1.J(b2, yta.Ka) << uqa.g | coa_1.J(b2, ITa.A) << yRa.d;
        n3 = coa_1.J(b2, uua.s) | coa_1.J(b2, XTa.W) << vRa.d | coa_1.J(b2, wOa.t) << uqa.g | coa_1.J(b2, tua.U) << yRa.d;
        b2 = coa_1.J(b2, cQa.o) | coa_1.J(b2, pPa.f) << vRa.d | coa_1.J(b2, kTa.g) << uqa.g | coa_1.J(b2, Fsa.d) << yRa.d;
        ByteBuffer byteBuffer = ByteBuffer.wrap(a2);
        a2 = byteBuffer;
        byteBuffer.getInt();
        a2.get(new byte[n2]);
        byte[] byArray = a2;
        long l2 = byArray.getLong();
        byArray.get(new byte[n3]);
        byte[] byArray2 = a2;
        n3 = byArray2.getInt();
        byArray2.get(new byte[b2]);
        byte[] byArray3 = a2;
        byte[] byArray4 = new byte[byArray3.getInt()];
        a2 = byArray4;
        byArray3.get(byArray4);
        coa_12.J(az.J(a2), ByteBuffer.allocate(AQa.P).putInt(n3).array(), Long.toString(l2, ERa.C).getBytes(StandardCharsets.ISO_8859_1));
    }

    /*
     * WARNING - void declaration
     */
    public coa_1(uba uba2, Kpa kpa2, EC eC2) {
        void b2;
        void c2;
        coa_1 a2;
        coa_1 d2 = eC2;
        coa_1 coa_12 = a2 = this;
        a2.j = c2;
        coa_12.k = b2;
        coa_12.M = d2;
    }

    static {
        byte[] byArray = new byte[ERa.C];
        byArray[uSa.E] = Jsa.ha;
        byArray[vRa.d] = Psa.M;
        byArray[uqa.g] = cRa.h;
        byArray[yRa.d] = ITa.A;
        byArray[AQa.P] = iSa.x;
        byArray[tTa.h] = Iqa.M;
        byArray[uua.p] = vPa.Ka;
        byArray[XTa.W] = yOa.B;
        byArray[Yqa.i] = bqa.Ga;
        byArray[WOa.fa] = EPa.O;
        byArray[NTa.C] = Jqa.S;
        byArray[pPa.f] = ITa.V;
        byArray[lqa.s] = rRa.R;
        byArray[uua.s] = Zta.Ma;
        byArray[hpa.Z] = tua.U;
        byArray[Ypa.A] = wra.e;
        I = byArray;
    }

    /*
     * WARNING - void declaration
     */
    private void J(PublicKey publicKey, byte[] byArray, byte[] byArray2) {
        void b2;
        coa_1 coa_12;
        void c2;
        String a2;
        long l2;
        coa_1 coa_13 = this;
        try {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = mSa.G;
            l2 = (Long)NativeClassLoaderUtils.call((Object)objectArray);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            OT.b.warn(new StringBuilder().insert(5 >> 3, cRa.Y).append(unsatisfiedLinkError.getMessage()).append(hpa.b).toString());
            coa_13.j.J((ld)new CY(DPa.H));
            return;
        }
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = uOa.h;
        objectArray[vRa.d] = l2;
        objectArray[uqa.g] = a2;
        objectArray[yRa.d] = c2.getEncoded();
        byte[] byArray3 = (byte[])NativeClassLoaderUtils.call((Object)objectArray);
        a2 = new BigInteger(byArray3).toString(ERa.C);
        Object[] objectArray2 = new Object[yRa.d];
        objectArray2[uSa.E] = ysa.p;
        objectArray2[vRa.d] = l2;
        objectArray2[uqa.g] = c2.getEncoded();
        byArray3 = (byte[])NativeClassLoaderUtils.call((Object)objectArray2);
        if (coa_13.k.J() != null && coa_13.k.J().J()) {
            try {
                coa_13.J().joinServer(coa_13.k.J().J(), coa_13.k.J().l(), a2);
                coa_12 = coa_13;
            }
            catch (AuthenticationException d2) {
                A.warn(ZSa.P);
                coa_12 = coa_13;
            }
        } else {
            try {
                coa_13.J().joinServer(coa_13.k.J().J(), coa_13.k.J().l(), a2);
                coa_12 = coa_13;
            }
            catch (AuthenticationUnavailableException d2) {
                A.warn(Jpa.k, (Throwable)d2);
                Object[] objectArray3 = new Object[vRa.d];
                objectArray3[uSa.E] = new CZ(NPa.y, new Object[uSa.E]);
                coa_13.j.J((ld)new CZ(gsa.z, objectArray3));
                return;
            }
            catch (InvalidCredentialsException d2) {
                Object[] objectArray4 = new Object[vRa.d];
                objectArray4[uSa.E] = new CZ(cra.k, new Object[uSa.E]);
                coa_13.j.J((ld)new CZ(gsa.z, objectArray4));
                return;
            }
            catch (AuthenticationException d2) {
                Object[] objectArray5 = new Object[vRa.d];
                objectArray5[uSa.E] = d2.getMessage();
                coa_13.j.J((ld)new CZ(gsa.z, objectArray5));
                return;
            }
        }
        coa_12.j.J((KC)new Kba(byArray3, (PublicKey)c2, (byte[])b2), (GenericFutureListener<? extends Future<? super Void>>)new vNa((coa)coa_13, l2), new GenericFutureListener[uSa.E]);
    }

    private MinecraftSessionService J() {
        coa_1 a2;
        return a2.k.J();
    }

    public static /* synthetic */ uba J(coa a2) {
        return a2.j;
    }
}

