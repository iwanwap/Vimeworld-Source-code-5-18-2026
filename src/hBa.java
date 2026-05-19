/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bFa
 *  nBa
 */
import com.google.common.collect.Lists;

public final class hBa
implements Runnable {
    private static final String A = "CL_00002380";
    public final /* synthetic */ nBa I;

    public hBa(nBa nBa2) {
        hBa b2 = nBa2;
        hBa a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        Object a2;
        hBa hBa2 = this;
        Object object = a2 = Lists.newArrayList(hBa2.I.J().J()).iterator();
        while (object.hasNext()) {
            bFa bFa2 = (bFa)a2.next();
            object = a2;
            hBa2.I.J().d(bFa2);
        }
    }
}

