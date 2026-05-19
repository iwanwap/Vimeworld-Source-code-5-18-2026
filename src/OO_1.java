/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Kn
 *  No
 *  OO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class OO_1
extends GeneratedMessageLite.Builder<Kn, OO>
implements aa {
    public OO clearGradientAnim() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.C((Kn)((Kn)oO_1.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public OO setGradientAnim(int n2, int n3) {
        void b2;
        OO_1 a2;
        int c2 = n3;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.f((Kn)((Kn)oO_1.instance), (int)b2, (int)c2);
        return a2;
    }

    public OO setHeightExprBytes(ByteString byteString) {
        OO_1 a2;
        ByteString b2 = byteString;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.J((Kn)((Kn)oO_1.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public ByteString getHeightExprAnimBytes() {
        OO_1 a2;
        return ((Kn)a2.instance).getHeightExprAnimBytes();
    }

    public OO addGradientAnim(int n2) {
        OO_1 a2;
        int b2 = n2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.C((Kn)((Kn)oO_1.instance), (int)b2);
        return a2;
    }

    @Override
    public String getWidthExpr() {
        OO_1 a2;
        return ((Kn)a2.instance).getWidthExpr();
    }

    @Override
    public ByteString getHeightExprBytes() {
        OO_1 a2;
        return ((Kn)a2.instance).getHeightExprBytes();
    }

    @Override
    public boolean hasHeightExpr() {
        OO_1 a2;
        return ((Kn)a2.instance).hasHeightExpr();
    }

    public OO setWidthExprAnim(String string) {
        OO_1 a2;
        String b2 = string;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.f((Kn)((Kn)oO_1.instance), (String)b2);
        return a2;
    }

    @Override
    public boolean hasWidthAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).hasWidthAnim();
    }

    public OO addAllGradientAnim(Iterable<? extends Integer> iterable) {
        OO_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.f((Kn)((Kn)oO_1.instance), (Iterable)b2);
        return a2;
    }

    @Override
    public String getHeightExpr() {
        OO_1 a2;
        return ((Kn)a2.instance).getHeightExpr();
    }

    public OO clearHeightAnim() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.e((Kn)((Kn)oO_1.instance));
        return a2;
    }

    @Override
    public int getGradient(int n2) {
        int b2 = n2;
        OO_1 a2 = this;
        return ((Kn)a2.instance).getGradient(b2);
    }

    @Override
    public float getHeight() {
        OO_1 a2;
        return ((Kn)a2.instance).getHeight();
    }

    @Override
    public ByteString getWidthExprBytes() {
        OO_1 a2;
        return ((Kn)a2.instance).getWidthExprBytes();
    }

    public OO clearHeightExpr() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.l((Kn)((Kn)oO_1.instance));
        return a2;
    }

    @Override
    public int getGradientAnim(int n2) {
        int b2 = n2;
        OO_1 a2 = this;
        return ((Kn)a2.instance).getGradientAnim(b2);
    }

    public OO addAllGradient(Iterable<? extends Integer> iterable) {
        OO_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.J((Kn)((Kn)oO_1.instance), (Iterable)b2);
        return a2;
    }

    @Override
    public boolean hasWidth() {
        OO_1 a2;
        return ((Kn)a2.instance).hasWidth();
    }

    public OO setWidthAnim(float f2) {
        OO_1 a2;
        float b2 = f2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.f((Kn)((Kn)oO_1.instance), (float)b2);
        return a2;
    }

    public OO setWidthExpr(String string) {
        OO_1 a2;
        String b2 = string;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.C((Kn)((Kn)oO_1.instance), (String)b2);
        return a2;
    }

    public OO clearWidth() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.i((Kn)((Kn)oO_1.instance));
        return a2;
    }

    @Override
    public float getWidthAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).getWidthAnim();
    }

    @Override
    public String getWidthExprAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).getWidthExprAnim();
    }

    public OO setHeight(float f2) {
        OO_1 a2;
        float b2 = f2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.C((Kn)((Kn)oO_1.instance), (float)b2);
        return a2;
    }

    public OO setRadius(int n2) {
        OO_1 a2;
        int b2 = n2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.J((Kn)((Kn)oO_1.instance), (int)b2);
        return a2;
    }

    @Override
    public List<Integer> getGradientAnimList() {
        OO_1 a2;
        return Collections.unmodifiableList(((Kn)a2.instance).getGradientAnimList());
    }

    @Override
    public boolean hasWidthExprAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).hasWidthExprAnim();
    }

    @Override
    public LO getRadiusvalCase() {
        OO_1 a2;
        return ((Kn)a2.instance).getRadiusvalCase();
    }

    @Override
    public float getHeightAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).getHeightAnim();
    }

    @Override
    public float getWidth() {
        OO_1 a2;
        return ((Kn)a2.instance).getWidth();
    }

    @Override
    public List<Integer> getGradientList() {
        OO_1 a2;
        return Collections.unmodifiableList(((Kn)a2.instance).getGradientList());
    }

    @Override
    public boolean hasWidthExpr() {
        OO_1 a2;
        return ((Kn)a2.instance).hasWidthExpr();
    }

    @Override
    public boolean hasRadius() {
        OO_1 a2;
        return ((Kn)a2.instance).hasRadius();
    }

    @Override
    public boolean hasHeightAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).hasHeightAnim();
    }

    public OO clearWidthAnim() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.j((Kn)((Kn)oO_1.instance));
        return a2;
    }

    @Override
    public int getRadius() {
        OO_1 a2;
        return ((Kn)a2.instance).getRadius();
    }

    public OO clearRadius() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.A((Kn)((Kn)oO_1.instance));
        return a2;
    }

    public OO setHeightExprAnimBytes(ByteString byteString) {
        OO_1 a2;
        ByteString b2 = byteString;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.C((Kn)((Kn)oO_1.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public int getGradientAnimCount() {
        OO_1 a2;
        return ((Kn)a2.instance).getGradientAnimCount();
    }

    public OO setWidthExprBytes(ByteString byteString) {
        OO_1 a2;
        ByteString b2 = byteString;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.l((Kn)((Kn)oO_1.instance), (ByteString)b2);
        return a2;
    }

    public OO clearRadiusval() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.f((Kn)((Kn)oO_1.instance));
        return a2;
    }

    public OO setHeightExpr(String string) {
        OO_1 a2;
        String b2 = string;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.J((Kn)((Kn)oO_1.instance), (String)b2);
        return a2;
    }

    @Override
    public int getRadiusAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).getRadiusAnim();
    }

    @Override
    public int getGradientCount() {
        OO_1 a2;
        return ((Kn)a2.instance).getGradientCount();
    }

    public OO clearHeight() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.d((Kn)((Kn)oO_1.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public OO setGradient(int n2, int n3) {
        void b2;
        OO_1 a2;
        int c2 = n3;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.J((Kn)((Kn)oO_1.instance), (int)b2, (int)c2);
        return a2;
    }

    public OO clearWidthval() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.D((Kn)((Kn)oO_1.instance));
        return a2;
    }

    public OO clearGradient() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.I((Kn)((Kn)oO_1.instance));
        return a2;
    }

    @Override
    public boolean hasHeightExprAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).hasHeightExprAnim();
    }

    public OO setWidthExprAnimBytes(ByteString byteString) {
        OO_1 a2;
        ByteString b2 = byteString;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.f((Kn)((Kn)oO_1.instance), (ByteString)b2);
        return a2;
    }

    public OO setHeightExprAnim(String string) {
        OO_1 a2;
        String b2 = string;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.l((Kn)((Kn)oO_1.instance), (String)b2);
        return a2;
    }

    public OO clearHeightExprAnim() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.G((Kn)((Kn)oO_1.instance));
        return a2;
    }

    private OO_1() {
        super(Kn.f());
        OO_1 a2;
    }

    public /* synthetic */ OO_1(AN aN2) {
        OO_1 b2 = aN2;
        OO_1 a2 = this;
        a2();
    }

    @Override
    public boolean hasHeight() {
        OO_1 a2;
        return ((Kn)a2.instance).hasHeight();
    }

    public OO clearHeightval() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.F((Kn)((Kn)oO_1.instance));
        return a2;
    }

    public OO clearRadiusAnim() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.M((Kn)((Kn)oO_1.instance));
        return a2;
    }

    public OO addGradient(int n2) {
        OO_1 a2;
        int b2 = n2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.l((Kn)((Kn)oO_1.instance), (int)b2);
        return a2;
    }

    @Override
    public String getHeightExprAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).getHeightExprAnim();
    }

    @Override
    public No getHeightvalCase() {
        OO_1 a2;
        return ((Kn)a2.instance).getHeightvalCase();
    }

    @Override
    public YN getWidthvalCase() {
        OO_1 a2;
        return ((Kn)a2.instance).getWidthvalCase();
    }

    public OO setRadiusAnim(int n2) {
        OO_1 a2;
        int b2 = n2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.f((Kn)((Kn)oO_1.instance), (int)b2);
        return a2;
    }

    public OO clearWidthExprAnim() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.J((Kn)((Kn)oO_1.instance));
        return a2;
    }

    public OO setHeightAnim(float f2) {
        OO_1 a2;
        float b2 = f2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.l((Kn)((Kn)oO_1.instance), (float)b2);
        return a2;
    }

    public OO setWidth(float f2) {
        OO_1 a2;
        float b2 = f2;
        OO_1 oO_1 = a2 = this;
        oO_1.copyOnWrite();
        Kn.J((Kn)((Kn)oO_1.instance), (float)b2);
        return a2;
    }

    @Override
    public ByteString getWidthExprAnimBytes() {
        OO_1 a2;
        return ((Kn)a2.instance).getWidthExprAnimBytes();
    }

    public OO clearWidthExpr() {
        OO_1 a2;
        OO_1 oO_1 = a2;
        oO_1.copyOnWrite();
        Kn.k((Kn)((Kn)oO_1.instance));
        return a2;
    }

    @Override
    public boolean hasRadiusAnim() {
        OO_1 a2;
        return ((Kn)a2.instance).hasRadiusAnim();
    }
}

