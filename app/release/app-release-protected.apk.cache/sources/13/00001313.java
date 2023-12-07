package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.xQ;

/* loaded from: classes.dex */
public final class xY extends xQ.setY {
    @Nullable
    private final Executor setX;

    public xY(@Nullable Executor executor) {
        this.setX = executor;
    }

    @Override // o.xQ.setY
    @Nullable
    public final xQ<?, ?> MenuHostHelper$$ExternalSyntheticLambda0(Type type, Annotation[] annotationArr) {
        if (C0629ym.setIconTintList(type) != xT.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type MenuHostHelper$$ExternalSyntheticLambda0 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type);
        final Executor executor = C0629ym.setY(annotationArr, InterfaceC0630yn.class) ? null : this.setX;
        return new xQ<Object, xT<?>>() { // from class: o.xY.2
            @Override // o.xQ
            public final Type setY() {
                return MenuHostHelper$$ExternalSyntheticLambda0;
            }

            @Override // o.xQ
            public final /* synthetic */ xT<?> MenuHostHelper$$ExternalSyntheticLambda1(xT<Object> xTVar) {
                Executor executor2 = executor;
                return executor2 != null ? new xY$MenuHostHelper$$ExternalSyntheticLambda1(executor2, xTVar) : xTVar;
            }
        };
    }
}