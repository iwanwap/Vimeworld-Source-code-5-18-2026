/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  bca
 *  vca
 *  ysa
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class vca_1
implements KC<Pd> {
    private int A;
    private final List<bca> I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        void a2;
        vca_1 vca_12 = this;
        void v0 = a2;
        v0.writeVarIntToBuffer(vca_12.A);
        v0.writeInt(vca_12.I.size());
        Iterator<bca> iterator = vca_12.I.iterator();
        while (iterator.hasNext()) {
            Object b2 = iterator.next();
            a2.writeString(b2.J());
            a2.writeDouble(b2.J());
            vca_1 vca_13 = b2;
            a2.writeVarIntToBuffer(vca_13.J().size());
            b2 = vca_13.J().iterator();
            Object object = b2;
            while (object.hasNext()) {
                CEa cEa2 = (CEa)b2.next();
                object = b2;
                void v3 = a2;
                v3.writeUuid(cEa2.J());
                v3.writeDouble(cEa2.J());
                a2.writeByte(cEa2.J());
            }
        }
    }

    public vca_1() {
        vca_1 a2;
        a2.I = Lists.newArrayList();
    }

    @Override
    public void J(Lca lca) throws IOException {
        int n2;
        Lca b2 = lca;
        vca_1 a2 = this;
        Object object = b2;
        a2.A = ((Lca)object).readVarIntFromBuffer();
        int n3 = ((Lca)object).readInt();
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object object2 = b2;
            String string = ((Lca)object2).readStringFromBuffer(ysa.s);
            double d2 = ((Lca)object2).readDouble();
            ArrayList<CEa> arrayList = Lists.newArrayList();
            int n5 = ((Lca)object2).readVarIntFromBuffer();
            int n6 = uSa.E;
            while (n6 < n5) {
                int n7;
                UUID uUID = b2.readUuid();
                arrayList.add(new CEa(uUID, Upa.U, b2.readDouble(), b2.readByte()));
                n6 = ++n7;
            }
            a2.I.add(new bca((vca)a2, string, d2, arrayList));
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public vca_1(int n2, Collection<bA> collection) {
        void b2;
        Object c2 = collection;
        vca_1 a2 = this;
        a2.I = Lists.newArrayList();
        a2.A = b2;
        Iterator iterator = b2 = c2.iterator();
        while (iterator.hasNext()) {
            c2 = (bA)b2.next();
            iterator = b2;
            a2.I.add(new bca((vca)a2, c2.J().J(), c2.J(), c2.J()));
        }
    }

    public int J() {
        vca_1 a2;
        return a2.A;
    }

    public List<bca> J() {
        vca_1 a2;
        return a2.I;
    }

    @Override
    public void J(Pd pd2) {
        vca_1 b2 = pd2;
        vca_1 a2 = this;
        b2.J((vca)a2);
    }
}

