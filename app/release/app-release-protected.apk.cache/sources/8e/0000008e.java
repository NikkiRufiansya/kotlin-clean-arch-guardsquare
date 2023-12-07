package com.google.android.datatransport.cct;

import o.MainDispatcherFactory;
import o.isConsumed;
import o.setCheckMarkTintMode;
import o.setPreserveFocusAfterLayout;

/* loaded from: classes.dex */
public class CctBackendFactory implements MainDispatcherFactory {
    @Override // o.MainDispatcherFactory
    public setCheckMarkTintMode create(isConsumed isconsumed) {
        return new setPreserveFocusAfterLayout(isconsumed.MenuHostHelper$$ExternalSyntheticLambda0(), isconsumed.setX(), isconsumed.setY());
    }
}