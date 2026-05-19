/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Uo
 *  dN
 *  dO
 *  lO
 *  uc
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class Uo_1
extends GeneratedMessageLite.Builder<dO, Uo>
implements uc {
    public Uo clearElements() {
        Uo_1 a2;
        Uo_1 uo_1 = a2;
        uo_1.copyOnWrite();
        dO.J((dO)((dO)uo_1.instance));
        return a2;
    }

    public Uo removeElements(int n2) {
        Uo_1 a2;
        int b2 = n2;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.J((dO)((dO)uo_1.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Uo addElements(int n2, dN dN2) {
        void b2;
        Uo_1 a2;
        Uo_1 c2 = dN2;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.f((dO)((dO)uo_1.instance), (int)b2, (dN)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Uo addElements(int n2, lO lO2) {
        void b2;
        Uo_1 a2;
        Uo_1 c2 = lO2;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.f((dO)((dO)uo_1.instance), (int)b2, (dN)((dN)c2.build()));
        return a2;
    }

    private Uo_1() {
        super(dO.J());
        Uo_1 a2;
    }

    public Uo addAllElements(Iterable<? extends dN> iterable) {
        Uo_1 a2;
        Iterable<? extends dN> b2 = iterable;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.J((dO)((dO)uo_1.instance), (Iterable)b2);
        return a2;
    }

    public int getElementsCount() {
        Uo_1 a2;
        return ((dO)a2.instance).getElementsCount();
    }

    public Uo addElements(dN dN2) {
        Uo_1 a2;
        Uo_1 b2 = dN2;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.J((dO)((dO)uo_1.instance), (dN)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Uo setElements(int n2, dN dN2) {
        void b2;
        Uo_1 a2;
        Uo_1 c2 = dN2;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.J((dO)((dO)uo_1.instance), (int)b2, (dN)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Uo setElements(int n2, lO lO2) {
        void b2;
        Uo_1 a2;
        Uo_1 c2 = lO2;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.J((dO)((dO)uo_1.instance), (int)b2, (dN)((dN)c2.build()));
        return a2;
    }

    public Uo addElements(lO lO2) {
        Uo_1 a2;
        Uo_1 b2 = lO2;
        Uo_1 uo_1 = a2 = this;
        uo_1.copyOnWrite();
        dO.J((dO)((dO)uo_1.instance), (dN)((dN)b2.build()));
        return a2;
    }

    public List<dN> getElementsList() {
        Uo_1 a2;
        return Collections.unmodifiableList(((dO)a2.instance).getElementsList());
    }

    public dN getElements(int n2) {
        int b2 = n2;
        Uo_1 a2 = this;
        return ((dO)a2.instance).getElements(b2);
    }

    public /* synthetic */ Uo_1(AN aN2) {
        Uo_1 b2 = aN2;
        Uo_1 a2 = this;
        a2();
    }
}

