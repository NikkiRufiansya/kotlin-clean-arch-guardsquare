package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;

/* loaded from: classes.dex */
public abstract class setOnSystemUiVisibilityChangeListener<V extends View> extends setImageTintList<V> {
    OverScroller MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private Runnable setIconTintList;
    private int setLayoutAnimation;
    private VelocityTracker setNavigationOnClickListener;
    private boolean setX;
    private int setY;

    protected boolean setIconTintList(V v) {
        return false;
    }

    protected void setY(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
    }

    public setOnSystemUiVisibilityChangeListener() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setLayoutAnimation = -1;
    }

    public setOnSystemUiVisibilityChangeListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setLayoutAnimation = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public boolean setY(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.setLayoutAnimation < 0) {
            this.setLayoutAnimation = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.setX) {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.setY) > this.setLayoutAnimation) {
                this.setY = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = setIconTintList(v) && coordinatorLayout.setIconTintList(v, x, y2);
            this.setX = z;
            if (z) {
                this.setY = y2;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = motionEvent.getPointerId(0);
                if (this.setNavigationOnClickListener == null) {
                    this.setNavigationOnClickListener = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.setNavigationOnClickListener;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean MenuHostHelper$$ExternalSyntheticLambda0(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnSystemUiVisibilityChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int setX(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iconTintList = setIconTintList();
        if (i2 != 0 && iconTintList >= i2 && iconTintList <= i3) {
            if (i < i2) {
                i = i2;
            } else if (i > i3) {
                i = i3;
            }
            if (iconTintList != i) {
                setX(i);
                return iconTintList - i;
            }
        }
        return 0;
    }

    public int setX() {
        return setIconTintList();
    }

    protected int setX(V v) {
        return -v.getHeight();
    }

    protected int setY(V v) {
        return v.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY implements Runnable {
        private final androidx.coordinatorlayout.widget.CoordinatorLayout MenuHostHelper$$ExternalSyntheticLambda1;
        private final V setY;

        setY(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = coordinatorLayout;
            this.setY = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.setY == null || setOnSystemUiVisibilityChangeListener.this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                return;
            }
            if (setOnSystemUiVisibilityChangeListener.this.MenuHostHelper$$ExternalSyntheticLambda0.computeScrollOffset()) {
                setOnSystemUiVisibilityChangeListener setonsystemuivisibilitychangelistener = setOnSystemUiVisibilityChangeListener.this;
                setonsystemuivisibilitychangelistener.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, setonsystemuivisibilitychangelistener.MenuHostHelper$$ExternalSyntheticLambda0.getCurrY(), Integer.MIN_VALUE, Integer.MAX_VALUE);
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(this.setY, this);
                return;
            }
            setOnSystemUiVisibilityChangeListener.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY);
        }
    }
}