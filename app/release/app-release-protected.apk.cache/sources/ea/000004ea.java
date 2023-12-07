package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.getTranslateX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class getInterfaceDescriptor extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<setY> {
    final getTranslateX<?> MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ void setY(setY sety, int i) {
        setY sety2 = sety;
        final int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setError.setIconTintList.setLayoutAnimation + i;
        String string = sety2.setZ.getContext().getString(R.string.res_0x7f140082);
        sety2.setZ.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        sety2.setZ.setContentDescription(String.format(string, Integer.valueOf(i2)));
        setEvaluator setevaluator = this.MenuHostHelper$$ExternalSyntheticLambda1.FirebaseRemoteConfigKtxRegistrar;
        Calendar iconTintList = HideBottomViewOnScrollBehavior.setIconTintList();
        getTranslateY gettranslatey = iconTintList.get(1) == i2 ? setevaluator.setLayoutAnimation : setevaluator.setNavigationOnClickListener;
        for (Long l : this.MenuHostHelper$$ExternalSyntheticLambda1.onActivityResumed.MenuHostHelper$$ExternalSyntheticLambda0()) {
            iconTintList.setTimeInMillis(l.longValue());
            if (iconTintList.get(1) == i2) {
                gettranslatey = setevaluator.setIconTintList;
            }
        }
        gettranslatey.MenuHostHelper$$ExternalSyntheticLambda1(sety2.setZ);
        sety2.setZ.setOnClickListener(new View.OnClickListener() { // from class: o.getInterfaceDescriptor.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setCompletionHint y = setCompletionHint.setY(i2, getInterfaceDescriptor.this.MenuHostHelper$$ExternalSyntheticLambda1.setTooltipText.setY);
                setGroupDividerEnabled setgroupdividerenabled = getInterfaceDescriptor.this.MenuHostHelper$$ExternalSyntheticLambda1.setError;
                if (y.setX.compareTo(setgroupdividerenabled.setIconTintList.setX) < 0) {
                    y = setgroupdividerenabled.setIconTintList;
                } else {
                    if (y.setX.compareTo(setgroupdividerenabled.setX.setX) > 0) {
                        y = setgroupdividerenabled.setX;
                    }
                }
                getInterfaceDescriptor.this.MenuHostHelper$$ExternalSyntheticLambda1.setX(y);
                getInterfaceDescriptor.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(getTranslateX.setX.DAY);
            }
        });
    }

    /* loaded from: classes.dex */
    public static class setY extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled {
        final TextView setZ;

        setY(TextView textView) {
            super(textView);
            this.setZ = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getInterfaceDescriptor(getTranslateX<?> gettranslatex) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = gettranslatex;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final int setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setError.setNavigationOnClickListener;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setY setY(ViewGroup viewGroup) {
        return new setY((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.res_0x7f0d0062, viewGroup, false));
    }
}