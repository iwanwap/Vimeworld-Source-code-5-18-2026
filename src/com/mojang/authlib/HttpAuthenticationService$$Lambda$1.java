/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.authlib;

import com.mojang.authlib.HttpAuthenticationService;
import java.util.function.Function;

final class HttpAuthenticationService$$Lambda$1
implements Function {
    private static final HttpAuthenticationService$$Lambda$1 instance = new HttpAuthenticationService$$Lambda$1();

    private HttpAuthenticationService$$Lambda$1() {
    }

    public Object apply(Object object) {
        return HttpAuthenticationService.lambda$createUrlConnection$0((String)object);
    }

    public static Function lambdaFactory$() {
        return instance;
    }
}

