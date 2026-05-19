/*
 * Decompiled with CFR 0.152.
 */
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class Pma_1
extends Authenticator {
    public final /* synthetic */ String A;
    public final /* synthetic */ String I;

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        Pma_1 a2;
        Pma_1 pma_1 = a2;
        return new PasswordAuthentication(pma_1.I, pma_1.A.toCharArray());
    }

    public Pma_1(String string, String object) {
        Object a2 = object;
        object = this;
        ((Pma_1)object).I = string;
        ((Pma_1)object).A = a2;
        ((Authenticator)object)();
    }
}

