package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Arrays;
import o.setBaselineAlignBottom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0559w extends FrameLayout implements Checkable {
    final C0447s MenuHostHelper$$ExternalSyntheticLambda0;
    private TextWatcher MenuHostHelper$$ExternalSyntheticLambda1;
    private TextView setIconTintList;
    final setOnCloseListener setX;
    private final EditText setY;

    public C0559w(Context context) {
        this(context, null);
    }

    public C0559w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0559w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int iconTintList;
        LayoutInflater from = LayoutInflater.from(context);
        setOnCloseListener setoncloselistener = (setOnCloseListener) from.inflate(R.layout.res_0x7f0d004d, (ViewGroup) this, false);
        this.setX = setoncloselistener;
        setoncloselistener.setAccessibilityClassName("android.view.View");
        C0447s c0447s = (C0447s) from.inflate(R.layout.res_0x7f0d004e, (ViewGroup) this, false);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0447s;
        EditText editText = c0447s.setUnboundedRipple;
        this.setY = editText;
        editText.setVisibility(4);
        w$MenuHostHelper$$ExternalSyntheticLambda0 w_menuhosthelper__externalsyntheticlambda0 = new w$MenuHostHelper$$ExternalSyntheticLambda0(this, (byte) 0);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = w_menuhosthelper__externalsyntheticlambda0;
        editText.addTextChangedListener(w_menuhosthelper__externalsyntheticlambda0);
        MenuHostHelper$$ExternalSyntheticLambda1();
        addView(setoncloselistener);
        addView(c0447s);
        this.setIconTintList = (TextView) findViewById(R.id.res_0x7f0a011c);
        iconTintList = setBaselineAlignBottom.setX.setIconTintList();
        editText.setId(iconTintList);
        setBaselineAlignBottom.setOnLongClickListener(this.setIconTintList, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.setY.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.setX.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.setX.setChecked(z);
        this.setY.setVisibility(z ? 0 : 4);
        this.setX.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            final EditText editText = this.setY;
            editText.requestFocus();
            editText.post(new Runnable() { // from class: o.setTitleMargin.5
                @Override // java.lang.Runnable
                public final void run() {
                    ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
                }
            });
            if (TextUtils.isEmpty(this.setY.getText())) {
                return;
            }
            EditText editText2 = this.setY;
            editText2.setSelection(editText2.getText().length());
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.setX.toggle();
    }

    public void setText(CharSequence charSequence) {
        this.setX.setText(D.setX(getResources(), charSequence, "%02d"));
        if (TextUtils.isEmpty(this.setY.getText())) {
            return;
        }
        this.setY.removeTextChangedListener(this.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setY.setText((CharSequence) null);
        this.setY.addTextChangedListener(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.setX.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.setX.setTag(i, obj);
    }

    public void setHelperText(CharSequence charSequence) {
        this.setIconTintList.setText(charSequence);
    }

    public void setCursorVisible(boolean z) {
        this.setY.setCursorVisible(z);
    }

    public final void setIconTintList(InputFilter inputFilter) {
        InputFilter[] filters = this.setY.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.setY.setFilters(inputFilterArr);
    }

    public void setChipDelegate(setCounterOverflowTextColor setcounteroverflowtextcolor) {
        setBaselineAlignBottom.setX(this.setX, setcounteroverflowtextcolor);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MenuHostHelper$$ExternalSyntheticLambda1();
    }
}