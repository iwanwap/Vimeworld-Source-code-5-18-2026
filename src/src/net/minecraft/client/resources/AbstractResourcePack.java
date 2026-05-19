/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Bsa
 *  Cra
 *  EQa
 *  ERa
 *  Epa
 *  FPa
 *  FTa
 *  Fd
 *  Fpa
 *  ISa
 *  JPa
 *  JQa
 *  JSa
 *  Kpa
 *  LQa
 *  Lqa
 *  Lra
 *  NOa
 *  NPa
 *  NQa
 *  NTa
 *  PTa
 *  Ppa
 *  QSa
 *  Qqa
 *  Qsa
 *  RQa
 *  Rua
 *  SOa
 *  SQa
 *  SRa
 *  Sqa
 *  Ssa
 *  TPa
 *  TQa
 *  Tpa
 *  Uta
 *  VQa
 *  Vua
 *  WQa
 *  WSa
 *  Wsa
 *  XSa
 *  XTa
 *  Xsa
 *  YSa
 *  Ypa
 *  Yra
 *  Ysa
 *  ZRa
 *  Zpa
 *  Zta
 *  Zua
 *  aQa
 *  aqa
 *  bRa
 *  bSa
 *  bpa
 *  bqa
 *  cQa
 *  cRa
 *  cra
 *  dpa
 *  fTa
 *  fpa
 *  hTa
 *  hqa
 *  isa
 *  jRa
 *  jpa
 *  jsa
 *  kPa
 *  kga
 *  kpa
 *  lPa
 *  lqa
 *  nQa
 *  oqa
 *  pPa
 *  pQa
 *  pqa
 *  qta
 *  uOa
 *  vPa
 *  vQa
 *  vRa
 *  vpa
 *  wOa
 *  wra
 *  yQa
 *  yra
 *  ysa
 *  zTa
 *  zsa
 */
package net.minecraft.client.resources;

