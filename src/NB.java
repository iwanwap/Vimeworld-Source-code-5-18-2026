/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  an
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface NB
extends MessageLiteOrBuilder {
    public String getTarget();

    public int getLocationValue();

    public boolean hasOrientation();

    public ByteString getTargetBytes();

    public an getLocation();

    public an getOrientation();

    public int getOrientationValue();

    public boolean getRemoveWhenParentRemove();

    public boolean hasRemoveWhenParentRemove();
}

