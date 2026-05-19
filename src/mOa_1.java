/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  rna
 *  woa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mOa_1
implements D {
    private boolean replaceExisting;
    private rna category;
    private final List<woa> soundList = Lists.newArrayList();

    public rna J() {
        mOa_1 a2;
        return a2.category;
    }

    public boolean J() {
        mOa_1 a2;
        return a2.replaceExisting;
    }

    public mOa_1() {
        mOa_1 a2;
    }

    public List<woa> J() {
        mOa_1 a2;
        return a2.soundList;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        mOa_1 a2 = this;
        a2.replaceExisting = b2;
    }

    public void J(rna rna2) {
        mOa_1 b2 = rna2;
        mOa_1 a2 = this;
        a2.category = b2;
    }
}

