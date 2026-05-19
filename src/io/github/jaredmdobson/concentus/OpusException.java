/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.CodecHelpers;

public class OpusException
extends Exception {
    private String _message;
    private int _opus_error_code;

    public OpusException() {
        this("", 0);
    }

    public OpusException(String message) {
        this(message, 1);
    }

    public OpusException(String message, int opus_error_code) {
        this._message = message + ": " + CodecHelpers.opus_strerror(opus_error_code);
        this._opus_error_code = opus_error_code;
    }

    @Override
    public String getMessage() {
        return this._message;
    }
}

