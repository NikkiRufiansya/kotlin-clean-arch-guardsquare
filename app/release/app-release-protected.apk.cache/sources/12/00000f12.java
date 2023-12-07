package o;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class setRowCount {
    private static final Interpolator setX = new Interpolator() { // from class: o.setRowCount.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public View MenuHostHelper$$ExternalSyntheticLambda1;
    private float[] ViewPager$SavedState$1;
    private float setAnimationFromJson;
    private float[] setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    private float[] setChipCornerRadius;
    private VelocityTracker setGuidelinePercent;
    private int[] setIconSize;
    public int setIconTintList;
    private int[] setLayoutAnimation;
    private boolean setMaxEms;
    private OverScroller setMinAndMaxProgress;
    private final int setNavigationOnClickListener;
    private int[] setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private float[] setTextAlignment;
    private float setTextScaleX;
    private final setRowCount$MenuHostHelper$$ExternalSyntheticLambda0 setUiOptions;
    private int setUnboundedRipple;
    private final ViewGroup setZ;
    public int setY = -1;
    private final Runnable setLayoutDirection = new Runnable() { // from class: o.setRowCount.4
        @Override // java.lang.Runnable
        public final void run() {
            setRowCount.this.MenuHostHelper$$ExternalSyntheticLambda0(0);
        }
    };

    public static setRowCount MenuHostHelper$$ExternalSyntheticLambda0(ViewGroup viewGroup, setRowCount$MenuHostHelper$$ExternalSyntheticLambda0 setrowcount_menuhosthelper__externalsyntheticlambda0) {
        return new setRowCount(viewGroup.getContext(), viewGroup, setrowcount_menuhosthelper__externalsyntheticlambda0);
    }

    private setRowCount(Context context, ViewGroup viewGroup, setRowCount$MenuHostHelper$$ExternalSyntheticLambda0 setrowcount_menuhosthelper__externalsyntheticlambda0) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (setrowcount_menuhosthelper__externalsyntheticlambda0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.setZ = viewGroup;
        this.setUiOptions = setrowcount_menuhosthelper__externalsyntheticlambda0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.setNavigationOnClickListener = i;
        this.setUnboundedRipple = i;
        this.setIconTintList = viewConfiguration.getScaledTouchSlop();
        this.setAnimationFromJson = viewConfiguration.getScaledMaximumFlingVelocity();
        this.setTextScaleX = viewConfiguration.getScaledMinimumFlingVelocity();
        this.setMinAndMaxProgress = new OverScroller(context, setX);
    }

    public final void setIconTintList(View view, int i) {
        if (view.getParent() != this.setZ) {
            StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sb.append(this.setZ);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = view;
        this.setY = i;
        this.setUiOptions.setX(view, i);
        MenuHostHelper$$ExternalSyntheticLambda0(1);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setY = -1;
        float[] fArr = this.setCenterIfNoTextEnabled;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.setTextAlignment, 0.0f);
            Arrays.fill(this.setChipCornerRadius, 0.0f);
            Arrays.fill(this.ViewPager$SavedState$1, 0.0f);
            Arrays.fill(this.setIconSize, 0);
            Arrays.fill(this.setOnLongClickListener, 0);
            Arrays.fill(this.setLayoutAnimation, 0);
            this.setOnNavigationItemSelectedListener = 0;
        }
        VelocityTracker velocityTracker = this.setGuidelinePercent;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.setGuidelinePercent = null;
        }
    }

    public final boolean setX(int i, int i2) {
        if (!this.setMaxEms) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return MenuHostHelper$$ExternalSyntheticLambda0(i, i2, (int) this.setGuidelinePercent.getXVelocity(this.setY), (int) this.setGuidelinePercent.getYVelocity(this.setY));
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.MenuHostHelper$$ExternalSyntheticLambda1.getLeft();
        int top = this.MenuHostHelper$$ExternalSyntheticLambda1.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.setMinAndMaxProgress.abortAnimation();
            MenuHostHelper$$ExternalSyntheticLambda0(0);
            return false;
        }
        View view = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i7 = (int) this.setTextScaleX;
        int i8 = (int) this.setAnimationFromJson;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 <= 0 ? -i8 : i8;
        }
        int i9 = (int) this.setTextScaleX;
        int i10 = (int) this.setAnimationFromJson;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i10) {
            i4 = i4 <= 0 ? -i10 : i10;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i11 = abs5 + abs6;
        int i12 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i11;
        } else {
            f = abs3;
            f2 = i12;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i11;
        } else {
            f3 = abs4;
            f4 = i12;
        }
        this.setMinAndMaxProgress.startScroll(left, top, i5, i6, (int) ((setX(i5, i3, this.setUiOptions.setY(view)) * f5) + (setX(i6, i4, this.setUiOptions.setIconTintList()) * (f3 / f4))));
        MenuHostHelper$$ExternalSyntheticLambda0(2);
        return true;
    }

    private int setX(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.setZ.getWidth() / 2;
        float sin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs((width2 + (sin * width2)) / abs2) * 1000.0f) << 2;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
            boolean computeScrollOffset = this.setMinAndMaxProgress.computeScrollOffset();
            int currX = this.setMinAndMaxProgress.getCurrX();
            int currY = this.setMinAndMaxProgress.getCurrY();
            int left = currX - this.MenuHostHelper$$ExternalSyntheticLambda1.getLeft();
            int top = currY - this.MenuHostHelper$$ExternalSyntheticLambda1.getTop();
            if (left != 0) {
                setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, left);
            }
            if (top != 0) {
                setBaselineAlignBottom.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, top);
            }
            if (left != 0 || top != 0) {
                this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, currX, currY);
            }
            if (computeScrollOffset && currX == this.setMinAndMaxProgress.getFinalX() && currY == this.setMinAndMaxProgress.getFinalY()) {
                this.setMinAndMaxProgress.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.setZ.post(this.setLayoutDirection);
            }
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0 == 2;
    }

    private void setX(float f, float f2) {
        this.setMaxEms = true;
        this.setUiOptions.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, f, f2);
        this.setMaxEms = false;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
            MenuHostHelper$$ExternalSyntheticLambda0(0);
        }
    }

    private void setX(int i) {
        if (this.setCenterIfNoTextEnabled != null) {
            int i2 = 1 << i;
            if ((this.setOnNavigationItemSelectedListener & i2) != 0) {
                this.setCenterIfNoTextEnabled[i] = 0.0f;
                this.setTextAlignment[i] = 0.0f;
                this.setChipCornerRadius[i] = 0.0f;
                this.ViewPager$SavedState$1[i] = 0.0f;
                this.setIconSize[i] = 0;
                this.setOnLongClickListener[i] = 0;
                this.setLayoutAnimation[i] = 0;
                this.setOnNavigationItemSelectedListener = (~i2) & this.setOnNavigationItemSelectedListener;
            }
        }
    }

    private void setY(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (MenuHostHelper$$ExternalSyntheticLambda1(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.setChipCornerRadius[pointerId] = x;
                this.ViewPager$SavedState$1[pointerId] = y;
            }
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setZ.removeCallbacks(this.setLayoutDirection);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != i) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.setUiOptions.setY(i);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            }
        }
    }

    private boolean setX(View view, int i) {
        if (view == this.MenuHostHelper$$ExternalSyntheticLambda1 && this.setY == i) {
            return true;
        }
        if (view == null || !this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(view, i)) {
            return false;
        }
        this.setY = i;
        setIconTintList(view, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r12 != r11) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setIconTintList(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRowCount.setIconTintList(android.view.MotionEvent):boolean");
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
        if (this.setGuidelinePercent == null) {
            this.setGuidelinePercent = VelocityTracker.obtain();
        }
        this.setGuidelinePercent.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0((int) x, (int) y);
            MenuHostHelper$$ExternalSyntheticLambda0(x, y, pointerId);
            setX(MenuHostHelper$$ExternalSyntheticLambda0, pointerId);
            int i3 = this.setIconSize[pointerId];
        } else if (actionMasked == 1) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
                setX();
            }
            MenuHostHelper$$ExternalSyntheticLambda1();
        } else if (actionMasked == 2) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
                if (MenuHostHelper$$ExternalSyntheticLambda1(this.setY)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.setY);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.setChipCornerRadius;
                    int i4 = this.setY;
                    int i5 = (int) (x2 - fArr[i4]);
                    int i6 = (int) (y2 - this.ViewPager$SavedState$1[i4]);
                    int left = this.MenuHostHelper$$ExternalSyntheticLambda1.getLeft() + i5;
                    int top = this.MenuHostHelper$$ExternalSyntheticLambda1.getTop() + i6;
                    int left2 = this.MenuHostHelper$$ExternalSyntheticLambda1.getLeft();
                    int top2 = this.MenuHostHelper$$ExternalSyntheticLambda1.getTop();
                    if (i5 != 0) {
                        left = this.setUiOptions.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, left);
                        setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, left - left2);
                    }
                    if (i6 != 0) {
                        top = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, top);
                        setBaselineAlignBottom.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, top - top2);
                    }
                    if (i5 != 0 || i6 != 0) {
                        this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, left, top);
                    }
                    setY(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (MenuHostHelper$$ExternalSyntheticLambda1(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.setCenterIfNoTextEnabled[pointerId2];
                    float f2 = y3 - this.setTextAlignment[pointerId2];
                    setX(f, f2, pointerId2);
                    if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
                        break;
                    }
                    View MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0((int) x3, (int) y3);
                    if (setX(MenuHostHelper$$ExternalSyntheticLambda02, f, f2) && setX(MenuHostHelper$$ExternalSyntheticLambda02, pointerId2)) {
                        break;
                    }
                }
                i2++;
            }
            setY(motionEvent);
        } else if (actionMasked == 3) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
                setX(0.0f, 0.0f);
            }
            MenuHostHelper$$ExternalSyntheticLambda1();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            MenuHostHelper$$ExternalSyntheticLambda0(x4, y4, pointerId3);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                setX(MenuHostHelper$$ExternalSyntheticLambda0((int) x4, (int) y4), pointerId3);
                int i7 = this.setIconSize[pointerId3];
                return;
            }
            int i8 = (int) x4;
            int i9 = (int) y4;
            View view = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom()) {
                i2 = 1;
            }
            if (i2 != 0) {
                setX(this.MenuHostHelper$$ExternalSyntheticLambda1, pointerId3);
            }
        } else if (actionMasked == 6) {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1 && pointerId4 == this.setY) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i2);
                    if (pointerId5 != this.setY) {
                        View MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (MenuHostHelper$$ExternalSyntheticLambda03 == view2 && setX(view2, pointerId5)) {
                            i = this.setY;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    setX();
                }
            }
            setX(pointerId4);
        }
    }

    private void setX(float f, float f2, int i) {
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(f, f2, i, 1);
        if (MenuHostHelper$$ExternalSyntheticLambda1(f2, f, i, 4)) {
            MenuHostHelper$$ExternalSyntheticLambda1 |= true;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1(f, f2, i, 2)) {
            MenuHostHelper$$ExternalSyntheticLambda1 |= true;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1(f2, f, i, 8)) {
            MenuHostHelper$$ExternalSyntheticLambda1 |= true;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1) {
            int[] iArr = this.setOnLongClickListener;
            iArr[i] = iArr[i] | MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.setIconSize[i] & i2) != i2 || (this.setCheckedIconEnabled & i2) == 0 || (this.setLayoutAnimation[i] & i2) == i2 || (this.setOnLongClickListener[i] & i2) == i2) {
            return false;
        }
        float f3 = this.setIconTintList;
        if (abs > f3 || abs2 > f3) {
            int i3 = (abs > (abs2 * 0.5f) ? 1 : (abs == (abs2 * 0.5f) ? 0 : -1));
            return (this.setOnLongClickListener[i] & i2) == 0 && abs > ((float) this.setIconTintList);
        }
        return false;
    }

    private boolean setX(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.setUiOptions.setY(view) > 0;
        boolean z2 = this.setUiOptions.setIconTintList() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.setIconTintList) : z2 && Math.abs(f2) > ((float) this.setIconTintList);
        }
        int i = this.setIconTintList;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private void setX() {
        this.setGuidelinePercent.computeCurrentVelocity(1000, this.setAnimationFromJson);
        float xVelocity = this.setGuidelinePercent.getXVelocity(this.setY);
        float f = this.setTextScaleX;
        float f2 = this.setAnimationFromJson;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity <= 0.0f ? -f2 : f2;
        }
        float yVelocity = this.setGuidelinePercent.getYVelocity(this.setY);
        float f4 = this.setTextScaleX;
        float f5 = this.setAnimationFromJson;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity <= 0.0f) {
                    yVelocity = -f5;
                } else {
                    f3 = f5;
                }
            }
            f3 = yVelocity;
        }
        setX(xVelocity, f3);
    }

    private View MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        for (int childCount = this.setZ.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.setZ.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if ((this.setOnNavigationItemSelectedListener & (1 << i)) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, int i) {
        float[] fArr = this.setCenterIfNoTextEnabled;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.setTextAlignment;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.setChipCornerRadius;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.ViewPager$SavedState$1;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.setIconSize;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.setOnLongClickListener;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.setLayoutAnimation;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.setCenterIfNoTextEnabled = fArr2;
            this.setTextAlignment = fArr3;
            this.setChipCornerRadius = fArr4;
            this.ViewPager$SavedState$1 = fArr5;
            this.setIconSize = iArr;
            this.setOnLongClickListener = iArr2;
            this.setLayoutAnimation = iArr3;
        }
        float[] fArr9 = this.setCenterIfNoTextEnabled;
        this.setChipCornerRadius[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.setTextAlignment;
        this.ViewPager$SavedState$1[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.setIconSize;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.setZ.getLeft() + this.setUnboundedRipple ? 1 : 0;
        if (i4 < this.setZ.getTop() + this.setUnboundedRipple) {
            i5 |= 4;
        }
        if (i3 > this.setZ.getRight() - this.setUnboundedRipple) {
            i5 |= 2;
        }
        if (i4 > this.setZ.getBottom() - this.setUnboundedRipple) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.setOnNavigationItemSelectedListener |= 1 << i;
    }
}