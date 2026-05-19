/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Fm
 *  zn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class zn_1
extends GeneratedMessageLite.Builder<Fm, zn>
implements Ka {
    public zn setHeightExprBytes(ByteString byteString) {
        zn_1 a2;
        ByteString b2 = byteString;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.J((Fm)((Fm)zn_12.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public float getHeight() {
        zn_1 a2;
        return ((Fm)a2.instance).getHeight();
    }

    @Override
    public ByteString getHeightExprBytes() {
        zn_1 a2;
        return ((Fm)a2.instance).getHeightExprBytes();
    }

    @Override
    public boolean hasHeight() {
        zn_1 a2;
        return ((Fm)a2.instance).hasHeight();
    }

    public zn addGradient(int n2) {
        zn_1 a2;
        int b2 = n2;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.f((Fm)((Fm)zn_12.instance), (int)b2);
        return a2;
    }

    @Override
    public int getGradient(int n2) {
        int b2 = n2;
        zn_1 a2 = this;
        return ((Fm)a2.instance).getGradient(b2);
    }

    @Override
    public String getHeightExpr() {
        zn_1 a2;
        return ((Fm)a2.instance).getHeightExpr();
    }

    private zn_1() {
        super(Fm.J());
        zn_1 a2;
    }

    public zn setWidthExprBytes(ByteString byteString) {
        zn_1 a2;
        ByteString b2 = byteString;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.f((Fm)((Fm)zn_12.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public boolean hasWidth() {
        zn_1 a2;
        return ((Fm)a2.instance).hasWidth();
    }

    public zn clearWidthExpr() {
        zn_1 a2;
        zn_1 zn_12 = a2;
        zn_12.copyOnWrite();
        Fm.J((Fm)((Fm)zn_12.instance));
        return a2;
    }

    public zn setWidthExpr(String string) {
        zn_1 a2;
        String b2 = string;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.f((Fm)((Fm)zn_12.instance), (String)b2);
        return a2;
    }

    @Override
    public float getWidth() {
        zn_1 a2;
        return ((Fm)a2.instance).getWidth();
    }

    @Override
    public int getRadius() {
        zn_1 a2;
        return ((Fm)a2.instance).getRadius();
    }

    @Override
    public ByteString getWidthExprBytes() {
        zn_1 a2;
        return ((Fm)a2.instance).getWidthExprBytes();
    }

    @Override
    public boolean hasRadius() {
        zn_1 a2;
        return ((Fm)a2.instance).hasRadius();
    }

    public zn setHeightExpr(String string) {
        zn_1 a2;
        String b2 = string;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.J((Fm)((Fm)zn_12.instance), (String)b2);
        return a2;
    }

    public zn addAllGradient(Iterable<? extends Integer> iterable) {
        zn_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.J((Fm)((Fm)zn_12.instance), (Iterable)b2);
        return a2;
    }

    public /* synthetic */ zn_1(AN aN2) {
        zn_1 b2 = aN2;
        zn_1 a2 = this;
        a2();
    }

    @Override
    public List<Integer> getGradientList() {
        zn_1 a2;
        return Collections.unmodifiableList(((Fm)a2.instance).getGradientList());
    }

    @Override
    public boolean hasHeightExpr() {
        zn_1 a2;
        return ((Fm)a2.instance).hasHeightExpr();
    }

    @Override
    public boolean hasWidthExpr() {
        zn_1 a2;
        return ((Fm)a2.instance).hasWidthExpr();
    }

    public zn setRadius(int n2) {
        zn_1 a2;
        int b2 = n2;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.J((Fm)((Fm)zn_12.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public zn setGradient(int n2, int n3) {
        void b2;
        zn_1 a2;
        int c2 = n3;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.J((Fm)((Fm)zn_12.instance), (int)b2, (int)c2);
        return a2;
    }

    @Override
    public String getWidthExpr() {
        zn_1 a2;
        return ((Fm)a2.instance).getWidthExpr();
    }

    @Override
    public int getGradientCount() {
        zn_1 a2;
        return ((Fm)a2.instance).getGradientCount();
    }

    public zn clearRadius() {
        zn_1 a2;
        zn_1 zn_12 = a2;
        zn_12.copyOnWrite();
        Fm.e((Fm)((Fm)zn_12.instance));
        return a2;
    }

    public zn setHeight(float f2) {
        zn_1 a2;
        float b2 = f2;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.J((Fm)((Fm)zn_12.instance), (float)b2);
        return a2;
    }

    public zn clearHeightExpr() {
        zn_1 a2;
        zn_1 zn_12 = a2;
        zn_12.copyOnWrite();
        Fm.l((Fm)((Fm)zn_12.instance));
        return a2;
    }

    public zn setWidth(float f2) {
        zn_1 a2;
        float b2 = f2;
        zn_1 zn_12 = a2 = this;
        zn_12.copyOnWrite();
        Fm.f((Fm)((Fm)zn_12.instance), (float)b2);
        return a2;
    }

    public zn clearWidth() {
        zn_1 a2;
        zn_1 zn_12 = a2;
        zn_12.copyOnWrite();
        Fm.d((Fm)((Fm)zn_12.instance));
        return a2;
    }

    public zn clearGradient() {
        zn_1 a2;
        zn_1 zn_12 = a2;
        zn_12.copyOnWrite();
        Fm.C((Fm)((Fm)zn_12.instance));
        return a2;
    }

    public zn clearHeight() {
        zn_1 a2;
        zn_1 zn_12 = a2;
        zn_12.copyOnWrite();
        Fm.f((Fm)((Fm)zn_12.instance));
        return a2;
    }
}

