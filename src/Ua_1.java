/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SN
 *  XM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Ua_1
extends MessageLiteOrBuilder {
    public int getKeyBindingsCount();

    public boolean getDefaultBackground();

    public int getElementsCount();

    public boolean hasDefaultFinishAnimationDuration();

    public XM getElements(int var1);

    public int getDefaultStartAnimationDuration();

    public boolean hasCloseCallback();

    public boolean hasDefaultBackground();

    public String getId();

    public boolean getCloseOnInventoryKey();

    public ByteString getIdBytes();

    public boolean getCloseOnEsc();

    public List<SN> getKeyBindingsList();

    public xm getBehavior();

    public boolean hasCloseOnEsc();

    public SN getKeyBindings(int var1);

    public int getDefaultFinishAnimationDuration();

    public boolean hasCloseOnInventoryKey();

    public boolean hasDefaultStartAnimationDuration();

    public boolean hasBehavior();

    public List<XM> getElementsList();

    public ByteString getCloseCallback();
}

