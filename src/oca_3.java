/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Oz
 *  Zz
 *  vRa
 */
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class oca_3
extends Zz {
    public boolean J() {
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(List<Sx> list) {
        void a2;
        Iterator iterator;
        oca_3 oca_32 = this;
        float b2 = JPa.N;
        Iterator iterator2 = iterator = a2.iterator();
        while (iterator2.hasNext()) {
            Sx sx2 = (Sx)((Object)iterator.next());
            b2 += sx2.f() + sx2.A();
            iterator2 = iterator;
        }
        if (a2.size() > 0) {
            b2 /= (float)a2.size();
        }
        return Oz.f((float)b2);
    }

    public oca_3(String string) {
        Object b2 = string;
        oca_3 a2 = this;
        super((String)b2);
    }

    public kBa J() {
        return kBa.HEARTS;
    }
}

