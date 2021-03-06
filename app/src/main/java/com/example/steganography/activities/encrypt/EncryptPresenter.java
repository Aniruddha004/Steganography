package com.example.steganography.activities.encrypt;

interface EncryptPresenter {

  void selectImage(int type, String path);

  void selectImageCamera(int type);

  void encryptText();

  void encryptImage();
}
