/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Yn
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Yn_2
extends GeneratedMessageLite.Builder<On, Yn>
implements Da {
    public Yn clearBarColor() {
        Yn_2 a2;
        Yn_2 yn_2 = a2;
        yn_2.copyOnWrite();
        On.f((On)yn_2.instance);
        return a2;
    }

    @Override
    public float getProgress() {
        Yn_2 a2;
        return ((On)a2.instance).getProgress();
    }

    public /* synthetic */ Yn_2(AN aN2) {
        Yn_2 b2 = aN2;
        Yn_2 a2 = this;
        a2();
    }

    public Yn setBarColor(int n2) {
        Yn_2 a2;
        int b2 = n2;
        Yn_2 yn_2 = a2 = this;
        yn_2.copyOnWrite();
        On.f((On)yn_2.instance, b2);
        return a2;
    }

    @Override
    public boolean hasBorderColor() {
        Yn_2 a2;
        return ((On)a2.instance).hasBorderColor();
    }

    public Yn setBorderColor(int n2) {
        Yn_2 a2;
        int b2 = n2;
        Yn_2 yn_2 = a2 = this;
        yn_2.copyOnWrite();
        On.J((On)yn_2.instance, b2);
        return a2;
    }

    public Yn clearBorderColor() {
        Yn_2 a2;
        Yn_2 yn_2 = a2;
        yn_2.copyOnWrite();
        On.l((On)yn_2.instance);
        return a2;
    }

    public Yn setProgress(float f2) {
        Yn_2 a2;
        float b2 = f2;
        Yn_2 yn_2 = a2 = this;
        yn_2.copyOnWrite();
        On.J((On)yn_2.instance, b2);
        return a2;
    }

    @Override
    public int getBorderColor() {
        Yn_2 a2;
        return ((On)a2.instance).getBorderColor();
    }

    private Yn_2() {
        super(On.J());
        Yn_2 a2;
    }

    @Override
    public int getBarColor() {
        Yn_2 a2;
        return ((On)a2.instance).getBarColor();
    }

    @Override
    public boolean hasBarColor() {
        Yn_2 a2;
        return ((On)a2.instance).hasBarColor();
    }

    public Yn clearProgress() {
        Yn_2 a2;
        Yn_2 yn_2 = a2;
        yn_2.copyOnWrite();
        On.J((On)yn_2.instance);
        return a2;
    }

    @Override
    public boolean hasProgress() {
        Yn_2 a2;
        return ((On)a2.instance).hasProgress();
    }
}

