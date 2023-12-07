package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
class SearchView$MenuHostHelper$$ExternalSyntheticLambda0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(SearchView.setOnLongClickListener setonlongclicklistener, int i) {
        setonlongclicklistener.setInputMethodMode(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }
}