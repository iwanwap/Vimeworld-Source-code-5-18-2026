/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Al
 *  KM
 *  LM
 *  Rk
 *  WN
 *  Xl
 *  co
 *  dN
 *  eo
 *  jo
 *  kj
 *  lO
 *  lo
 *  mO
 *  sM
 *  ya
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class lO_1
extends GeneratedMessageLite.Builder<dN, lO>
implements ya {
    public lO setFrustum(boolean bl) {
        lO_1 a2;
        boolean b2 = bl;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (boolean)b2);
        return a2;
    }

    public boolean hasDuration() {
        lO_1 a2;
        return ((dN)a2.instance).hasDuration();
    }

    public boolean hasEditEasing() {
        lO_1 a2;
        return ((dN)a2.instance).hasEditEasing();
    }

    public lO clearVisibility() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.F((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO clearEditDuration() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.k((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setEditEasingExprBytes(ByteString byteString) {
        lO_1 a2;
        ByteString b2 = byteString;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (ByteString)b2);
        return a2;
    }

    public boolean hasEditEasingExpr() {
        lO_1 a2;
        return ((dN)a2.instance).hasEditEasingExpr();
    }

    public lO clearDepthTest() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.a((dN)((dN)lO_12.instance));
        return a2;
    }

    public String getId() {
        lO_1 a2;
        return ((dN)a2.instance).getId();
    }

    public lO clearELine() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.b((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setESphere(uM uM2) {
        lO_1 a2;
        GeneratedMessageLite.Builder b2 = uM2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (co)((co)b2.build()));
        return a2;
    }

    public lO setIdBytes(ByteString byteString) {
        lO_1 a2;
        ByteString b2 = byteString;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (ByteString)b2);
        return a2;
    }

    public lO setEWorldGroup(Xl xl2) {
        lO_1 a2;
        lO_1 b2 = xl2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (kj)((kj)b2.build()));
        return a2;
    }

    public lO mergeESphere(co co2) {
        lO_1 a2;
        lO_1 b2 = co2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (co)b2);
        return a2;
    }

    public lO mergeEWorldGroup(kj kj2) {
        lO_1 a2;
        lO_1 b2 = kj2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (kj)b2);
        return a2;
    }

    public lO clearEditEasing() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.C((dN)((dN)lO_12.instance));
        return a2;
    }

    public int getKindValue() {
        lO_1 a2;
        return ((dN)a2.instance).getKindValue();
    }

    public lO setFinishFade(int n2) {
        lO_1 a2;
        int b2 = n2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.d((dN)((dN)lO_12.instance), (int)b2);
        return a2;
    }

    public KM getEDirectDraw() {
        lO_1 a2;
        return ((dN)a2.instance).getEDirectDraw();
    }

    public lO clearHoverRange() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setVisibility(Al al2) {
        lO_1 a2;
        lO_1 b2 = al2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (Rk)((Rk)b2.build()));
        return a2;
    }

    public boolean hasVisibility() {
        lO_1 a2;
        return ((dN)a2.instance).hasVisibility();
    }

    public boolean getFogTest() {
        lO_1 a2;
        return ((dN)a2.instance).getFogTest();
    }

    public lO setHoverable(boolean bl) {
        lO_1 a2;
        boolean b2 = bl;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (boolean)b2);
        return a2;
    }

    public lO mergeELine(jo jo2) {
        lO_1 a2;
        lO_1 b2 = jo2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (jo)b2);
        return a2;
    }

    public boolean hasEBeamPartial() {
        lO_1 a2;
        return ((dN)a2.instance).hasEBeamPartial();
    }

    public boolean hasEditDuration() {
        lO_1 a2;
        return ((dN)a2.instance).hasEditDuration();
    }

    public Rk getVisibility() {
        lO_1 a2;
        return ((dN)a2.instance).getVisibility();
    }

    public eo getEBeamPartial() {
        lO_1 a2;
        return ((dN)a2.instance).getEBeamPartial();
    }

    public lO clearESphere() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.j((dN)((dN)lO_12.instance));
        return a2;
    }

    public boolean hasHoverRange() {
        lO_1 a2;
        return ((dN)a2.instance).hasHoverRange();
    }

    public boolean hasDepthTest() {
        lO_1 a2;
        return ((dN)a2.instance).hasDepthTest();
    }

    public lO setKindValue(int n2) {
        lO_1 a2;
        int b2 = n2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.M((dN)((dN)lO_12.instance), (int)b2);
        return a2;
    }

    public int getStartFade() {
        lO_1 a2;
        return ((dN)a2.instance).getStartFade();
    }

    public lO setEDirectDraw(KM kM) {
        lO_1 a2;
        lO_1 b2 = kM;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (KM)b2);
        return a2;
    }

    public String getEditEasingExpr() {
        lO_1 a2;
        return ((dN)a2.instance).getEditEasingExpr();
    }

    public lO mergeEDirectDraw(KM kM) {
        lO_1 a2;
        lO_1 b2 = kM;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (KM)b2);
        return a2;
    }

    public lo getKind() {
        lO_1 a2;
        return ((dN)a2.instance).getKind();
    }

    public lO setEditEasingValue(int n2) {
        lO_1 a2;
        int b2 = n2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.e((dN)((dN)lO_12.instance), (int)b2);
        return a2;
    }

    public /* synthetic */ lO_1(AN aN2) {
        lO_1 b2 = aN2;
        lO_1 a2 = this;
        a2();
    }

    public WN getEditEasing() {
        lO_1 a2;
        return ((dN)a2.instance).getEditEasing();
    }

    public boolean hasEDirectDraw() {
        lO_1 a2;
        return ((dN)a2.instance).hasEDirectDraw();
    }

    public lO setEditEasingExpr(String string) {
        lO_1 a2;
        String b2 = string;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (String)b2);
        return a2;
    }

    public lO setEDirectDraw(sM sM2) {
        lO_1 a2;
        lO_1 b2 = sM2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (KM)((KM)b2.build()));
        return a2;
    }

    public boolean hasFogTest() {
        lO_1 a2;
        return ((dN)a2.instance).hasFogTest();
    }

    public lO clearFogTest() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setDepthTest(boolean bl) {
        lO_1 a2;
        boolean b2 = bl;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.C((dN)((dN)lO_12.instance), (boolean)b2);
        return a2;
    }

    public boolean hasHoverable() {
        lO_1 a2;
        return ((dN)a2.instance).hasHoverable();
    }

    public boolean hasStartFade() {
        lO_1 a2;
        return ((dN)a2.instance).hasStartFade();
    }

    public lO clearStartFade() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.g((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO clearEditEasingExpr() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.i((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setEditDuration(int n2) {
        lO_1 a2;
        int b2 = n2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.C((dN)((dN)lO_12.instance), (int)b2);
        return a2;
    }

    public lO setEWorldGroup(kj kj2) {
        lO_1 a2;
        lO_1 b2 = kj2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (kj)b2);
        return a2;
    }

    public lO clearDuration() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.I((dN)((dN)lO_12.instance));
        return a2;
    }

    public long getDuration() {
        lO_1 a2;
        return ((dN)a2.instance).getDuration();
    }

    public lO setKind(lo lo2) {
        lO_1 a2;
        lO_1 b2 = lo2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (lo)b2);
        return a2;
    }

    public lO clearHoverable() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.d((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setHoverRange(int n2) {
        lO_1 a2;
        int b2 = n2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (int)b2);
        return a2;
    }

    public boolean hasEWorldGroup() {
        lO_1 a2;
        return ((dN)a2.instance).hasEWorldGroup();
    }

    public lO clearEWorldGroup() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.H((dN)((dN)lO_12.instance));
        return a2;
    }

    public boolean hasId() {
        lO_1 a2;
        return ((dN)a2.instance).hasId();
    }

    public lO setESphere(co co2) {
        lO_1 a2;
        lO_1 b2 = co2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (co)b2);
        return a2;
    }

    public lO clearRenderDistance() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.A((dN)((dN)lO_12.instance));
        return a2;
    }

    public boolean hasFrustum() {
        lO_1 a2;
        return ((dN)a2.instance).hasFrustum();
    }

    public kj getEWorldGroup() {
        lO_1 a2;
        return ((dN)a2.instance).getEWorldGroup();
    }

    public boolean getHoverable() {
        lO_1 a2;
        return ((dN)a2.instance).getHoverable();
    }

    public co getESphere() {
        lO_1 a2;
        return ((dN)a2.instance).getESphere();
    }

    public boolean getDepthTest() {
        lO_1 a2;
        return ((dN)a2.instance).getDepthTest();
    }

    public lO setFogTest(boolean bl) {
        lO_1 a2;
        boolean b2 = bl;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.l((dN)((dN)lO_12.instance), (boolean)b2);
        return a2;
    }

    public lO setRenderDistance(int n2) {
        lO_1 a2;
        int b2 = n2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.l((dN)((dN)lO_12.instance), (int)b2);
        return a2;
    }

    public lO setELine(LM lM) {
        lO_1 a2;
        lO_1 b2 = lM;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (jo)((jo)b2.build()));
        return a2;
    }

    public lO clearEBeamPartial() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.e((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setELine(jo jo2) {
        lO_1 a2;
        lO_1 b2 = jo2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (jo)b2);
        return a2;
    }

    public boolean hasRenderDistance() {
        lO_1 a2;
        return ((dN)a2.instance).hasRenderDistance();
    }

    public lO clearFinishFade() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.l((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO clearKind() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.M((dN)((dN)lO_12.instance));
        return a2;
    }

    public boolean getFrustum() {
        lO_1 a2;
        return ((dN)a2.instance).getFrustum();
    }

    public lO setEditEasing(WN wN2) {
        lO_1 a2;
        lO_1 b2 = wN2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (WN)b2);
        return a2;
    }

    public lO setEBeamPartial(mO mO2) {
        lO_1 a2;
        lO_1 b2 = mO2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (eo)((eo)b2.build()));
        return a2;
    }

    public boolean hasESphere() {
        lO_1 a2;
        return ((dN)a2.instance).hasESphere();
    }

    public int getEditEasingValue() {
        lO_1 a2;
        return ((dN)a2.instance).getEditEasingValue();
    }

    public lO clearEDirectDraw() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.D((dN)((dN)lO_12.instance));
        return a2;
    }

    public boolean hasFinishFade() {
        lO_1 a2;
        return ((dN)a2.instance).hasFinishFade();
    }

    public lO mergeEBeamPartial(eo eo2) {
        lO_1 a2;
        lO_1 b2 = eo2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (eo)b2);
        return a2;
    }

    public lO setStartFade(int n2) {
        lO_1 a2;
        int b2 = n2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (int)b2);
        return a2;
    }

    public int getRenderDistance() {
        lO_1 a2;
        return ((dN)a2.instance).getRenderDistance();
    }

    public jo getELine() {
        lO_1 a2;
        return ((dN)a2.instance).getELine();
    }

    public int getHoverRange() {
        lO_1 a2;
        return ((dN)a2.instance).getHoverRange();
    }

    public lO setDuration(long a2) {
        lO_1 b2;
        lO_1 lO_12 = b2;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (long)a2);
        return b2;
    }

    public int getFinishFade() {
        lO_1 a2;
        return ((dN)a2.instance).getFinishFade();
    }

    public lO setVisibility(Rk rk) {
        lO_1 a2;
        lO_1 b2 = rk;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (Rk)b2);
        return a2;
    }

    private lO_1() {
        super(dN.J());
        lO_1 a2;
    }

    public lO setId(String string) {
        lO_1 a2;
        String b2 = string;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (String)b2);
        return a2;
    }

    public int getEditDuration() {
        lO_1 a2;
        return ((dN)a2.instance).getEditDuration();
    }

    public lO mergeVisibility(Rk rk) {
        lO_1 a2;
        lO_1 b2 = rk;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.J((dN)((dN)lO_12.instance), (Rk)b2);
        return a2;
    }

    public ByteString getEditEasingExprBytes() {
        lO_1 a2;
        return ((dN)a2.instance).getEditEasingExprBytes();
    }

    public boolean hasELine() {
        lO_1 a2;
        return ((dN)a2.instance).hasELine();
    }

    public ByteString getIdBytes() {
        lO_1 a2;
        return ((dN)a2.instance).getIdBytes();
    }

    public lO clearId() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.L((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO clearFrustum() {
        lO_1 a2;
        lO_1 lO_12 = a2;
        lO_12.copyOnWrite();
        dN.G((dN)((dN)lO_12.instance));
        return a2;
    }

    public lO setEBeamPartial(eo eo2) {
        lO_1 a2;
        lO_1 b2 = eo2;
        lO_1 lO_12 = a2 = this;
        lO_12.copyOnWrite();
        dN.f((dN)((dN)lO_12.instance), (eo)b2);
        return a2;
    }
}

