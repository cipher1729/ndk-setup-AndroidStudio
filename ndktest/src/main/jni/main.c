#include "main.h"

JNIEXPORT jint JNICALL Java_com_example_cipher1729_ndktest_mainNative_callWithArguments
  (JNIEnv * env , jobject thiz, jstring deviceName, jint width, jint height)
{
    const char* dev_name = (*env)->GetStringUTFChars(env, deviceName, 0);
    (*env)->ReleaseStringUTFChars(env,deviceName,dev_name);
    return 5;
}

jint JNI_OnLoad(JavaVM* vm, void* reserved) {
  return JNI_VERSION_1_6;
}