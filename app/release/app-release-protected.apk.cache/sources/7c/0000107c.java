package o;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class setTitle extends ParcelableSparseArray$1 implements View.OnClickListener {
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private final androidx.appcompat.widget.SearchView ViewPager$SavedState$1;
    private int setCenterIfNoTextEnabled;
    private final SearchableInfo setChipCornerRadius;
    private int setIconSize;
    private boolean setIconTintList;
    private int setLayoutAnimation;
    private ColorStateList setMaxEms;
    private int setNavigationOnClickListener;
    private final WeakHashMap<String, Drawable.ConstantState> setOnLongClickListener;
    private int setTextAlignment;
    private final Context setUiOptions;
    private int setUnboundedRipple;
    private final int setY;

    @Override // o.setForegroundTintList, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[Catch: RuntimeException -> 0x007c, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x007c, blocks: (B:10:0x001b, B:25:0x0078, B:13:0x0021, B:16:0x0028, B:18:0x0045, B:19:0x0048, B:21:0x0053, B:23:0x005f, B:22:0x005b), top: B:30:0x001b }] */
    @Override // o.setForegroundTintList, o.setAutoLinkMask.setIconTintList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor setY(java.lang.CharSequence r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r11 != 0) goto L6
            r11 = r0
            goto La
        L6:
            java.lang.String r11 = r11.toString()
        La:
            androidx.appcompat.widget.SearchView r1 = r10.ViewPager$SavedState$1
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L84
            androidx.appcompat.widget.SearchView r1 = r10.ViewPager$SavedState$1
            int r1 = r1.getWindowVisibility()
            if (r1 != 0) goto L84
            android.app.SearchableInfo r1 = r10.setChipCornerRadius     // Catch: java.lang.RuntimeException -> L7c
            if (r1 != 0) goto L21
        L1f:
            r11 = r2
            goto L76
        L21:
            java.lang.String r3 = r1.getSuggestAuthority()     // Catch: java.lang.RuntimeException -> L7c
            if (r3 != 0) goto L28
            goto L1f
        L28:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch: java.lang.RuntimeException -> L7c
            r4.<init>()     // Catch: java.lang.RuntimeException -> L7c
            java.lang.String r5 = "content"
            android.net.Uri$Builder r4 = r4.scheme(r5)     // Catch: java.lang.RuntimeException -> L7c
            android.net.Uri$Builder r3 = r4.authority(r3)     // Catch: java.lang.RuntimeException -> L7c
            android.net.Uri$Builder r3 = r3.query(r0)     // Catch: java.lang.RuntimeException -> L7c
            android.net.Uri$Builder r0 = r3.fragment(r0)     // Catch: java.lang.RuntimeException -> L7c
            java.lang.String r3 = r1.getSuggestPath()     // Catch: java.lang.RuntimeException -> L7c
            if (r3 == 0) goto L48
            r0.appendEncodedPath(r3)     // Catch: java.lang.RuntimeException -> L7c
        L48:
            java.lang.String r3 = "search_suggest_query"
            r0.appendPath(r3)     // Catch: java.lang.RuntimeException -> L7c
            java.lang.String r7 = r1.getSuggestSelection()     // Catch: java.lang.RuntimeException -> L7c
            if (r7 == 0) goto L5b
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.RuntimeException -> L7c
            r3 = 0
            r1[r3] = r11     // Catch: java.lang.RuntimeException -> L7c
            r8 = r1
            goto L5f
        L5b:
            r0.appendPath(r11)     // Catch: java.lang.RuntimeException -> L7c
            r8 = r2
        L5f:
            java.lang.String r11 = "limit"
            java.lang.String r1 = "50"
            r0.appendQueryParameter(r11, r1)     // Catch: java.lang.RuntimeException -> L7c
            android.net.Uri r5 = r0.build()     // Catch: java.lang.RuntimeException -> L7c
            android.content.Context r11 = r10.setUiOptions     // Catch: java.lang.RuntimeException -> L7c
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.RuntimeException -> L7c
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.RuntimeException -> L7c
        L76:
            if (r11 == 0) goto L84
            r11.getCount()     // Catch: java.lang.RuntimeException -> L7c
            return r11
        L7c:
            r11 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r11)
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitle.setY(java.lang.CharSequence):android.database.Cursor");
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor y = setY();
        Bundle extras = y != null ? y.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor y = setY();
        Bundle extras = y != null ? y.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // o.setForegroundTintList, o.setAutoLinkMask.setIconTintList
    public final void setY(Cursor cursor) {
        try {
            super.setY(cursor);
            if (cursor != null) {
                this.setCenterIfNoTextEnabled = cursor.getColumnIndex("suggest_text_1");
                this.setIconSize = cursor.getColumnIndex("suggest_text_2");
                this.setTextAlignment = cursor.getColumnIndex("suggest_text_2_url");
                this.setNavigationOnClickListener = cursor.getColumnIndex("suggest_icon_1");
                this.setUnboundedRipple = cursor.getColumnIndex("suggest_icon_2");
                this.setLayoutAnimation = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // o.ParcelableSparseArray$1, o.setForegroundTintList
    public final View setIconTintList(Context context, Cursor cursor, ViewGroup viewGroup) {
        View iconTintList = super.setIconTintList(context, cursor, viewGroup);
        iconTintList.setTag(new setY(iconTintList));
        ((ImageView) iconTintList.findViewById(R.id.res_0x7f0a00bc)).setImageResource(this.setY);
        return iconTintList;
    }

    /* loaded from: classes.dex */
    static final class setY {
        public final TextView MenuHostHelper$$ExternalSyntheticLambda0;
        public final TextView MenuHostHelper$$ExternalSyntheticLambda1;
        public final ImageView setIconTintList;
        public final ImageView setX;
        public final ImageView setY;

        public setY(View view) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = (TextView) view.findViewById(16908308);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = (TextView) view.findViewById(16908309);
            this.setY = (ImageView) view.findViewById(16908295);
            this.setX = (ImageView) view.findViewById(16908296);
            this.setIconTintList = (ImageView) view.findViewById(R.id.res_0x7f0a00bc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setForegroundTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, Cursor cursor) {
        Drawable y;
        String str;
        setY sety = (setY) view.getTag();
        int i = this.setLayoutAnimation;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (sety.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            String x = setX(cursor, this.setCenterIfNoTextEnabled);
            TextView textView = sety.MenuHostHelper$$ExternalSyntheticLambda1;
            textView.setText(x);
            if (TextUtils.isEmpty(x)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (sety.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            String x2 = setX(cursor, this.setTextAlignment);
            if (x2 == null) {
                str = setX(cursor, this.setIconSize);
            } else {
                if (this.setMaxEms == null) {
                    TypedValue typedValue = new TypedValue();
                    this.setUiOptions.getTheme().resolveAttribute(R.attr.res_0x7f040431, typedValue, true);
                    this.setMaxEms = this.setUiOptions.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(x2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.setMaxEms, null), 0, x2.length(), 33);
                str = spannableString;
            }
            if (TextUtils.isEmpty(str)) {
                if (sety.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    sety.MenuHostHelper$$ExternalSyntheticLambda1.setSingleLine(false);
                    sety.MenuHostHelper$$ExternalSyntheticLambda1.setMaxLines(2);
                }
            } else if (sety.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                sety.MenuHostHelper$$ExternalSyntheticLambda1.setSingleLine(true);
                sety.MenuHostHelper$$ExternalSyntheticLambda1.setMaxLines(1);
            }
            TextView textView2 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        if (sety.setY != null) {
            ImageView imageView = sety.setY;
            int i3 = this.setNavigationOnClickListener;
            if (i3 == -1) {
                y = null;
            } else {
                y = setY(cursor.getString(i3));
                if (y == null) {
                    ComponentName searchActivity = this.setChipCornerRadius.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.setOnLongClickListener.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = this.setOnLongClickListener.get(flattenToShortString);
                        y = constantState == null ? null : constantState.newDrawable(this.setUiOptions.getResources());
                    } else {
                        y = MenuHostHelper$$ExternalSyntheticLambda1(searchActivity);
                        this.setOnLongClickListener.put(flattenToShortString, y == null ? null : y.getConstantState());
                    }
                    if (y == null) {
                        y = this.setUiOptions.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1(imageView, y, 4);
        }
        if (sety.setX != null) {
            ImageView imageView2 = sety.setX;
            int i4 = this.setUnboundedRipple;
            MenuHostHelper$$ExternalSyntheticLambda1(imageView2, i4 != -1 ? setY(cursor.getString(i4)) : null, 8);
        }
        int i5 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i5 == 2 || (i5 == 1 && (i2 & 1) != 0)) {
            sety.setIconTintList.setVisibility(0);
            sety.setIconTintList.setTag(sety.MenuHostHelper$$ExternalSyntheticLambda1.getText());
            sety.setIconTintList.setOnClickListener(this);
            return;
        }
        sety.setIconTintList.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.ViewPager$SavedState$1.setY((CharSequence) tag);
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // o.setForegroundTintList, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View iconTintList = setIconTintList(this.setUiOptions, setY(), viewGroup);
            if (iconTintList != null) {
                ((setY) iconTintList.getTag()).MenuHostHelper$$ExternalSyntheticLambda1.setText(e.toString());
            }
            return iconTintList;
        }
    }

    @Override // o.setForegroundTintList, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View y = setY(this.setUiOptions, setY(), viewGroup);
            if (y != null) {
                ((setY) y.getTag()).MenuHostHelper$$ExternalSyntheticLambda1.setText(e.toString());
            }
            return y;
        }
    }

    private Drawable setY(String str) {
        Drawable drawable;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder("android.resource://");
                sb.append(this.setUiOptions.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String obj = sb.toString();
                Drawable.ConstantState constantState = this.setOnLongClickListener.get(obj);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                drawable = this.setUiOptions.getDrawable(parseInt);
                if (drawable != null) {
                    this.setOnLongClickListener.put(obj, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                StringBuilder sb2 = new StringBuilder("Icon resource not found: ");
                sb2.append(str);
                Log.w("SuggestionsAdapter", sb2.toString());
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = this.setOnLongClickListener.get(str);
                r0 = constantState2 != null ? constantState2.newDrawable() : null;
                if (r0 != null) {
                    return r0;
                }
                r0 = MenuHostHelper$$ExternalSyntheticLambda0(Uri.parse(str));
                if (r0 != null) {
                    this.setOnLongClickListener.put(str, r0.getConstantState());
                }
            }
        }
        return r0;
    }

    private Drawable MenuHostHelper$$ExternalSyntheticLambda0(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return MenuHostHelper$$ExternalSyntheticLambda1(uri);
                } catch (Resources.NotFoundException unused) {
                    StringBuilder sb = new StringBuilder("Resource does not exist: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
            }
            InputStream openInputStream = this.setUiOptions.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                StringBuilder sb2 = new StringBuilder("Failed to open ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e) {
                StringBuilder sb3 = new StringBuilder("Error closing icon stream for ");
                sb3.append(uri);
                Log.e("SuggestionsAdapter", sb3.toString(), e);
            }
            return createFromStream;
        } catch (FileNotFoundException e2) {
            StringBuilder sb4 = new StringBuilder("Icon not found: ");
            sb4.append(uri);
            sb4.append(", ");
            sb4.append(e2.getMessage());
            Log.w("SuggestionsAdapter", sb4.toString());
            return null;
        }
        StringBuilder sb42 = new StringBuilder("Icon not found: ");
        sb42.append(uri);
        sb42.append(", ");
        sb42.append(e2.getMessage());
        Log.w("SuggestionsAdapter", sb42.toString());
        return null;
    }

    private Drawable MenuHostHelper$$ExternalSyntheticLambda1(ComponentName componentName) {
        PackageManager packageManager = this.setUiOptions.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, ((ComponentInfo) activityInfo).applicationInfo);
            if (drawable == null) {
                StringBuilder sb = new StringBuilder("Invalid icon resource ");
                sb.append(iconResource);
                sb.append(" for ");
                sb.append(componentName.flattenToShortString());
                Log.w("SuggestionsAdapter", sb.toString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String setX(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private Drawable MenuHostHelper$$ExternalSyntheticLambda1(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            StringBuilder sb = new StringBuilder("No authority: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        try {
            Resources resourcesForApplication = this.setUiOptions.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                StringBuilder sb2 = new StringBuilder("No path: ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder("Single path segment is not a resource ID: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
            } else if (size == 2) {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                StringBuilder sb4 = new StringBuilder("More than two path segments: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            }
            if (parseInt == 0) {
                StringBuilder sb5 = new StringBuilder("No resource found for: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
            return resourcesForApplication.getDrawable(parseInt);
        } catch (PackageManager.NameNotFoundException unused2) {
            StringBuilder sb6 = new StringBuilder("No package found for authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    public setTitle(Context context, androidx.appcompat.widget.SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.setChipCornerRadius);
        this.setIconTintList = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
        this.setCenterIfNoTextEnabled = -1;
        this.setIconSize = -1;
        this.setTextAlignment = -1;
        this.setNavigationOnClickListener = -1;
        this.setUnboundedRipple = -1;
        this.setLayoutAnimation = -1;
        this.ViewPager$SavedState$1 = searchView;
        this.setChipCornerRadius = searchableInfo;
        this.setY = searchView.setCenterIfNoTextEnabled;
        this.setUiOptions = context;
        this.setOnLongClickListener = weakHashMap;
    }

    @Override // o.setForegroundTintList, o.setAutoLinkMask.setIconTintList
    public final CharSequence MenuHostHelper$$ExternalSyntheticLambda1(Cursor cursor) {
        String x;
        String x2;
        if (cursor == null) {
            return null;
        }
        String x3 = setX(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (x3 != null) {
            return x3;
        }
        if (!this.setChipCornerRadius.shouldRewriteQueryFromData() || (x2 = setX(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
            if (!this.setChipCornerRadius.shouldRewriteQueryFromText() || (x = setX(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                return null;
            }
            return x;
        }
        return x2;
    }
}