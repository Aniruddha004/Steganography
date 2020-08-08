// Generated code from Butter Knife. Do not modify!
package com.example.steganography.encrypt;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.steganography.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EncryptActivity_ViewBinding implements Unbinder {
  private EncryptActivity target;

  private View view7f07004b;

  private View view7f07004c;

  private View view7f070061;

  private View view7f070060;

  private View view7f070023;

  @UiThread
  public EncryptActivity_ViewBinding(EncryptActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EncryptActivity_ViewBinding(final EncryptActivity target, View source) {
    this.target = target;

    View view;
    target.etSecretMessage = Utils.findRequiredViewAsType(source, R.id.etSecretMessage, "field 'etSecretMessage'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ivCoverImage, "field 'ivCoverImage' and method 'onCoverSecretImageClick'");
    target.ivCoverImage = Utils.castView(view, R.id.ivCoverImage, "field 'ivCoverImage'", ImageView.class);
    view7f07004b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCoverSecretImageClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ivSecretImage, "field 'ivSecretImage' and method 'onCoverSecretImageClick'");
    target.ivSecretImage = Utils.castView(view, R.id.ivSecretImage, "field 'ivSecretImage'", ImageView.class);
    view7f07004c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCoverSecretImageClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rbText, "field 'rbText' and method 'onRadioButtonClick'");
    target.rbText = Utils.castView(view, R.id.rbText, "field 'rbText'", RadioButton.class);
    view7f070061 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onRadioButtonClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.rbImage, "field 'rbImage' and method 'onRadioButtonClick'");
    target.rbImage = Utils.castView(view, R.id.rbImage, "field 'rbImage'", RadioButton.class);
    view7f070060 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onRadioButtonClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.bEncrypt, "method 'onButtonClick'");
    view7f070023 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    EncryptActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etSecretMessage = null;
    target.ivCoverImage = null;
    target.ivSecretImage = null;
    target.rbText = null;
    target.rbImage = null;

    view7f07004b.setOnClickListener(null);
    view7f07004b = null;
    view7f07004c.setOnClickListener(null);
    view7f07004c = null;
    ((CompoundButton) view7f070061).setOnCheckedChangeListener(null);
    view7f070061 = null;
    ((CompoundButton) view7f070060).setOnCheckedChangeListener(null);
    view7f070060 = null;
    view7f070023.setOnClickListener(null);
    view7f070023 = null;
  }
}
