package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import o.xQ;
import o.xS;

/* loaded from: classes.dex */
public final class xS extends xQ.setY {
    public static final xQ.setY setX = new xS();

    xS() {
    }

    /* loaded from: classes.dex */
    static final class setY<R> implements xQ<R, CompletableFuture<C0622yf<R>>> {
        private final Type MenuHostHelper$$ExternalSyntheticLambda1;

        setY(Type type) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = type;
        }

        @Override // o.xQ
        public final Type setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        /* renamed from: o.xS$setY$setY  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0011setY implements xR<R> {
            private final CompletableFuture<C0622yf<R>> setY;

            public C0011setY(CompletableFuture<C0622yf<R>> completableFuture) {
                this.setY = completableFuture;
            }

            @Override // o.xR
            public final void setY(xT<R> xTVar, C0622yf<R> c0622yf) {
                this.setY.complete(c0622yf);
            }

            @Override // o.xR
            public final void MenuHostHelper$$ExternalSyntheticLambda1(xT<R> xTVar, Throwable th) {
                this.setY.completeExceptionally(th);
            }
        }

        @Override // o.xQ
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(xT xTVar) {
            setX setx = new setX(xTVar);
            xTVar.MenuHostHelper$$ExternalSyntheticLambda0(new C0011setY(setx));
            return setx;
        }
    }

    /* loaded from: classes.dex */
    static final class setX<T> extends CompletableFuture<T> {
        private final xT<?> setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(xT<?> xTVar) {
            this.setY = xTVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.setY.setIconTintList();
            }
            return super.cancel(z);
        }
    }

    @Override // o.xQ.setY
    @Nullable
    public final xQ<?, ?> MenuHostHelper$$ExternalSyntheticLambda0(Type type, Annotation[] annotationArr) {
        if (C0629ym.setIconTintList(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        final Type MenuHostHelper$$ExternalSyntheticLambda0 = C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) type);
        if (C0629ym.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0) != C0622yf.class) {
            return new xQ<R, CompletableFuture<R>>(MenuHostHelper$$ExternalSyntheticLambda0) { // from class: o.xS$MenuHostHelper$$ExternalSyntheticLambda1
                private final Type MenuHostHelper$$ExternalSyntheticLambda1;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda0;
                }

                @Override // o.xQ
                public final Type setY() {
                    return this.MenuHostHelper$$ExternalSyntheticLambda1;
                }

                /* loaded from: classes.dex */
                class setY implements xR<R> {
                    private final CompletableFuture<R> setY;

                    public setY(CompletableFuture<R> completableFuture) {
                        this.setY = completableFuture;
                    }

                    @Override // o.xR
                    public final void MenuHostHelper$$ExternalSyntheticLambda1(xT<R> xTVar, Throwable th) {
                        this.setY.completeExceptionally(th);
                    }

                    @Override // o.xR
                    public final void setY(xT<R> xTVar, C0622yf<R> c0622yf) {
                        int i = c0622yf.setX.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (200 <= i && 299 >= i) {
                            this.setY.complete(c0622yf.setY);
                        } else {
                            this.setY.completeExceptionally(new xW(c0622yf));
                        }
                    }
                }

                @Override // o.xQ
                public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(xT xTVar) {
                    xS.setX setx = new xS.setX(xTVar);
                    xTVar.MenuHostHelper$$ExternalSyntheticLambda0(new setY(setx));
                    return setx;
                }
            };
        }
        if (!(MenuHostHelper$$ExternalSyntheticLambda0 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new setY(C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(0, (ParameterizedType) MenuHostHelper$$ExternalSyntheticLambda0));
    }
}