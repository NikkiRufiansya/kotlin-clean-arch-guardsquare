package androidx.lifecycle;

import o.registerIn;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setCheckable;
import o.setCounterEnabled;
import o.setMenuCallbacks;
import o.setOverlayMode;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    volatile Object MenuHostHelper$$ExternalSyntheticLambda0;
    private int setChipCornerRadius;
    private boolean setIconTintList;
    private boolean setLayoutAnimation;
    private volatile Object setNavigationOnClickListener;
    private boolean setUiOptions;
    private final Runnable setUnboundedRipple;
    final Object setX = new Object();
    private setCounterEnabled<setOverlayMode<? super T>, LiveData<T>.setX> setOnLongClickListener = new setCounterEnabled<>();
    private int setY = 0;

    protected void setIconTintList() {
    }

    protected void setY() {
    }

    public LiveData() {
        Object obj = MenuHostHelper$$ExternalSyntheticLambda1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
        this.setUnboundedRipple = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.setX) {
                    obj2 = LiveData.this.MenuHostHelper$$ExternalSyntheticLambda0;
                    LiveData.this.MenuHostHelper$$ExternalSyntheticLambda0 = LiveData.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                LiveData.this.setIconTintList((LiveData) obj2);
            }
        };
        this.setNavigationOnClickListener = obj;
        this.setChipCornerRadius = -1;
    }

    private void setIconTintList(LiveData<T>.setX setx) {
        if (setx.setY) {
            if (!setx.setY()) {
                setx.MenuHostHelper$$ExternalSyntheticLambda1(false);
                return;
            }
            int i = setx.setX;
            int i2 = this.setChipCornerRadius;
            if (i >= i2) {
                return;
            }
            setx.setX = i2;
            setx.setUnboundedRipple.setY((Object) this.setNavigationOnClickListener);
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(LiveData<T>.setX setx) {
        if (this.setUiOptions) {
            this.setLayoutAnimation = true;
            return;
        }
        this.setUiOptions = true;
        do {
            this.setLayoutAnimation = false;
            if (setx != null) {
                setIconTintList((setX) setx);
                setx = null;
            } else {
                setCounterEnabled<setOverlayMode<? super T>, LiveData<T>.setX> setcounterenabled = this.setOnLongClickListener;
                setCounterEnabled.setY sety = new setCounterEnabled.setY();
                setcounterenabled.setX.put(sety, Boolean.FALSE);
                while (sety.hasNext()) {
                    setIconTintList((setX) ((setX) sety.next().getValue()));
                    if (this.setLayoutAnimation) {
                        break;
                    }
                }
            }
        } while (this.setLayoutAnimation);
        this.setUiOptions = false;
    }

    public final void setY(setTouchDelegate settouchdelegate, setOverlayMode<? super T> setoverlaymode) {
        setY("observe");
        if (settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0() == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(settouchdelegate, setoverlaymode);
        LiveData<T>.setX x = this.setOnLongClickListener.setX(setoverlaymode, lifecycleBoundObserver);
        if (x != null && !x.setX(settouchdelegate)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (x != null) {
            return;
        }
        settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().setY(lifecycleBoundObserver);
    }

    public final void setX(setOverlayMode<? super T> setoverlaymode) {
        setY("observeForever");
        LiveData<T>.setX setx = new setX(setoverlaymode) { // from class: androidx.lifecycle.LiveData$MenuHostHelper$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LiveData.setX
            final boolean setY() {
                return true;
            }
        };
        LiveData<T>.setX x = this.setOnLongClickListener.setX(setoverlaymode, setx);
        if (x instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (x != null) {
            return;
        }
        setx.MenuHostHelper$$ExternalSyntheticLambda1(true);
    }

    public void setIconTintList(setOverlayMode<? super T> setoverlaymode) {
        setY("removeObserver");
        LiveData<T>.setX MenuHostHelper$$ExternalSyntheticLambda0 = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(setoverlaymode);
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(false);
    }

    public void setIconTintList(T t) {
        setY("setValue");
        this.setChipCornerRadius++;
        this.setNavigationOnClickListener = t;
        MenuHostHelper$$ExternalSyntheticLambda1((setX) null);
    }

    public final T MenuHostHelper$$ExternalSyntheticLambda1() {
        T t = (T) this.setNavigationOnClickListener;
        if (t != MenuHostHelper$$ExternalSyntheticLambda1) {
            return t;
        }
        return null;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY > 0;
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int i2 = this.setY;
        this.setY = i + i2;
        if (this.setIconTintList) {
            return;
        }
        this.setIconTintList = true;
        while (true) {
            try {
                int i3 = this.setY;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    setY();
                } else if (z2) {
                    setIconTintList();
                }
                i2 = i3;
            } finally {
                this.setIconTintList = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends setX implements setCheckable {
        final setTouchDelegate MenuHostHelper$$ExternalSyntheticLambda0;

        LifecycleBoundObserver(setTouchDelegate settouchdelegate, setOverlayMode<? super T> setoverlaymode) {
            super(setoverlaymode);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = settouchdelegate;
        }

        @Override // androidx.lifecycle.LiveData.setX
        final boolean setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0().compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED) >= 0;
        }

        @Override // o.setCheckable
        public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
            registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
                LiveData.this.setIconTintList((setOverlayMode) this.setUnboundedRipple);
                return;
            }
            registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1 = null;
            while (registerin_menuhosthelper__externalsyntheticlambda1 != MenuHostHelper$$ExternalSyntheticLambda0) {
                MenuHostHelper$$ExternalSyntheticLambda1(setY());
                registerin_menuhosthelper__externalsyntheticlambda1 = MenuHostHelper$$ExternalSyntheticLambda0;
                MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }

        @Override // androidx.lifecycle.LiveData.setX
        final boolean setX(setTouchDelegate settouchdelegate) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0 == settouchdelegate;
        }

        @Override // androidx.lifecycle.LiveData.setX
        final void MenuHostHelper$$ExternalSyntheticLambda1() {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class setX {
        final setOverlayMode<? super T> setUnboundedRipple;
        int setX = -1;
        boolean setY;

        void MenuHostHelper$$ExternalSyntheticLambda1() {
        }

        boolean setX(setTouchDelegate settouchdelegate) {
            return false;
        }

        abstract boolean setY();

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(setOverlayMode<? super T> setoverlaymode) {
            this.setUnboundedRipple = setoverlaymode;
        }

        final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
            if (z == this.setY) {
                return;
            }
            this.setY = z;
            LiveData.this.MenuHostHelper$$ExternalSyntheticLambda1(z ? 1 : -1);
            if (this.setY) {
                LiveData.this.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    private static void setY(String str) {
        if (setMenuCallbacks.setY().setIconTintList()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot invoke ");
        sb.append(str);
        sb.append(" on a background thread");
        throw new IllegalStateException(sb.toString());
    }
}