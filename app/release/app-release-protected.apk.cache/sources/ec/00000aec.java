package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class setCustomView {
    private static final ThreadLocal<TypedValue> MenuHostHelper$$ExternalSyntheticLambda1 = new ThreadLocal<>();

    public static ColorStateList setX(Resources resources, int i, Resources.Theme theme) {
        try {
            return setIconTintList(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static ColorStateList setIconTintList(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(resources, xmlPullParser, asAttributeSet, theme);
    }

    public static ColorStateList MenuHostHelper$$ExternalSyntheticLambda1(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid color state list tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        return MenuHostHelper$$ExternalSyntheticLambda0(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList MenuHostHelper$$ExternalSyntheticLambda0(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomView.MenuHostHelper$$ExternalSyntheticLambda0(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(Resources resources, int i) {
        TypedValue iconTintList = setIconTintList();
        resources.getValue(i, iconTintList, true);
        return iconTintList.type >= 28 && iconTintList.type <= 31;
    }

    private static TypedValue setIconTintList() {
        ThreadLocal<TypedValue> threadLocal = MenuHostHelper$$ExternalSyntheticLambda1;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static TypedArray setIconTintList(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda1(int i, float f, float f2) {
        float f3;
        float f4;
        int i2 = i;
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f != 1.0f || z) {
            int alpha = (int) ((Color.alpha(i) * f) + 0.5f);
            if (alpha < 0) {
                alpha = 0;
            } else if (alpha > 255) {
                alpha = 255;
            }
            if (z) {
                flushPendingCommands MenuHostHelper$$ExternalSyntheticLambda12 = flushPendingCommands.MenuHostHelper$$ExternalSyntheticLambda1(i2, FirebaseInstallationsKtxRegistrar.setY);
                float f5 = MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1;
                float f6 = MenuHostHelper$$ExternalSyntheticLambda12.setY;
                FirebaseInstallationsKtxRegistrar firebaseInstallationsKtxRegistrar = FirebaseInstallationsKtxRegistrar.setY;
                if (f6 >= 1.0d && Math.round(f2) > 0.0d && Math.round(f2) < 100.0d) {
                    float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                    float f7 = f6;
                    boolean z2 = true;
                    float f8 = 0.0f;
                    flushPendingCommands flushpendingcommands = null;
                    while (true) {
                        if (Math.abs(f8 - f6) >= 0.4f) {
                            float f9 = 1000.0f;
                            float f10 = 1000.0f;
                            flushPendingCommands flushpendingcommands2 = null;
                            float f11 = 0.0f;
                            float f12 = 100.0f;
                            while (true) {
                                if (Math.abs(f11 - f12) <= 0.01f) {
                                    f3 = f7;
                                    break;
                                }
                                float f13 = ((f12 - f11) / 2.0f) + f11;
                                int MenuHostHelper$$ExternalSyntheticLambda0 = flushPendingCommands.setX(f13, f7, min, FirebaseInstallationsKtxRegistrar.setY).MenuHostHelper$$ExternalSyntheticLambda0(FirebaseInstallationsKtxRegistrar.setY);
                                float y = setScale.setY(MenuHostHelper$$ExternalSyntheticLambda0);
                                float abs = Math.abs(f2 - y);
                                if (abs < 0.2f) {
                                    flushPendingCommands MenuHostHelper$$ExternalSyntheticLambda13 = flushPendingCommands.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, FirebaseInstallationsKtxRegistrar.setY);
                                    f3 = f7;
                                    flushPendingCommands x = flushPendingCommands.setX(MenuHostHelper$$ExternalSyntheticLambda13.setX, MenuHostHelper$$ExternalSyntheticLambda13.setY, min, FirebaseInstallationsKtxRegistrar.setY);
                                    float f14 = MenuHostHelper$$ExternalSyntheticLambda13.setOnLongClickListener - x.setOnLongClickListener;
                                    f4 = f13;
                                    float f15 = MenuHostHelper$$ExternalSyntheticLambda13.MenuHostHelper$$ExternalSyntheticLambda0 - x.MenuHostHelper$$ExternalSyntheticLambda0;
                                    float f16 = MenuHostHelper$$ExternalSyntheticLambda13.setIconTintList - x.setIconTintList;
                                    float pow = (float) (Math.pow(Math.sqrt((f14 * f14) + (f15 * f15) + (f16 * f16)), 0.63d) * 1.41d);
                                    if (pow <= 1.0f) {
                                        f10 = pow;
                                        flushpendingcommands2 = MenuHostHelper$$ExternalSyntheticLambda13;
                                        f9 = abs;
                                    }
                                } else {
                                    f3 = f7;
                                    f4 = f13;
                                }
                                if (f9 == 0.0f && f10 == 0.0f) {
                                    break;
                                }
                                f7 = f3;
                                if (y < f2) {
                                    f11 = f4;
                                } else {
                                    f12 = f4;
                                }
                            }
                            if (!z2) {
                                if (flushpendingcommands2 == null) {
                                    f6 = f3;
                                } else {
                                    f8 = f3;
                                    flushpendingcommands = flushpendingcommands2;
                                }
                                f7 = ((f6 - f8) / 2.0f) + f8;
                            } else if (flushpendingcommands2 != null) {
                                i2 = flushpendingcommands2.MenuHostHelper$$ExternalSyntheticLambda0(firebaseInstallationsKtxRegistrar);
                                break;
                            } else {
                                f7 = ((f6 - f8) / 2.0f) + f8;
                                z2 = false;
                            }
                        } else if (flushpendingcommands != null) {
                            i2 = flushpendingcommands.MenuHostHelper$$ExternalSyntheticLambda0(firebaseInstallationsKtxRegistrar);
                        }
                    }
                }
                i2 = setScale.setIconTintList(f2);
            }
            return (i2 & 16777215) | (alpha << 24);
        }
        return i2;
    }
}