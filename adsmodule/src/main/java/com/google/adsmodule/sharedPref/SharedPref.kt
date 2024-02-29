package com.google.adsmodule.sharedPref

import android.content.Context


import android.annotation.SuppressLint
import android.content.SharedPreferences
import com.google.adsmodule.R


class AdsSharedPref private constructor(private val context: Context) {

    companion object {
        const val SHARED_PREF_ADS = "jeniAdsSetup1110"

        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: AdsSharedPref? = null

        fun getInstance(context: Context): AdsSharedPref {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: AdsSharedPref(context).also { INSTANCE = it }
            }
        }
    }

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(SHARED_PREF_ADS, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()

    // Admob's keys
    private val NativeAdvancedAdsGoogleAdmob = "NativeAdvancedAdsPrefGoogleAdmob"
    private val InterstitialAdsGoogleAdmob = "InterstitialAdsPreGoogleAdmob"
    private val AppOpenAdsGoogleAdmob = "AppOpenAdsPrefBackPro"
    private val BannerAdsGoogleAdmob = "BannerAdsPrefGoogleAdmob"

    // Facebook's keys
    private val NativeAdvancedAdsFaceBook = "NativeAdvancedAdsPrefFaceBook"
    private val InterstitialAdsFaceBook = "InterstitialAdsPreFaceBook"
    private val BannerAdsFaceBook = "BannerAdsPrefFaceBook"

    // Admob's methods
    fun setNativeAdvancedAdsGoogleAdmobPrf(banner_ads_id: String) {
        editor.putString(NativeAdvancedAdsGoogleAdmob, banner_ads_id).apply()
    }

    fun setInterstitialAdsGoogleAdmobPrf(interstitial_ads_id: String) {
        editor.putString(InterstitialAdsGoogleAdmob, interstitial_ads_id).apply()
    }

    fun setAppOpenAdsGoogleAdmobPrf(appOpen_ads_id: String) {
        editor.putString(AppOpenAdsGoogleAdmob, appOpen_ads_id).apply()
    }

    fun setBannerAdsGoogleAdmobPrf(banner_ads_id: String) {
        editor.putString(BannerAdsGoogleAdmob, banner_ads_id).apply()
    }

    fun getNativeAdvancedAdsGoogleAdmob(): String {
        return if (!getABoolean(FirebaseConfigConst.APP_IS_LIVE_MODE) || sharedPreferences.getString(NativeAdvancedAdsGoogleAdmob, null) == null)
            context.getString(R.string.str_native_admob_google)
        else sharedPreferences.getString(NativeAdvancedAdsGoogleAdmob, null) ?: ""
    }

    fun getInterstitialAdsGoogleAdmob(): String {
        return if (!getABoolean(FirebaseConfigConst.APP_IS_LIVE_MODE) || sharedPreferences.getString(InterstitialAdsGoogleAdmob, null) == null)
            context.getString(R.string.str_interstitial_admob_google)
        else sharedPreferences.getString(InterstitialAdsGoogleAdmob, null) ?: ""
    }

    fun getAppOpenAdsGoogleAdmob(): String {
        return if (!getABoolean(FirebaseConfigConst.APP_IS_LIVE_MODE) || sharedPreferences.getString(AppOpenAdsGoogleAdmob, null) == null)
            context.getString(R.string.str_app_open_admob_google)
        else sharedPreferences.getString(AppOpenAdsGoogleAdmob, null) ?: ""
    }

    fun getBannerAdsGoogleAdmob(): String {
        return if (!getABoolean(FirebaseConfigConst.APP_IS_LIVE_MODE) || sharedPreferences.getString(BannerAdsGoogleAdmob, null) == null)
            context.getString(R.string.str_banner_admob_google)
        else sharedPreferences.getString(BannerAdsGoogleAdmob, null) ?: ""
    }

    // Facebook's methods
    fun setNativeAdvancedAdsFaceBookPrf(banner_ads_id: String) {
        editor.putString(NativeAdvancedAdsFaceBook, banner_ads_id).apply()
    }

    fun setInterstitialAdsFaceBookPrf(interstitial_ads_id: String) {
        editor.putString(InterstitialAdsFaceBook, interstitial_ads_id).apply()
    }

    fun setBannerAdsFaceBookPrf(banner_ads_id: String) {
        editor.putString(BannerAdsFaceBook, banner_ads_id).apply()
    }

    fun getNativeAdvancedAdsFaceBook(): String {
        return if (!getABoolean(FirebaseConfigConst.APP_IS_LIVE_MODE) || sharedPreferences.getString(NativeAdvancedAdsFaceBook, null) == null)
            context.getString(R.string.str_fb_native_facebook)
        else sharedPreferences.getString(NativeAdvancedAdsFaceBook, null) ?: ""
    }

    fun getInterstitialAdsFaceBook(): String {
        return if (!getABoolean(FirebaseConfigConst.APP_IS_LIVE_MODE) || sharedPreferences.getString(InterstitialAdsFaceBook, null) == null)
            context.getString(R.string.str_interstitial_facebook)
        else sharedPreferences.getString(InterstitialAdsFaceBook, null) ?: ""
    }

    fun getBannerAdsFaceBook(): String {
        return if (!getABoolean(FirebaseConfigConst.APP_IS_LIVE_MODE) || sharedPreferences.getString(BannerAdsFaceBook, null) == null)
            context.getString(R.string.str_banner_90_facebook)
        else sharedPreferences.getString(BannerAdsFaceBook, null) ?: ""
    }

    // Other common methods
    fun getBackPressInterShow(): Boolean {
        return sharedPreferences.getBoolean(FirebaseConfigConst.IS_BACK_PRESS_INTER_SHOW, false)
    }

    fun setBackPressInterShow(is_boolean_value: Boolean) {
        editor.putBoolean(FirebaseConfigConst.IS_BACK_PRESS_INTER_SHOW, is_boolean_value).apply()
    }

    fun setSkipAdsActivityArray(skipArrayValue: String) {
        editor.putString(FirebaseConfigConst.SKIP_ADS_ACTIVITY_ARRAY, skipArrayValue).apply()
    }

    fun getSkipAdsActivityArray(): String {
        return sharedPreferences.getString(FirebaseConfigConst.SKIP_ADS_ACTIVITY_ARRAY, "") ?: ""
    }

    // Use For Original SharedPreferences
    fun setInteger(integer: String, is_boolean_value: Int) {
        editor.putInt(integer, is_boolean_value).apply()
    }

    fun getInt(IsBooleanKey: String): Int {
        return sharedPreferences.getInt(IsBooleanKey, 1)
    }

    fun setString(sharedKey: String, strValue: String) {
        editor.putString(sharedKey, strValue).apply()
    }

    fun getString(sharedKey: String): String {
        return sharedPreferences.getString(sharedKey, "") ?: ""
    }

    fun setBooleanValue(IsBooleanKey: String, is_boolean_value: Boolean) {
        editor.putBoolean(IsBooleanKey, is_boolean_value).apply()
    }

    fun getABoolean(IsBooleanKey: String): Boolean {
        return sharedPreferences.getBoolean(IsBooleanKey, false)
    }
}
