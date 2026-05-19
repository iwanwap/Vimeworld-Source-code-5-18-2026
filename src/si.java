/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fpa
 *  JPa
 *  Kpa
 *  NPa
 *  NTa
 *  Qta
 *  RQa
 *  Rua
 *  TI
 *  UG
 *  UI
 *  VQa
 *  XTa
 *  Ypa
 *  aPa
 *  aQa
 *  di
 *  eG
 *  g
 *  hqa
 *  jsa
 *  pG
 *  pg
 *  psa
 *  pua
 *  qh
 *  rh
 *  uQa
 *  vRa
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.Base64;
import javax.imageio.ImageIO;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class si
implements Runnable {
    private final qh M;
    private final vi k;
    private final m j;
    private final boolean J;
    private static final byte[] A;
    private final di I;

    private static boolean f(BufferedInputStream bufferedInputStream) throws Exception {
        BufferedInputStream bufferedInputStream2;
        BufferedInputStream bufferedInputStream3 = bufferedInputStream2 = bufferedInputStream;
        bufferedInputStream3.mark(uua.p);
        byte[] byArray = new byte[uua.p];
        Object a2 = byArray;
        int n2 = bufferedInputStream3.read(byArray);
        bufferedInputStream3.reset();
        if (n2 < uua.p) {
            return uSa.E != 0;
        }
        if (a2[uSa.E] == hqa.K && a2[vRa.d] == Pua.Ka && a2[uqa.g] == NPa.e && a2[yRa.d] == Upa.D && (a2[AQa.P] == Fpa.ca || a2[AQa.P] == KSa.x) && a2[tTa.h] == Hta.k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(InputStream inputStream) throws Exception {
        InputStream b2 = inputStream;
        si a2 = this;
        if (b2 instanceof BufferedInputStream) {
            a2.J((BufferedInputStream)b2);
            return;
        }
        a2.J(new BufferedInputStream(b2));
    }

    private UG f(BufferedInputStream bufferedInputStream) throws Exception {
        String a22;
        int n2;
        si si2 = this;
        AD b2 = new AD();
        int n3 = n2 = si2.M.C != null ? b2.J(si2.M.C) : b2.J((InputStream)((Object)a22), uSa.E);
        if (n2 == 0) {
            if (b2.i() > di.E || b2.J() > di.E) {
                throw new IllegalStateException(new StringBuilder().insert(5 >> 3, Rua.v).append(b2.i()).append(rRa.X).append(b2.J()).append(aPa.F).append(di.E).toString());
            }
            int a22 = uSa.E;
            if (si2.M.i == TI.ENABLED) {
                a22 = vRa.d;
            } else if (si2.M.i == TI.AUTO) {
                int n4 = a22 = b2.d() > AQa.P && b2.i() * b2.J() * b2.d() > JPa.E ? vRa.d : uSa.E;
                if (a22 != 0 && OT.A) {
                    OT.J(new StringBuilder().insert(5 >> 3, ZSa.C).append(si2.M.I).toString(), new Object[uSa.E]);
                }
            }
            si si3 = si2;
            return new CH(si2.I, (g)new pG(b2, a22 != 0), si3.J, si3.M.M, si2.M.j);
        }
        a22 = n2 == vRa.d ? Ypa.J : VQa.C;
        throw new Exception(new StringBuilder().insert(3 ^ 3, zta.g).append(a22).toString());
    }

    static {
        byte[] byArray = new byte[Yqa.i];
        byArray[uSa.E] = Fsa.S;
        byArray[vRa.d] = Fua.J;
        byArray[uqa.g] = RQa.b;
        byArray[yRa.d] = hqa.K;
        byArray[AQa.P] = uua.s;
        byArray[tTa.h] = NTa.C;
        byArray[uua.p] = ITa.E;
        byArray[XTa.W] = NTa.C;
        A = byArray;
    }

    public static /* synthetic */ void J(si si2, InputStream inputStream) {
        InputStream b22 = inputStream;
        si a2 = si2;
        try {
            a2.J(b22);
            return;
        }
        catch (Exception b22) {
            a2.J(b22);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public si(di di2, qh qh2, vi vi2, m m2) {
        void a2;
        void b2;
        void d2;
        si c2;
        si e2 = qh2;
        si si2 = c2 = this;
        si si3 = c2;
        c2.I = d2;
        si3.M = e2;
        si3.k = b2;
        si2.j = a2;
        si2.J = ((qh)e2).J || !((qh)e2).A || ((qh)e2).M != UI.CLAMP ? vRa.d : uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Exception exception) {
        void a2;
        si si2 = this;
        Object b2 = si2.M.I;
        if (((String)b2).startsWith(pua.v)) {
            b2 = new File(Kpa.J().p, ((String)b2).substring(tTa.h)).getAbsolutePath();
        }
        OT.b.warn(new StringBuilder().insert(3 ^ 3, aQa.x).append((String)b2).append(wua.b).append(si2.j.J()).toString(), (Throwable)a2);
        si2.k.I = rh.ERROR;
    }

    @Override
    public void run() {
        si si2;
        block11: {
            Object a22;
            block10: {
                block9: {
                    si2 = this;
                    try {
                        if (!si2.M.I.startsWith(FRa.W)) break block9;
                        si si3 = si2;
                        si si4 = si2;
                        si4.J(new ByteArrayInputStream(si4.M.C));
                        return;
                    }
                    catch (Exception a22) {
                        si2.J(a22);
                        return;
                    }
                }
                if (!si2.M.I.startsWith(pua.v)) break block10;
                a22 = new File(Kpa.J().p, si2.M.I.substring(tTa.h));
                si2.J(Files.newInputStream(((File)a22).toPath(), new OpenOption[uSa.E]));
                return;
            }
            if (si2.M.I.startsWith(uQa.Y)) {
                a22 = OT.i.C.J(si2.M.I.substring(vRa.d));
                if (a22 == null) {
                    OT.b.warn(new StringBuilder().insert(3 >> 2, Qta.u).append(si2.M.I).append(wta.p).toString());
                    si2.k.I = rh.ERROR;
                    return;
                }
                a22.f().thenAccept(dh.J(si2));
                return;
            }
            if (!si2.M.m) break block11;
            a22 = OT.i.C.J(si2.M.I, null, si2.M.k);
            try {
                si2.J(a22.J());
                return;
            }
            catch (Exception exception) {
                a22.f();
                throw exception;
            }
        }
        si2.J(new URL(si2.M.I).openStream());
    }

    private UG J(BufferedInputStream bufferedInputStream) throws Exception {
        Object b2 = bufferedInputStream;
        si a2 = this;
        if (((we)(b2 = new we((InputStream)b2))).l()) {
            if (((we)b2).J() > di.E || ((we)b2).f() > di.E) {
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, jsa.E).append(((we)b2).J()).append(rRa.X).append(((we)b2).f()).append(aPa.F).append(di.E).toString());
            }
            si si2 = a2;
            return new CH(a2.I, (g)new eG((we)b2), si2.J, si2.M.M, a2.M.j);
        }
        BufferedImage bufferedImage = new BufferedImage(((we)b2).J(), ((we)b2).f(), uqa.g);
        int[] nArray = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
        ((we)b2).E.get(nArray);
        si si3 = a2;
        return new pg(a2.I, bufferedImage, si3.J, si3.M.M, a2.M.j);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private void J(BufferedInputStream bufferedInputStream) throws Exception {
        void a2;
        si si2 = this;
        try {
            Object object;
            Object b2;
            long l2;
            block10: {
                si si3;
                block12: {
                    block11: {
                        block9: {
                            l2 = OT.A ? System.nanoTime() : nqa.i;
                            b2 = kra.Fa;
                            if (!si.f((BufferedInputStream)a2)) break block9;
                            si si4 = si2;
                            si3 = si4;
                            si2.k.I = si4.f((BufferedInputStream)a2);
                            b2 = Cqa.C;
                            break block10;
                        }
                        if (!si.J((BufferedInputStream)a2)) break block11;
                        si si5 = si2;
                        si2.k.I = si5.J((BufferedInputStream)a2);
                        b2 = GPa.l;
                        if (!(si5.k.I instanceof CH)) break block12;
                        b2 = psa.Aa;
                        si3 = si2;
                        break block10;
                    }
                    object = ImageIO.read((InputStream)a2);
                    if (object == null) {
                        if (si2.M.I.startsWith(FRa.W)) {
                            throw new Exception(new StringBuilder().insert(3 >> 2, xTa.g).append(Base64.getEncoder().encodeToString(si2.M.C)).append(XTa.Z).toString());
                        }
                        throw new Exception(new StringBuilder().insert(3 & 4, si2.M.I).append(sra.ja).toString());
                    }
                    si si6 = si2;
                    si2.k.I = new pg(si2.I, (BufferedImage)object, si6.J, si6.M.M, si2.M.j);
                }
                si3 = si2;
            }
            si3.k.I = rh.READY;
            if (OT.A) {
                object = Mqa.y;
                if (si2.k.I instanceof CH) {
                    CH cH = (CH)si2.k.I;
                    object = new StringBuilder().insert(3 >> 2, (String)object).append(TOa.n).append(cH.l()).append(kTa.E).toString();
                }
                Object[] objectArray = new Object[uua.p];
                objectArray[uSa.E] = b2;
                objectArray[vRa.d] = si2.M.I;
                objectArray[uqa.g] = si2.k.J();
                objectArray[yRa.d] = si2.k.f();
                objectArray[AQa.P] = object;
                objectArray[tTa.h] = Float.valueOf((float)Math.round((double)(System.nanoTime() - l2) / Eqa.w) / QTa.G);
                OT.J(Fsa.n, objectArray);
            }
            return;
        }
        finally {
            a2.close();
        }
    }

    private static boolean J(BufferedInputStream bufferedInputStream) throws Exception {
        BufferedInputStream bufferedInputStream2 = bufferedInputStream;
        bufferedInputStream2.mark(A.length);
        Object a2 = new byte[A.length];
        BufferedInputStream bufferedInputStream3 = bufferedInputStream2;
        int n2 = bufferedInputStream3.read((byte[])a2);
        bufferedInputStream3.reset();
        if (n2 < A.length) {
            return uSa.E != 0;
        }
        return Arrays.equals((byte[])a2, A);
    }
}

