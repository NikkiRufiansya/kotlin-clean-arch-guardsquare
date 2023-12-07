package o;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
final class setAutoLinkMask extends Filter {
    private setIconTintList setY;

    /* loaded from: classes.dex */
    interface setIconTintList {
        CharSequence MenuHostHelper$$ExternalSyntheticLambda1(Cursor cursor);

        Cursor setY();

        Cursor setY(CharSequence charSequence);

        void setY(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAutoLinkMask(setIconTintList seticontintlist) {
        this.setY = seticontintlist;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda1((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor y = this.setY.setY(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (y != null) {
            filterResults.count = y.getCount();
            filterResults.values = y;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor y = this.setY.setY();
        if (filterResults.values == null || filterResults.values == y) {
            return;
        }
        this.setY.setY((Cursor) filterResults.values);
    }
}