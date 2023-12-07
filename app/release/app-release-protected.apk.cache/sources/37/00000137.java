package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.AbsSavedState$2;
import o.setExpandedTitleMargin;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AbsSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0 {
    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    ArrayList<AbsSavedState$2.setX> setX = new ArrayList<>();

    public AbsSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0(Context context, XmlPullParser xmlPullParser) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setItemTextColor);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setExpandedTitleMargin.setY.setTextOn) {
                this.setIconTintList = obtainStyledAttributes.getResourceId(index, this.setIconTintList);
            } else if (index == setExpandedTitleMargin.setY.setStatusBarScrim) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getResourceId(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.MenuHostHelper$$ExternalSyntheticLambda1);
                context.getResources().getResourceName(this.MenuHostHelper$$ExternalSyntheticLambda1);
                if ("layout".equals(resourceTypeName)) {
                    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY((setMIndicatorOptions) LayoutInflater.from(context).inflate(this.MenuHostHelper$$ExternalSyntheticLambda1, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final int setX(float f, float f2) {
        for (int i = 0; i < this.setX.size(); i++) {
            if (this.setX.get(i).MenuHostHelper$$ExternalSyntheticLambda1(f, f2)) {
                return i;
            }
        }
        return -1;
    }
}