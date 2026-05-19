/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aia
 *  BGa
 *  BIa
 *  CZ
 *  DIa
 *  Gha
 *  HIa
 *  HZ
 *  Hga
 *  JIa
 *  Jha
 *  LHa
 *  MIa
 *  Mha
 *  Mia
 *  NGa
 *  OCa
 *  Oc
 *  PHa
 *  Qc
 *  TPa
 *  UHa
 *  Uga
 *  VHa
 *  WHa
 *  Wga
 *  Wia
 *  Xga
 *  YIa
 *  Yga
 *  Yia
 *  Zga
 *  aia
 *  bGa
 *  bHa
 *  caa
 *  dha
 *  dia
 *  gha
 *  hHa
 *  iga
 *  jia
 *  kHa
 *  kia
 *  lGa
 *  ld
 *  lda
 *  lia
 *  nia
 *  pGa
 *  pY
 *  pia
 *  qHa
 *  qga
 *  sga
 *  uGa
 *  vRa
 *  xIa
 *  zGa
 *  zga
 */
public class saa_3
extends HZ
implements Oc {
    public saa_3() {
        saa_3 saa_32;
        saa_3 a2;
        a2.J((Qc)new Aia());
        a2.J((Qc)new qHa());
        a2.J((Qc)new gha());
        a2.J((Qc)new iga());
        a2.J((Qc)new sga());
        a2.J((Qc)new pGa());
        a2.J((Qc)new iHa());
        a2.J((Qc)new BIa());
        a2.J((Qc)new YIa());
        a2.J((Qc)new Bha());
        a2.J((Qc)new Wia());
        a2.J((Qc)new lia());
        a2.J((Qc)new xIa());
        a2.J((Qc)new dIa());
        a2.J((Qc)new UHa());
        a2.J((Qc)new kHa());
        a2.J((Qc)new JIa());
        a2.J((Qc)new jia());
        a2.J((Qc)new Uga());
        a2.J((Qc)new PGa());
        a2.J((Qc)new kia());
        a2.J((Qc)new BGa());
        a2.J((Qc)new Xga());
        a2.J((Qc)new DIa());
        a2.J((Qc)new Hga());
        a2.J((Qc)new aHa());
        a2.J((Qc)new qga());
        a2.J((Qc)new pia());
        a2.J((Qc)new NGa());
        a2.J((Qc)new Sga());
        a2.J((Qc)new dha());
        a2.J((Qc)new dia());
        a2.J((Qc)new XGa());
        a2.J((Qc)new Yga());
        a2.J((Qc)new SHa());
        a2.J((Qc)new zGa());
        a2.J((Qc)new uia());
        a2.J((Qc)new nha());
        a2.J((Qc)new Wga());
        a2.J((Qc)new Mia());
        a2.J((Qc)new DGa());
        a2.J((Qc)new bGa());
        a2.J((Qc)new VHa());
        if (OCa.J().a()) {
            Qc qc2 = a2.J((Qc)new hHa());
            saa_3 saa_33 = a2;
            a2.J((Qc)new lGa());
            saa_32 = saa_33;
            saa_33.J((Qc)new MIa());
            a2.J((Qc)new Zga());
            a2.J((Qc)new nia());
            a2.J((Qc)new Jha());
            a2.J((Qc)new uGa());
            a2.J((Qc)new zga());
            a2.J((Qc)new WHa());
            a2.J((Qc)new Yia());
            a2.J((Qc)new LHa());
            a2.J((Qc)new bHa());
            a2.J((Qc)new aia());
            a2.J((Qc)new HIa());
            a2.J((Qc)new Gha());
        } else {
            saa_3 saa_34 = a2;
            saa_32 = saa_34;
            saa_34.J((Qc)new PHa());
        }
        Mha.setAdminCommander((Oc)saa_32);
    }

    /*
     * WARNING - void declaration
     */
    public void J(u u2, Qc qc2, int n2, String string, Object ... objectArray) {
        void c2;
        void a2;
        void b2;
        u f2 = u2;
        saa_3 e2 = this;
        int n3 = vRa.d;
        OCa oCa2 = OCa.J();
        if (!f2.f()) {
            n3 = uSa.E;
        }
        Object[] objectArray2 = new Object[uqa.g];
        objectArray2[uSa.E] = f2.J();
        objectArray2[vRa.d] = new CZ((String)b2, (Object[])a2);
        CZ cZ2 = new CZ(TPa.l, objectArray2);
        cZ2.J().J(pY.GRAY);
        cZ2.J().i(Boolean.valueOf(vRa.d != 0));
        if (n3 != 0) {
            for (Sx sx2 : oCa2.J().J()) {
                int n4;
                void d2;
                if (sx2 == f2 || !oCa2.J().f(sx2.J()) || !d2.canCommandSenderUseCommand(f2)) continue;
                int n5 = f2 instanceof OCa && OCa.J().D() ? vRa.d : uSa.E;
                int n6 = n4 = f2 instanceof lda && OCa.J().C() ? vRa.d : uSa.E;
                if (n5 == 0 && n4 == 0 && (f2 instanceof lda || f2 instanceof OCa)) continue;
                sx2.J((ld)cZ2);
            }
        }
        if (f2 != oCa2 && oCa2.G[uSa.E].J().f(cTa.X)) {
            oCa2.J((ld)cZ2);
        }
        boolean bl2 = oCa2.G[uSa.E].J().f(Ura.Q);
        if (f2 instanceof caa) {
            bl2 = ((caa)f2).J();
        }
        if ((c2 & vRa.d) != vRa.d && bl2 || f2 instanceof OCa) {
            f2.J((ld)new CZ((String)b2, (Object[])a2));
        }
    }
}

