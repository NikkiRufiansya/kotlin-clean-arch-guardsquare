package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public class setOnItemClickListener extends setDropDownBackgroundResource {
    private CharSequence FirebaseRemoteConfigKtxRegistrar;
    private View createDispatcher;
    private View onActivityResumed;
    ListView setError;
    private View setHint;
    private TextView setRevealInfo;
    private ListAdapter setTitleMarginEnd;
    private boolean setTooltipText;
    private final Handler getCallingPid = new Handler();
    private final Runnable setCloseIconEndPadding = new Runnable() { // from class: o.setOnItemClickListener.5
        @Override // java.lang.Runnable
        public final void run() {
            setOnItemClickListener.this.setError.focusableViewAvailable(setOnItemClickListener.this.setError);
        }
    };
    private final AdapterView.OnItemClickListener setFilterRedundantCalls = new AdapterView.OnItemClickListener() { // from class: o.setOnItemClickListener.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ListView listView = (ListView) adapterView;
        }
    };

    @Override // o.setDropDownBackgroundResource
    public View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context callingWorkSourceUid = setCallingWorkSourceUid();
        FrameLayout frameLayout = new FrameLayout(callingWorkSourceUid);
        LinearLayout linearLayout = new LinearLayout(callingWorkSourceUid);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(callingWorkSourceUid, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(callingWorkSourceUid);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(callingWorkSourceUid);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(callingWorkSourceUid);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // o.setDropDownBackgroundResource
    public void setIconTintList(View view, Bundle bundle) {
        super.setIconTintList(view, bundle);
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.setDropDownBackgroundResource
    public void setLayoutAnimation() {
        this.getCallingPid.removeCallbacks(this.setCloseIconEndPadding);
        this.setError = null;
        this.setTooltipText = false;
        this.onActivityResumed = null;
        this.createDispatcher = null;
        this.setHint = null;
        this.setRevealInfo = null;
        super.setLayoutAnimation();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(boolean z, boolean z2) {
        MenuHostHelper$$ExternalSyntheticLambda0();
        View view = this.createDispatcher;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.setTooltipText == z) {
            return;
        }
        this.setTooltipText = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(setCheckedIconEnabled(), 17432577));
                this.onActivityResumed.startAnimation(AnimationUtils.loadAnimation(setCheckedIconEnabled(), 17432576));
            } else {
                view.clearAnimation();
                this.onActivityResumed.clearAnimation();
            }
            this.createDispatcher.setVisibility(8);
            this.onActivityResumed.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(setCheckedIconEnabled(), 17432576));
            this.onActivityResumed.startAnimation(AnimationUtils.loadAnimation(setCheckedIconEnabled(), 17432577));
        } else {
            view.clearAnimation();
            this.onActivityResumed.clearAnimation();
        }
        this.createDispatcher.setVisibility(0);
        this.onActivityResumed.setVisibility(8);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setError != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.setError = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.setRevealInfo = textView;
            if (textView == null) {
                this.setHint = view.findViewById(16908292);
            } else {
                textView.setVisibility(8);
            }
            this.createDispatcher = view.findViewById(16711682);
            this.onActivityResumed = view.findViewById(16711683);
            View findViewById = view.findViewById(16908298);
            if (!(findViewById instanceof ListView)) {
                if (findViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            ListView listView = (ListView) findViewById;
            this.setError = listView;
            View view2 = this.setHint;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.setTooltipText = true;
        this.setError.setOnItemClickListener(this.setFilterRedundantCalls);
        ListAdapter listAdapter = this.setTitleMarginEnd;
        if (listAdapter != null) {
            this.setTitleMarginEnd = null;
            boolean z = 0 != 0;
            this.setTitleMarginEnd = listAdapter;
            ListView listView2 = this.setError;
            if (listView2 != null) {
                listView2.setAdapter(listAdapter);
                if (!this.setTooltipText && !z) {
                    MenuHostHelper$$ExternalSyntheticLambda0(true, setErrorIconTintList().getWindowToken() != null);
                }
            }
        } else if (this.createDispatcher != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(false, false);
        }
        this.getCallingPid.post(this.setCloseIconEndPadding);
    }
}