package com.google.adsmodule.sharedPref


object FirebaseConfigConst {

    /**Note:-
     *          This Two Variable Use for ads management
     *          if app live @APP_IS_LIVE_MODE true then show demo ads
     *          or if @ IS_ADS_SHOWING_OR_NOT false then not showing any type of ads demo or real
     * */

    //if app is live mode then app showing live id's and if not then showing test avd
    const val APP_IS_LIVE_MODE = "app_is_live_mode"
    //if flag true then avs show if not then avd not showing if any test or live
    const val IS_ADS_SHOWING_OR_NOT = "is_ads_showing_or_not"


    //Admob id's
    const val GOOGLE_ADMOB_BANNER = "google_admob_banner"
    const val GOOGLE_ADMOB_INTERSTITIAL = "google_admob_interstitial"
    const val GOOGLE_ADMOB_NATIVE = "google_admob_native"
    const val GOOGLE_ADMOB_APP_OPEN = "google_admob_app_open"

    //Facebook id's
    const val FACEBOOK_BANNER = "facebook_banner"
    const val FACEBOOK_INTERSTITIAL = "facebook_interstitial"
    const val FACEBOOK_NATIVE = "facebook_native"

    //Ads Sequence Manage
    const val ADS_SEQUENCE = "ads_sequence"
    const val SHOW_ADMOB = 1 //Show Admob Ads
    const val SHOW_FB = 2 //Show Facebook Ads Only
    const val ADMOB_FAIL_SHOW_FB = 3 //When Admob Fail Then Show Facebook
    const val FB_FAIL_SHOW_ADMOB = 4 // Facebook Fail Then Show Google


    /**
     * if we need to off particular ads Inter,Native,Banner,App Open Then switch below Variable
     * */

    //turn on or off all inters avd quereka,facebook,google all of them if true then show avd if false then not show
    const val INTERSTITIAL_ALL_ADS_ON_OFF = "interstitial_all_ads_on_off"
    //turn on or off all native avd quereka,facebook,google all of them if true then show avd if false then not show
    const val NATIVE_ALL_ADS_ON_OFF = "native_all_ads_on_off"
    //turn on or off all banner avd quereka,facebook,google all of them if true then show avd if false then not show
    const val BANNER_ALL_ADS_ON_OFF = "banner_all_ads_on_off"
    //turn on or off all appopen google if true then show avd if false then not show
    const val IS_SHOWING_APP_OPEN = "is_showing_app_open"



    //Using for interstial ads gep
    const val AD_INTERVAL_MINUTE_FOR_INTERSTITIALS = "ad_interval_minute_for_interstitials"
    // Ads Interstial ads Click Counter
    const val ADS_CLICK_COUNTER = "ads_click_counter"


    //if app is live mode then app showing live id's and if not then showing test avd
    const val IS_BANNER_CHANGE_NATIVE = "is_banner_change_native"
    const val IS_NATIVE_CHANGE_BANNER = "is_native_change_banner"



    //use for skip ads actity when we match with this array
    const val SKIP_ADS_ACTIVITY_ARRAY = "skip_ads_activity_array"
    //Which Ads Show in click type
    const val CLICK_TIME_ADS_TYPE_NAME = "click_time_ads_type_name"
    //SHOWING Intro Activity Or Not
    const val IS_SHOW_INTRO_SCREEN = "is_show_intro_screen"
    //if flag is true then showing inter in backpPress and if false then skip avd in backpress
    const val IS_BACK_PRESS_INTER_SHOW = "is_back_press_inter_show"

}
