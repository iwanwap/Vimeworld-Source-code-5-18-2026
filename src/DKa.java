/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  zJa
 */
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.block.properties.IProperty;

public final class DKa {
    private String J;
    private final List<IProperty<?>> A = Lists.newArrayList();
    private IProperty<?> I;

    public DKa J(IProperty<?> ... iPropertyArray) {
        IProperty<?>[] b2 = iPropertyArray;
        IProperty<?>[] a2 = this;
        Collections.addAll(a2.A, b2);
        return a2;
    }

    public DKa J(IProperty<?> iProperty) {
        IProperty<?> b2 = iProperty;
        DKa a2 = this;
        a2.I = b2;
        return a2;
    }

    public DKa J(String string) {
        String b2 = string;
        DKa a2 = this;
        a2.J = b2;
        return a2;
    }

    public zJa J() {
        DKa a2;
        DKa dKa = a2;
        return new zJa(dKa.I, dKa.J, a2.A, null);
    }

    public DKa() {
        DKa a2;
    }
}

