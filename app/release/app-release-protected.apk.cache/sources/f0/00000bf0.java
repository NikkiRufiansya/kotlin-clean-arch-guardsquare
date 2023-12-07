package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import o.setExpandedTitleMargin;
import o.setForegroundTintBlendMode;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0 {
    public ArrayList<setForegroundTintBlendMode.setIconTintList> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
    public int setIconTintList;
    private boolean setX;
    int setY;

    public setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0(Context context, XmlPullParser xmlPullParser) {
        this.setIconTintList = -1;
        this.setX = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setItemTextColor);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setExpandedTitleMargin.setY.setTextOn) {
                this.setY = obtainStyledAttributes.getResourceId(index, this.setY);
            } else if (index == setExpandedTitleMargin.setY.setStatusBarScrim) {
                this.setIconTintList = obtainStyledAttributes.getResourceId(index, this.setIconTintList);
                String resourceTypeName = context.getResources().getResourceTypeName(this.setIconTintList);
                context.getResources().getResourceName(this.setIconTintList);
                if ("layout".equals(resourceTypeName)) {
                    this.setX = true;
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2) {
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0.size(); i++) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.get(i).MenuHostHelper$$ExternalSyntheticLambda0(f, f2)) {
                return i;
            }
        }
        return -1;
    }
}