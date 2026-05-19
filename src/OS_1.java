/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DE
 *  Dpa
 *  EC
 *  Fr
 *  JSa
 *  Kpa
 *  M
 *  Mp
 *  Nq
 *  ON
 *  PQ
 *  QS
 *  Rm
 *  Tg
 *  Uqa
 *  XM
 *  YL
 *  dN
 *  fO
 *  iO
 *  k
 *  pm
 *  sI
 *  tp
 *  uw
 *  vRa
 *  wi
 *  xy
 *  zU
 */
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import paulscode.sound.SoundSystem;

public final class OS_1 {
    private final eq i;
    private static final Logger M = LogManager.getLogger();
    private static final boolean k;
    private final OT j;
    private final wi J;
    private static final boolean A;
    public static String I;

    public static /* synthetic */ Logger J() {
        return M;
    }

    /*
     * Exception decompiling
     */
    public void J(Cda var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, int n2, byte[] byArray, byte[] byArray2) throws IOException {
        void a2;
        void b2;
        void c2;
        String string2 = string;
        String d2 = Kpa.J();
        String string3 = fta.h;
        if (d2 != null && ((Kpa)d2).c != null) {
            string3 = ((Kpa)d2).c.J();
        }
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = string2;
        objectArray[vRa.d] = (int)c2;
        objectArray[uqa.g] = string3;
        M.warn(Wqa.ja, objectArray);
        if (Mqa.y.equals(string2)) {
            if (OT.i.l == null) {
                WF.l();
                WF.J().J().J(DE.SERVER_MAINTENANCE, yRa.d);
            }
            return;
        }
        OT.i.l = new Dpa((M)new Mp(), (SoundSystem)Kpa.J().J().J().J(), Kpa.J().c.J(), string2, (int)c2, (byte[])b2, (byte[])a2);
        OT.i.l.d();
    }

