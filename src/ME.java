/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QFa
 *  Yka
 *  vRa
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ME {
    private List<IBlockState> J;
    private List<Yka> A;
    private List<Yka> I;

    public IBlockState J(int n2) {
        int b2 = n2;
        ME a2 = this;
        if (b2 >= 0 && b2 < a2.J.size()) {
            return a2.J.get(b2);
        }
        return QFa.HF.J();
    }

    public ME() {
        ME a2;
        ME mE2 = a2;
        a2.I = new ArrayList<Yka>();
        mE2.J = new ArrayList<IBlockState>();
        a2.A = Arrays.asList(new Yka[vRa.d]);
    }

    public int J() {
        ME a2;
        return a2.I.size();
    }

    public void J() {
        ME a2;
        ME mE2 = a2;
        mE2.I.clear();
        mE2.J.clear();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Yka yka, IBlockState iBlockState) {
        void b2;
        IBlockState c2 = iBlockState;
        ME a2 = this;
        a2.I.add((Yka)b2);
        a2.J.add(c2);
    }

    public Yka J(int n2) {
        int b2 = n2;
        ME a2 = this;
        return a2.I.get(b2);
    }

    public List<Yka> J(Yka yka) {
        ME a2;
        ME b2 = yka;
        ME mE2 = a2 = this;
        mE2.A.set(uSa.E, (Yka)b2);
        return mE2.A;
    }
}

