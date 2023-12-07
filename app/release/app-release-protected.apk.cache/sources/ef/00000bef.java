package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import o.setExpandedTitleMargin;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class setForegroundTintBlendMode {
    private int setLayoutAnimation;
    private int MenuHostHelper$$ExternalSyntheticLambda1 = -1;
    private int setIconTintList = -1;
    public SparseArray<setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0> MenuHostHelper$$ExternalSyntheticLambda0 = new SparseArray<>();
    private SparseArray<WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1> setX = new SparseArray<>();
    private setEndIconMode setY = null;

    public setForegroundTintBlendMode(Context context, XmlPullParser xmlPullParser) {
        this.setLayoutAnimation = -1;
        setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0 setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.ExecutorsRegistrar);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setExpandedTitleMargin.setY.setRightStripDrawable) {
                this.setLayoutAnimation = obtainStyledAttributes.getResourceId(index, this.setLayoutAnimation);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 2) {
                        setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 = new setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0(context, xmlPullParser);
                        this.MenuHostHelper$$ExternalSyntheticLambda0.put(setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.setY, setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0);
                    } else if (c == 3) {
                        setIconTintList seticontintlist = new setIconTintList(context, xmlPullParser);
                        if (setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 != null) {
                            setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0.add(seticontintlist);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1(int i, float f, float f2) {
        setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0 setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        if (-1 != i) {
            setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0 setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda02 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
            if (setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda02 == null) {
                return -1;
            }
            int MenuHostHelper$$ExternalSyntheticLambda12 = setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda02.MenuHostHelper$$ExternalSyntheticLambda1(-1.0f, -1.0f);
            return MenuHostHelper$$ExternalSyntheticLambda12 == -1 ? setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda02.setIconTintList : setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda02.MenuHostHelper$$ExternalSyntheticLambda0.get(MenuHostHelper$$ExternalSyntheticLambda12).setIconTintList;
        }
        if (i == -1) {
            setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.valueAt(0);
        } else {
            setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        if (setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 == null) {
            return -1;
        }
        if ((this.setIconTintList == -1 || !setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0.get(-1).MenuHostHelper$$ExternalSyntheticLambda0(-1.0f, -1.0f)) && -1 != (MenuHostHelper$$ExternalSyntheticLambda1 = setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1(-1.0f, -1.0f))) {
            return MenuHostHelper$$ExternalSyntheticLambda1 == -1 ? setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.setIconTintList : setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0.get(MenuHostHelper$$ExternalSyntheticLambda1).setIconTintList;
        }
        return -1;
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        private boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private float MenuHostHelper$$ExternalSyntheticLambda1;
        public int setIconTintList;
        private float setUnboundedRipple;
        private float setX;
        private float setY;

        public setIconTintList(Context context, XmlPullParser xmlPullParser) {
            this.setUnboundedRipple = Float.NaN;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Float.NaN;
            this.setX = Float.NaN;
            this.setY = Float.NaN;
            this.setIconTintList = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setTranslateY);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.setValues) {
                    this.setIconTintList = obtainStyledAttributes.getResourceId(index, this.setIconTintList);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.setIconTintList);
                    context.getResources().getResourceName(this.setIconTintList);
                    if ("layout".equals(resourceTypeName)) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                    }
                } else if (index == setExpandedTitleMargin.setY.setCurrentPosition) {
                    this.setY = obtainStyledAttributes.getDimension(index, this.setY);
                } else if (index == setExpandedTitleMargin.setY.LegacySavedStateHandleController$1) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getDimension(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                } else if (index == setExpandedTitleMargin.setY.unlinkToDeath) {
                    this.setX = obtainStyledAttributes.getDimension(index, this.setX);
                } else if (index == setExpandedTitleMargin.setY.setPromptId) {
                    this.setUnboundedRipple = obtainStyledAttributes.getDimension(index, this.setUnboundedRipple);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2) {
            if (Float.isNaN(this.setUnboundedRipple) || f >= this.setUnboundedRipple) {
                if (Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda1) || f2 >= this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    if (Float.isNaN(this.setX) || f <= this.setX) {
                        return Float.isNaN(this.setY) || f2 <= this.setY;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }
}