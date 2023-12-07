package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import o.setBackgroundTintMode;
import o.setBaselineAlignBottom;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public View MenuHostHelper$$ExternalSyntheticLambda0;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final int setCenterIfNoTextEnabled;
    private final int setIconSize;
    public setChipIconEnabledResource setIconTintList;
    private final PopupWindow.OnDismissListener setLayoutAnimation;
    private final setNavigationIconTint setNavigationOnClickListener;
    private final Context setOnLongClickListener;
    private int setUiOptions;
    private final boolean setUnboundedRipple;
    public setBackgroundTintMode.setY setX;
    PopupWindow.OnDismissListener setY;

    public RemoteActionCompatParcelizer(Context context, setNavigationIconTint setnavigationicontint, View view, boolean z, int i) {
        this(context, setnavigationicontint, view, z, R.attr.res_0x7f040022, 0);
    }

    public RemoteActionCompatParcelizer(Context context, setNavigationIconTint setnavigationicontint, View view, boolean z, int i, int i2) {
        this.setUiOptions = 8388611;
        this.setLayoutAnimation = new PopupWindow.OnDismissListener() { // from class: o.RemoteActionCompatParcelizer.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                RemoteActionCompatParcelizer.this.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        };
        this.setOnLongClickListener = context;
        this.setNavigationOnClickListener = setnavigationicontint;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = view;
        this.setUnboundedRipple = z;
        this.setIconSize = i;
        this.setCenterIfNoTextEnabled = i2;
    }

    public final void setX() {
        this.setUiOptions = 8388613;
    }

    public final setChipIconEnabledResource setIconTintList() {
        setChipIconEnabledResource seterroricontintlist;
        Display defaultDisplay = ((WindowManager) this.setOnLongClickListener.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        RemoteActionCompatParcelizer$MenuHostHelper$$ExternalSyntheticLambda0.setX(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.setOnLongClickListener.getResources().getDimensionPixelSize(R.dimen.res_0x7f070016)) {
            seterroricontintlist = new createDispatcher(this.setOnLongClickListener, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconSize, this.setCenterIfNoTextEnabled, this.setUnboundedRipple);
        } else {
            seterroricontintlist = new setErrorIconTintList(this.setOnLongClickListener, this.setNavigationOnClickListener, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconSize, this.setCenterIfNoTextEnabled, this.setUnboundedRipple);
        }
        seterroricontintlist.setY(this.setNavigationOnClickListener);
        seterroricontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation);
        seterroricontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
        seterroricontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
        seterroricontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
        seterroricontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.setUiOptions);
        return seterroricontintlist;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setIconTintList = null;
        PopupWindow.OnDismissListener onDismissListener = this.setY;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i, int i2, boolean z, boolean z2) {
        int x;
        int absoluteGravity;
        if (this.setIconTintList == null) {
            this.setIconTintList = setIconTintList();
        }
        setChipIconEnabledResource setchipiconenabledresource = this.setIconTintList;
        setchipiconenabledresource.setY(z2);
        if (z) {
            int i3 = this.setUiOptions;
            x = setBaselineAlignBottom.setX.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            absoluteGravity = Gravity.getAbsoluteGravity(i3, x);
            if ((absoluteGravity & 7) == 5) {
                i -= this.MenuHostHelper$$ExternalSyntheticLambda0.getWidth();
            }
            setchipiconenabledresource.setX(i);
            setchipiconenabledresource.MenuHostHelper$$ExternalSyntheticLambda0(i2);
            int i4 = (int) ((this.setOnLongClickListener.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            setchipiconenabledresource.setUnboundedRipple = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        setchipiconenabledresource.setLayoutAnimation();
    }

    public final void setY() {
        setChipIconEnabledResource setchipiconenabledresource = this.setIconTintList;
        if (setchipiconenabledresource != null && setchipiconenabledresource.setUnboundedRipple()) {
            this.setIconTintList.setIconTintList();
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        setChipIconEnabledResource setchipiconenabledresource = this.setIconTintList;
        if (setchipiconenabledresource != null && setchipiconenabledresource.setUnboundedRipple()) {
            return true;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return false;
        }
        setX(0, 0, false, false);
        return true;
    }
}