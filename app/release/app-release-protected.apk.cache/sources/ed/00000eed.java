package o;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.Calendar;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setRemoteViewsAdapter extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0> {
    final setGroupDividerEnabled MenuHostHelper$$ExternalSyntheticLambda0;
    private final setErrorIconTintMode<?> MenuHostHelper$$ExternalSyntheticLambda1;
    final getTranslateX$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
    private final int setOnLongClickListener;

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ void setY(setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0 setremoteviewsadapter_menuhosthelper__externalsyntheticlambda0, int i) {
        setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0 setremoteviewsadapter_menuhosthelper__externalsyntheticlambda02 = setremoteviewsadapter_menuhosthelper__externalsyntheticlambda0;
        Calendar x = HideBottomViewOnScrollBehavior.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setX);
        x.add(2, i);
        setCompletionHint setcompletionhint = new setCompletionHint(x);
        TextView textView = setremoteviewsadapter_menuhosthelper__externalsyntheticlambda02.setAnimationFromJson;
        if (setcompletionhint.setIconTintList == null) {
            setcompletionhint.setIconTintList = DateUtils.formatDateTime(null, setcompletionhint.setX.getTimeInMillis(), 8228);
        }
        textView.setText(setcompletionhint.setIconTintList);
        final setAnimationCacheEnabled setanimationcacheenabled = (setAnimationCacheEnabled) setremoteviewsadapter_menuhosthelper__externalsyntheticlambda02.setZ.findViewById(R.id.res_0x7f0a012b);
        if (setanimationcacheenabled.setY() != null && setcompletionhint.equals(setanimationcacheenabled.setY().MenuHostHelper$$ExternalSyntheticLambda0)) {
            setanimationcacheenabled.invalidate();
            AppBarLayout$Behavior y = setanimationcacheenabled.setY();
            for (Long l : y.setUnboundedRipple) {
                y.setY(setanimationcacheenabled, l.longValue());
            }
            setErrorIconTintMode<?> seterroricontintmode = y.MenuHostHelper$$ExternalSyntheticLambda1;
            if (seterroricontintmode != null) {
                for (Long l2 : seterroricontintmode.MenuHostHelper$$ExternalSyntheticLambda0()) {
                    y.setY(setanimationcacheenabled, l2.longValue());
                }
                y.setUnboundedRipple = y.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        } else {
            AppBarLayout$Behavior appBarLayout$Behavior = new AppBarLayout$Behavior(setcompletionhint, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0);
            setanimationcacheenabled.setNumColumns(setcompletionhint.MenuHostHelper$$ExternalSyntheticLambda0);
            setanimationcacheenabled.setAdapter((ListAdapter) appBarLayout$Behavior);
        }
        setanimationcacheenabled.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.setRemoteViewsAdapter.5
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                AppBarLayout$Behavior y2 = setanimationcacheenabled.setY();
                boolean z = true;
                if ((i2 < y2.MenuHostHelper$$ExternalSyntheticLambda0.setY(y2.setIconTintList.setY) || i2 > (y2.MenuHostHelper$$ExternalSyntheticLambda0.setY(y2.setIconTintList.setY) + y2.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1) - 1) ? false : false) {
                    setRemoteViewsAdapter.this.setIconTintList.setY(setanimationcacheenabled.setY().getItem(i2).longValue());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setRemoteViewsAdapter(Context context, setErrorIconTintMode<?> seterroricontintmode, setGroupDividerEnabled setgroupdividerenabled, getTranslateX$MenuHostHelper$$ExternalSyntheticLambda1 gettranslatex_menuhosthelper__externalsyntheticlambda1) {
        setCompletionHint setcompletionhint = setgroupdividerenabled.setIconTintList;
        setCompletionHint setcompletionhint2 = setgroupdividerenabled.setX;
        setCompletionHint setcompletionhint3 = setgroupdividerenabled.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setcompletionhint.setX.compareTo(setcompletionhint3.setX) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (setcompletionhint3.setX.compareTo(setcompletionhint2.setX) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.setOnLongClickListener = (AppBarLayout$Behavior.setY * context.getResources().getDimensionPixelSize(R.dimen.res_0x7f0701c2)) + (setTranslationZ.MenuHostHelper$$ExternalSyntheticLambda1(context, 16843277) ? context.getResources().getDimensionPixelSize(R.dimen.res_0x7f0701c2) : 0);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setgroupdividerenabled;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = seterroricontintmode;
        this.setIconTintList = gettranslatex_menuhosthelper__externalsyntheticlambda1;
        if (this.setX.setY()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.setY = true;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final long setY(int i) {
        Calendar x = HideBottomViewOnScrollBehavior.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setX);
        x.add(2, i);
        return new setCompletionHint(x).setX.getTimeInMillis();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final int setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0 setY(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.res_0x7f0d005e, viewGroup, false);
        if (setTranslationZ.MenuHostHelper$$ExternalSyntheticLambda1(viewGroup.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation(-1, this.setOnLongClickListener));
            return new setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0(linearLayout, true);
        }
        return new setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0(linearLayout, false);
    }
}