/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ay
 *  vRa
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class uy_2
implements ParameterizedType {
    public uy_2() {
        uy_2 a2;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }

    @Override
    public Type getRawType() {
        return List.class;
    }

    @Override
    public Type[] getActualTypeArguments() {
        Type[] typeArray = new Type[vRa.d];
        typeArray[uSa.E] = ay.class;
        return typeArray;
    }
}

