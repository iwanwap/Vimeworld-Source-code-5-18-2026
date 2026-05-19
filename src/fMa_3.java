/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  ERa
 *  INa
 *  KA
 *  Kna
 *  Kpa
 *  NQa
 *  Oz
 *  Qsa
 *  UIa
 *  Vna
 *  Ypa
 *  ZRa
 *  Zoa
 *  kNa
 *  ld
 *  lqa
 *  mca
 *  pua
 *  uKa
 *  vRa
 *  wC
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fMa_3
implements PB {
    private final ResourceLocation j;
    private final mca J;
    public final /* synthetic */ Zoa A;
    private final List<Vna> I;

    @Override
    public ld J() {
        fMa_3 a2;
        return new CY(a2.J.C());
    }

    public fMa_3(Zoa zoa2, mca mca2) {
        String a22;
        fMa_3 b2;
        Object c2 = zoa2;
        fMa_3 fMa_32 = b2 = this;
        b2.A = c2;
        fMa_32.J = a22;
        fMa_32.I = Lists.newArrayList();
        for (String a22 : fMa_32.J.J()) {
            a22 = Kpa.J().J().J(a22);
            if (a22 == null) continue;
            b2.I.add((Vna)a22);
        }
        if (!b2.I.isEmpty()) {
            c2 = b2.I.get(new Random().nextInt(b2.I.size())).J().getName();
            b2.j = XW.J((String)c2);
            XW.J(b2.j, (String)c2);
            return;
        }
        b2.j = UIa.J();
    }

    @Override
    public void J(kNa kNa2) {
        fMa_3 b2 = kNa2;
        fMa_3 a2 = this;
        b2.J((wC)new INa(a2.I));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(float f2, int n2) {
        void a2;
        void b2;
        fMa_3 fMa_32 = this;
        int c22 = pua.o;
        String string = Kna.l((String)fMa_32.J.l());
        if (string.length() >= uqa.g) {
            c22 = Kpa.J().Ea.f(string.charAt(vRa.d));
        }
        if (c22 >= 0) {
            float f3 = (float)(c22 >> ERa.C & osa.Ja) / NQa.Y;
            float f4 = (float)(c22 >> Yqa.i & osa.Ja) / NQa.Y;
            float c22 = (float)(c22 & osa.Ja) / NQa.Y;
            KA.J((int)vRa.d, (int)vRa.d, (int)Ypa.A, (int)Ypa.A, (int)(Oz.J((float)(f3 * b2), (float)(f4 * b2), (float)(c22 * b2)) | a2 << osa.c));
        }
        Kpa.J().J().J(fMa_32.j);
        void v0 = b2;
        uKa.f((float)v0, (float)v0, (float)v0, (float)((float)a2 / NQa.Y));
        KA.J((int)uqa.g, (int)uqa.g, (float)Qsa.k, (float)Qsa.k, (int)Yqa.i, (int)Yqa.i, (int)lqa.s, (int)lqa.s, (float)EPa.r, (float)EPa.r);
        KA.J((int)uqa.g, (int)uqa.g, (float)ZRa.l, (float)Qsa.k, (int)Yqa.i, (int)Yqa.i, (int)lqa.s, (int)lqa.s, (float)EPa.r, (float)EPa.r);
    }

    @Override
    public boolean J() {
        fMa_3 a2;
        if (!a2.I.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

