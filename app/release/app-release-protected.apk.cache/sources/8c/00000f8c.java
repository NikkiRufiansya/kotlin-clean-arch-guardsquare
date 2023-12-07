package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.io.IOException;
import java.lang.reflect.Method;
import o.setAnimationFromJson;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class setShrinkMotionSpec extends MenuInflater {
    private static Class<?>[] setOnLongClickListener;
    private static byte[] setUiOptions;
    static final Class<?>[] setX;
    public static final int setY = 76;
    Context MenuHostHelper$$ExternalSyntheticLambda0;
    final Object[] MenuHostHelper$$ExternalSyntheticLambda1;
    final Object[] setIconTintList;
    private Object setNavigationOnClickListener;

    public setShrinkMotionSpec(Context context) {
        super(context);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
        Object[] objArr = {context};
        this.MenuHostHelper$$ExternalSyntheticLambda1 = objArr;
        this.setIconTintList = objArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof setVerticalFadingEdgeEnabled)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.MenuHostHelper$$ExternalSyntheticLambda0.getResources().getLayout(i);
                    MenuHostHelper$$ExternalSyntheticLambda1(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        setShrinkMotionSpec$MenuHostHelper$$ExternalSyntheticLambda0 setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0 = new setShrinkMotionSpec$MenuHostHelper$$ExternalSyntheticLambda0(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (!name2.equals("group")) {
                        if (!name2.equals("item")) {
                            if (name2.equals("menu")) {
                                z = true;
                            }
                        } else if (!setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setChipCornerRadius) {
                            if (setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation != null && setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation.setIconTintList()) {
                                setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setX();
                            } else {
                                setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setChipCornerRadius = true;
                                setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setY(setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setContentScrimResource.add(setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setX, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setLayoutDirection, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setTextAlignment, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setChipIconTintResource));
                            }
                        }
                    } else {
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setX = 0;
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setY = 0;
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setIconTintList = 0;
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple = true;
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (!name3.equals("group")) {
                    if (!name3.equals("item")) {
                        if (name3.equals("menu")) {
                            MenuHostHelper$$ExternalSyntheticLambda1(xmlPullParser, attributeSet, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setX());
                        } else {
                            str = name3;
                            z2 = true;
                        }
                    } else {
                        setExpandedHintEnabled x = setExpandedHintEnabled.setX(setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.FloatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda0, attributeSet, setAnimationFromJson.setY.setTextDirection);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setLayoutDirection = x.setNavigationOnClickListener(setAnimationFromJson.setY.setHelperTextEnabled, 0);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setTextAlignment = (x.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setExpandedHintEnabled, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setY) & (-65536)) | (x.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setCompatPressedTranslationZ, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setIconTintList) & 65535);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setChipIconTintResource = x.setUnboundedRipple(setAnimationFromJson.setY.transact);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setHasDecor = x.setUnboundedRipple(setAnimationFromJson.setY.setTranscriptMode);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setTextScaleX = x.setNavigationOnClickListener(setAnimationFromJson.setY.setPresenter, 0);
                        int i = setAnimationFromJson.setY.setScrollCaptureCallback;
                        String navigationOnClickListener = x.setNavigationOnClickListener(9);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setIconSize = navigationOnClickListener == null ? (char) 0 : navigationOnClickListener.charAt(0);
                        int i2 = setAnimationFromJson.setY.onActivityPreStopped;
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.ViewPager$SavedState$1 = x.MenuHostHelper$$ExternalSyntheticLambda0(16, 4096);
                        int i3 = setAnimationFromJson.setY.setStripEnabled;
                        String navigationOnClickListener2 = x.setNavigationOnClickListener(10);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setGuidelinePercent = navigationOnClickListener2 == null ? (char) 0 : navigationOnClickListener2.charAt(0);
                        int i4 = setAnimationFromJson.setY.setCheckedColor;
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setCheckedIconEnabled = x.MenuHostHelper$$ExternalSyntheticLambda0(20, 4096);
                        if (x.setLayoutAnimation(setAnimationFromJson.setY.getPathName)) {
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setCenterIfNoTextEnabled = x.setIconTintList(setAnimationFromJson.setY.getPathName, false) ? 1 : 0;
                        } else {
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setCenterIfNoTextEnabled = setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setMaxEms = x.setIconTintList(setAnimationFromJson.setY.setAlpha, false);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setIconified = x.setIconTintList(setAnimationFromJson.setY.setShadowPaddingEnabled, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setAnimationFromJson = x.setIconTintList(setAnimationFromJson.setY.setTitle, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.SearchView$SavedState$1 = x.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.NestedScrollView$SavedState$1, -1);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setMinAndMaxProgress = x.setNavigationOnClickListener(setAnimationFromJson.setY.setGuidelineBegin);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setNavigationOnClickListener = x.setNavigationOnClickListener(setAnimationFromJson.setY.setAccessibilityTraversalBefore, 0);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener = x.setNavigationOnClickListener(setAnimationFromJson.setY.setTabRippleColor);
                        String navigationOnClickListener3 = x.setNavigationOnClickListener(setAnimationFromJson.setY.onActivityPostResumed);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setUiOptions = navigationOnClickListener3;
                        boolean z3 = navigationOnClickListener3 != null;
                        if (z3 && setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setNavigationOnClickListener == 0 && setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener == null) {
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = (AppBarLayout$BaseBehavior) setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1(navigationOnClickListener3, setOnLongClickListener, setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.FloatingActionButton$BaseBehavior.setIconTintList);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = null;
                        }
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setOnNavigationItemSelectedListener = x.setUnboundedRipple(setAnimationFromJson.setY.setSelectedTabIndicatorGravity);
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.ExtendableSavedState$1 = x.setUnboundedRipple(setAnimationFromJson.setY.getSystemGestureInsets);
                        if (x.setLayoutAnimation(setAnimationFromJson.setY.setTabMode)) {
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setTextAppearanceResource = setCheckMarkDrawable.MenuHostHelper$$ExternalSyntheticLambda1(x.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setTabMode, -1), setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setTextAppearanceResource);
                        } else {
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setTextAppearanceResource = null;
                        }
                        if (x.setLayoutAnimation(setAnimationFromJson.setY.AppBarLayout$ScrollingViewBehavior)) {
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setZ = x.setY(setAnimationFromJson.setY.AppBarLayout$ScrollingViewBehavior);
                        } else {
                            setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setZ = null;
                        }
                        x.setX();
                        setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setChipCornerRadius = false;
                    }
                } else {
                    TypedArray obtainStyledAttributes = setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.FloatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda0.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setStrokeColorResource);
                    setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setX = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setCheckedIconTint, 0);
                    setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setY = obtainStyledAttributes.getInt(setAnimationFromJson.setY.ExpandableBehavior, 0);
                    setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setIconTintList = obtainStyledAttributes.getInt(setAnimationFromJson.setY.setCheckMarkDrawable, 0);
                    setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInt(setAnimationFromJson.setY.getView, 0);
                    setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple = obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setHoverListener, true);
                    setshrinkmotionspec_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setSupportImageTintMode, true);
                    obtainStyledAttributes.recycle();
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setNavigationOnClickListener == null) {
            Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                obj = ((ContextWrapper) obj).getBaseContext();
                if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                    obj = MenuHostHelper$$ExternalSyntheticLambda1(((ContextWrapper) obj).getBaseContext());
                }
            }
            this.setNavigationOnClickListener = obj;
        }
        return this.setNavigationOnClickListener;
    }

    private Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? MenuHostHelper$$ExternalSyntheticLambda1(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] MenuHostHelper$$ExternalSyntheticLambda1 = {MenuItem.class};
        private Method setX;
        private Object setY;

        public setX(Object obj, String str) {
            this.setY = obj;
            Class<?> cls = obj.getClass();
            try {
                this.setX = cls.getMethod(str, MenuHostHelper$$ExternalSyntheticLambda1);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.setX.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.setX.invoke(this.setY, menuItem)).booleanValue();
                }
                this.setX.invoke(this.setY, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:11:0x0042). Please submit an issue!!! */
    static {
        /*
            r0 = 26
            byte[] r0 = new byte[r0]
            r0 = {x004c: FILL_ARRAY_DATA  , data: [28, 71, 97, 53, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4} // fill-array
            o.setShrinkMotionSpec.setUiOptions = r0
            r1 = 76
            o.setShrinkMotionSpec.setY = r1
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 23
            byte[] r4 = new byte[r3]
            r5 = 97
            r6 = 4
            r7 = 0
            if (r0 != 0) goto L20
            r6 = r4
            r8 = 4
            r9 = 4
            r10 = 0
            r4 = r2
            goto L42
        L20:
            r5 = r4
            r6 = 97
            r8 = 4
            r9 = 0
            r4 = r2
        L26:
            int r10 = r9 + 1
            byte r11 = (byte) r6
            r5[r9] = r11
            if (r10 != r3) goto L3d
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r7)
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r2[r7] = r0
            o.setShrinkMotionSpec.setX = r4
            o.setShrinkMotionSpec.setOnLongClickListener = r4
            return
        L3d:
            r9 = r0[r8]
            r12 = r6
            r6 = r5
            r5 = r12
        L42:
            int r5 = r5 - r9
            int r5 = r5 + (-8)
            int r8 = r8 + r1
            r9 = r10
            r12 = r6
            r6 = r5
            r5 = r12
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setShrinkMotionSpec.<clinit>():void");
    }
}