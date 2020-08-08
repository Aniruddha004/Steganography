package com.example.steganography.activities.stego;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.steganography.R;
import com.example.steganography.utils.Constants;
import com.example.steganography.utils.HelperMethods;
import com.example.steganography.utils.StandardMethods;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StegoActivity extends AppCompatActivity implements StegoView {


  @BindView(R.id.ivStegoImage)
  ImageView ivStegoImage;

  @OnClick({R.id.bStegoSave, R.id.bStegoShare})
  public void onClick(View view) {
    //(TODO) Implement onClick
  }


  private ProgressDialog progressDialog;
  private Bitmap stegoImage;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_stego);

    ButterKnife.bind(this);

    Intent intent = getIntent();
    if (intent != null) {
      byte[] byteArrayExtra = intent.getByteArrayExtra(Constants.EXTRA_STEGO_IMAGE_ARRAY);
      stegoImage = HelperMethods.byteArrayToBitmap(byteArrayExtra);
      setStegoImage(stegoImage);
      ivStegoImage.setImageBitmap(stegoImage);
    }

    initToolbar();
    progressDialog = new ProgressDialog(StegoActivity.this);
    progressDialog.setMessage("Please wait...");
  }

  @Override
  public void initToolbar() {
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
      actionBar.setDisplayHomeAsUpEnabled(true);
    }
  }

  @Override
  public Bitmap getStegoImage() {
    return stegoImage;
  }

  @Override
  public void setStegoImage(Bitmap stegoImage) {
    this.stegoImage = stegoImage;
  }

  @Override
  public void showToast(int message) {
    StandardMethods.showToast(this, message);
  }

  @Override
  public void showProgressDialog() {
    if (progressDialog != null && !progressDialog.isShowing()) {
      progressDialog.show();
    }
  }

  @Override
  public void stopProgressDialog() {
    if (progressDialog != null && progressDialog.isShowing()) {
      progressDialog.dismiss();
    }
  }
}