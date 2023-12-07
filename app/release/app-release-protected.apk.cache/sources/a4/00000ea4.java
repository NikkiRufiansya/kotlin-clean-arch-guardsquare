package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.setHighlights;

/* loaded from: classes.dex */
public final class setPreferKeepClearRects {
    public static void setX(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setX.setX(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static Drawable[] setY(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static ActionMode.Callback MenuHostHelper$$ExternalSyntheticLambda1(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof setOnLongClickListener) || callback == null) ? callback : new setOnLongClickListener(callback, textView);
    }

    public static ActionMode.Callback MenuHostHelper$$ExternalSyntheticLambda1(ActionMode.Callback callback) {
        return (!(callback instanceof setOnLongClickListener) || Build.VERSION.SDK_INT < 26) ? callback : ((setOnLongClickListener) callback).MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* loaded from: classes.dex */
    public static class setOnLongClickListener implements ActionMode.Callback {
        private Class<?> MenuHostHelper$$ExternalSyntheticLambda0;
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setIconTintList = false;
        private final TextView setOnLongClickListener;
        private Method setX;
        private final ActionMode.Callback setY;

        setOnLongClickListener(ActionMode.Callback callback, TextView textView) {
            this.setY = callback;
            this.setOnLongClickListener = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.setY.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            setIconTintList(menu);
            return this.setY.onPrepareActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.setY.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.setY.onDestroyActionMode(actionMode);
        }

        ActionMode.Callback MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setY;
        }

        private void setIconTintList(Menu menu) {
            Method declaredMethod;
            Context context = this.setOnLongClickListener.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.setIconTintList) {
                this.setIconTintList = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = cls;
                    this.setX = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
                    this.setX = null;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                }
            }
            try {
                if (this.MenuHostHelper$$ExternalSyntheticLambda1 && this.MenuHostHelper$$ExternalSyntheticLambda0.isInstance(menu)) {
                    declaredMethod = this.setX;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> iconTintList = setIconTintList(context, packageManager);
                for (int i = 0; i < iconTintList.size(); i++) {
                    ResolveInfo resolveInfo = iconTintList.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(setIconTintList(resolveInfo, this.setOnLongClickListener)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private List<ResolveInfo> setIconTintList(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(setX(), 0)) {
                    if (MenuHostHelper$$ExternalSyntheticLambda1(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        private boolean MenuHostHelper$$ExternalSyntheticLambda1(ResolveInfo resolveInfo, Context context) {
            int checkSelfPermission;
            if (context.getPackageName().equals(((PackageItemInfo) resolveInfo.activityInfo).packageName)) {
                return true;
            }
            if (((ComponentInfo) resolveInfo.activityInfo).exported) {
                if (resolveInfo.activityInfo.permission != null) {
                    checkSelfPermission = context.checkSelfPermission(resolveInfo.activityInfo.permission);
                    return checkSelfPermission == 0;
                }
                return true;
            }
            return false;
        }

        private Intent setIconTintList(ResolveInfo resolveInfo, TextView textView) {
            return setX().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !setY(textView)).setClassName(((PackageItemInfo) resolveInfo.activityInfo).packageName, ((PackageItemInfo) resolveInfo.activityInfo).name);
        }

        private boolean setY(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private Intent setX() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    public static void setY(TextView textView, int i) {
        boolean includeFontPadding;
        int i2;
        if (i >= 0) {
            if (Build.VERSION.SDK_INT < 28) {
                Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
                includeFontPadding = textView.getIncludeFontPadding();
                if (includeFontPadding) {
                    i2 = fontMetricsInt.top;
                } else {
                    i2 = fontMetricsInt.ascent;
                }
                if (i > Math.abs(i2)) {
                    textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
                    return;
                }
                return;
            }
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void setIconTintList(TextView textView, int i) {
        boolean includeFontPadding;
        int i2;
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            includeFontPadding = textView.getIncludeFontPadding();
            if (includeFontPadding) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int setX(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(TextView textView, int i) {
        if (i >= 0) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing(i - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.setHighlights$setX$MenuHostHelper$$ExternalSyntheticLambda0] */
    public static setHighlights.setX setIconTintList(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new setHighlights.setX(setY.setX(textView));
        }
        ?? r0 = new Object(new TextPaint(textView.getPaint())) { // from class: o.setHighlights$setX$MenuHostHelper$$ExternalSyntheticLambda0
            private TextDirectionHeuristic MenuHostHelper$$ExternalSyntheticLambda0;
            private int MenuHostHelper$$ExternalSyntheticLambda1;
            private int setIconTintList;
            private final TextPaint setX;

            {
                this.setX = r2;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
                    this.setIconTintList = 1;
                } else {
                    this.setIconTintList = 0;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public setHighlights$setX$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1(int i) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
                return this;
            }

            public setHighlights$setX$MenuHostHelper$$ExternalSyntheticLambda0 setY(int i) {
                this.setIconTintList = i;
                return this;
            }

            public setHighlights$setX$MenuHostHelper$$ExternalSyntheticLambda0 setY(TextDirectionHeuristic textDirectionHeuristic) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = textDirectionHeuristic;
                return this;
            }

            public setHighlights.setX MenuHostHelper$$ExternalSyntheticLambda1() {
                return new setHighlights.setX(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList);
            }
        };
        if (Build.VERSION.SDK_INT >= 23) {
            r0.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList.setY(textView));
            r0.setY(textView.getHyphenationFrequency());
        }
        r0.setY(setNavigationOnClickListener(textView));
        return r0.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(TextView textView, setHighlights.setX setx) {
        setX.setY(textView, setIconTintList(setx.MenuHostHelper$$ExternalSyntheticLambda1()));
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = setx.setX().getTextScaleX();
            textView.getPaint().set(setx.setX());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(setx.setX());
        setIconTintList.setY(textView, setx.MenuHostHelper$$ExternalSyntheticLambda0());
        setIconTintList.setIconTintList(textView, setx.setY());
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(TextView textView, setHighlights sethighlights) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(sethighlights.setY());
        } else if (!setIconTintList(textView).setIconTintList(sethighlights.setIconTintList())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        } else {
            textView.setText(sethighlights);
        }
    }

    private static TextDirectionHeuristic setNavigationOnClickListener(TextView textView) {
        DecimalFormatSymbols decimalFormatSymbols;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            boolean z = setX.setX(textView) == 1;
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }
        decimalFormatSymbols = DecimalFormatSymbols.getInstance(setX.setIconTintList(textView));
        byte directionality = Character.getDirectionality(setY.setY(decimalFormatSymbols)[0].codePointAt(0));
        if (directionality == 1 || directionality == 2) {
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }

    private static int setIconTintList(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(TextView textView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 24) {
            setIconTintList.setIconTintList(textView, colorStateList);
        } else if (textView instanceof setHorizontalScrollbarTrackDrawable) {
            ((setHorizontalScrollbarTrackDrawable) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(TextView textView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 24) {
            setIconTintList.setY(textView, mode);
        } else if (textView instanceof setHorizontalScrollbarTrackDrawable) {
            ((setHorizontalScrollbarTrackDrawable) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* loaded from: classes.dex */
    public static class setX {
        static void setX(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        static int setX(View view) {
            return view.getLayoutDirection();
        }

        static void setY(View view, int i) {
            view.setTextDirection(i);
        }

        static Locale setIconTintList(TextView textView) {
            return textView.getTextLocale();
        }
    }

    /* loaded from: classes.dex */
    public static class setY {
        static PrecomputedText.Params setX(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static String[] setY(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        static int setY(TextView textView) {
            return textView.getBreakStrategy();
        }

        static void setY(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        static void setIconTintList(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }

        static void setIconTintList(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void setY(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }
    }
}