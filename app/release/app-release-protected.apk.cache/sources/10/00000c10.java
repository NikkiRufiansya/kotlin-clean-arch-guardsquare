package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class setGuidelinePercent {
    private static int MenuHostHelper$$ExternalSyntheticLambda0 = -100;
    private static final setHasNonEmbeddedTabs<WeakReference<setGuidelinePercent>> MenuHostHelper$$ExternalSyntheticLambda1 = new setHasNonEmbeddedTabs<>();
    private static final Object setY = new Object();

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(Configuration configuration);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(View view);

    public void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
    }

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle);

    public int setIconTintList() {
        return -100;
    }

    public abstract void setIconTintList(Bundle bundle);

    public abstract void setIconTintList(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setIconTintList(setTranscriptMode settranscriptmode);

    public abstract boolean setIconTintList(int i);

    public abstract void setLayoutAnimation();

    public abstract void setNavigationOnClickListener();

    public abstract void setOnLongClickListener();

    public abstract void setUiOptions();

    public abstract void setUnboundedRipple();

    public abstract setMaxEms setX();

    public abstract void setX(View view, ViewGroup.LayoutParams layoutParams);

    public abstract MenuInflater setY();

    public abstract <T extends View> T setY(int i);

    @Deprecated
    public void setY(Context context) {
    }

    public abstract void setY(Bundle bundle);

    public abstract void setY(CharSequence charSequence);

    public static setGuidelinePercent setY(Activity activity, setLayoutDirection setlayoutdirection) {
        return new setIconified(activity, setlayoutdirection);
    }

    public static setGuidelinePercent MenuHostHelper$$ExternalSyntheticLambda0(Dialog dialog, setLayoutDirection setlayoutdirection) {
        return new setIconified(dialog, setlayoutdirection);
    }

    public Context MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        setY(context);
        return context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(setGuidelinePercent setguidelinepercent) {
        synchronized (setY) {
            setIconTintList(setguidelinepercent);
            MenuHostHelper$$ExternalSyntheticLambda1.add(new WeakReference<>(setguidelinepercent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda0(setGuidelinePercent setguidelinepercent) {
        synchronized (setY) {
            setIconTintList(setguidelinepercent);
        }
    }

    private static void setIconTintList(setGuidelinePercent setguidelinepercent) {
        synchronized (setY) {
            Iterator<WeakReference<setGuidelinePercent>> it = MenuHostHelper$$ExternalSyntheticLambda1.iterator();
            while (it.hasNext()) {
                setGuidelinePercent setguidelinepercent2 = it.next().get();
                if (setguidelinepercent2 == setguidelinepercent || setguidelinepercent2 == null) {
                    it.remove();
                }
            }
        }
    }
}