package o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import o.ActivityResultRegistry$1;

/* loaded from: classes.dex */
public final class ActivityResultRegistry$1 {
    public final setIconTintList setIconTintList;

    /* loaded from: classes.dex */
    public static class setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda0() {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        }

        TransformationMethod setIconTintList(TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        public void setX(boolean z) {
        }

        public InputFilter[] setY(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }
    }

    public ActivityResultRegistry$1(final TextView textView) {
        if (textView != null) {
            this.setIconTintList = new setIconTintList(textView) { // from class: o.ActivityResultRegistry$1$MenuHostHelper$$ExternalSyntheticLambda0
                private final ActivityResultRegistry$1.setY MenuHostHelper$$ExternalSyntheticLambda0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = new ActivityResultRegistry$1.setY(textView);
                }

                private boolean setIconTintList() {
                    return !setScrollContainer.setX();
                }

                @Override // o.ActivityResultRegistry$1.setIconTintList
                void MenuHostHelper$$ExternalSyntheticLambda0() {
                    if (setIconTintList()) {
                        return;
                    }
                    this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // o.ActivityResultRegistry$1.setIconTintList
                public InputFilter[] setY(InputFilter[] inputFilterArr) {
                    return setIconTintList() ? inputFilterArr : this.MenuHostHelper$$ExternalSyntheticLambda0.setY(inputFilterArr);
                }

                @Override // o.ActivityResultRegistry$1.setIconTintList
                TransformationMethod setIconTintList(TransformationMethod transformationMethod) {
                    return setIconTintList() ? transformationMethod : this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(transformationMethod);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // o.ActivityResultRegistry$1.setIconTintList
                public void setX(boolean z) {
                    if (setIconTintList()) {
                        return;
                    }
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setX(z);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // o.ActivityResultRegistry$1.setIconTintList
                public void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
                    if (setIconTintList()) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(z);
                    } else {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(z);
                    }
                }
            };
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }

    /* loaded from: classes.dex */
    static class setY extends setIconTintList {
        private final TextView MenuHostHelper$$ExternalSyntheticLambda1;
        private final setContentScrimColor setX;
        private boolean setY = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(TextView textView) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = textView;
            this.setX = new setContentScrimColor(textView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.ActivityResultRegistry$1.setIconTintList
        public void MenuHostHelper$$ExternalSyntheticLambda0() {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setTransformationMethod(setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1.getTransformationMethod()));
        }

        private void setIconTintList() {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setFilters(setY(this.MenuHostHelper$$ExternalSyntheticLambda1.getFilters()));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.ActivityResultRegistry$1.setIconTintList
        public InputFilter[] setY(InputFilter[] inputFilterArr) {
            if (!this.setY) {
                return MenuHostHelper$$ExternalSyntheticLambda0(inputFilterArr);
            }
            return setIconTintList(inputFilterArr);
        }

        private InputFilter[] setIconTintList(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.setX) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.setX;
            return inputFilterArr2;
        }

        private InputFilter[] MenuHostHelper$$ExternalSyntheticLambda0(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(inputFilterArr);
            if (MenuHostHelper$$ExternalSyntheticLambda1.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - MenuHostHelper$$ExternalSyntheticLambda1.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (MenuHostHelper$$ExternalSyntheticLambda1.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> MenuHostHelper$$ExternalSyntheticLambda1(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof setContentScrimColor) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.ActivityResultRegistry$1.setIconTintList
        public TransformationMethod setIconTintList(TransformationMethod transformationMethod) {
            if (this.setY) {
                return MenuHostHelper$$ExternalSyntheticLambda1(transformationMethod);
            }
            return setX(transformationMethod);
        }

        private TransformationMethod setX(TransformationMethod transformationMethod) {
            return transformationMethod instanceof setCheckedIconMargin ? ((setCheckedIconMargin) transformationMethod).setY : transformationMethod;
        }

        private TransformationMethod MenuHostHelper$$ExternalSyntheticLambda1(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof setCheckedIconMargin) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new setCheckedIconMargin(transformationMethod);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.ActivityResultRegistry$1.setIconTintList
        public void setX(boolean z) {
            if (z) {
                MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.ActivityResultRegistry$1.setIconTintList
        public void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
            this.setY = z;
            MenuHostHelper$$ExternalSyntheticLambda0();
            setIconTintList();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void setIconTintList(boolean z) {
            this.setY = z;
        }
    }
}