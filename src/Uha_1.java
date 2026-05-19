/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class Uha_1
implements ParameterizedType {
    private static final String I = "CL_00000651";

    @Override
    public Type getOwnerType() {
        return null;
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    public Uha_1() {
        Uha_1 a2;
    }

    @Override
    public Type[] getActualTypeArguments() {
        Type[] typeArray = new Type[vRa.d];
        typeArray[uSa.E] = String.class;
        return typeArray;
    }
}

