package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import o.MenuHostHelper$$ExternalSyntheticLambda1;
import o.registerIn;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setCheckable;
import o.setOnLongClickListener;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    final ArrayDeque<setOnLongClickListener> setIconTintList;
    private final Runnable setX;

    public OnBackPressedDispatcher() {
        this(null);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.setIconTintList = new ArrayDeque<>();
        this.setX = runnable;
    }

    final MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0(setOnLongClickListener setonlongclicklistener) {
        this.setIconTintList.add(setonlongclicklistener);
        MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1 = new MenuHostHelper$$ExternalSyntheticLambda1(setonlongclicklistener) { // from class: androidx.activity.OnBackPressedDispatcher$MenuHostHelper$$ExternalSyntheticLambda0
            private final setOnLongClickListener MenuHostHelper$$ExternalSyntheticLambda1;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setonlongclicklistener;
            }

            @Override // o.MenuHostHelper$$ExternalSyntheticLambda1
            public final void setY() {
                OnBackPressedDispatcher.this.setIconTintList.remove(this.MenuHostHelper$$ExternalSyntheticLambda1);
                this.MenuHostHelper$$ExternalSyntheticLambda1.setY(this);
            }
        };
        setonlongclicklistener.setX(menuHostHelper$$ExternalSyntheticLambda1);
        return menuHostHelper$$ExternalSyntheticLambda1;
    }

    public final void setX(setTouchDelegate settouchdelegate, setOnLongClickListener setonlongclicklistener) {
        registerIn MenuHostHelper$$ExternalSyntheticLambda1 = settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0() == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
            return;
        }
        setonlongclicklistener.setX(new LifecycleOnBackPressedCancellable(MenuHostHelper$$ExternalSyntheticLambda1, setonlongclicklistener));
    }

    public final void setIconTintList() {
        Iterator<setOnLongClickListener> descendingIterator = this.setIconTintList.descendingIterator();
        while (descendingIterator.hasNext()) {
            setOnLongClickListener next = descendingIterator.next();
            if (next.MenuHostHelper$$ExternalSyntheticLambda1()) {
                next.setX();
                return;
            }
        }
        Runnable runnable = this.setX;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements setCheckable, MenuHostHelper$$ExternalSyntheticLambda1 {
        private final registerIn MenuHostHelper$$ExternalSyntheticLambda0;
        private MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
        private final setOnLongClickListener setY;

        LifecycleOnBackPressedCancellable(registerIn registerin, setOnLongClickListener setonlongclicklistener) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = registerin;
            this.setY = setonlongclicklistener;
            registerin.setY(this);
        }

        @Override // o.setCheckable
        public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
            if (setx == registerIn.setX.ON_START) {
                this.setIconTintList = OnBackPressedDispatcher.this.MenuHostHelper$$ExternalSyntheticLambda0(this.setY);
            } else if (setx == registerIn.setX.ON_STOP) {
                MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList;
                if (menuHostHelper$$ExternalSyntheticLambda1 != null) {
                    menuHostHelper$$ExternalSyntheticLambda1.setY();
                }
            } else if (setx == registerIn.setX.ON_DESTROY) {
                setY();
            }
        }

        @Override // o.MenuHostHelper$$ExternalSyntheticLambda1
        public final void setY() {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this);
            this.setY.setY(this);
            MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList;
            if (menuHostHelper$$ExternalSyntheticLambda1 != null) {
                menuHostHelper$$ExternalSyntheticLambda1.setY();
                this.setIconTintList = null;
            }
        }
    }
}