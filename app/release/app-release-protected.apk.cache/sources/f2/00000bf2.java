package o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import o.setAutoLinkMask;

/* loaded from: classes.dex */
public abstract class setForegroundTintList extends BaseAdapter implements Filterable, setAutoLinkMask.setIconTintList {
    private Context MenuHostHelper$$ExternalSyntheticLambda1;
    private FilterQueryProvider setLayoutAnimation;
    private setAutoLinkMask setOnLongClickListener;
    private boolean setY = true;
    public Cursor MenuHostHelper$$ExternalSyntheticLambda0 = null;
    protected boolean setX = false;
    private int setNavigationOnClickListener = -1;
    private setForegroundTintList$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new ContentObserver() { // from class: o.setForegroundTintList$MenuHostHelper$$ExternalSyntheticLambda1
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            setForegroundTintList.this.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    };
    private DataSetObserver setUnboundedRipple = new setY();

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(View view, Cursor cursor);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public abstract View setIconTintList(Context context, Cursor cursor, ViewGroup viewGroup);

    /* JADX WARN: Type inference failed for: r1v2, types: [o.setForegroundTintList$MenuHostHelper$$ExternalSyntheticLambda1] */
    public setForegroundTintList(Context context, Cursor cursor, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
    }

    @Override // o.setAutoLinkMask.setIconTintList
    public final Cursor setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.setX || (cursor = this.MenuHostHelper$$ExternalSyntheticLambda0) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.setX || (cursor = this.MenuHostHelper$$ExternalSyntheticLambda0) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.setX && (cursor = this.MenuHostHelper$$ExternalSyntheticLambda0) != null && cursor.moveToPosition(i)) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.getLong(this.setNavigationOnClickListener);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.setX) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0.moveToPosition(i)) {
            StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        if (view == null) {
            view = setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0, viewGroup);
        }
        MenuHostHelper$$ExternalSyntheticLambda0(view, this.MenuHostHelper$$ExternalSyntheticLambda0);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.setX) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.moveToPosition(i);
            if (view == null) {
                view = setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0, viewGroup);
            }
            MenuHostHelper$$ExternalSyntheticLambda0(view, this.MenuHostHelper$$ExternalSyntheticLambda0);
            return view;
        }
        return null;
    }

    public View setY(Context context, Cursor cursor, ViewGroup viewGroup) {
        return setIconTintList(context, cursor, viewGroup);
    }

    @Override // o.setAutoLinkMask.setIconTintList
    public CharSequence MenuHostHelper$$ExternalSyntheticLambda1(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // o.setAutoLinkMask.setIconTintList
    public Cursor setY(CharSequence charSequence) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.setOnLongClickListener == null) {
            this.setOnLongClickListener = new setAutoLinkMask(this);
        }
        return this.setOnLongClickListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        Cursor cursor;
        if (!this.setY || (cursor = this.MenuHostHelper$$ExternalSyntheticLambda0) == null || cursor.isClosed()) {
            return;
        }
        this.setX = this.MenuHostHelper$$ExternalSyntheticLambda0.requery();
    }

    /* loaded from: classes.dex */
    class setY extends DataSetObserver {
        setY() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            setForegroundTintList.this.setX = true;
            setForegroundTintList.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            setForegroundTintList.this.setX = false;
            setForegroundTintList.this.notifyDataSetInvalidated();
        }
    }

    @Override // o.setAutoLinkMask.setIconTintList
    public void setY(Cursor cursor) {
        Cursor cursor2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                setForegroundTintList$MenuHostHelper$$ExternalSyntheticLambda1 setforegroundtintlist_menuhosthelper__externalsyntheticlambda1 = this.setIconTintList;
                if (setforegroundtintlist_menuhosthelper__externalsyntheticlambda1 != null) {
                    cursor2.unregisterContentObserver(setforegroundtintlist_menuhosthelper__externalsyntheticlambda1);
                }
                DataSetObserver dataSetObserver = this.setUnboundedRipple;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = cursor;
            if (cursor != null) {
                setForegroundTintList$MenuHostHelper$$ExternalSyntheticLambda1 setforegroundtintlist_menuhosthelper__externalsyntheticlambda12 = this.setIconTintList;
                if (setforegroundtintlist_menuhosthelper__externalsyntheticlambda12 != null) {
                    cursor.registerContentObserver(setforegroundtintlist_menuhosthelper__externalsyntheticlambda12);
                }
                DataSetObserver dataSetObserver2 = this.setUnboundedRipple;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.setNavigationOnClickListener = cursor.getColumnIndexOrThrow("_id");
                this.setX = true;
                notifyDataSetChanged();
            } else {
                this.setNavigationOnClickListener = -1;
                this.setX = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}