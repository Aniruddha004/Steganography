package com.example.steganography.activities.encrypt;

import android.content.Context;
import android.graphics.Bitmap;

import com.example.steganography.algorithms.Embedding;
import com.example.steganography.utils.StandardMethods;

public class EncryptInteractorImpl implements EncryptInteractor {

  private Context context;
  private EncryptInteractorListener listener;

  EncryptInteractorImpl(Context context, EncryptInteractorListener listener) {
    this.context = context;
    this.listener = listener;
  }

  @Override
  public void performSteganography(String message, Bitmap coverImage, Bitmap secretImage) {
    if (secretImage == null) {
      encryptSecretMessage(message, coverImage);
    } else {
      encryptSecretImage(coverImage, secretImage);
    }
  }

  private void encryptSecretMessage(String message, Bitmap coverImage) {
    Bitmap stegoImage = Embedding.embedSecretText(message, coverImage);
    if (stegoImage != null) {
      listener.onPerformSteganographySuccessful(stegoImage);
    } else {
      listener.onPerformSteganographyFailure();
    }
  }

  private void encryptSecretImage(Bitmap coverImage, Bitmap secretImage) {
    Bitmap stegoImage = Embedding.embedSecretImage(coverImage, secretImage);
    if(stegoImage != null) {
      listener.onPerformSteganographySuccessful(stegoImage);
    } else {
      listener.onPerformSteganographyFailure();
    }
  }

  interface EncryptInteractorListener {

    void onPerformSteganographySuccessful(Bitmap stegoImage);

    void onPerformSteganographyFailure();
  }
}