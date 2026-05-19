/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mOa
 *  vRa
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public final class Gna_2
implements ParameterizedType {
    @Override
    public Type getOwnerType() {
        return null;
    }

    @Override
    public Type[] getActualTypeArguments() {
        Type[] typeArray = new Type[uqa.g];
        typeArray[uSa.E] = String.class;
        typeArray[vRa.d] = mOa.class;
        return typeArray;
    }

    public Gna_2() {
        Gna_2 a2;
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }
}

