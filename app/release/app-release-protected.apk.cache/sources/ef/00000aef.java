package o;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.setShowDividers;

/* loaded from: classes.dex */
public class setDecorPadding {
    private static int setIconTintList;
    private final AccessibilityNodeInfo setX;
    public int setY = -1;
    private int MenuHostHelper$$ExternalSyntheticLambda0 = -1;

    private static String setY(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public static final setIconTintList ExtendableSavedState$1;
        public static final setIconTintList FloatingActionButton$BaseBehavior;
        public static final setIconTintList FragmentStateAdapter$5;
        public static final setIconTintList ViewPager$SavedState$1;
        public static final setIconTintList setAnimationFromJson;
        public static final setIconTintList setCheckedIconEnabled;
        public static final setIconTintList setChipCornerRadius;
        public static final setIconTintList setConstraintSet;
        public static final setIconTintList setContentScrimResource;
        public static final setIconTintList setIconified;
        public static final setIconTintList setMaxEms;
        public static final setIconTintList setMinAndMaxProgress;
        public static final setIconTintList setOnLongClickListener;
        public static final setIconTintList setSuffixText;
        public static final setIconTintList setTextAppearanceResource;
        public static final setIconTintList setViewTranslationCallback;
        public static final setIconTintList setZ;
        protected final setShowDividers setFloatValues;
        private final int setImageTintMode;
        final Object setObjectValues;
        private final Class<? extends setShowDividers.setIconTintList> setSelectedChildViewEnabled;
        public static final setIconTintList setCenterIfNoTextEnabled = new setIconTintList(1, null);
        public static final setIconTintList setY = new setIconTintList(2, null);
        public static final setIconTintList FragmentStateAdapter$2 = new setIconTintList(4, null);
        public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList(8, null);
        public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1 = new setIconTintList(16, null);
        public static final setIconTintList setIconSize = new setIconTintList(32, null);
        public static final setIconTintList setIconTintList = new setIconTintList(64, null);
        public static final setIconTintList setX = new setIconTintList(128, null);
        public static final setIconTintList setOnNavigationItemSelectedListener = new setIconTintList(256, (CharSequence) null, setShowDividers.setX.class);
        public static final setIconTintList setLayoutDirection = new setIconTintList(512, (CharSequence) null, setShowDividers.setX.class);
        public static final setIconTintList setTextScaleX = new setIconTintList(1024, (CharSequence) null, setShowDividers$MenuHostHelper$$ExternalSyntheticLambda0.class);
        public static final setIconTintList setChipIconTintResource = new setIconTintList(2048, (CharSequence) null, setShowDividers$MenuHostHelper$$ExternalSyntheticLambda0.class);
        public static final setIconTintList SearchView$SavedState$1 = new setIconTintList(4096, null);
        public static final setIconTintList setHasDecor = new setIconTintList(8192, null);
        public static final setIconTintList setNavigationOnClickListener = new setIconTintList(16384, null);
        public static final setIconTintList setGuidelinePercent = new setIconTintList(32768, null);
        public static final setIconTintList setLayoutAnimation = new setIconTintList(65536, null);
        public static final setIconTintList setFilterTouchesWhenObscured = new setIconTintList(131072, (CharSequence) null, setShowDividers.setOnLongClickListener.class);
        public static final setIconTintList setTextAlignment = new setIconTintList(262144, null);
        public static final setIconTintList setUnboundedRipple = new setIconTintList(524288, null);
        public static final setIconTintList setUiOptions = new setIconTintList(1048576, null);
        public static final setIconTintList setAdapter = new setIconTintList(2097152, (CharSequence) null, setShowDividers.setNavigationOnClickListener.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction32;
            } else {
                accessibilityAction = null;
            }
            setViewTranslationCallback = new setIconTintList(accessibilityAction, 16908342, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction31;
            } else {
                accessibilityAction2 = null;
            }
            FloatingActionButton$BaseBehavior = new setIconTintList(accessibilityAction2, 16908343, null, null, setShowDividers$MenuHostHelper$$ExternalSyntheticLambda1.class);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction30;
            } else {
                accessibilityAction3 = null;
            }
            FragmentStateAdapter$5 = new setIconTintList(accessibilityAction3, 16908344, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction29;
            } else {
                accessibilityAction4 = null;
            }
            setIconified = new setIconTintList(accessibilityAction4, 16908345, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction28;
            } else {
                accessibilityAction5 = null;
            }
            ExtendableSavedState$1 = new setIconTintList(accessibilityAction5, 16908346, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction27;
            } else {
                accessibilityAction6 = null;
            }
            setConstraintSet = new setIconTintList(accessibilityAction6, 16908347, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction7 = accessibilityAction26;
            } else {
                accessibilityAction7 = null;
            }
            setCheckedIconEnabled = new setIconTintList(accessibilityAction7, 16908358, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction25;
            } else {
                accessibilityAction8 = null;
            }
            setMaxEms = new setIconTintList(accessibilityAction8, 16908359, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction9 = accessibilityAction24;
            } else {
                accessibilityAction9 = null;
            }
            setAnimationFromJson = new setIconTintList(accessibilityAction9, 16908360, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction23;
            } else {
                accessibilityAction10 = null;
            }
            setTextAppearanceResource = new setIconTintList(accessibilityAction10, 16908361, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction22;
            } else {
                accessibilityAction11 = null;
            }
            setOnLongClickListener = new setIconTintList(accessibilityAction11, 16908348, null, null, null);
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction21;
            } else {
                accessibilityAction12 = null;
            }
            setContentScrimResource = new setIconTintList(accessibilityAction12, 16908349, null, null, setShowDividers.setUiOptions.class);
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction13 = accessibilityAction20;
            } else {
                accessibilityAction13 = null;
            }
            setZ = new setIconTintList(accessibilityAction13, 16908354, null, null, setShowDividers.setY.class);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction19;
            } else {
                accessibilityAction14 = null;
            }
            setSuffixText = new setIconTintList(accessibilityAction14, 16908356, null, null, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction18;
            } else {
                accessibilityAction15 = null;
            }
            setChipCornerRadius = new setIconTintList(accessibilityAction15, 16908357, null, null, null);
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction16 = accessibilityAction17;
            } else {
                accessibilityAction16 = null;
            }
            setMinAndMaxProgress = new setIconTintList(accessibilityAction16, 16908362, null, null, null);
            ViewPager$SavedState$1 = new setIconTintList(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public setIconTintList(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public setIconTintList(int i, CharSequence charSequence, setShowDividers setshowdividers) {
            this(null, i, charSequence, setshowdividers, null);
        }

        setIconTintList(Object obj) {
            this(obj, 0, null, null, null);
        }

        private setIconTintList(int i, CharSequence charSequence, Class<? extends setShowDividers.setIconTintList> cls) {
            this(null, i, charSequence, null, cls);
        }

        setIconTintList(Object obj, int i, CharSequence charSequence, setShowDividers setshowdividers, Class<? extends setShowDividers.setIconTintList> cls) {
            this.setImageTintMode = i;
            this.setFloatValues = setshowdividers;
            if (obj == null) {
                this.setObjectValues = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.setObjectValues = obj;
            }
            this.setSelectedChildViewEnabled = cls;
        }

        public int MenuHostHelper$$ExternalSyntheticLambda0() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.setObjectValues).getId();
        }

        public CharSequence setIconTintList() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.setObjectValues).getLabel();
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0(View view, Bundle bundle) {
            if (this.setFloatValues != null) {
                Class<? extends setShowDividers.setIconTintList> cls = this.setSelectedChildViewEnabled;
                if (cls != null) {
                    try {
                        cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        Class<? extends setShowDividers.setIconTintList> cls2 = this.setSelectedChildViewEnabled;
                        String name = cls2 == null ? "null" : cls2.getName();
                        StringBuilder sb = new StringBuilder("Failed to execute command with argument class ViewCommandArgument: ");
                        sb.append(name);
                        Log.e("A11yActionCompat", sb.toString(), e);
                    }
                }
                return this.setFloatValues.MenuHostHelper$$ExternalSyntheticLambda0(view);
            }
            return false;
        }

        public setIconTintList setIconTintList(CharSequence charSequence, setShowDividers setshowdividers) {
            return new setIconTintList(null, this.setImageTintMode, charSequence, setshowdividers, this.setSelectedChildViewEnabled);
        }

        public int hashCode() {
            Object obj = this.setObjectValues;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof setIconTintList)) {
                setIconTintList seticontintlist = (setIconTintList) obj;
                Object obj2 = this.setObjectValues;
                return obj2 == null ? seticontintlist.setObjectValues == null : obj2.equals(seticontintlist.setObjectValues);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class setX {
        final Object MenuHostHelper$$ExternalSyntheticLambda1;

        public static setX setIconTintList(int i, int i2, boolean z, int i3) {
            return new setX(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        setX(Object obj) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class setY {
        final Object setX;

        public static setY MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new setY(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        setY(Object obj) {
            this.setX = obj;
        }
    }

    private setDecorPadding(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.setX = accessibilityNodeInfo;
    }

    public static setDecorPadding setY(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new setDecorPadding(accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo setGuidelinePercent() {
        return this.setX;
    }

    public static setDecorPadding setY(View view) {
        return setY(AccessibilityNodeInfo.obtain(view));
    }

    public static setDecorPadding setY(setDecorPadding setdecorpadding) {
        return setY(AccessibilityNodeInfo.obtain(setdecorpadding.setX));
    }

    public void setY(View view, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setX.setSource(view, i);
    }

    public int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX.getChildCount();
    }

    public void setX(View view, int i) {
        this.setX.addChild(view, i);
    }

    public int setY() {
        return this.setX.getActions();
    }

    public void setIconTintList(int i) {
        this.setX.addAction(i);
    }

    private List<Integer> setY(String str) {
        ArrayList<Integer> integerArrayList = this.setX.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.setX.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public void setIconTintList(setIconTintList seticontintlist) {
        this.setX.addAction((AccessibilityNodeInfo.AccessibilityAction) seticontintlist.setObjectValues);
    }

    public boolean setX(setIconTintList seticontintlist) {
        return this.setX.removeAction((AccessibilityNodeInfo.AccessibilityAction) seticontintlist.setObjectValues);
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, Bundle bundle) {
        return this.setX.performAction(i, bundle);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        this.setY = -1;
        this.setX.setParent(view);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        this.setY = i;
        this.setX.setParent(view, i);
    }

    @Deprecated
    public void MenuHostHelper$$ExternalSyntheticLambda0(Rect rect) {
        this.setX.getBoundsInParent(rect);
    }

    @Deprecated
    public void setY(Rect rect) {
        this.setX.setBoundsInParent(rect);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect) {
        this.setX.getBoundsInScreen(rect);
    }

    public void setIconTintList(Rect rect) {
        this.setX.setBoundsInScreen(rect);
    }

    public boolean setTextAlignment() {
        return this.setX.isCheckable();
    }

    public void setX(boolean z) {
        this.setX.setCheckable(z);
    }

    public boolean setIconSize() {
        return this.setX.isChecked();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        this.setX.setChecked(z);
    }

    public boolean setChipCornerRadius() {
        return this.setX.isFocusable();
    }

    public void setUnboundedRipple(boolean z) {
        this.setX.setFocusable(z);
    }

    public boolean setAnimationFromJson() {
        return this.setX.isFocused();
    }

    public void setOnLongClickListener(boolean z) {
        this.setX.setFocused(z);
    }

    public void ViewPager$SavedState$1(boolean z) {
        this.setX.setVisibleToUser(z);
    }

    public void setY(boolean z) {
        this.setX.setAccessibilityFocused(z);
    }

    public boolean setOnNavigationItemSelectedListener() {
        return this.setX.isSelected();
    }

    public boolean setCenterIfNoTextEnabled() {
        return this.setX.isClickable();
    }

    public void setIconTintList(boolean z) {
        this.setX.setClickable(z);
    }

    public boolean setTextScaleX() {
        return this.setX.isLongClickable();
    }

    public boolean ViewPager$SavedState$1() {
        return this.setX.isEnabled();
    }

    public void setUiOptions(boolean z) {
        this.setX.setEnabled(z);
    }

    public boolean setZ() {
        return this.setX.isPassword();
    }

    public boolean setMaxEms() {
        return this.setX.isScrollable();
    }

    public void setIconSize(boolean z) {
        this.setX.setScrollable(z);
    }

    public CharSequence setUiOptions() {
        return this.setX.getPackageName();
    }

    public void setUnboundedRipple(CharSequence charSequence) {
        this.setX.setPackageName(charSequence);
    }

    public CharSequence setX() {
        return this.setX.getClassName();
    }

    public void setIconTintList(CharSequence charSequence) {
        this.setX.setClassName(charSequence);
    }

    public CharSequence setLayoutAnimation() {
        if (setMinAndMaxProgress()) {
            List<Integer> y = setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> y2 = setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> y3 = setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> y4 = setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.setX.getText(), 0, this.setX.getText().length()));
            for (int i = 0; i < y.size(); i++) {
                spannableString.setSpan(new setRotation(y4.get(i).intValue(), this, setOnLongClickListener().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), y.get(i).intValue(), y2.get(i).intValue(), y3.get(i).intValue());
            }
            return spannableString;
        }
        return this.setX.getText();
    }

    public void setNavigationOnClickListener(CharSequence charSequence) {
        this.setX.setText(charSequence);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            setCheckedIconEnabled();
            setOnLongClickListener(view);
            ClickableSpan[] x = setX(charSequence);
            if (x == null || x.length <= 0) {
                return;
            }
            setOnLongClickListener().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.res_0x7f0a000f);
            SparseArray<WeakReference<ClickableSpan>> x2 = setX(view);
            for (int i = 0; x != null && i < x.length; i++) {
                int y = setY(x[i], x2);
                x2.put(y, new WeakReference<>(x[i]));
                setX(x[i], (Spanned) charSequence, y);
            }
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> setX(View view) {
        SparseArray<WeakReference<ClickableSpan>> unboundedRipple = setUnboundedRipple(view);
        if (unboundedRipple == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(R.id.res_0x7f0a01dc, sparseArray);
            return sparseArray;
        }
        return unboundedRipple;
    }

    private SparseArray<WeakReference<ClickableSpan>> setUnboundedRipple(View view) {
        return (SparseArray) view.getTag(R.id.res_0x7f0a01dc);
    }

    public static ClickableSpan[] setX(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private int setY(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = setIconTintList;
        setIconTintList = i2 + 1;
        return i2;
    }

    private boolean setMinAndMaxProgress() {
        return !setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private void setCheckedIconEnabled() {
        this.setX.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.setX.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.setX.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.setX.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private void setX(ClickableSpan clickableSpan, Spanned spanned, int i) {
        setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        setY("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void setOnLongClickListener(View view) {
        SparseArray<WeakReference<ClickableSpan>> unboundedRipple = setUnboundedRipple(view);
        if (unboundedRipple != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < unboundedRipple.size(); i++) {
                if (unboundedRipple.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                unboundedRipple.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public CharSequence setNavigationOnClickListener() {
        return this.setX.getContentDescription();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence) {
        this.setX.setContentDescription(charSequence);
    }

    public void setUiOptions(CharSequence charSequence) {
        if (setAllowCollapse.setX()) {
            this.setX.setStateDescription(charSequence);
        } else {
            this.setX.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void setLayoutDirection() {
        this.setX.recycle();
    }

    public String setUnboundedRipple() {
        return this.setX.getViewIdResourceName();
    }

    public void setX(Object obj) {
        this.setX.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((setX) obj).MenuHostHelper$$ExternalSyntheticLambda1);
    }

    public void setY(Object obj) {
        this.setX.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((setY) obj).setX);
    }

    public List<setIconTintList> setIconTintList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.setX.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new setIconTintList(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void setY(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.setX.setHintText(charSequence);
        } else {
            this.setX.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        this.setX.setError(charSequence);
    }

    public void setIconTintList(View view) {
        this.setX.setLabelFor(view);
    }

    public Bundle setOnLongClickListener() {
        return this.setX.getExtras();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setX.setMaxTextLength(i);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.setX.setTraversalAfter(view);
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        this.setX.setDismissable(z);
    }

    public void setLayoutAnimation(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.setX.setPaneTitle(charSequence);
        } else {
            this.setX.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void setNavigationOnClickListener(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.setX.setScreenReaderFocusable(z);
        } else {
            setIconTintList(1, z);
        }
    }

    public boolean setTextAppearanceResource() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.setX.isShowingHintText();
            return isShowingHintText;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(4);
    }

    public void setTextAlignment(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.setX.setShowingHintText(z);
        } else {
            setIconTintList(4, z);
        }
    }

    public void setLayoutAnimation(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.setX.setHeading(z);
        } else {
            setIconTintList(2, z);
        }
    }

    public void setOnLongClickListener(CharSequence charSequence) {
        this.setX.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.setX;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof setDecorPadding)) {
            setDecorPadding setdecorpadding = (setDecorPadding) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.setX;
            if (accessibilityNodeInfo == null) {
                if (setdecorpadding.setX != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(setdecorpadding.setX)) {
                return false;
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda0 == setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0 && this.setY == setdecorpadding.setY;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        MenuHostHelper$$ExternalSyntheticLambda0(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        MenuHostHelper$$ExternalSyntheticLambda1(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(setUiOptions());
        sb.append("; className: ");
        sb.append(setX());
        sb.append("; text: ");
        sb.append(setLayoutAnimation());
        sb.append("; contentDescription: ");
        sb.append(setNavigationOnClickListener());
        sb.append("; viewId: ");
        sb.append(setUnboundedRipple());
        sb.append("; checkable: ");
        sb.append(setTextAlignment());
        sb.append("; checked: ");
        sb.append(setIconSize());
        sb.append("; focusable: ");
        sb.append(setChipCornerRadius());
        sb.append("; focused: ");
        sb.append(setAnimationFromJson());
        sb.append("; selected: ");
        sb.append(setOnNavigationItemSelectedListener());
        sb.append("; clickable: ");
        sb.append(setCenterIfNoTextEnabled());
        sb.append("; longClickable: ");
        sb.append(setTextScaleX());
        sb.append("; enabled: ");
        sb.append(ViewPager$SavedState$1());
        sb.append("; password: ");
        sb.append(setZ());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(setMaxEms());
        sb.append(sb4.toString());
        sb.append("; [");
        List<setIconTintList> iconTintList = setIconTintList();
        for (int i = 0; i < iconTintList.size(); i++) {
            setIconTintList seticontintlist = iconTintList.get(i);
            String y = setY(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0());
            if (y.equals("ACTION_UNKNOWN") && seticontintlist.setIconTintList() != null) {
                y = seticontintlist.setIconTintList().toString();
            }
            sb.append(y);
            if (i != iconTintList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void setIconTintList(int i, boolean z) {
        Bundle onLongClickListener = setOnLongClickListener();
        if (onLongClickListener != null) {
            onLongClickListener.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", ((~i) & onLongClickListener.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0)) | (z ? i : 0));
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        Bundle onLongClickListener = setOnLongClickListener();
        return onLongClickListener != null && (onLongClickListener.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }
}