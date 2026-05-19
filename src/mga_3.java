/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  UK
 */
import java.util.Comparator;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class mga_3
implements Comparator<ModelResourceLocation> {
    public final /* synthetic */ UK I;

    public mga_3(UK uK2) {
        mga_3 b2 = uK2;
        mga_3 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(ModelResourceLocation modelResourceLocation, ModelResourceLocation modelResourceLocation2) {
        void b2;
        ModelResourceLocation c2 = modelResourceLocation2;
        mga_3 a2 = this;
        return b2.toString().compareTo(c2.toString());
    }
}

