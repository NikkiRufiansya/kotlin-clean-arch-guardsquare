package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class setImageMatrix {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private final Shader setIconTintList;
    private final ColorStateList setY;

    private setImageMatrix(Shader shader, ColorStateList colorStateList, int i) {
        this.setIconTintList = shader;
        this.setY = colorStateList;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    static setImageMatrix setX(Shader shader) {
        return new setImageMatrix(shader, null, 0);
    }

    static setImageMatrix setX(ColorStateList colorStateList) {
        return new setImageMatrix(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setImageMatrix setX(int i) {
        return new setImageMatrix(null, null, i);
    }

    public final Shader MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList;
    }

    public final int setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final void setIconTintList(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    public final boolean setY() {
        return this.setIconTintList != null;
    }

    public final boolean setX() {
        ColorStateList colorStateList;
        return this.setIconTintList == null && (colorStateList = this.setY) != null && colorStateList.isStateful();
    }

    public final boolean setY(int[] iArr) {
        if (setX()) {
            ColorStateList colorStateList = this.setY;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return setY() || this.MenuHostHelper$$ExternalSyntheticLambda0 != 0;
    }

    public static setImageMatrix setX(Resources resources, int i, Resources.Theme theme) {
        try {
            return setIconTintList(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    private static setImageMatrix setIconTintList(Resources resources, int i, Resources.Theme theme) {
        int next;
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
        name.hashCode();
        if (name.equals("gradient")) {
            return setX(setCheckedIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return setX(setCustomView.MenuHostHelper$$ExternalSyntheticLambda1(resources, xml, asAttributeSet, theme));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xml.getPositionDescription());
        sb.append(": unsupported complex color tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
}