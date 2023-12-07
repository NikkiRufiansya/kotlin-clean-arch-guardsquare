package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import o.setExpandedTitleMargin;
import o.setMIndicatorOptions;

/* loaded from: classes.dex */
public final class setCloseIconSizeResource extends View {
    View MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int setX;

    public setCloseIconSizeResource(Context context) {
        super(context);
        this.setIconTintList = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        this.setX = 4;
        setIconTintList(null);
    }

    public setCloseIconSizeResource(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setIconTintList = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        this.setX = 4;
        setIconTintList(attributeSet);
    }

    public setCloseIconSizeResource(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setIconTintList = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        this.setX = 4;
        setIconTintList(attributeSet);
    }

    private void setIconTintList(AttributeSet attributeSet) {
        super.setVisibility(this.setX);
        this.setIconTintList = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setErrorIconTintList);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.setCallingWorkSourceUid) {
                    this.setIconTintList = obtainStyledAttributes.getResourceId(index, this.setIconTintList);
                } else if (index == setExpandedTitleMargin.setY.setCheckedIconEnabledResource) {
                    this.setX = obtainStyledAttributes.getInt(index, this.setX);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setEmptyVisibility(int i) {
        this.setX = i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public final void setContentId(int i) {
        View findViewById;
        if (this.setIconTintList == i) {
            return;
        }
        View view = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (view != null) {
            view.setVisibility(0);
            ((setMIndicatorOptions.setIconTintList) this.MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams()).setAdapter = false;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        }
        this.setIconTintList = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }
}