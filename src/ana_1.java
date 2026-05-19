/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qoa
 *  sb
 *  wNa
 *  woa
 *  xNa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ana_1
implements sb<qoa> {
    public final /* synthetic */ String j;
    public final /* synthetic */ woa J;
    public final /* synthetic */ wNa A;
    public final ResourceLocation I;

    public int J() {
        ana_1 ana_12 = this;
        ana_1 a2 = (xNa)ana_12.A.J.J(ana_12.I);
        if (a2 == null) {
            return uSa.E;
        }
        return a2.J();
    }

    public qoa J() {
        ana_1 ana_12 = this;
        ana_1 a2 = (xNa)ana_12.A.J.J(ana_12.I);
        if (a2 == null) {
            return wNa.j;
        }
        return a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public ana_1(wNa wNa2, String string, woa object) {
        void a2;
        ana_1 b2 = object;
        object = this;
        object.A = a2;
        object.j = string;
        object.J = b2;
        Object object2 = object;
        object.I = new ResourceLocation(object.j, object.J.J());
    }
}

