/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BN
 */
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface xa_1
extends MessageLiteOrBuilder {
    public boolean getCancel();

    public boolean hasCancel();

    public List<Integer> getModifiersList();

    public boolean getKeydown();

    public int getModifiersCount();

    public boolean hasKeyup();

    public int getActionsCount();

    public BN getActions(int var1);

    public List<BN> getActionsList();

    public boolean getDoubleClick();

    public boolean hasKeydown();

    public boolean getKeyup();

    public boolean hasDoubleClick();

    public int getModifiers(int var1);

    public boolean hasTimeout();

    public int getTimeout();
}

