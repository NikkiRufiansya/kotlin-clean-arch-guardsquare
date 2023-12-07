package o;

import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import java.util.concurrent.Executor;
import o.SingleGeneratedAdapterObserver;
import o.setScrollContainer;

/* loaded from: classes.dex */
public class WindowInsetsCompat$Impl30 extends setScrollContainer.setX {
    private static final setY setUnboundedRipple = new setY();

    public WindowInsetsCompat$Impl30(Context context, setMarqueeRepeatLimit setmarqueerepeatlimit) {
        super(new WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1(context, setmarqueerepeatlimit, setUnboundedRipple));
    }

    public WindowInsetsCompat$Impl30 setX(Executor executor) {
        ((WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1) setX()).setX(executor);
        return this;
    }

    /* loaded from: classes.dex */
    public static class setY {
        public SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0(Context context, setMarqueeRepeatLimit setmarqueerepeatlimit) {
            return SingleGeneratedAdapterObserver.MenuHostHelper$$ExternalSyntheticLambda0(context, null, setmarqueerepeatlimit);
        }

        public Typeface MenuHostHelper$$ExternalSyntheticLambda0(Context context, SingleGeneratedAdapterObserver.setX setx) {
            return SingleGeneratedAdapterObserver.MenuHostHelper$$ExternalSyntheticLambda1(context, null, new SingleGeneratedAdapterObserver.setX[]{setx});
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void setIconTintList(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }
}