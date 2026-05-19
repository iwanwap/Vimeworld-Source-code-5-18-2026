/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Fa
 *  Mn
 *  YM
 *  xN
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class oo
extends GeneratedMessageLite.Builder<xN, oo>
implements Fa {
    public boolean hasStep() {
        oo a2;
        return ((xN)a2.instance).hasStep();
    }

    public oo setTrackSize(float f2) {
        oo a2;
        float b2 = f2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.e((xN)((xN)oo2.instance), (float)b2);
        return a2;
    }

    private oo() {
        super(xN.f());
        oo a2;
    }

    public boolean hasSize() {
        oo a2;
        return ((xN)a2.instance).hasSize();
    }

    public oo clearSizeExpr() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.F((xN)((xN)oo2.instance));
        return a2;
    }

    public float getStep() {
        oo a2;
        return ((xN)a2.instance).getStep();
    }

    public float getSize() {
        oo a2;
        return ((xN)a2.instance).getSize();
    }

    public oo setSizeExprBytes(ByteString byteString) {
        oo a2;
        ByteString b2 = byteString;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (ByteString)b2);
        return a2;
    }

    public oo clearTrackWidth() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.G((xN)((xN)oo2.instance));
        return a2;
    }

    public oo setTrackColor(int n2) {
        oo a2;
        int b2 = n2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.l((xN)((xN)oo2.instance), (int)b2);
        return a2;
    }

    public boolean hasCallback() {
        oo a2;
        return ((xN)a2.instance).hasCallback();
    }

    public oo setArcColor(int n2) {
        oo a2;
        int b2 = n2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (int)b2);
        return a2;
    }

    public int getArcColor() {
        oo a2;
        return ((xN)a2.instance).getArcColor();
    }

    public boolean hasDisplayFormat() {
        oo a2;
        return ((xN)a2.instance).hasDisplayFormat();
    }

    public oo removeArcColors(int n2) {
        oo a2;
        int b2 = n2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.f((xN)((xN)oo2.instance), (int)b2);
        return a2;
    }

    public oo setDisplayFormat(String string) {
        oo a2;
        String b2 = string;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (String)b2);
        return a2;
    }

    public oo addArcColors(YM yM2) {
        oo a2;
        oo b2 = yM2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (YM)b2);
        return a2;
    }

    public boolean hasTrackWidth() {
        oo a2;
        return ((xN)a2.instance).hasTrackWidth();
    }

    public boolean hasValue() {
        oo a2;
        return ((xN)a2.instance).hasValue();
    }

    public float getMin() {
        oo a2;
        return ((xN)a2.instance).getMin();
    }

    public oo clearMin() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.M((xN)((xN)oo2.instance));
        return a2;
    }

    public oo setSize(float f2) {
        oo a2;
        float b2 = f2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (float)b2);
        return a2;
    }

    public String getDisplayId() {
        oo a2;
        return ((xN)a2.instance).getDisplayId();
    }

    public oo clearDisplayFormat() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.i((xN)((xN)oo2.instance));
        return a2;
    }

    public oo clearArcColor() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.D((xN)((xN)oo2.instance));
        return a2;
    }

    public ByteString getDisplayIdBytes() {
        oo a2;
        return ((xN)a2.instance).getDisplayIdBytes();
    }

    public oo clearMax() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.A((xN)((xN)oo2.instance));
        return a2;
    }

    public oo clearSize() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.d((xN)((xN)oo2.instance));
        return a2;
    }

    public oo setSizeExpr(String string) {
        oo a2;
        String b2 = string;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.f((xN)((xN)oo2.instance), (String)b2);
        return a2;
    }

    public boolean hasTrackSize() {
        oo a2;
        return ((xN)a2.instance).hasTrackSize();
    }

    public boolean hasDisplayId() {
        oo a2;
        return ((xN)a2.instance).hasDisplayId();
    }

    public oo clearArcColors() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.j((xN)((xN)oo2.instance));
        return a2;
    }

    public oo setStep(float f2) {
        oo a2;
        float b2 = f2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.d((xN)((xN)oo2.instance), (float)b2);
        return a2;
    }

    public oo clearCallback() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.l((xN)((xN)oo2.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public oo addArcColors(int n2, Mn mn2) {
        void b2;
        oo a2;
        oo c2 = mn2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.f((xN)((xN)oo2.instance), (int)b2, (YM)((YM)c2.build()));
        return a2;
    }

    public boolean hasArcColor() {
        oo a2;
        return ((xN)a2.instance).hasArcColor();
    }

    public oo setMax(float f2) {
        oo a2;
        float b2 = f2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.l((xN)((xN)oo2.instance), (float)b2);
        return a2;
    }

    public oo setDisplayId(String string) {
        oo a2;
        String b2 = string;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.l((xN)((xN)oo2.instance), (String)b2);
        return a2;
    }

    public List<YM> getArcColorsList() {
        oo a2;
        return Collections.unmodifiableList(((xN)a2.instance).getArcColorsList());
    }

    public boolean hasTrackColor() {
        oo a2;
        return ((xN)a2.instance).hasTrackColor();
    }

    /*
     * WARNING - void declaration
     */
    public oo setArcColors(int n2, YM yM2) {
        void b2;
        oo a2;
        oo c2 = yM2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (int)b2, (YM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public oo setArcColors(int n2, Mn mn2) {
        void b2;
        oo a2;
        oo c2 = mn2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (int)b2, (YM)((YM)c2.build()));
        return a2;
    }

    public String getSizeExpr() {
        oo a2;
        return ((xN)a2.instance).getSizeExpr();
    }

    public oo clearTrackSize() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.f((xN)((xN)oo2.instance));
        return a2;
    }

    public oo setMin(float f2) {
        oo a2;
        float b2 = f2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.f((xN)((xN)oo2.instance), (float)b2);
        return a2;
    }

    public oo addAllArcColors(Iterable<? extends YM> iterable) {
        oo a2;
        Iterable<? extends YM> b2 = iterable;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (Iterable)b2);
        return a2;
    }

    public ByteString getDisplayFormatBytes() {
        oo a2;
        return ((xN)a2.instance).getDisplayFormatBytes();
    }

    public boolean hasMax() {
        oo a2;
        return ((xN)a2.instance).hasMax();
    }

    public int getArcColorsCount() {
        oo a2;
        return ((xN)a2.instance).getArcColorsCount();
    }

    public boolean hasMin() {
        oo a2;
        return ((xN)a2.instance).hasMin();
    }

    public float getValue() {
        oo a2;
        return ((xN)a2.instance).getValue();
    }

    public oo setTrackWidth(float f2) {
        oo a2;
        float b2 = f2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.C((xN)((xN)oo2.instance), (float)b2);
        return a2;
    }

    public oo setDisplayIdBytes(ByteString byteString) {
        oo a2;
        ByteString b2 = byteString;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.l((xN)((xN)oo2.instance), (ByteString)b2);
        return a2;
    }

    public oo setValue(float f2) {
        oo a2;
        float b2 = f2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.M((xN)((xN)oo2.instance), (float)b2);
        return a2;
    }

    public float getTrackSize() {
        oo a2;
        return ((xN)a2.instance).getTrackSize();
    }

    public oo setDisplayFormatBytes(ByteString byteString) {
        oo a2;
        ByteString b2 = byteString;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.f((xN)((xN)oo2.instance), (ByteString)b2);
        return a2;
    }

    public boolean hasSizeExpr() {
        oo a2;
        return ((xN)a2.instance).hasSizeExpr();
    }

    public oo clearStep() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.C((xN)((xN)oo2.instance));
        return a2;
    }

    public oo addArcColors(Mn mn2) {
        oo a2;
        oo b2 = mn2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance), (YM)((YM)b2.build()));
        return a2;
    }

    public float getTrackWidth() {
        oo a2;
        return ((xN)a2.instance).getTrackWidth();
    }

    public int getTrackColor() {
        oo a2;
        return ((xN)a2.instance).getTrackColor();
    }

    public oo clearTrackColor() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.k((xN)((xN)oo2.instance));
        return a2;
    }

    public ByteString getCallback() {
        oo a2;
        return ((xN)a2.instance).getCallback();
    }

    public ByteString getSizeExprBytes() {
        oo a2;
        return ((xN)a2.instance).getSizeExprBytes();
    }

    public float getMax() {
        oo a2;
        return ((xN)a2.instance).getMax();
    }

    public oo clearValue() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.e((xN)((xN)oo2.instance));
        return a2;
    }

    public String getDisplayFormat() {
        oo a2;
        return ((xN)a2.instance).getDisplayFormat();
    }

    public oo clearDisplayId() {
        oo a2;
        oo oo2 = a2;
        oo2.copyOnWrite();
        xN.J((xN)((xN)oo2.instance));
        return a2;
    }

    public oo setCallback(ByteString byteString) {
        oo a2;
        ByteString b2 = byteString;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.C((xN)((xN)oo2.instance), (ByteString)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public oo addArcColors(int n2, YM yM2) {
        void b2;
        oo a2;
        oo c2 = yM2;
        oo oo2 = a2 = this;
        oo2.copyOnWrite();
        xN.f((xN)((xN)oo2.instance), (int)b2, (YM)c2);
        return a2;
    }

    public /* synthetic */ oo(AN aN2) {
        oo b2 = aN2;
        oo a2 = this;
        a2();
    }

    public YM getArcColors(int n2) {
        int b2 = n2;
        oo a2 = this;
        return ((xN)a2.instance).getArcColors(b2);
    }
}

