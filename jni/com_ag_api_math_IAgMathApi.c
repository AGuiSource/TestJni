
#include <string.h>
#include <jni.h>
//#include "com_ag_api_math_IAgMathApi.h"

//JNIEXPORT jint JNICALL Java_com_ag_api_math_IAgMathApi_add
//  (JNIEnv * env, jclass thiz, jint a, jint b)
//{
//	return a+b;
//}

jint 
Java_com_ag_api_math_IAgMathApi_add( JNIEnv* env, 
									 jclass thiz, 
									 jint a, 
									 jint b)
{
	return a+b;
}
  