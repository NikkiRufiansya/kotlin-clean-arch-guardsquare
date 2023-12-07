package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class setLastBaselineToBottomHeight implements getPropertyName {
    int MenuHostHelper$$ExternalSyntheticLambda0;
    public int setChipCornerRadius;
    setSupportButtonTintList setUnboundedRipple;
    public getPropertyName setIconSize = null;
    public boolean setY = false;
    public boolean setLayoutAnimation = false;
    setLastBaselineToBottomHeight$MenuHostHelper$$ExternalSyntheticLambda1 setUiOptions = setLastBaselineToBottomHeight$MenuHostHelper$$ExternalSyntheticLambda1.UNKNOWN;
    int MenuHostHelper$$ExternalSyntheticLambda1 = 1;
    setItemTextAppearanceActive setX = null;
    public boolean setOnLongClickListener = false;
    List<getPropertyName> setIconTintList = new ArrayList();
    List<setLastBaselineToBottomHeight> setNavigationOnClickListener = new ArrayList();

    public setLastBaselineToBottomHeight(setSupportButtonTintList setsupportbuttontintlist) {
        this.setUnboundedRipple = setsupportbuttontintlist;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setUnboundedRipple.setIconSize.setOnNavigationItemSelectedListener);
        sb.append(":");
        sb.append(this.setUiOptions);
        sb.append("(");
        sb.append(this.setOnLongClickListener ? Integer.valueOf(this.setChipCornerRadius) : "unresolved");
        sb.append(") <t=");
        sb.append(this.setNavigationOnClickListener.size());
        sb.append(":d=");
        sb.append(this.setIconTintList.size());
        sb.append(">");
        return sb.toString();
    }

    public void setX(int i) {
        if (this.setOnLongClickListener) {
            return;
        }
        this.setOnLongClickListener = true;
        this.setChipCornerRadius = i;
        for (getPropertyName getpropertyname : this.setIconTintList) {
            getpropertyname.setLayoutAnimation();
        }
    }

    @Override // o.getPropertyName
    public final void setLayoutAnimation() {
        for (setLastBaselineToBottomHeight setlastbaselinetobottomheight : this.setNavigationOnClickListener) {
            if (!setlastbaselinetobottomheight.setOnLongClickListener) {
                return;
            }
        }
        this.setLayoutAnimation = true;
        getPropertyName getpropertyname = this.setIconSize;
        if (getpropertyname != null) {
            getpropertyname.setLayoutAnimation();
        }
        if (this.setY) {
            this.setUnboundedRipple.setLayoutAnimation();
            return;
        }
        setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = null;
        int i = 0;
        for (setLastBaselineToBottomHeight setlastbaselinetobottomheight3 : this.setNavigationOnClickListener) {
            if (!(setlastbaselinetobottomheight3 instanceof setItemTextAppearanceActive)) {
                i++;
                setlastbaselinetobottomheight2 = setlastbaselinetobottomheight3;
            }
        }
        if (setlastbaselinetobottomheight2 != null && i == 1 && setlastbaselinetobottomheight2.setOnLongClickListener) {
            setItemTextAppearanceActive setitemtextappearanceactive = this.setX;
            if (setitemtextappearanceactive != null) {
                if (!setitemtextappearanceactive.setOnLongClickListener) {
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1 * setitemtextappearanceactive.setChipCornerRadius;
            }
            setX(setlastbaselinetobottomheight2.setChipCornerRadius + this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        getPropertyName getpropertyname2 = this.setIconSize;
        if (getpropertyname2 != null) {
            getpropertyname2.setLayoutAnimation();
        }
    }

    public final void setY() {
        this.setNavigationOnClickListener.clear();
        this.setIconTintList.clear();
        this.setOnLongClickListener = false;
        this.setChipCornerRadius = 0;
        this.setLayoutAnimation = false;
        this.setY = false;
    }
}