    public OS_1(OT oT2) {
        OS_1 a2;
        OT b2 = oT2;
        OS_1 oS_1 = a2 = this;
        a2.j = b2;
        oS_1.i = ((OT)a2.j).F;
        oS_1.J = b2.H;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(iO iO2) throws Exception {
        void a2;
        OS_1 oS_1 = this;
        switch (Nq.I[a2.getActionCase().ordinal()]) {
            case 1: {
                zU.M.d();
                I = null;
                oS_1.j.J();
                return;
            }
            case 2: {
                Iterator<Object> b2 = a2.getAdd2D().getElementList().iterator();
                Iterator<Object> iterator = b2;
                while (iterator.hasNext()) {
                    XM xM2 = (XM)b2.next();
                    iterator = b2;
                    oS_1.i.J(Bp.J(xM2, oS_1.i));
                }
                return;
            }
            case 3: {
                Iterator iterator;
                Iterator<Object> b2 = Fr.I;
                ON oN2 = a2.getAdd2Dgroup();
                if (oN2.hasVisibility()) {
                    b2 = new Fr(oN2.getVisibility());
                }
                Iterator iterator2 = iterator = oN2.getElementsList().iterator();
                while (iterator2.hasNext()) {
                    XM xM3 = (XM)iterator.next();
                    Bp bp2 = Bp.J(xM3, oS_1.i);
                    iterator2 = iterator;
                    bp2.w = b2;
                    oS_1.i.J(bp2);
                }
                return;
            }
            case 4: {
                Iterator<Object> b2 = a2.getRemove2D().getId();
                OS_1 oS_12 = oS_1;
                if (((String)((Object)b2)).endsWith(JSa.a)) {
                    Iterator<Object> iterator = b2;
                    oS_12.i.J(((String)((Object)iterator)).substring(uSa.E, ((String)((Object)iterator)).length() - vRa.d));
                    return;
                }
                oS_12.i.f((String)((Object)b2));
                return;
            }
            case 5: {
                oS_1.i.e();
                return;
            }
            case 6: {
                Iterator iterator;
                Iterator<Object> b2 = a2.getEdit2D();
                List list = tp.J((k)oS_1.i, (fO)b2.getEdit());
                Iterator iterator3 = iterator = list.iterator();
                while (iterator3.hasNext()) {
                    Bp bp3 = (Bp)iterator.next();
                    iterator3 = iterator;
                    bp3.J(b2.getEdit());
                }
                return;
            }
            case 7: {
                PQ pQ2;
                Iterator<Object> b2 = a2.getOpenGui();
                PQ pQ3 = pQ2 = new PQ(((En)((Object)b2)).getGui());
                pQ3.I = new mQ(((En)((Object)b2)).getGui(), pQ2);
                oS_1.i.J((Bp)pQ2);
                Kpa.J().J((EC)pQ2.I);
                return;
            }
            case 8: {
                int n2;
                Iterator<Object> b2 = a2.getParticles().getConfig();
                sI sI2 = new sI(b2);
                sI2.h = vRa.d;
                if (b2.hasAmount()) {
                    sI2.h = b2.getAmount();
                }
                int n3 = n2 = uSa.E;
                while (n3 < sI2.h) {
                    oS_1.J.J.f(new qI(sI2, n2++));
                    n3 = n2;
                }
                return;
            }
            case 9: {
                Iterator<Object> b2 = a2.getAdd3D().getElementsList().iterator();
                Iterator<Object> iterator = b2;
                while (iterator.hasNext()) {
                    dN dN2 = (dN)b2.next();
                    iterator = b2;
                    oS_1.J.i.f(Tg.J((dN)dN2));
                }
                return;
            }
            case 10: {
                Iterator<Object> b2 = oS_1.J.i.J(a2.getEdit3D().getId());
                if (b2 == null) return;
                b2.J(a2.getEdit3D().getEdit());
                return;
            }
            case 11: {
                Iterator<Object> b2 = a2.getRemove3D().getId();
                OS_1 oS_13 = oS_1;
                if (((String)((Object)b2)).endsWith(JSa.a)) {
                    Iterator<Object> iterator = b2;
                    oS_13.J.i.f(((String)((Object)iterator)).substring(uSa.E, ((String)((Object)iterator)).length() - vRa.d));
                    return;
                }
                oS_13.J.i.J(b2);
                return;
            }
            case 12: {
                oS_1.J.i.f();
                return;
            }
            case 13: {
                Iterator<Object> b2 = a2.getAddBB().getBox();
                oS_1.J.M.J(b2.getId(), new gh((pm)b2));
                return;
            }
            case 14: {
                oS_1.J.M.J(a2.getRemoveBB().getId());
                return;
            }
            case 15: {
                oS_1.J.M.J(a2.getEditBB().getId(), a2.getEditBB().getEdit());
                return;
            }
            case 16: {
                Sg.l(a2.getOpenUrl().getUrl());
                return;
            }
            case 17: {
                oS_1.j.M.J(a2.getKeyboardBind().getKeybind());
                return;
            }
            case 18: {
                Iterator<Object> b2 = a2.getKeyboardUnbind();
                oS_1.j.M.J(((mo)((Object)b2)).getKey(), ((mo)((Object)b2)).hasId() ? ((mo)((Object)b2)).getId() : null);
                return;
            }
            case 19: {
                oS_1.j.M.J();
                return;
            }
            case 20: {
                oS_1.j.L.f(new YL(a2.getSoundPlay().getSound()));
                return;
            }
            case 21: {
                oS_1.j.L.J(a2.getSoundStop().getId());
                return;
            }
            case 22: {
                uw.J((IO)a2.getOptionSet());
                return;
            }
            case 23: {
                oS_1.j.C.J(a2.getResourceCheck());
                return;
            }
            case 24: {
                oS_1.j.C.J(a2.getResourceSave());
                return;
            }
            case 25: {
                oS_1.j.f.J(a2.getEntityOption());
                return;
            }
            case 26: {
                oS_1.j.f.J(a2.getEntityAction());
                return;
            }
            case 27: {
                oS_1.j.G.J(a2.getRegisterDynamicItem());
                return;
            }
            case 28: {
                oS_1.j.J(a2.getPlayAnimation());
                return;
            }
            case 29: {
                I = a2.getReconnectData().getReconnectTo();
                return;
            }
            case 30: {
                oS_1.j.J(a2.getSnowstormParticles());
                return;
            }
            case 31: {
                Iterator<Object> b2 = a2.getJoinVoiceChat();
                OS_1.J(b2.getHost(), b2.getPort(), b2.getKey().toByteArray(), b2.getToken().toByteArray());
                return;
            }
            case 32: {
                oS_1.j.J(a2.getCopyToClipboard());
                return;
            }
            case 33: {
                return;
            }
            case 34: {
                Rm rm2 = a2.getIsometricEnable();
                QS.J((float)rm2.getPitch(), (float)rm2.getYaw(), (float)rm2.getZoom(), (xy)new xy((double)rm2.getMinX(), (double)rm2.getMinY(), (double)rm2.getMinZ(), (double)rm2.getMaxX(), (double)rm2.getMaxY(), (double)rm2.getMaxZ()));
                return;
            }
            case 35: {
                QS.J();
                return;
            }
        }
    }

    static {
        I = null;
        k = Boolean.getBoolean(Uqa.K);
        A = Boolean.getBoolean(wta.x);
    }
}

