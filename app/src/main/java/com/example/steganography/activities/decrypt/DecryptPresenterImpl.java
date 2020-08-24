package com.example.steganography.activities.decrypt;

import java.io.File;



class DecryptPresenterImpl implements DecryptPresenter {

  private DecryptView mView;
  private String stegoImagePath = "";

  DecryptPresenterImpl(DecryptView decryptView) {
    this.mView = decryptView;
  }

  @Override
  public void selectImage(String path) {
    mView.showProgressDialog();

    File stegoFile = new File(path);

    stegoImagePath = path;

    mView.setStegoImage(stegoFile);
  }

  @Override
  public void decryptMessage() {

  }
}
