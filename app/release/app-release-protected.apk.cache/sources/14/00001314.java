package o;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.xY$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
final class xY$MenuHostHelper$$ExternalSyntheticLambda1<T> implements xT<T> {
    final xT<T> setX;
    final Executor setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xY$MenuHostHelper$$ExternalSyntheticLambda1(Executor executor, xT<T> xTVar) {
        this.setY = executor;
        this.setX = xTVar;
    }

    @Override // o.xT
    public final void MenuHostHelper$$ExternalSyntheticLambda0(xR<T> xRVar) {
        Objects.requireNonNull(xRVar, "callback == null");
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(new AnonymousClass5(xRVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.xY$MenuHostHelper$$ExternalSyntheticLambda1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 implements xR<T> {
        private /* synthetic */ xR MenuHostHelper$$ExternalSyntheticLambda0;

        AnonymousClass5(xR xRVar) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = xRVar;
        }

        @Override // o.xR
        public final void setY(xT<T> xTVar, final C0622yf<T> c0622yf) {
            Executor executor = xY$MenuHostHelper$$ExternalSyntheticLambda1.this.setY;
            final xR xRVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            executor.execute(new Runnable() { // from class: o.xZ
                @Override // java.lang.Runnable
                public final void run() {
                    xY$MenuHostHelper$$ExternalSyntheticLambda1.AnonymousClass5 anonymousClass5 = xY$MenuHostHelper$$ExternalSyntheticLambda1.AnonymousClass5.this;
                    xR xRVar2 = xRVar;
                    C0622yf c0622yf2 = c0622yf;
                    if (xY$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.MenuHostHelper$$ExternalSyntheticLambda0()) {
                        xRVar2.MenuHostHelper$$ExternalSyntheticLambda1(xY$MenuHostHelper$$ExternalSyntheticLambda1.this, new IOException("Canceled"));
                    } else {
                        xRVar2.setY(xY$MenuHostHelper$$ExternalSyntheticLambda1.this, c0622yf2);
                    }
                }
            });
        }

        @Override // o.xR
        public final void MenuHostHelper$$ExternalSyntheticLambda1(xT<T> xTVar, final Throwable th) {
            Executor executor = xY$MenuHostHelper$$ExternalSyntheticLambda1.this.setY;
            final xR xRVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            executor.execute(new Runnable() { // from class: o.xX
                @Override // java.lang.Runnable
                public final void run() {
                    xY$MenuHostHelper$$ExternalSyntheticLambda1.AnonymousClass5 anonymousClass5 = xY$MenuHostHelper$$ExternalSyntheticLambda1.AnonymousClass5.this;
                    xRVar.MenuHostHelper$$ExternalSyntheticLambda1(xY$MenuHostHelper$$ExternalSyntheticLambda1.this, th);
                }
            });
        }
    }

    @Override // o.xT
    public final void setIconTintList() {
        this.setX.setIconTintList();
    }

    @Override // o.xT
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.xT
    public final xT<T> setY() {
        return new xY$MenuHostHelper$$ExternalSyntheticLambda1(this.setY, this.setX.setY());
    }

    @Override // o.xT
    public final vE setX() {
        return this.setX.setX();
    }

    public final /* synthetic */ Object clone() {
        return new xY$MenuHostHelper$$ExternalSyntheticLambda1(this.setY, this.setX.setY());
    }
}