package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import o.getTrimPathOffset;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class CoordinatorLayout extends setPaintFlags implements getTrimPathOffset {
    private setX MenuHostHelper$$ExternalSyntheticLambda0;
    final Drawable.Callback MenuHostHelper$$ExternalSyntheticLambda1;
    ArrayList<getTrimPathOffset.setIconTintList> setIconTintList;
    private ArgbEvaluator setLayoutAnimation;
    private Context setNavigationOnClickListener;
    private Animator.AnimatorListener setUiOptions;
    setIconTintList setY;

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    CoordinatorLayout() {
        this(null, null, null);
    }

    private CoordinatorLayout(Context context) {
        this(context, null, null);
    }

    private CoordinatorLayout(Context context, setX setx, Resources resources) {
        this.setLayoutAnimation = null;
        this.setUiOptions = null;
        this.setIconTintList = null;
        Drawable.Callback callback = new Drawable.Callback() { // from class: o.CoordinatorLayout.4
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                CoordinatorLayout.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                CoordinatorLayout.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                CoordinatorLayout.this.unscheduleSelf(runnable);
            }
        };
        this.MenuHostHelper$$ExternalSyntheticLambda1 = callback;
        this.setNavigationOnClickListener = context;
        if (setx != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setx;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setX(context, setx, callback, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.setX != null) {
            this.setX.mutate();
        }
        return this;
    }

    public static CoordinatorLayout setX(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
            coordinatorLayout.setX = setTextStartPaddingResource.setY(context.getResources(), i, context.getTheme());
            coordinatorLayout.setX.setCallback(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1);
            coordinatorLayout.setY = new setIconTintList(coordinatorLayout.setX.getConstantState());
            return coordinatorLayout;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return MenuHostHelper$$ExternalSyntheticLambda0(context, context.getResources(), xml, asAttributeSet, context.getTheme());
        } catch (IOException e) {
            Log.e("AnimatedVDCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        }
    }

    public static CoordinatorLayout MenuHostHelper$$ExternalSyntheticLambda0(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
        coordinatorLayout.inflate(resources, xmlPullParser, attributeSet, theme);
        return coordinatorLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.setX == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new setIconTintList(this.setX.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.setX != null) {
            return this.setX.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.MenuHostHelper$$ExternalSyntheticLambda0.setX;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.setX != null) {
            this.setX.draw(canvas);
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.draw(canvas);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setY.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.setX != null) {
            this.setX.setBounds(rect);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.setX != null) {
            return this.setX.setState(iArr);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setState(iArr);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.setX != null) {
            return this.setX.setLevel(i);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.setX != null) {
            return setEnsureMinTouchTargetSize.setX(this.setX);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.setX != null) {
            this.setX.setAlpha(i);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.setX != null) {
            this.setX.setColorFilter(colorFilter);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        if (this.setX != null) {
            return setEnsureMinTouchTargetSize.setY(this.setX);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(this.setX, i);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(this.setX, colorStateList);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.setX(this.setX, mode);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.setX != null) {
            return this.setX.setVisible(z, z2);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.setX != null) {
            return this.setX.isStateful();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.setX != null) {
            return this.setX.getOpacity();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.setX != null) {
            return this.setX.getIntrinsicWidth();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.setX != null) {
            return this.setX.getIntrinsicHeight();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.setX != null) {
            return setEnsureMinTouchTargetSize.setUnboundedRipple(this.setX);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, z);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    int[] iArr = setClipToPadding.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (theme == null) {
                        obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setAccessibilityLiveRegion x = setAccessibilityLiveRegion.setX(resources, resourceId, theme);
                        x.setX(false);
                        x.setCallback(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setCallback(null);
                        }
                        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = x;
                    }
                    obtainStyledAttributes.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, setClipToPadding.setX);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.setNavigationOnClickListener;
                        if (context != null) {
                            setX(string, setNextClusterForwardId.MenuHostHelper$$ExternalSyntheticLambda1(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setY();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.setY(this.setX, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.setX != null) {
            return setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
        }
        return false;
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends Drawable.ConstantState {
        private final Drawable.ConstantState setY;

        public setIconTintList(Drawable.ConstantState constantState) {
            this.setY = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            CoordinatorLayout coordinatorLayout = new CoordinatorLayout();
            coordinatorLayout.setX = this.setY.newDrawable();
            coordinatorLayout.setX.setCallback(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1);
            return coordinatorLayout;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            CoordinatorLayout coordinatorLayout = new CoordinatorLayout();
            coordinatorLayout.setX = this.setY.newDrawable(resources);
            coordinatorLayout.setX.setCallback(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1);
            return coordinatorLayout;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            CoordinatorLayout coordinatorLayout = new CoordinatorLayout();
            coordinatorLayout.setX = this.setY.newDrawable(resources, theme);
            coordinatorLayout.setX.setCallback(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1);
            return coordinatorLayout;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.setY.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.setY.getChangingConfigurations();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX extends Drawable.ConstantState {
        setFabAnchorMode<Animator, String> MenuHostHelper$$ExternalSyntheticLambda0;
        setAccessibilityLiveRegion MenuHostHelper$$ExternalSyntheticLambda1;
        ArrayList<Animator> setIconTintList;
        int setX;
        AnimatorSet setY;

        public setX(Context context, setX setx, Drawable.Callback callback, Resources resources) {
            if (setx != null) {
                this.setX = setx.setX;
                setAccessibilityLiveRegion setaccessibilityliveregion = setx.MenuHostHelper$$ExternalSyntheticLambda1;
                if (setaccessibilityliveregion != null) {
                    Drawable.ConstantState constantState = setaccessibilityliveregion.getConstantState();
                    if (resources != null) {
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = (setAccessibilityLiveRegion) constantState.newDrawable(resources);
                    } else {
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = (setAccessibilityLiveRegion) constantState.newDrawable();
                    }
                    setAccessibilityLiveRegion setaccessibilityliveregion2 = (setAccessibilityLiveRegion) this.MenuHostHelper$$ExternalSyntheticLambda1.mutate();
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = setaccessibilityliveregion2;
                    setaccessibilityliveregion2.setCallback(callback);
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(setx.MenuHostHelper$$ExternalSyntheticLambda1.getBounds());
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setX(false);
                }
                ArrayList<Animator> arrayList = setx.setIconTintList;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.setIconTintList = new ArrayList<>(size);
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = new setFabAnchorMode<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = setx.setIconTintList.get(i);
                        Animator clone = animator.clone();
                        String str = setx.MenuHostHelper$$ExternalSyntheticLambda0.get(animator);
                        clone.setTarget(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(str));
                        this.setIconTintList.add(clone);
                        this.MenuHostHelper$$ExternalSyntheticLambda0.put(clone, str);
                    }
                    setY();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.setX;
        }

        public void setY() {
            if (this.setY == null) {
                this.setY = new AnimatorSet();
            }
            this.setY.playTogether(this.setIconTintList);
        }
    }

    private void setX(String str, Animator animator) {
        animator.setTarget(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(str));
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList = new ArrayList<>();
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = new setFabAnchorMode<>();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.add(animator);
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.setX != null) {
            return ((AnimatedVectorDrawable) this.setX).isRunning();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.setY.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.setX != null) {
            ((AnimatedVectorDrawable) this.setX).start();
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda0.setY.isStarted()) {
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.setX != null) {
            ((AnimatedVectorDrawable) this.setX).stop();
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY.end();
        }
    }

    private static boolean setIconTintList(AnimatedVectorDrawable animatedVectorDrawable, getTrimPathOffset.setIconTintList seticontintlist) {
        boolean unregisterAnimationCallback;
        unregisterAnimationCallback = animatedVectorDrawable.unregisterAnimationCallback(seticontintlist.setX());
        return unregisterAnimationCallback;
    }

    public void setY(getTrimPathOffset.setIconTintList seticontintlist) {
        if (this.setX != null) {
            setX((AnimatedVectorDrawable) this.setX, seticontintlist);
        } else if (seticontintlist == null) {
        } else {
            if (this.setIconTintList == null) {
                this.setIconTintList = new ArrayList<>();
            }
            if (this.setIconTintList.contains(seticontintlist)) {
                return;
            }
            this.setIconTintList.add(seticontintlist);
            if (this.setUiOptions == null) {
                this.setUiOptions = new AnimatorListenerAdapter() { // from class: o.CoordinatorLayout.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ArrayList arrayList = new ArrayList(CoordinatorLayout.this.setIconTintList);
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((getTrimPathOffset.setIconTintList) arrayList.get(i)).MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout.this);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ArrayList arrayList = new ArrayList(CoordinatorLayout.this.setIconTintList);
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((getTrimPathOffset.setIconTintList) arrayList.get(i)).MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout.this);
                        }
                    }
                };
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY.addListener(this.setUiOptions);
        }
    }

    private static void setX(AnimatedVectorDrawable animatedVectorDrawable, getTrimPathOffset.setIconTintList seticontintlist) {
        animatedVectorDrawable.registerAnimationCallback(seticontintlist.setX());
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setUiOptions != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY.removeListener(this.setUiOptions);
            this.setUiOptions = null;
        }
    }

    public boolean setX(getTrimPathOffset.setIconTintList seticontintlist) {
        if (this.setX != null) {
            setIconTintList((AnimatedVectorDrawable) this.setX, seticontintlist);
        }
        ArrayList<getTrimPathOffset.setIconTintList> arrayList = this.setIconTintList;
        if (arrayList == null || seticontintlist == null) {
            return false;
        }
        boolean remove = arrayList.remove(seticontintlist);
        if (this.setIconTintList.size() == 0) {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return remove;
    }
}