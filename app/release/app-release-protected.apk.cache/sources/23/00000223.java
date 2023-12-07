package o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class ParcelableSparseArray$1 extends setForegroundTintList {
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private LayoutInflater setIconTintList;
    private int setY;

    @Deprecated
    public ParcelableSparseArray$1(Context context, int i) {
        super(context, null, true);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setY = i;
        this.setIconTintList = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // o.setForegroundTintList
    public View setIconTintList(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.setIconTintList.inflate(this.setY, viewGroup, false);
    }

    @Override // o.setForegroundTintList
    public final View setY(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.setIconTintList.inflate(this.MenuHostHelper$$ExternalSyntheticLambda1, viewGroup, false);
    }
}