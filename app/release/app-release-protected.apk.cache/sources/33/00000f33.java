package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.setEnsureMinTouchTargetSize;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class setScrollCaptureCallback {
    private static final PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda1 = PorterDuff.Mode.SRC_IN;
    private static final setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new setStepSize<Integer, PorterDuffColorFilter>() { // from class: o.setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda1
    };
    private static setScrollCaptureCallback setY;
    setLayoutAnimation MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean setLayoutAnimation;
    private setDividerHeight<String, setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0> setNavigationOnClickListener;
    private WeakHashMap<Context, onAppEnteredBackground<ColorStateList>> setOnLongClickListener;
    private onAppEnteredBackground<String> setUiOptions;
    private TypedValue setUnboundedRipple;
    final WeakHashMap<Context, setPrefixTextAppearance<WeakReference<Drawable.ConstantState>>> setX = new WeakHashMap<>(0);

    /* loaded from: classes.dex */
    public interface setLayoutAnimation {
        boolean MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i, Drawable drawable);

        PorterDuff.Mode setIconTintList(int i);

        Drawable setIconTintList(setScrollCaptureCallback setscrollcapturecallback, Context context, int i);

        ColorStateList setX(Context context, int i);

        boolean setY(Context context, int i, Drawable drawable);
    }

    public static setScrollCaptureCallback setX() {
        setScrollCaptureCallback setscrollcapturecallback;
        synchronized (setScrollCaptureCallback.class) {
            if (setY == null) {
                setScrollCaptureCallback setscrollcapturecallback2 = new setScrollCaptureCallback();
                setY = setscrollcapturecallback2;
                if (Build.VERSION.SDK_INT < 24) {
                    setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
                    if (setscrollcapturecallback2.setNavigationOnClickListener == null) {
                        setscrollcapturecallback2.setNavigationOnClickListener = new setDividerHeight<>();
                    }
                    setscrollcapturecallback2.setNavigationOnClickListener.put("vector", setonlongclicklistener);
                    setIconTintList seticontintlist = new setIconTintList();
                    if (setscrollcapturecallback2.setNavigationOnClickListener == null) {
                        setscrollcapturecallback2.setNavigationOnClickListener = new setDividerHeight<>();
                    }
                    setscrollcapturecallback2.setNavigationOnClickListener.put("animated-vector", seticontintlist);
                    setX setx = new setX();
                    if (setscrollcapturecallback2.setNavigationOnClickListener == null) {
                        setscrollcapturecallback2.setNavigationOnClickListener = new setDividerHeight<>();
                    }
                    setscrollcapturecallback2.setNavigationOnClickListener.put("animated-selector", setx);
                    setY sety = new setY();
                    if (setscrollcapturecallback2.setNavigationOnClickListener == null) {
                        setscrollcapturecallback2.setNavigationOnClickListener = new setDividerHeight<>();
                    }
                    setscrollcapturecallback2.setNavigationOnClickListener.put("drawable", sety);
                }
            }
            setscrollcapturecallback = setY;
        }
        return setscrollcapturecallback;
    }

    public final Drawable MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i) {
        Drawable iconTintList;
        synchronized (this) {
            iconTintList = setIconTintList(context, i, false);
        }
        return iconTintList;
    }

    private Drawable MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        int next;
        setDividerHeight<String, setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0> setdividerheight = this.setNavigationOnClickListener;
        if (setdividerheight == null || setdividerheight.isEmpty()) {
            return null;
        }
        onAppEnteredBackground<String> onappenteredbackground = this.setUiOptions;
        if (onappenteredbackground != null) {
            String x = onappenteredbackground.setX(i);
            if ("appcompat_skip_skip".equals(x) || (x != null && this.setNavigationOnClickListener.get(x) == null)) {
                return null;
            }
        } else {
            this.setUiOptions = new onAppEnteredBackground<>();
        }
        if (this.setUnboundedRipple == null) {
            this.setUnboundedRipple = new TypedValue();
        }
        TypedValue typedValue = this.setUnboundedRipple;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(context, j);
        if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda12;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
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
                String name = xml.getName();
                this.setUiOptions.setX(i, name);
                setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0 setscrollcapturecallback_menuhosthelper__externalsyntheticlambda0 = this.setNavigationOnClickListener.get(name);
                if (setscrollcapturecallback_menuhosthelper__externalsyntheticlambda0 != null) {
                    MenuHostHelper$$ExternalSyntheticLambda12 = setscrollcapturecallback_menuhosthelper__externalsyntheticlambda0.setX(context, xml, asAttributeSet, context.getTheme());
                }
                if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                    MenuHostHelper$$ExternalSyntheticLambda12.setChangingConfigurations(typedValue.changingConfigurations);
                    MenuHostHelper$$ExternalSyntheticLambda1(context, j, MenuHostHelper$$ExternalSyntheticLambda12);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda12 == null) {
            this.setUiOptions.setX(i, "appcompat_skip_skip");
        }
        return MenuHostHelper$$ExternalSyntheticLambda12;
    }

    private Drawable MenuHostHelper$$ExternalSyntheticLambda1(Context context, long j) {
        synchronized (this) {
            setPrefixTextAppearance<WeakReference<Drawable.ConstantState>> setprefixtextappearance = this.setX.get(context);
            if (setprefixtextappearance == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> MenuHostHelper$$ExternalSyntheticLambda0 = setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0(j, null);
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                Drawable.ConstantState constantState = MenuHostHelper$$ExternalSyntheticLambda0.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                int y = setStatusBarBackground.setY(setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0, setprefixtextappearance.setX, j);
                if (y >= 0) {
                    Object[] objArr = setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda1;
                    Object obj = objArr[y];
                    Object obj2 = setPrefixTextAppearance.setY;
                    if (obj != obj2) {
                        objArr[y] = obj2;
                        setprefixtextappearance.setIconTintList = true;
                    }
                }
            }
            return null;
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(Context context, long j, Drawable drawable) {
        synchronized (this) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                setPrefixTextAppearance<WeakReference<Drawable.ConstantState>> setprefixtextappearance = this.setX.get(context);
                if (setprefixtextappearance == null) {
                    setprefixtextappearance = new setPrefixTextAppearance<>();
                    this.setX.put(context, setprefixtextappearance);
                }
                setprefixtextappearance.setX(j, new WeakReference<>(constantState));
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(Drawable drawable, setStripEnabled setstripenabled, int[] iArr) {
        int[] state = drawable.getState();
        setCheckMarkDrawable.setY();
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        if (setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 || setstripenabled.setY) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 ? setstripenabled.setIconTintList : null;
            PorterDuff.Mode mode = setstripenabled.setY ? setstripenabled.setX : MenuHostHelper$$ExternalSyntheticLambda1;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = setX(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public static PorterDuffColorFilter setX(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter y;
        synchronized (setScrollCaptureCallback.class) {
            setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda1 setscrollcapturecallback_menuhosthelper__externalsyntheticlambda1 = setIconTintList;
            int i2 = (i + 31) * 31;
            y = setscrollcapturecallback_menuhosthelper__externalsyntheticlambda1.setY(Integer.valueOf(mode.hashCode() + i2));
            if (y == null) {
                y = new PorterDuffColorFilter(i, mode);
                setscrollcapturecallback_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1(Integer.valueOf(i2 + mode.hashCode()), y);
            }
        }
        return y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setOnLongClickListener implements setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0 {
        setOnLongClickListener() {
        }

        @Override // o.setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0
        public final Drawable setX(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return setAccessibilityLiveRegion.MenuHostHelper$$ExternalSyntheticLambda0(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList implements setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0 {
        setIconTintList() {
        }

        @Override // o.setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0
        public final Drawable setX(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return CoordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX implements setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0 {
        setX() {
        }

        @Override // o.setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0
        public final Drawable setX(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return setViewTranslationCallback.setIconTintList(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY implements setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0 {
        setY() {
        }

        @Override // o.setScrollCaptureCallback$MenuHostHelper$$ExternalSyntheticLambda0
        public final Drawable setX(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) setY.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    RecyclerView$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final Drawable setIconTintList(Context context, int i, boolean z) {
        Drawable MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            boolean z2 = false;
            if (!this.setLayoutAnimation) {
                this.setLayoutAnimation = true;
                Drawable MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(context, R.drawable.res_0x7f080070);
                if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                    if ((MenuHostHelper$$ExternalSyntheticLambda12 instanceof setAccessibilityLiveRegion) || "android.graphics.drawable.VectorDrawable".equals(MenuHostHelper$$ExternalSyntheticLambda12.getClass().getName())) {
                    }
                }
                this.setLayoutAnimation = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(context, i);
            PorterDuff.Mode mode = 0;
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                if (this.setUnboundedRipple == null) {
                    this.setUnboundedRipple = new TypedValue();
                }
                TypedValue typedValue = this.setUnboundedRipple;
                context.getResources().getValue(i, typedValue, true);
                long j = (typedValue.assetCookie << 32) | typedValue.data;
                Drawable MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1(context, j);
                if (MenuHostHelper$$ExternalSyntheticLambda13 == null) {
                    setLayoutAnimation setlayoutanimation = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    MenuHostHelper$$ExternalSyntheticLambda13 = setlayoutanimation == null ? null : setlayoutanimation.setIconTintList(this, context, i);
                    if (MenuHostHelper$$ExternalSyntheticLambda13 != null) {
                        MenuHostHelper$$ExternalSyntheticLambda13.setChangingConfigurations(typedValue.changingConfigurations);
                        MenuHostHelper$$ExternalSyntheticLambda1(context, j, MenuHostHelper$$ExternalSyntheticLambda13);
                    }
                }
                MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda13;
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = context.getDrawable(i);
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                ColorStateList y = setY(context, i);
                if (y != null) {
                    setCheckMarkDrawable.setY();
                    Drawable navigationOnClickListener = setEnsureMinTouchTargetSize.setNavigationOnClickListener(MenuHostHelper$$ExternalSyntheticLambda0.mutate());
                    setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(navigationOnClickListener, y);
                    setLayoutAnimation setlayoutanimation2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (setlayoutanimation2 != null) {
                        mode = setlayoutanimation2.setIconTintList(i);
                    }
                    if (mode != null) {
                        setEnsureMinTouchTargetSize.setX(navigationOnClickListener, mode);
                    }
                    mode = navigationOnClickListener;
                } else {
                    setLayoutAnimation setlayoutanimation3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (setlayoutanimation3 == null || !setlayoutanimation3.setY(context, i, MenuHostHelper$$ExternalSyntheticLambda0)) {
                        setLayoutAnimation setlayoutanimation4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (setlayoutanimation4 != null && setlayoutanimation4.MenuHostHelper$$ExternalSyntheticLambda1(context, i, MenuHostHelper$$ExternalSyntheticLambda0)) {
                            z2 = true;
                        }
                        if (!z2 && z) {
                        }
                    }
                    mode = MenuHostHelper$$ExternalSyntheticLambda0;
                }
                MenuHostHelper$$ExternalSyntheticLambda0 = mode;
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                setCheckMarkDrawable.setX(MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ColorStateList setY(Context context, int i) {
        ColorStateList x;
        onAppEnteredBackground<ColorStateList> onappenteredbackground;
        synchronized (this) {
            WeakHashMap<Context, onAppEnteredBackground<ColorStateList>> weakHashMap = this.setOnLongClickListener;
            ColorStateList colorStateList = null;
            x = (weakHashMap == null || (onappenteredbackground = weakHashMap.get(context)) == null) ? null : onappenteredbackground.setX(i);
            if (x == null) {
                setLayoutAnimation setlayoutanimation = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (setlayoutanimation != null) {
                    colorStateList = setlayoutanimation.setX(context, i);
                }
                if (colorStateList != null) {
                    if (this.setOnLongClickListener == null) {
                        this.setOnLongClickListener = new WeakHashMap<>();
                    }
                    onAppEnteredBackground<ColorStateList> onappenteredbackground2 = this.setOnLongClickListener.get(context);
                    if (onappenteredbackground2 == null) {
                        onappenteredbackground2 = new onAppEnteredBackground<>();
                        this.setOnLongClickListener.put(context, onappenteredbackground2);
                    }
                    onappenteredbackground2.setX(i, colorStateList);
                }
                x = colorStateList;
            }
        }
        return x;
    }
}