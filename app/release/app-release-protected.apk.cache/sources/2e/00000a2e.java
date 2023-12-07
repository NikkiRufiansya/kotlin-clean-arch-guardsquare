package o;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
final class setChipStartPadding extends BaseAdapter {
    private static final int MenuHostHelper$$ExternalSyntheticLambda1;
    private final Calendar MenuHostHelper$$ExternalSyntheticLambda0;
    private final int setIconTintList;
    private final int setX;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    static {
        MenuHostHelper$$ExternalSyntheticLambda1 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public setChipStartPadding() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = calendar;
        this.setIconTintList = calendar.getMaximum(7);
        this.setX = calendar.getFirstDayOfWeek();
    }

    public setChipStartPadding(int i) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = calendar;
        this.setIconTintList = calendar.getMaximum(7);
        this.setX = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.setIconTintList;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.res_0x7f0d005a, viewGroup, false);
        }
        Calendar calendar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = i + this.setX;
        int i3 = this.setIconTintList;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.MenuHostHelper$$ExternalSyntheticLambda0.getDisplayName(7, MenuHostHelper$$ExternalSyntheticLambda1, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.res_0x7f14007d), this.MenuHostHelper$$ExternalSyntheticLambda0.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        int i2 = this.setIconTintList;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.setX;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }
}