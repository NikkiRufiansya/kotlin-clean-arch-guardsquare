package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* renamed from: o.na  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0313na extends BitmapDrawable {
    private static final Paint setX = new Paint();
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final float setIconTintList;
    private Drawable setLayoutAnimation;
    private final mU$MenuHostHelper$$ExternalSyntheticLambda1 setNavigationOnClickListener;
    private long setOnLongClickListener;
    private boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(ImageView imageView, Context context, Bitmap bitmap, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C0313na(context, bitmap, drawable, mu_menuhosthelper__externalsyntheticlambda1, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    private C0313na(Context context, Bitmap bitmap, Drawable drawable, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 255;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z2;
        this.setIconTintList = context.getResources().getDisplayMetrics().density;
        this.setNavigationOnClickListener = mu_menuhosthelper__externalsyntheticlambda1;
        if ((mu_menuhosthelper__externalsyntheticlambda1 == mU$MenuHostHelper$$ExternalSyntheticLambda1.MEMORY || z) ? false : true) {
            this.setLayoutAnimation = drawable;
            this.setY = true;
            this.setOnLongClickListener = SystemClock.uptimeMillis();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.setY) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.setOnLongClickListener)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.setY = false;
                this.setLayoutAnimation = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.setLayoutAnimation;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.MenuHostHelper$$ExternalSyntheticLambda0 * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            Paint paint = setX;
            paint.setColor(-1);
            canvas.drawPath(MenuHostHelper$$ExternalSyntheticLambda0((int) (this.setIconTintList * 16.0f)), paint);
            paint.setColor(this.setNavigationOnClickListener.setX);
            canvas.drawPath(MenuHostHelper$$ExternalSyntheticLambda0((int) (this.setIconTintList * 15.0f)), paint);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        Drawable drawable = this.setLayoutAnimation;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.setLayoutAnimation;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.setLayoutAnimation;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    private static Path MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        float f = i;
        path.lineTo(f, 0.0f);
        path.lineTo(0.0f, f);
        return path;
    }
}