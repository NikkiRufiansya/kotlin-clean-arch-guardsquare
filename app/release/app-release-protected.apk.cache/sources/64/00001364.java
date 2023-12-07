package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import o.xU;

/* renamed from: o.yd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620yd extends xU.setX {
    public static final xU.setX MenuHostHelper$$ExternalSyntheticLambda0 = new C0620yd();

    C0620yd() {
    }

    /* renamed from: o.yd$setY */
    /* loaded from: classes.dex */
    static final class setY<T> implements xU<vH, Optional<T>> {
        private xU<vH, T> MenuHostHelper$$ExternalSyntheticLambda0;

        @Override // o.xU
        public final /* synthetic */ Object setY(vH vHVar) {
            return Optional.ofNullable(this.MenuHostHelper$$ExternalSyntheticLambda0.setY(vHVar));
        }

        setY(xU<vH, T> xUVar) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = xUVar;
        }
    }

    @Override // o.xU.setX
    @Nullable
    public final xU<vH, ?> MenuHostHelper$$ExternalSyntheticLambda0(Type type, Annotation[] annotationArr, C0624yh c0624yh) {
        if (C0629ym.setIconTintList(type) != Optional.class) {
            return null;
        }
        return new setY(c0624yh.MenuHostHelper$$ExternalSyntheticLambda1(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type), annotationArr));
    }
}