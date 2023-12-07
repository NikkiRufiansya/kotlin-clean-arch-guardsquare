package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public final class setCheckedIconEnabled {
    int ExtendableSavedState$1;
    int FloatingActionButton$BaseBehavior;
    boolean FragmentStateAdapter$2;
    TextView FragmentStateAdapter$5;
    Button MenuHostHelper$$ExternalSyntheticLambda0;
    ListAdapter MenuHostHelper$$ExternalSyntheticLambda1;
    CharSequence SearchView$SavedState$1;
    Message ViewPager$SavedState$1;
    TextView setAdapter;
    CharSequence setAnimationFromJson;
    Handler setCheckedIconEnabled;
    Button setChipCornerRadius;
    ImageView setChipIconTintResource;
    CharSequence setConstraintSet;
    setVelocityScale setContentScrimResource;
    int setFilterTouchesWhenObscured;
    private int setFloatValues;
    View setGuidelinePercent;
    public ListView setHasDecor;
    int setIconSize;
    int setIconTintList;
    int setIconified;
    Message setLayoutAnimation;
    Drawable setMaxEms;
    final setHasDecor setMinAndMaxProgress;
    Drawable setNavigationOnClickListener;
    final Window setObjectValues;
    Button setOnLongClickListener;
    CharSequence setTextAlignment;
    Drawable setTextAppearanceResource;
    final Context setTextScaleX;
    Drawable setUiOptions;
    CharSequence setUnboundedRipple;
    View setViewTranslationCallback;
    final int setX;
    Message setZ;
    boolean setSuffixText = false;
    int setLayoutDirection = 0;
    int setOnNavigationItemSelectedListener = -1;
    int setCenterIfNoTextEnabled = 0;
    final View.OnClickListener setY = new View.OnClickListener() { // from class: o.setCheckedIconEnabled.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view == setCheckedIconEnabled.this.setChipCornerRadius) {
                Message message = setCheckedIconEnabled.this.setZ;
            }
            if (view == setCheckedIconEnabled.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                Message message2 = setCheckedIconEnabled.this.setLayoutAnimation;
            }
            if (view == setCheckedIconEnabled.this.setOnLongClickListener) {
                Message message3 = setCheckedIconEnabled.this.ViewPager$SavedState$1;
            }
            setCheckedIconEnabled.this.setCheckedIconEnabled.obtainMessage(1, setCheckedIconEnabled.this.setMinAndMaxProgress).sendToTarget();
        }
    };

    public setCheckedIconEnabled(Context context, setHasDecor sethasdecor, Window window) {
        this.setTextScaleX = context;
        this.setMinAndMaxProgress = sethasdecor;
        this.setObjectValues = window;
        this.setCheckedIconEnabled = new Handler(sethasdecor) { // from class: o.setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda1
            private WeakReference<DialogInterface> MenuHostHelper$$ExternalSyntheticLambda0;

            {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new WeakReference<>(sethasdecor);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.MenuHostHelper$$ExternalSyntheticLambda0.get(), message.what);
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, setAnimationFromJson.setY.setIconified, R.attr.res_0x7f040029, 0);
        this.setIconTintList = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setConstraintSet, 0);
        this.setIconSize = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.FragmentStateAdapter$2, 0);
        this.ExtendableSavedState$1 = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setContentScrimResource, 0);
        this.setFloatValues = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setObjectValues, 0);
        int i = setAnimationFromJson.setY.setSuffixText;
        this.FloatingActionButton$BaseBehavior = obtainStyledAttributes.getResourceId(7, 0);
        this.setIconified = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.FragmentStateAdapter$5, 0);
        this.FragmentStateAdapter$2 = obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setViewTranslationCallback, true);
        this.setX = obtainStyledAttributes.getDimensionPixelSize(setAnimationFromJson.setY.FloatingActionButton$BaseBehavior, 0);
        obtainStyledAttributes.recycle();
        sethasdecor.MenuHostHelper$$ExternalSyntheticLambda0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewGroup setY(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void setY(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* loaded from: classes.dex */
    public static class setX {
        public CharSequence ExtendableSavedState$1;
        public CharSequence SearchView$SavedState$1;
        public boolean ViewPager$SavedState$1;
        public CharSequence setAnimationFromJson;
        public Drawable setCenterIfNoTextEnabled;
        public DialogInterface.OnKeyListener setCheckedIconEnabled;
        public CharSequence setChipCornerRadius;
        public Drawable setChipIconTintResource;
        public AdapterView.OnItemSelectedListener setGuidelinePercent;
        public int setHasDecor;
        public boolean setIconSize;
        public Cursor setIconTintList;
        public View setIconified;
        public final LayoutInflater setLayoutAnimation;
        public DialogInterface.OnClickListener setLayoutDirection;
        public CharSequence setMaxEms;
        public setIconTintList setMinAndMaxProgress;
        public Drawable setNavigationOnClickListener;
        public View setOnLongClickListener;
        public Drawable setOnNavigationItemSelectedListener;
        public CharSequence[] setTextAlignment;
        public DialogInterface.OnDismissListener setTextAppearanceResource;
        public DialogInterface.OnCancelListener setTextScaleX;
        public final Context setX;
        public ListAdapter setY;
        public DialogInterface.OnMultiChoiceClickListener setZ;
        public int setUnboundedRipple = 0;
        public int setUiOptions = 0;
        private boolean FloatingActionButton$BaseBehavior = false;
        public int MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        private boolean FragmentStateAdapter$5 = true;
        public boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;

        /* loaded from: classes.dex */
        public interface setIconTintList {
        }

        public setX(Context context) {
            this.setX = context;
            this.setLayoutAnimation = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    static class setY extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }

        public setY(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }
    }
}