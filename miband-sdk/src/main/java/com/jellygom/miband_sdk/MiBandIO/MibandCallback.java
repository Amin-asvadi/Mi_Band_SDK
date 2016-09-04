package com.jellygom.miband_sdk.MiBandIO;

/**
 * Create  : Iyeonghun
 * Date    : 2016. 9. 1.
 * Content : CallBack 인터페이스
 */
public interface MibandCallback {

  int STATUS_SEARCH_DEVICE = 0xF2;
  int STATUS_CONNECT = 0xF3;
  int STATUS_SEND_ALERT = 0xF5;
  int STATUS_GET_USERINFO = 0xF1;
  int STATUS_SET_USERINFO = 0xF4;
  int STATUS_START_HEARTRATE_SCAN = 0xF6;

  void onSuccess(Object data, int status);

  void onFail(int errorCode, String msg, int status);
}
