package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
final class getSystemGestureInsets {
    final WindowManager.LayoutParams MenuHostHelper$$ExternalSyntheticLambda0;
    final View MenuHostHelper$$ExternalSyntheticLambda1;
    final Context setIconTintList;
    final int[] setUiOptions;
    final Rect setUnboundedRipple;
    final TextView setX;
    final int[] setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getSystemGestureInsets(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = layoutParams;
        this.setUnboundedRipple = new Rect();
        this.setY = new int[2];
        this.setUiOptions = new int[2];
        this.setIconTintList = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.res_0x7f0d001b, (ViewGroup) null);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = inflate;
        this.setX = (TextView) inflate.findViewById(R.id.res_0x7f0a0127);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style._res_0x7f150004;
        layoutParams.flags = 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.getParent() != null) {
            ((WindowManager) this.setIconTintList.getSystemService("window")).removeView(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }
}