package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.GridLayoutManager;
import o.R;
import o.setAnimationFromJson;
import o.setBaselineAlignBottom;
import o.setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setChipSpacingVertical;
import o.setExpandedHintEnabled;
import o.setForegroundTintList;
import o.setOrientation;
import o.setTabMode;
import o.setTabRippleColor;
import o.setTitle;
import o.transact;

/* loaded from: classes.dex */
public class SearchView extends setTabRippleColor implements setChipSpacingVertical {
    static final setX MenuHostHelper$$ExternalSyntheticLambda0;
    private final TextView.OnEditorActionListener ExtendableSavedState$1;
    private CharSequence FirebaseRemoteConfigKtxRegistrar;
    private View.OnClickListener FloatingActionButton$BaseBehavior;
    private setY FragmentStateAdapter$2;
    private final WeakHashMap<String, Drawable.ConstantState> FragmentStateAdapter$5;
    final View MenuHostHelper$$ExternalSyntheticLambda1;
    private Rect RecyclerView$SavedState$1;
    private setIconTintList SearchView$SavedState$1;
    SearchableInfo ViewPager$SavedState$1;
    private boolean onActivityResumed;
    private final Drawable setAdapter;
    private boolean setAnimationFromJson;
    public final int setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    public final int setChipCornerRadius;
    private int[] setChipIconEnabled;
    private final AdapterView.OnItemClickListener setChipIconTintResource;
    private View.OnKeyListener setChipSpacingVertical;
    private CharSequence setConstraintSet;
    private final AdapterView.OnItemSelectedListener setContentScrimResource;
    private TextWatcher setError;
    private boolean setFilterTouchesWhenObscured;
    private int[] setFloatValues;
    private int setGuidelinePercent;
    private CharSequence setHasDecor;
    final setOnLongClickListener setIconSize;
    final ImageView setIconTintList;
    private final View.OnClickListener setIconified;
    private boolean setImageTintMode;
    SearchView$MenuHostHelper$$ExternalSyntheticLambda1 setLayoutAnimation;
    private boolean setLayoutDirection;
    final Intent setMaxEms;
    private boolean setMinAndMaxProgress;
    boolean setNavigationOnClickListener;
    private Runnable setObjectValues;
    final ImageView setOnLongClickListener;
    final ImageView setOnNavigationItemSelectedListener;
    private final View setSelectedChildViewEnabled;
    private setUiOptions setShrinkMotionSpec;
    private Rect setSuffixText;
    setForegroundTintList setTextAlignment;
    private final CharSequence setTextAppearanceResource;
    final Intent setTextScaleX;
    private final Runnable setTitleMarginEnd;
    final View setUiOptions;
    View.OnFocusChangeListener setUnboundedRipple;
    private final View setViewTranslationCallback;
    final ImageView setX;
    Bundle setY;
    private final ImageView setZ;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        boolean setIconTintList();
    }

    /* loaded from: classes.dex */
    public interface setY {
        boolean MenuHostHelper$$ExternalSyntheticLambda0();
    }

    static {
        MenuHostHelper$$ExternalSyntheticLambda0 = Build.VERSION.SDK_INT < 29 ? new setX() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04038a);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setSuffixText = new Rect();
        this.RecyclerView$SavedState$1 = new Rect();
        this.setFloatValues = new int[2];
        this.setChipIconEnabled = new int[2];
        this.setTitleMarginEnd = new Runnable() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.setChipCornerRadius();
            }
        };
        this.setObjectValues = new Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (SearchView.this.setTextAlignment instanceof setTitle) {
                    SearchView.this.setTextAlignment.setY((Cursor) null);
                }
            }
        };
        this.FragmentStateAdapter$5 = new WeakHashMap<>();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == SearchView.this.setOnLongClickListener) {
                    SearchView.this.setUnboundedRipple();
                } else if (view == SearchView.this.setX) {
                    SearchView.this.MenuHostHelper$$ExternalSyntheticLambda0();
                } else if (view == SearchView.this.setIconTintList) {
                    SearchView.this.ViewPager$SavedState$1();
                } else if (view == SearchView.this.setOnNavigationItemSelectedListener) {
                    SearchView searchView = SearchView.this;
                    SearchableInfo searchableInfo = searchView.ViewPager$SavedState$1;
                    if (searchableInfo != null) {
                        try {
                            String str = null;
                            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                    Intent intent = searchView.setTextScaleX;
                                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                                    Intent intent2 = new Intent("android.intent.action.SEARCH");
                                    intent2.setComponent(searchActivity);
                                    PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent2, 1107296256);
                                    Bundle bundle = new Bundle();
                                    Bundle bundle2 = searchView.setY;
                                    if (bundle2 != null) {
                                        bundle.putParcelable("app_data", bundle2);
                                    }
                                    Intent intent3 = new Intent(intent);
                                    Resources resources = searchView.getResources();
                                    String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
                                    String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                                    String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                                    int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
                                    intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
                                    intent3.putExtra("android.speech.extra.PROMPT", string2);
                                    intent3.putExtra("android.speech.extra.LANGUAGE", string3);
                                    intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                                    if (searchActivity != null) {
                                        str = searchActivity.flattenToShortString();
                                    }
                                    intent3.putExtra("calling_package", str);
                                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                    searchView.getContext().startActivity(intent3);
                                    return;
                                }
                                return;
                            }
                            Intent intent4 = new Intent(searchView.setMaxEms);
                            ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                            if (searchActivity2 != null) {
                                str = searchActivity2.flattenToShortString();
                            }
                            intent4.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent4);
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                        }
                    }
                } else if (view == SearchView.this.setIconSize) {
                    SearchView.this.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
        };
        this.setIconified = onClickListener;
        this.setChipSpacingVertical = new View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (SearchView.this.ViewPager$SavedState$1 == null) {
                    return false;
                }
                if (SearchView.this.setIconSize.isPopupShowing() && SearchView.this.setIconSize.getListSelection() != -1) {
                    SearchView searchView = SearchView.this;
                    if (searchView.ViewPager$SavedState$1 != null && searchView.setTextAlignment != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                        if (i2 == 66 || i2 == 84 || i2 == 61) {
                            return searchView.setY(searchView.setIconSize.getListSelection());
                        }
                        if (i2 == 21 || i2 == 22) {
                            searchView.setIconSize.setSelection(i2 == 21 ? 0 : searchView.setIconSize.length());
                            searchView.setIconSize.setListSelection(0);
                            searchView.setIconSize.clearListSelection();
                            searchView.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1();
                            return true;
                        } else if (i2 == 19) {
                            searchView.setIconSize.getListSelection();
                        }
                    }
                    return false;
                }
                if (!(TextUtils.getTrimmedLength(SearchView.this.setIconSize.getText()) == 0) && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.getContext().startActivity(searchView2.setY("android.intent.action.SEARCH", null, null, searchView2.setIconSize.getText().toString(), 0, null));
                    return true;
                }
                return false;
            }
        };
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.ViewPager$SavedState$1();
                return true;
            }
        };
        this.ExtendableSavedState$1 = onEditorActionListener;
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView.this.setY(i2);
            }
        };
        this.setChipIconTintResource = onItemClickListener;
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView searchView = SearchView.this;
                SearchView$MenuHostHelper$$ExternalSyntheticLambda1 searchView$MenuHostHelper$$ExternalSyntheticLambda1 = searchView.setLayoutAnimation;
                if (searchView$MenuHostHelper$$ExternalSyntheticLambda1 == null || !searchView$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
                    Editable text = searchView.setIconSize.getText();
                    Cursor cursor = searchView.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (cursor != null) {
                        if (cursor.moveToPosition(i2)) {
                            CharSequence MenuHostHelper$$ExternalSyntheticLambda1 = searchView.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(cursor);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                                searchView.setY(MenuHostHelper$$ExternalSyntheticLambda1);
                                return;
                            } else {
                                searchView.setY(text);
                                return;
                            }
                        }
                        searchView.setY(text);
                    }
                }
            }
        };
        this.setContentScrimResource = onItemSelectedListener;
        this.setError = new TextWatcher() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.MenuHostHelper$$ExternalSyntheticLambda0(charSequence);
            }
        };
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda02 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, setAnimationFromJson.setY.setNextFocusDownId, i, 0);
        setBaselineAlignBottom.setY(this, context, setAnimationFromJson.setY.setNextFocusDownId, attributeSet, MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(), i, 0);
        LayoutInflater.from(context).inflate(MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(setAnimationFromJson.setY.onAppEnteredBackground, R.layout.res_0x7f0d0019), (ViewGroup) this, true);
        setOnLongClickListener setonlongclicklistener = (setOnLongClickListener) findViewById(R.id.res_0x7f0a01a6);
        this.setIconSize = setonlongclicklistener;
        setonlongclicklistener.setIconTintList = this;
        this.setViewTranslationCallback = findViewById(R.id.res_0x7f0a01a1);
        View findViewById = findViewById(R.id.res_0x7f0a01a5);
        this.setUiOptions = findViewById;
        View findViewById2 = findViewById(R.id.res_0x7f0a01d5);
        this.setSelectedChildViewEnabled = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.res_0x7f0a019e);
        this.setOnLongClickListener = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.res_0x7f0a01a3);
        this.setIconTintList = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.res_0x7f0a01a0);
        this.setX = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.res_0x7f0a01a8);
        this.setOnNavigationItemSelectedListener = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.res_0x7f0a01a4);
        this.setZ = imageView5;
        int i2 = setAnimationFromJson.setY.getLoadPriority;
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(findViewById, MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(10));
        int i3 = setAnimationFromJson.setY.setHapticFeedbackEnabled;
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(findViewById2, MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(14));
        imageView.setImageDrawable(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setShortcut));
        imageView2.setImageDrawable(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setHasNonEmbeddedTabs));
        imageView3.setImageDrawable(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setStatusBarBackground));
        imageView4.setImageDrawable(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setRootWindowInsets));
        imageView5.setImageDrawable(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setShortcut));
        this.setAdapter = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setHorizontalScrollBarEnabled);
        transact.setIconTintList(imageView, getResources().getString(R.string.res_0x7f140015));
        this.setChipCornerRadius = MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(setAnimationFromJson.setY.setCompatHoveredFocusedTranslationZ, R.layout.res_0x7f0d0018);
        this.setCenterIfNoTextEnabled = MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener(setAnimationFromJson.setY.setOnConstraintsChanged, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        setonlongclicklistener.setOnClickListener(onClickListener);
        setonlongclicklistener.addTextChangedListener(this.setError);
        setonlongclicklistener.setOnEditorActionListener(onEditorActionListener);
        setonlongclicklistener.setOnItemClickListener(onItemClickListener);
        setonlongclicklistener.setOnItemSelectedListener(onItemSelectedListener);
        setonlongclicklistener.setOnKeyListener(this.setChipSpacingVertical);
        setonlongclicklistener.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.setUnboundedRipple != null) {
                    SearchView.this.setUnboundedRipple.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList(setAnimationFromJson.setY.setPrefixTextAppearance, true));
        int y = MenuHostHelper$$ExternalSyntheticLambda02.setY(setAnimationFromJson.setY.setFrame, -1);
        if (y != -1) {
            setMaxWidth(y);
        }
        this.setTextAppearanceResource = MenuHostHelper$$ExternalSyntheticLambda02.setUnboundedRipple(setAnimationFromJson.setY.setStepSize);
        this.setConstraintSet = MenuHostHelper$$ExternalSyntheticLambda02.setUnboundedRipple(setAnimationFromJson.setY.setDividerHeight);
        int MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setMinWidthResource, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda03 != -1) {
            setImeOptions(MenuHostHelper$$ExternalSyntheticLambda03);
        }
        int MenuHostHelper$$ExternalSyntheticLambda04 = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setErrorShown, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda04 != -1) {
            setInputType(MenuHostHelper$$ExternalSyntheticLambda04);
        }
        setFocusable(MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList(setAnimationFromJson.setY.setFabAnchorMode, true));
        MenuHostHelper$$ExternalSyntheticLambda02.setX();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.setMaxEms = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.setTextScaleX = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(setonlongclicklistener.getDropDownAnchor());
        this.MenuHostHelper$$ExternalSyntheticLambda1 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    int i12;
                    SearchView searchView = SearchView.this;
                    if (searchView.MenuHostHelper$$ExternalSyntheticLambda1.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.setUiOptions.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean MenuHostHelper$$ExternalSyntheticLambda05 = setTabMode.MenuHostHelper$$ExternalSyntheticLambda0(searchView);
                        int dimensionPixelSize = searchView.setNavigationOnClickListener ? resources.getDimensionPixelSize(R.dimen.res_0x7f070029) + resources.getDimensionPixelSize(R.dimen.res_0x7f07002a) : 0;
                        searchView.setIconSize.getDropDownBackground().getPadding(rect);
                        if (MenuHostHelper$$ExternalSyntheticLambda05) {
                            i12 = -rect.left;
                        } else {
                            i12 = paddingLeft - (rect.left + dimensionPixelSize);
                        }
                        searchView.setIconSize.setDropDownHorizontalOffset(i12);
                        searchView.setIconSize.setDropDownWidth((((searchView.MenuHostHelper$$ExternalSyntheticLambda1.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    }
                }
            });
        }
        setX(this.setNavigationOnClickListener);
        String textScaleX = setTextScaleX();
        this.setIconSize.setHint(MenuHostHelper$$ExternalSyntheticLambda1(textScaleX == null ? "" : textScaleX));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (getContext().getPackageManager().resolveActivity(r1, 65536) != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.ViewPager$SavedState$1 = r7
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L7c
            androidx.appcompat.widget.SearchView$setOnLongClickListener r3 = r6.setIconSize
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$setOnLongClickListener r7 = r6.setIconSize
            android.app.SearchableInfo r3 = r6.ViewPager$SavedState$1
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.ViewPager$SavedState$1
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r2) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.ViewPager$SavedState$1
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r0
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$setOnLongClickListener r3 = r6.setIconSize
            r3.setInputType(r7)
            o.setForegroundTintList r7 = r6.setTextAlignment
            if (r7 == 0) goto L42
            r7.setY(r1)
        L42:
            android.app.SearchableInfo r7 = r6.ViewPager$SavedState$1
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            o.setTitle r7 = new o.setTitle
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.ViewPager$SavedState$1
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.FragmentStateAdapter$5
            r7.<init>(r3, r6, r4, r5)
            r6.setTextAlignment = r7
            androidx.appcompat.widget.SearchView$setOnLongClickListener r3 = r6.setIconSize
            r3.setAdapter(r7)
            o.setForegroundTintList r7 = r6.setTextAlignment
            o.setTitle r7 = (o.setTitle) r7
            boolean r3 = r6.setFilterTouchesWhenObscured
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            r7.MenuHostHelper$$ExternalSyntheticLambda1 = r3
        L6b:
            java.lang.CharSequence r7 = r6.setTextScaleX()
            androidx.appcompat.widget.SearchView$setOnLongClickListener r3 = r6.setIconSize
            if (r7 != 0) goto L75
            java.lang.String r7 = ""
        L75:
            java.lang.CharSequence r7 = r6.MenuHostHelper$$ExternalSyntheticLambda1(r7)
            r3.setHint(r7)
        L7c:
            android.app.SearchableInfo r7 = r6.ViewPager$SavedState$1
            r3 = 0
            if (r7 == 0) goto Lad
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto Lad
            android.app.SearchableInfo r7 = r6.ViewPager$SavedState$1
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L92
            android.content.Intent r1 = r6.setMaxEms
            goto L9c
        L92:
            android.app.SearchableInfo r7 = r6.ViewPager$SavedState$1
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L9c
            android.content.Intent r1 = r6.setTextScaleX
        L9c:
            if (r1 == 0) goto Lad
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r1, r0)
            if (r7 == 0) goto Lad
            goto Lae
        Lad:
            r2 = 0
        Lae:
            r6.onActivityResumed = r2
            if (r2 == 0) goto Lb9
            androidx.appcompat.widget.SearchView$setOnLongClickListener r7 = r6.setIconSize
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lb9:
            boolean r7 = r6.setLayoutDirection
            r6.setX(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setAppSearchData(Bundle bundle) {
        this.setY = bundle;
    }

    public void setImeOptions(int i) {
        this.setIconSize.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.setIconSize.setInputType(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.setAnimationFromJson && isFocusable()) {
            if (!this.setLayoutDirection) {
                boolean requestFocus = this.setIconSize.requestFocus(i, rect);
                if (requestFocus) {
                    setX(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.setAnimationFromJson = true;
        super.clearFocus();
        this.setIconSize.clearFocus();
        this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(false);
        this.setAnimationFromJson = false;
    }

    public void setOnQueryTextListener(setY sety) {
        this.FragmentStateAdapter$2 = sety;
    }

    public void setOnCloseListener(setIconTintList seticontintlist) {
        this.SearchView$SavedState$1 = seticontintlist;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.setUnboundedRipple = onFocusChangeListener;
    }

    public void setOnSuggestionListener(SearchView$MenuHostHelper$$ExternalSyntheticLambda1 searchView$MenuHostHelper$$ExternalSyntheticLambda1) {
        this.setLayoutAnimation = searchView$MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.FloatingActionButton$BaseBehavior = onClickListener;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.setIconSize.setText(charSequence);
        if (charSequence != null) {
            setOnLongClickListener setonlongclicklistener = this.setIconSize;
            setonlongclicklistener.setSelection(setonlongclicklistener.length());
            this.FirebaseRemoteConfigKtxRegistrar = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        ViewPager$SavedState$1();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.setConstraintSet = charSequence;
        CharSequence textScaleX = setTextScaleX();
        setOnLongClickListener setonlongclicklistener = this.setIconSize;
        if (textScaleX == null) {
            textScaleX = "";
        }
        setonlongclicklistener.setHint(MenuHostHelper$$ExternalSyntheticLambda1(textScaleX));
    }

    private CharSequence setTextScaleX() {
        CharSequence charSequence = this.setConstraintSet;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.ViewPager$SavedState$1;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.ViewPager$SavedState$1.getHintId());
            }
            return this.setTextAppearanceResource;
        }
        return charSequence;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.setNavigationOnClickListener == z) {
            return;
        }
        this.setNavigationOnClickListener = z;
        setX(z);
        CharSequence textScaleX = setTextScaleX();
        setOnLongClickListener setonlongclicklistener = this.setIconSize;
        if (textScaleX == null) {
            textScaleX = "";
        }
        setonlongclicklistener.setHint(MenuHostHelper$$ExternalSyntheticLambda1(textScaleX));
    }

    public void setIconified(boolean z) {
        if (z) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            setUnboundedRipple();
        }
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.setImageTintMode = z;
        setX(this.setLayoutDirection);
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.setFilterTouchesWhenObscured = z;
        setForegroundTintList setforegroundtintlist = this.setTextAlignment;
        if (setforegroundtintlist instanceof setTitle) {
            ((setTitle) setforegroundtintlist).MenuHostHelper$$ExternalSyntheticLambda1 = z ? 2 : 1;
        }
    }

    public void setSuggestionsAdapter(setForegroundTintList setforegroundtintlist) {
        this.setTextAlignment = setforegroundtintlist;
        this.setIconSize.setAdapter(setforegroundtintlist);
    }

    public void setMaxWidth(int i) {
        this.setCheckedIconEnabled = i;
        requestLayout();
    }

    @Override // o.setTabRippleColor, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            setOnLongClickListener setonlongclicklistener = this.setIconSize;
            Rect rect = this.setSuffixText;
            setonlongclicklistener.getLocationInWindow(this.setFloatValues);
            getLocationInWindow(this.setChipIconEnabled);
            int[] iArr = this.setFloatValues;
            int i5 = iArr[1];
            int[] iArr2 = this.setChipIconEnabled;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, setonlongclicklistener.getWidth() + i7, setonlongclicklistener.getHeight() + i6);
            this.RecyclerView$SavedState$1.set(this.setSuffixText.left, 0, this.setSuffixText.right, i4 - i2);
            setUiOptions setuioptions = this.setShrinkMotionSpec;
            if (setuioptions == null) {
                setUiOptions setuioptions2 = new setUiOptions(this.RecyclerView$SavedState$1, this.setSuffixText, this.setIconSize);
                this.setShrinkMotionSpec = setuioptions2;
                setTouchDelegate(setuioptions2);
                return;
            }
            setuioptions.setIconTintList(this.RecyclerView$SavedState$1, this.setSuffixText);
        }
    }

    private void setX(boolean z) {
        this.setLayoutDirection = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.setIconSize.getText());
        this.setOnLongClickListener.setVisibility(i2);
        setIconTintList(z2);
        this.setViewTranslationCallback.setVisibility(z ? 8 : 0);
        this.setZ.setVisibility((this.setZ.getDrawable() == null || this.setNavigationOnClickListener) ? 8 : 8);
        setTextAlignment();
        setY(!z2);
        setIconSize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.onActivityResumed == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setIconTintList(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.setImageTintMode
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.onActivityResumed
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.setLayoutDirection
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.onActivityResumed
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.setIconTintList
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setIconTintList(boolean):void");
    }

    private void setTextAlignment() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.setIconSize.getText());
        if (!z2 && (!this.setNavigationOnClickListener || this.setMinAndMaxProgress)) {
            z = false;
        }
        this.setX.setVisibility(z ? 0 : 8);
        Drawable drawable = this.setX.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    final void setChipCornerRadius() {
        int[] iArr = this.setIconSize.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.setUiOptions.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.setSelectedChildViewEnabled.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.setTitleMarginEnd);
        post(this.setObjectValues);
        super.onDetachedFromWindow();
    }

    private CharSequence MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        if (!this.setNavigationOnClickListener || this.setAdapter == null) {
            return charSequence;
        }
        int textSize = (int) (this.setIconSize.getTextSize() * 1.25d);
        this.setAdapter.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.setAdapter), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void setY(boolean z) {
        int i = 8;
        if (this.onActivityResumed && !this.setLayoutDirection && z) {
            this.setIconTintList.setVisibility(8);
            i = 0;
        }
        this.setOnNavigationItemSelectedListener.setVisibility(i);
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence) {
        Editable text = this.setIconSize.getText();
        this.FirebaseRemoteConfigKtxRegistrar = text;
        boolean z = !TextUtils.isEmpty(text);
        setIconTintList(z);
        setY(!z);
        setTextAlignment();
        setIconSize();
        if (this.FragmentStateAdapter$2 != null) {
            TextUtils.equals(charSequence, this.setHasDecor);
        }
        this.setHasDecor = charSequence.toString();
    }

    final void ViewPager$SavedState$1() {
        Editable text = this.setIconSize.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        setY sety = this.FragmentStateAdapter$2;
        if (sety == null || !sety.MenuHostHelper$$ExternalSyntheticLambda0()) {
            if (this.ViewPager$SavedState$1 != null) {
                getContext().startActivity(setY("android.intent.action.SEARCH", null, null, text.toString(), 0, null));
            }
            this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(false);
            this.setIconSize.dismissDropDown();
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (TextUtils.isEmpty(this.setIconSize.getText())) {
            if (this.setNavigationOnClickListener) {
                setIconTintList seticontintlist = this.SearchView$SavedState$1;
                if (seticontintlist == null || !seticontintlist.setIconTintList()) {
                    clearFocus();
                    setX(true);
                    return;
                }
                return;
            }
            return;
        }
        this.setIconSize.setText("");
        this.setIconSize.requestFocus();
        this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(true);
    }

    final void setUnboundedRipple() {
        setX(false);
        this.setIconSize.requestFocus();
        this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(true);
        View.OnClickListener onClickListener = this.FloatingActionButton$BaseBehavior;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.setTitleMarginEnd);
    }

    @Override // o.setChipSpacingVertical
    public final void setIconTintList() {
        setQuery("", false);
        clearFocus();
        setX(true);
        this.setIconSize.setImeOptions(this.setGuidelinePercent);
        this.setMinAndMaxProgress = false;
    }

    @Override // o.setChipSpacingVertical
    public final void setX() {
        if (this.setMinAndMaxProgress) {
            return;
        }
        this.setMinAndMaxProgress = true;
        int imeOptions = this.setIconSize.getImeOptions();
        this.setGuidelinePercent = imeOptions;
        this.setIconSize.setImeOptions(imeOptions | 33554432);
        this.setIconSize.setText("");
        setIconified(false);
    }

    /* loaded from: classes.dex */
    static class setUnboundedRipple extends setOrientation {
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private static byte[] setX = {25, -104, -116, 103, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
        public static final int setY = 99;
        public static final Parcelable.Creator<setUnboundedRipple> CREATOR = new Parcelable.ClassLoaderCreator<setUnboundedRipple>() { // from class: androidx.appcompat.widget.SearchView$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SearchView.setUnboundedRipple(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ SearchView.setUnboundedRipple createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SearchView.setUnboundedRipple(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SearchView.setUnboundedRipple[i];
            }
        };

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                byte[] r0 = androidx.appcompat.widget.SearchView.setUnboundedRipple.setX
                int r8 = 106 - r8
                int r7 = r7 * 4
                int r7 = r7 + 16
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L34
            L18:
                r3 = 0
            L19:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L34:
                int r9 = r9 + r7
                int r7 = r9 + 2
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setUnboundedRipple.a(byte, short, int, java.lang.Object[]):void");
        }

        setUnboundedRipple(Parcelable parcelable) {
            super(parcelable);
        }

        public setUnboundedRipple(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // o.setOrientation, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            try {
                Object[] objArr = {this};
                byte b = (byte) (setX[5] + 1);
                Object[] objArr2 = new Object[1];
                a((byte) 14, b, b, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b2 = setX[5];
                Object[] objArr3 = new Object[1];
                a(b2, (byte) (b2 + 1), (byte) (-setX[5]), objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append(" isIconified=");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                sb.append("}");
                return sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        setUnboundedRipple setunboundedripple = new setUnboundedRipple(super.onSaveInstanceState());
        setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0 = this.setLayoutDirection;
        return setunboundedripple;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setUnboundedRipple)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setUnboundedRipple setunboundedripple = (setUnboundedRipple) parcelable;
        super.onRestoreInstanceState(setunboundedripple.setUiOptions);
        setX(setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0);
        requestLayout();
    }

    final boolean setY(int i) {
        SearchView$MenuHostHelper$$ExternalSyntheticLambda1 searchView$MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation;
        if (searchView$MenuHostHelper$$ExternalSyntheticLambda1 == null || !searchView$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1()) {
            setX(i);
            this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(false);
            this.setIconSize.dismissDropDown();
            return true;
        }
        return false;
    }

    private boolean setX(int i) {
        Cursor cursor = this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0;
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        Intent iconTintList = setIconTintList(cursor, 0, null);
        if (iconTintList != null) {
            try {
                getContext().startActivity(iconTintList);
                return true;
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder("Failed launch activity: ");
                sb.append(iconTintList);
                Log.e("SearchView", sb.toString(), e);
                return true;
            }
        }
        return true;
    }

    public final void setY(CharSequence charSequence) {
        this.setIconSize.setText(charSequence);
        this.setIconSize.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    final Intent setY(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.FirebaseRemoteConfigKtxRegistrar);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.setY;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.ViewPager$SavedState$1.getSearchActivity());
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        r0 = o.setTitle.setX(r8, r8.getColumnIndex("suggest_intent_data_id"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.Intent setIconTintList(android.database.Cursor r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            r9 = 0
            java.lang.String r10 = "suggest_intent_action"
            java.lang.String r10 = o.setTitle.MenuHostHelper$$ExternalSyntheticLambda1(r8, r10)     // Catch: java.lang.RuntimeException -> L61
            if (r10 != 0) goto Lf
            android.app.SearchableInfo r10 = r7.ViewPager$SavedState$1     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r10 = r10.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L61
        Lf:
            if (r10 != 0) goto L13
            java.lang.String r10 = "android.intent.action.SEARCH"
        L13:
            r1 = r10
            java.lang.String r10 = "suggest_intent_data"
            java.lang.String r10 = o.setTitle.MenuHostHelper$$ExternalSyntheticLambda1(r8, r10)     // Catch: java.lang.RuntimeException -> L61
            if (r10 != 0) goto L22
            android.app.SearchableInfo r10 = r7.ViewPager$SavedState$1     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r10 = r10.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L61
        L22:
            if (r10 == 0) goto L44
            java.lang.String r0 = "suggest_intent_data_id"
            java.lang.String r0 = o.setTitle.MenuHostHelper$$ExternalSyntheticLambda1(r8, r0)     // Catch: java.lang.RuntimeException -> L61
            if (r0 == 0) goto L44
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L61
            r2.<init>()     // Catch: java.lang.RuntimeException -> L61
            r2.append(r10)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r10 = "/"
            r2.append(r10)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r10 = android.net.Uri.encode(r0)     // Catch: java.lang.RuntimeException -> L61
            r2.append(r10)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r10 = r2.toString()     // Catch: java.lang.RuntimeException -> L61
        L44:
            if (r10 != 0) goto L48
            r2 = r9
            goto L4d
        L48:
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.RuntimeException -> L61
            r2 = r10
        L4d:
            java.lang.String r10 = "suggest_intent_query"
            java.lang.String r4 = o.setTitle.MenuHostHelper$$ExternalSyntheticLambda1(r8, r10)     // Catch: java.lang.RuntimeException -> L61
            java.lang.String r10 = "suggest_intent_extra_data"
            java.lang.String r3 = o.setTitle.MenuHostHelper$$ExternalSyntheticLambda1(r8, r10)     // Catch: java.lang.RuntimeException -> L61
            r5 = 0
            r6 = 0
            r0 = r7
            android.content.Intent r8 = r0.setY(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L61
            return r8
        L61:
            r10 = move-exception
            int r8 = r8.getPosition()     // Catch: java.lang.RuntimeException -> L67
            goto L68
        L67:
            r8 = -1
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Search suggestions cursor at row "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = " returned exception."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "SearchView"
            android.util.Log.w(r0, r8, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setIconTintList(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (Build.VERSION.SDK_INT >= 29) {
            SearchView$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setIconSize);
            return;
        }
        setX setx = MenuHostHelper$$ExternalSyntheticLambda0;
        setOnLongClickListener setonlongclicklistener = this.setIconSize;
        if (Build.VERSION.SDK_INT < 29) {
            Method method = setx.setX;
            if (method != null) {
                try {
                    method.invoke(setonlongclicklistener, new Object[0]);
                } catch (Exception unused) {
                }
            }
            setOnLongClickListener setonlongclicklistener2 = this.setIconSize;
            if (Build.VERSION.SDK_INT < 29) {
                Method method2 = setx.MenuHostHelper$$ExternalSyntheticLambda0;
                if (method2 != null) {
                    try {
                        method2.invoke(setonlongclicklistener2, new Object[0]);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }

    static boolean MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* loaded from: classes.dex */
    static class setUiOptions extends TouchDelegate {
        private final View MenuHostHelper$$ExternalSyntheticLambda0;
        private final Rect MenuHostHelper$$ExternalSyntheticLambda1;
        private final Rect setIconTintList;
        private final Rect setUnboundedRipple;
        private final int setX;
        private boolean setY;

        public setUiOptions(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.setX = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.setUnboundedRipple = new Rect();
            this.setIconTintList = new Rect();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new Rect();
            setIconTintList(rect, rect2);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = view;
        }

        public final void setIconTintList(Rect rect, Rect rect2) {
            this.setUnboundedRipple.set(rect);
            this.setIconTintList.set(rect);
            Rect rect3 = this.setIconTintList;
            int i = -this.setX;
            rect3.inset(i, i);
            this.MenuHostHelper$$ExternalSyntheticLambda1.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action == 0) {
                if (this.setUnboundedRipple.contains(x, y)) {
                    this.setY = true;
                    z = true;
                }
                z = false;
            } else if (action == 1 || action == 2) {
                z = this.setY;
                if (z && !this.setIconTintList.contains(x, y)) {
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z = this.setY;
                    this.setY = false;
                }
                z = false;
            }
            if (z) {
                if (z2 && !this.MenuHostHelper$$ExternalSyntheticLambda1.contains(x, y)) {
                    motionEvent.setLocation(this.MenuHostHelper$$ExternalSyntheticLambda0.getWidth() / 2, this.MenuHostHelper$$ExternalSyntheticLambda0.getHeight() / 2);
                } else {
                    motionEvent.setLocation(x - this.MenuHostHelper$$ExternalSyntheticLambda1.left, y - this.MenuHostHelper$$ExternalSyntheticLambda1.top);
                }
                return this.MenuHostHelper$$ExternalSyntheticLambda0.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class setOnLongClickListener extends GridLayoutManager {
        final Runnable MenuHostHelper$$ExternalSyntheticLambda0;
        SearchView setIconTintList;
        private int setX;
        boolean setY;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public setOnLongClickListener(Context context) {
            this(context, null);
        }

        public setOnLongClickListener(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.res_0x7f040039);
        }

        public setOnLongClickListener(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.setOnLongClickListener.4
                @Override // java.lang.Runnable
                public final void run() {
                    setOnLongClickListener setonlongclicklistener = setOnLongClickListener.this;
                    if (setonlongclicklistener.setY) {
                        ((InputMethodManager) setonlongclicklistener.getContext().getSystemService("input_method")).showSoftInput(setonlongclicklistener, 0);
                        setonlongclicklistener.setY = false;
                    }
                }
            };
            this.setX = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : 256, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.setX = i;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.setIconTintList.hasFocus() && getVisibility() == 0) {
                this.setY = true;
                if (SearchView.MenuHostHelper$$ExternalSyntheticLambda0(getContext())) {
                    MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.setIconTintList.setCenterIfNoTextEnabled();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.setX <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.setIconTintList.clearFocus();
                        MenuHostHelper$$ExternalSyntheticLambda0(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // o.GridLayoutManager, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.setY) {
                removeCallbacks(this.MenuHostHelper$$ExternalSyntheticLambda0);
                post(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return onCreateInputConnection;
        }

        final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.setY = false;
                removeCallbacks(this.MenuHostHelper$$ExternalSyntheticLambda0);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.setY = false;
                removeCallbacks(this.MenuHostHelper$$ExternalSyntheticLambda0);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.setY = true;
            }
        }

        final void MenuHostHelper$$ExternalSyntheticLambda1() {
            if (Build.VERSION.SDK_INT >= 29) {
                SearchView$MenuHostHelper$$ExternalSyntheticLambda0.setY(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        Method MenuHostHelper$$ExternalSyntheticLambda0;
        private Method setIconTintList;
        Method setX;

        setX() {
            this.setX = null;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            this.setIconTintList = null;
            if (Build.VERSION.SDK_INT < 29) {
                try {
                    Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                    this.setX = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused2) {
                }
                try {
                    Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                    this.setIconTintList = method;
                    method.setAccessible(true);
                    return;
                } catch (NoSuchMethodException unused3) {
                    return;
                }
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        final void MenuHostHelper$$ExternalSyntheticLambda1(AutoCompleteTextView autoCompleteTextView) {
            if (Build.VERSION.SDK_INT < 29) {
                Method method = this.setIconTintList;
                if (method != null) {
                    try {
                        method.invoke(autoCompleteTextView, Boolean.TRUE);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    private void setIconSize() {
        int i = 0;
        if (!((this.setImageTintMode || this.onActivityResumed) && !this.setLayoutDirection) || (this.setIconTintList.getVisibility() != 0 && this.setOnNavigationItemSelectedListener.getVisibility() != 0)) {
            i = 8;
        }
        this.setSelectedChildViewEnabled.setVisibility(i);
    }

    @Override // o.setTabRippleColor, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.setLayoutDirection) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.setCheckedIconEnabled;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.res_0x7f070037), size);
        } else if (mode == 0) {
            size = this.setCheckedIconEnabled;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(R.dimen.res_0x7f070037);
            }
        } else if (mode == 1073741824 && (i3 = this.setCheckedIconEnabled) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(R.dimen.res_0x7f070036), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(R.dimen.res_0x7f070036);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    final void setCenterIfNoTextEnabled() {
        setX(this.setLayoutDirection);
        post(this.setTitleMarginEnd);
        if (this.setIconSize.hasFocus()) {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }
}