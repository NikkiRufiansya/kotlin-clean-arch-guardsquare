package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class onActivityPreStopped implements View.OnTouchListener, View.OnAttachStateChangeListener {
    final View MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private Runnable setIconTintList;
    private final int[] setLayoutAnimation = new int[2];
    private final int setNavigationOnClickListener;
    private Runnable setOnLongClickListener;
    private final float setUiOptions;
    private boolean setX;
    private final int setY;

    public abstract setEdgeEffectFactory MenuHostHelper$$ExternalSyntheticLambda0();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public onActivityPreStopped(View view) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.setUiOptions = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.setNavigationOnClickListener = tapTimeout;
        this.setY = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.setX;
        if (z2) {
            if (!setX(motionEvent) && setY()) {
                z = false;
            }
            z = true;
        } else {
            z = MenuHostHelper$$ExternalSyntheticLambda0(motionEvent) && setIconTintList();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.MenuHostHelper$$ExternalSyntheticLambda0.onTouchEvent(obtain);
                obtain.recycle();
                z = true;
            }
        }
        this.setX = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.setX = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        Runnable runnable = this.setIconTintList;
        if (runnable != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.removeCallbacks(runnable);
        }
    }

    protected boolean setIconTintList() {
        setEdgeEffectFactory MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null || MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple()) {
            return true;
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation();
        return true;
    }

    protected boolean setY() {
        setEdgeEffectFactory MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null || !MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple()) {
            return true;
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean MenuHostHelper$$ExternalSyntheticLambda0(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.MenuHostHelper$$ExternalSyntheticLambda0
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.setUiOptions
            boolean r6 = MenuHostHelper$$ExternalSyntheticLambda1(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.MenuHostHelper$$ExternalSyntheticLambda1()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.MenuHostHelper$$ExternalSyntheticLambda1()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.MenuHostHelper$$ExternalSyntheticLambda1 = r6
            java.lang.Runnable r6 = r5.setIconTintList
            if (r6 != 0) goto L52
            o.onActivityPreStopped$setIconTintList r6 = new o.onActivityPreStopped$setIconTintList
            r6.<init>()
            r5.setIconTintList = r6
        L52:
            java.lang.Runnable r6 = r5.setIconTintList
            int r1 = r5.setNavigationOnClickListener
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.setOnLongClickListener
            if (r6 != 0) goto L65
            o.onActivityPreStopped$setY r6 = new o.onActivityPreStopped$setY
            r6.<init>()
            r5.setOnLongClickListener = r6
        L65:
            java.lang.Runnable r6 = r5.setOnLongClickListener
            int r1 = r5.setY
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityPreStopped.MenuHostHelper$$ExternalSyntheticLambda0(android.view.MotionEvent):boolean");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        Runnable runnable = this.setOnLongClickListener;
        if (runnable != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.setIconTintList;
        if (runnable2 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.removeCallbacks(runnable2);
        }
    }

    void setX() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        View view = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (view.isEnabled() && !view.isLongClickable() && setIconTintList()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.setX = true;
        }
    }

    private boolean setX(MotionEvent motionEvent) {
        setCheckedIconTint setcheckedicontint;
        View view = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setEdgeEffectFactory MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple() && (setcheckedicontint = (setCheckedIconTint) MenuHostHelper$$ExternalSyntheticLambda0.setY()) != null && setcheckedicontint.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            setIconTintList(view, obtainNoHistory);
            MenuHostHelper$$ExternalSyntheticLambda1(setcheckedicontint, obtainNoHistory);
            boolean x = setcheckedicontint.setX(obtainNoHistory, this.MenuHostHelper$$ExternalSyntheticLambda1);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (x && z) {
                return true;
            }
        }
        return false;
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, MotionEvent motionEvent) {
        int[] iArr = this.setLayoutAnimation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    private boolean setIconTintList(View view, MotionEvent motionEvent) {
        int[] iArr = this.setLayoutAnimation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setIconTintList implements Runnable {
        setIconTintList() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = onActivityPreStopped.this.MenuHostHelper$$ExternalSyntheticLambda0.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY implements Runnable {
        setY() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            onActivityPreStopped.this.setX();
        }
    }
}