import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.obfuscator.KeepClassName;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class AbstractResourcePack
implements IResourcePack {
    private static final Set<String> M;
    private static final Logger k;
    public final File j;
    private static final String[] J;
    private static final List<Pattern> A;
    private static final Set<String> I;

    static {
        int n2;
        k = LogManager.getLogger();
        String[] stringArray = new String[ATa.L];
        stringArray[uSa.E] = cRa.V;
        stringArray[vRa.d] = lqa.q;
        stringArray[uqa.g] = TOa.I;
        stringArray[yRa.d] = YSa.fa;
        stringArray[AQa.P] = csa.O;
        stringArray[tTa.h] = Pua.X;
        stringArray[uua.p] = rRa.la;
        stringArray[XTa.W] = qQa.m;
        stringArray[Yqa.i] = Ysa.W;
        stringArray[WOa.fa] = Jta.D;
        stringArray[NTa.C] = Epa.i;
        stringArray[pPa.f] = JQa.m;
        stringArray[lqa.s] = hTa.ja;
        stringArray[uua.s] = jsa.fa;
        stringArray[hpa.Z] = VQa.T;
        stringArray[Ypa.A] = NQa.t;
        stringArray[ERa.C] = lPa.D;
        stringArray[yta.Ka] = mPa.c;
        stringArray[yOa.B] = cra.Y;
        stringArray[wOa.t] = nQa.f;
        stringArray[kTa.j] = fTa.K;
        stringArray[wOa.h] = FTa.v;
        stringArray[cQa.o] = yQa.o;
        stringArray[AQa.ba] = jRa.h;
        stringArray[osa.c] = IPa.C;
        stringArray[kTa.g] = Xsa.G;
        stringArray[ITa.E] = vTa.O;
        stringArray[Lra.e] = Uta.X;
        stringArray[EPa.O] = lqa.K;
        stringArray[ITa.A] = zua.K;
        stringArray[Fsa.d] = NOa.c;
        stringArray[tua.U] = ATa.I;
        stringArray[fPa.i] = Hta.O;
        stringArray[Zqa.G] = cQa.D;
        stringArray[Tpa.z] = nOa.D;
        stringArray[TQa.ca] = Era.E;
        stringArray[Qsa.Ha] = Lra.ca;
        stringArray[LQa.c] = SOa.Da;
        stringArray[ISa.E] = lPa.c;
        stringArray[CRa.L] = Nra.Z;
        stringArray[wra.P] = jsa.fa;
        stringArray[kra.U] = rpa.J;
        stringArray[cQa.i] = jsa.f;
        stringArray[iSa.x] = ppa.o;
        stringArray[Yqa.D] = Ura.d;
        stringArray[wra.e] = Ysa.W;
        stringArray[Bpa.Ha] = Jta.D;
        stringArray[uOa.F] = Epa.i;
        stringArray[QSa.p] = lQa.j;
        stringArray[jRa.q] = gua.p;
        stringArray[vpa.o] = Tqa.X;
        stringArray[cPa.Q] = jRa.Ka;
        stringArray[FPa.F] = YSa.Ga;
        stringArray[Bpa.Z] = Wqa.A;
        stringArray[GPa.C] = TPa.p;
        stringArray[Fpa.ca] = BQa.B;
        stringArray[Upa.D] = sra.X;
        stringArray[KSa.x] = uSa.N;
        stringArray[lQa.R] = IPa.h;
        stringArray[lPa.p] = zTa.D;
        stringArray[Psa.M] = kpa.I;
        stringArray[tua.w] = oua.fa;
        stringArray[ITa.V] = Hra.C;
        stringArray[Ssa.u] = Mqa.a;
        stringArray[ysa.s] = vua.W;
        stringArray[fPa.ga] = Bua.l;
        stringArray[SPa.T] = wsa.X;
        stringArray[Vra.b] = PRa.r;
        stringArray[WPa.L] = lQa.ia;
        stringArray[Cra.S] = EPa.p;
        stringArray[NPa.e] = lPa.D;
        stringArray[hqa.K] = mPa.c;
        stringArray[Eqa.Ka] = aQa.t;
        stringArray[Pua.Ka] = VPa.j;
        stringArray[bqa.Ga] = Tqa.H;
        stringArray[jRa.X] = SOa.R;
        stringArray[NPa.i] = EQa.D;
        stringArray[uqa.b] = WOa.W;
        stringArray[RQa.b] = WQa.P;
        stringArray[vPa.Ka] = PQa.W;
        stringArray[Fua.J] = AQa.n;
        stringArray[csa.A] = GPa.Z;
        stringArray[aqa.Aa] = xua.Ha;
        stringArray[pPa.ja] = cra.Ga;
        stringArray[Vua.J] = jpa.h;
        stringArray[Ira.ga] = pPa.H;
        stringArray[Bra.C] = pqa.z;
        stringArray[Jqa.S] = Yqa.ja;
        stringArray[ZRa.D] = kua.P;
        stringArray[bSa.Da] = NOa.Aa;
        stringArray[Jsa.ha] = JPa.Ga;
        stringArray[rRa.R] = NQa.Ha;
        stringArray[iSa.ca] = eta.M;
        stringArray[fPa.t] = Xpa.Q;
        stringArray[bpa.I] = yra.J;
        stringArray[pqa.ga] = Bra.w;
        stringArray[zua.m] = Rua.G;
        stringArray[Hta.k] = kua.ga;
        stringArray[dpa.A] = ATa.n;
        stringArray[zOa.v] = Pua.L;
        stringArray[ySa.T] = pQa.T;
        stringArray[zTa.C] = ROa.v;
        stringArray[jRa.v] = JSa.Ha;
        stringArray[Bsa.E] = tua.F;
        stringArray[Lqa.h] = SRa.Q;
        stringArray[xua.S] = ISa.Aa;
        stringArray[Yra.j] = vQa.l;
        stringArray[jpa.E] = NOa.D;
        stringArray[Jra.o] = Tpa.Ka;
        stringArray[rSa.i] = Eqa.W;
        stringArray[Iqa.M] = hqa.u;
        stringArray[fPa.z] = Bta.V;
        stringArray[BRa.E] = opa.Ga;
        stringArray[XSa.C] = SQa.Q;
        stringArray[WSa.o] = isa.Ha;
        stringArray[pta.ba] = PQa.m;
        stringArray[rQa.s] = oua.G;
        stringArray[Ppa.K] = PRa.b;
        stringArray[Zta.Q] = Gta.c;
        stringArray[yta.g] = aqa.g;
        stringArray[sOa.D] = BRa.ca;
        stringArray[APa.J] = tua.K;
        stringArray[Zta.Ma] = Wsa.X;
        stringArray[JPa.ga] = fPa.u;
        stringArray[cPa.Ea] = SQa.N;
        stringArray[ySa.Z] = Iqa.j;
        stringArray[rQa.i] = qta.J;
        stringArray[cRa.h] = wua.i;
        stringArray[XOa.h] = VQa.T;
        stringArray[rpa.F] = Jra.r;
        stringArray[GPa.G] = Cqa.j;
        stringArray[vRa.Ea] = zsa.ha;
        stringArray[gsa.Ja] = WRa.h;
        stringArray[ITa.Da] = eta.h;
        stringArray[Qqa.Ja] = tua.S;
        stringArray[RQa.R] = bqa.w;
        stringArray[PRa.D] = rRa.d;
        J = stringArray;
        M = new HashSet<String>();
        A = new ArrayList<Pattern>();
        I = new HashSet<String>();
        int n3 = n2 = uSa.E;
        while (n3 < J.length) {
            if (J[n2].contains(pPa.k) || J[n2].contains(dqa.X)) {
                A.add(Pattern.compile(new StringBuilder().insert(3 ^ 3, CRa.D).append(J[n2]).append(PQa.U).toString()));
            } else {
                M.add(J[n2]);
            }
            n3 = ++n2;
        }
        I.add(hqa.fa);
        I.add(oua.M);
        I.add(Qpa.F);
        I.add(Asa.c);
        I.add(fpa.w);
        I.add(yQa.L);
        I.add(Ypa.H);
        I.add(Ysa.Aa);
        I.add(aua.ba);
        I.add(Bra.d);
        I.add(kpa.v);
        I.add(FPa.n);
        I.add(mSa.I);
        I.add(ATa.P);
        I.add(Zpa.j);
        I.add(osa.R);
        I.add(Sqa.n);
        I.add(bSa.c);
        I.add(pta.z);
        I.add(Wqa.f);
        I.add(kua.I);
        I.add(Mqa.E);
        I.add(Jqa.P);
        I.add(oua.T);
        I.add(hTa.Ia);
        I.add(XSa.s);
        I.add(tpa.z);
        I.add(kTa.fa);
        I.add(nQa.I);
        I.add(ATa.d);
        I.add(Lra.a);
        I.add(WQa.C);
        I.add(kPa.fa);
        I.add(Pua.i);
        I.add(TPa.b);
        I.add(Bpa.ha);
        I.add(uOa.Aa);
        I.add(xTa.F);
        I.add(aqa.w);
        I.add(PTa.n);
        I.add(isa.F);
        I.add(wua.ja);
        I.add(oqa.K);
        I.add(bRa.G);
        I.add(mSa.A);
        I.add(BPa.X);
        I.add(vpa.R);
        I.add(Npa.w);
        I.add(Uta.d);
        I.add(IPa.Da);
        I.add(LRa.l);
        I.add(BQa.Ha);
        I.add(uua.y);
        I.add(Cqa.k);
        I.add(iSa.Da);
    }

    public abstract boolean J(String var1);

    public static String J(File file, File file2) {
        File b2 = file2;
        File a2 = file;
        return a2.toURI().relativize(b2.toURI()).getPath();
    }

    @Override
    public boolean J(ResourceLocation resourceLocation) {
        KeepClassName b2 = resourceLocation;
        AbstractResourcePack a2 = this;
        return a2.J(AbstractResourcePack.J((ResourceLocation)b2));
    }

    @Override
    public BufferedImage J() throws IOException {
        AbstractResourcePack a2;
        return gLa.J(a2.J(kua.L));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream J(ResourceLocation resourceLocation, String string, InputStream inputStream) throws IOException {
        ResourceLocation resourceLocation2 = resourceLocation;
        try {
            void a2;
            String b2;
            b2 = b2.replace((char)iSa.ca, (char)uOa.F);
            if (b2.endsWith(KPa.C) && b2.contains(AQa.Ma)) {
                int n2;
                String string2 = b2;
                String string3 = string2.substring(b2.lastIndexOf(uOa.F) + vRa.d, string2.lastIndexOf(KPa.C));
                if (M.contains(string3)) {
                    return a2;
                }
                for (Pattern c2 : A) {
                    if (!c2.matcher(string3).matches()) continue;
                    return a2;
                }
                BufferedImage bufferedImage = ImageIO.read((InputStream)a2);
                int c2 = bufferedImage.getWidth();
                int n3 = bufferedImage.getHeight();
                int[] nArray = bufferedImage.getRGB(uSa.E, uSa.E, c2, n3, null, uSa.E, c2);
                int n4 = n2 = uSa.E;
                while (true) {
                    if (n4 >= nArray.length) {
                        BufferedImage bufferedImage2 = bufferedImage;
                        bufferedImage2.setRGB(uSa.E, uSa.E, c2, n3, nArray, uSa.E, c2);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ImageIO.write((RenderedImage)bufferedImage2, GPa.l, byteArrayOutputStream);
                        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    }
                    int n5 = n2++;
                    nArray[n5] = nArray[n5] | gsa.X;
                    n4 = n2;
                }
            }
            if (I.contains(b2)) {
                return Kpa.J().J().k.J(resourceLocation2);
            }
            return a2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public String J() {
        AbstractResourcePack a2;
        return a2.j.getName();
    }

    public void J(String string) {
        String b2 = string;
        AbstractResourcePack a2 = this;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2;
        objectArray[vRa.d] = a2.j;
        k.warn(Zua.I, objectArray);
    }

    private static String J(ResourceLocation a2) {
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = vpa.r;
        objectArray[vRa.d] = a2.f();
        objectArray[uqa.g] = a2.J();
        return String.format(Ppa.j, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Fd> T J(kga kga2, InputStream inputStream, String string) {
        void a2;
        kga kga3 = kga2;
        JsonObject jsonObject = null;
        Object c2 = null;
        try {
            void b2;
            c2 = new BufferedReader(new InputStreamReader((InputStream)b2, Charsets.UTF_8));
            jsonObject = new JsonParser().parse((Reader)c2).getAsJsonObject();
        }
        catch (RuntimeException b2) {
            throw new JsonParseException(b2);
        }
        finally {
            IOUtils.closeQuietly((Reader)c2);
        }
        return (T)kga3.J((String)a2, jsonObject);
    }

    public AbstractResourcePack(File file) {
        File b2 = file;
        AbstractResourcePack a2 = this;
        a2.j = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public <T extends Fd> T J(kga kga2, String string) throws IOException {
        void b2;
        String c2 = string;
        AbstractResourcePack a2 = this;
        return AbstractResourcePack.J((kga)b2, a2.J(tpa.C), c2);
    }

    public abstract InputStream J(String var1) throws IOException;

    @Override
    public InputStream J(ResourceLocation resourceLocation) throws IOException {
        Object b2 = resourceLocation;
        AbstractResourcePack a2 = this;
        KeepClassName keepClassName = b2;
        Object object = b2 = AbstractResourcePack.J((ResourceLocation)keepClassName);
        return AbstractResourcePack.J((ResourceLocation)keepClassName, (String)object, a2.J((String)object));
    }
}

