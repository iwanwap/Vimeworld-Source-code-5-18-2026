/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZZ
 */
import com.google.common.base.Function;
import java.util.Arrays;
import java.util.List;

public final class Hz<T>
implements Function<Object[], List<T>> {
    private Hz() {
        Hz a2;
    }

    public /* synthetic */ Hz(ZZ zZ2) {
        Hz<T> b2 = zZ2;
        Hz<T> a2 = this;
        a2();
    }

    public List<T> J(Object[] objectArray) {
        Object[] b2 = objectArray;
        Object[] a2 = this;
        return Arrays.asList(b2);
    }
}

