package com.example.steganography.activities.stego;



interface StegoView {

  void showToast(int message);

  void showProgressDialog();

  void stopProgressDialog();

  void initToolbar();

  void setStegoImage(String path);
}
