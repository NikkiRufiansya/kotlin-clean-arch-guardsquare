package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.Locale;
import o.setIconTint;

/* renamed from: o.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0420r extends setSystemUiVisibility {
    private boolean setIconTintList;
    private final Rect setX;

    public C0420r(Context context) {
        this(context, null);
    }

    public C0420r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04016c);
    }

    public C0420r(Context context, AttributeSet attributeSet, int i) {
        super(C0501u.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, i, 0), attributeSet, i);
        this.setX = new Rect();
        int[] iArr = setIconTint.setIconTintList.setSuffixText;
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context, attributeSet, i, R.style._res_0x7f15030c);
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context, attributeSet, iArr, i, R.style._res_0x7f15030c, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style._res_0x7f15030c);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null || !MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1) {
            return super.getHint();
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setIconSize) {
            return MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener;
        }
        return null;
    }

    @Override // o.setSystemUiVisibility, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            CharSequence charSequence = null;
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda0.setIconSize) {
                charSequence = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener;
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    private C0447s MenuHostHelper$$ExternalSyntheticLambda0() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof C0447s) {
                return (C0447s) parent;
            }
        }
        return null;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.setIconTintList = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (!(MenuHostHelper$$ExternalSyntheticLambda0 != null && this.setIconTintList) || rect == null) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0.getFocusedRect(this.setX);
        rect.bottom = this.setX.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null && this.setIconTintList) {
            return MenuHostHelper$$ExternalSyntheticLambda0.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if ((MenuHostHelper$$ExternalSyntheticLambda0 != null && this.setIconTintList) && rect != null) {
            this.setX.set(rect.left, rect.top, rect.right, rect.bottom + (MenuHostHelper$$ExternalSyntheticLambda0.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.setX);
        }
        return super.requestRectangleOnScreen(rect);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0447s MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (Build.VERSION.SDK_INT >= 23 || MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return;
        }
        Editable text = getText();
        CharSequence charSequence = MenuHostHelper$$ExternalSyntheticLambda0.setIconSize ? MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener : null;
        boolean isEmpty = TextUtils.isEmpty(text);
        String str = "";
        String charSequence2 = TextUtils.isEmpty(charSequence) ^ true ? charSequence.toString() : "";
        if (!isEmpty) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) text);
            if (!TextUtils.isEmpty(charSequence2)) {
                StringBuilder sb2 = new StringBuilder(", ");
                sb2.append(charSequence2);
                str = sb2.toString();
            }
            sb.append(str);
            str = sb.toString();
        } else if (!TextUtils.isEmpty(charSequence2)) {
            str = charSequence2;
        }
        accessibilityNodeInfo.setText(str);
    }
}