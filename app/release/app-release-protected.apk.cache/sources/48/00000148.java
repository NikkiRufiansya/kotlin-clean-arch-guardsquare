package o;

import android.content.Context;
import android.icu.text.DateFormat;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppBarLayout$Behavior extends BaseAdapter {
    private static final int setLayoutAnimation;
    static final int setY;
    final setCompletionHint MenuHostHelper$$ExternalSyntheticLambda0;
    final setErrorIconTintMode<?> MenuHostHelper$$ExternalSyntheticLambda1;
    final setGroupDividerEnabled setIconTintList;
    Collection<Long> setUnboundedRipple;
    setEvaluator setX;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppBarLayout$Behavior(setCompletionHint setcompletionhint, setErrorIconTintMode<?> seterroricontintmode, setGroupDividerEnabled setgroupdividerenabled) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setcompletionhint;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = seterroricontintmode;
        this.setIconTintList = setgroupdividerenabled;
        this.setUnboundedRipple = seterroricontintmode.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return setLayoutAnimation;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(TextView textView, long j) {
        getTranslateY gettranslatey;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.setIconTintList.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(j)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                long longValue = it.next().longValue();
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar.clear();
                calendar.setTimeInMillis(j);
                long timeInMillis = HideBottomViewOnScrollBehavior.setX(calendar).getTimeInMillis();
                Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                calendar2.clear();
                calendar2.setTimeInMillis(longValue);
                if (timeInMillis == HideBottomViewOnScrollBehavior.setX(calendar2).getTimeInMillis()) {
                    z = true;
                    break;
                }
            }
            if (z) {
                gettranslatey = this.setX.setY;
            } else if (HideBottomViewOnScrollBehavior.setIconTintList().getTimeInMillis() == j) {
                gettranslatey = this.setX.setOnLongClickListener;
            } else {
                gettranslatey = this.setX.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        } else {
            textView.setEnabled(false);
            gettranslatey = this.setX.setX;
        }
        gettranslatey.MenuHostHelper$$ExternalSyntheticLambda1(textView);
    }

    static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        setY = calendar.getMaximum(4);
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.clear();
        int maximum = calendar2.getMaximum(5);
        Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar3.clear();
        setLayoutAnimation = (maximum + calendar3.getMaximum(7)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(setAnimationCacheEnabled setanimationcacheenabled, long j) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setTimeInMillis(j);
        if (new setCompletionHint(calendar).equals(this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            Calendar x = HideBottomViewOnScrollBehavior.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            x.setTimeInMillis(j);
            int i = x.get(5);
            AppBarLayout$Behavior y = setanimationcacheenabled.setY();
            MenuHostHelper$$ExternalSyntheticLambda0((TextView) setanimationcacheenabled.getChildAt((y.MenuHostHelper$$ExternalSyntheticLambda0.setY(y.setIconTintList.setY) + (i - 1)) - setanimationcacheenabled.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: setY */
    public final Long getItem(int i) {
        if (i < this.MenuHostHelper$$ExternalSyntheticLambda0.setY(this.setIconTintList.setY) || i > (this.MenuHostHelper$$ExternalSyntheticLambda0.setY(this.setIconTintList.setY) + this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1) - 1) {
            return null;
        }
        setCompletionHint setcompletionhint = this.MenuHostHelper$$ExternalSyntheticLambda0;
        Calendar x = HideBottomViewOnScrollBehavior.setX(setcompletionhint.setX);
        x.set(5, (i - setcompletionhint.setY(this.setIconTintList.setY)) + 1);
        return Long.valueOf(x.getTimeInMillis());
    }

    @Override // android.widget.Adapter
    public /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        String format;
        DateFormat instanceForSkeleton;
        android.icu.util.TimeZone timeZone;
        String format2;
        DateFormat instanceForSkeleton2;
        android.icu.util.TimeZone timeZone2;
        Context context = viewGroup.getContext();
        if (this.setX == null) {
            this.setX = new setEvaluator(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.res_0x7f0d0059, viewGroup, false);
        }
        int y = i - this.MenuHostHelper$$ExternalSyntheticLambda0.setY(this.setIconTintList.setY);
        if (y < 0 || y >= this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = y + 1;
            textView.setTag(this.MenuHostHelper$$ExternalSyntheticLambda0);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
            Calendar x = HideBottomViewOnScrollBehavior.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
            x.set(5, i2);
            long timeInMillis = x.getTimeInMillis();
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation == new setCompletionHint(HideBottomViewOnScrollBehavior.setIconTintList()).setLayoutAnimation) {
                Locale locale = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                    timeZone2 = android.icu.util.TimeZone.getTimeZone("UTC");
                    instanceForSkeleton2.setTimeZone(timeZone2);
                    format2 = instanceForSkeleton2.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                    dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
                    format2 = dateInstance.format(new Date(timeInMillis));
                }
                textView.setContentDescription(format2);
            } else {
                Locale locale2 = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                    timeZone = android.icu.util.TimeZone.getTimeZone("UTC");
                    instanceForSkeleton.setTimeZone(timeZone);
                    format = instanceForSkeleton.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                    dateInstance2.setTimeZone(TimeZone.getTimeZone("UTC"));
                    format = dateInstance2.format(new Date(timeInMillis));
                }
                textView.setContentDescription(format);
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(textView, item.longValue());
        return textView;
    }
}