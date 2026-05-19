/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class fZ_3
implements ParameterizedType {
    @Override
    public Type getRawType() {
        return List.class;
    }

    public fZ_3() {
        fZ_3 a2;
    }

    @Override
    public Type[] getActualTypeArguments() {
        Type[] typeArray = new Type[vRa.d];
        typeArray[uSa.E] = aY.class;
        return typeArray;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

