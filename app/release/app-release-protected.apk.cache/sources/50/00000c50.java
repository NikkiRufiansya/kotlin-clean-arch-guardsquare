package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class setHoverListener extends FrameLayout implements setTextDirection {
    private setTextDirection$MenuHostHelper$$ExternalSyntheticLambda0 setX;

    public setHoverListener(Context context) {
        super(context);
    }

    public setHoverListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(setTextDirection$MenuHostHelper$$ExternalSyntheticLambda0 settextdirection_menuhosthelper__externalsyntheticlambda0) {
        this.setX = settextdirection_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }
}