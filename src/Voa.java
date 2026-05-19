/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  xNa
 */
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.util.ResourceLocation;

public final class Voa
extends Ky<ResourceLocation, xNa> {
    private Map<ResourceLocation, xNa> I;

    public void J() {
        Voa a2;
        a2.I.clear();
    }

    public Voa() {
        Voa a2;
    }

    @Override
    public Map<ResourceLocation, xNa> J() {
        Voa a2;
        a2.I = Maps.newHashMap();
        return a2.I;
    }

    @Override
    public void J(xNa xNa2) {
        Voa b2 = xNa2;
        Voa a2 = this;
        a2.J(b2.J(), b2);
    }
}

