package com.zhengsr.opshelper

import android.Manifest
import android.app.AppOpsManager
import java.util.*

/**
 * @author by zhengshaorui 2020/12/14 10:12
 * describe：权限常量
 */
internal class OpsConstants {
    /**  No operation specified.  */
    val OP_NONE = -1

    /**  Access to coarse location information.  */
    val OP_COARSE_LOCATION = 0

    /**  Access to fine location information.  */
    val OP_FINE_LOCATION = 1

    /**  Causing GPS to run.  */
    val OP_GPS = 2
    val OP_VIBRATE = 3
    val OP_READ_CONTACTS = 4
    val OP_WRITE_CONTACTS = 5
    val OP_READ_CALL_LOG = 6
    val OP_WRITE_CALL_LOG = 7
    val OP_READ_CALENDAR = 8
    val OP_WRITE_CALENDAR = 9
    val OP_WIFI_SCAN = 10
    val OP_POST_NOTIFICATION = 11
    val OP_NEIGHBORING_CELLS = 12
    val OP_CALL_PHONE = 13
    val OP_READ_SMS = 14
    val OP_WRITE_SMS = 15
    val OP_RECEIVE_SMS = 16
    val OP_RECEIVE_EMERGECY_SMS = 17
    val OP_RECEIVE_MMS = 18
    val OP_RECEIVE_WAP_PUSH = 19
    val OP_SEND_SMS = 20
    val OP_READ_ICC_SMS = 21
    val OP_WRITE_ICC_SMS = 22
    val OP_WRITE_SETTINGS = 23

    /**  Required to draw on top of other apps.  */
    val OP_SYSTEM_ALERT_WINDOW = 24
    val OP_ACCESS_NOTIFICATIONS = 25
    val OP_CAMERA = 26
    val OP_RECORD_AUDIO = 27
    val OP_PLAY_AUDIO = 28
    val OP_READ_CLIPBOARD = 29
    val OP_WRITE_CLIPBOARD = 30
    val OP_TAKE_MEDIA_BUTTONS = 31
    val OP_TAKE_AUDIO_FOCUS = 32
    val OP_AUDIO_MASTER_VOLUME = 33
    val OP_AUDIO_VOICE_VOLUME = 34
    val OP_AUDIO_RING_VOLUME = 35
    val OP_AUDIO_MEDIA_VOLUME = 36
    val OP_AUDIO_ALARM_VOLUME = 37
    val OP_AUDIO_NOTIFICATION_VOLUME = 38
    val OP_AUDIO_BLUETOOTH_VOLUME = 39
    val OP_WAKE_LOCK = 40

    /**  Continually monitoring location data.  */
    val OP_MONITOR_LOCATION = 41

    /**  Continually monitoring location data with a relatively high power request.  */
    val OP_MONITOR_HIGH_POWER_LOCATION = 42

    /**  Retrieve current usage stats via [].  */
    val OP_GET_USAGE_STATS = 43
    val OP_MUTE_MICROPHONE = 44
    val OP_TOAST_WINDOW = 45

    /**  Capture the device's display contents and/or audio  */
    val OP_PROJECT_MEDIA = 46

    /**  Activate a VPN connection without user intervention.  */
    val OP_ACTIVATE_VPN = 47

    /**  Access the WallpaperManagerAPI to write wallpapers.  */
    val OP_WRITE_WALLPAPER = 48

    /**  Received the assist structure from an app.  */
    val OP_ASSIST_STRUCTURE = 49

    /**  Received a screenshot from assist.  */
    val OP_ASSIST_SCREENSHOT = 50

    /**  Read the phone state.  */
    val OP_READ_PHONE_STATE = 51

    /**  Add voicemail messages to the voicemail content provider.  */
    val OP_ADD_VOICEMAIL = 52

    /**  Access APIs for SIP calling over VOIP or WiFi.  */
    val OP_USE_SIP = 53

    /**  Intercept outgoing calls.  */
    val OP_PROCESS_OUTGOING_CALLS = 54

    /**  User the fingerprint API.  */
    val OP_USE_FINGERPRINT = 55

    /**  Access to body sensors such as heart rate, etc.  */
    val OP_BODY_SENSORS = 56

    /**  Read previously received cell broadcast messages.  */
    val OP_READ_CELL_BROADCASTS = 57

    /**  Inject mock location into the system.  */
    val OP_MOCK_LOCATION = 58

    /**  Read external storage.  */
    val OP_READ_EXTERNAL_STORAGE = 59

    /**  Write external storage.  */
    val OP_WRITE_EXTERNAL_STORAGE = 60

    /**  Turned on the screen.  */
    val OP_TURN_SCREEN_ON = 61

    /**  Get device accounts.  */
    val OP_GET_ACCOUNTS = 62

    /**  Control whether an application is allowed to run in the background.  */
    val OP_RUN_IN_BACKGROUND = 63
    val OP_AUDIO_ACCESSIBILITY_VOLUME = 64

    /**  Read the phone number.  */
    val OP_READ_PHONE_NUMBERS = 65

    /**  Request package installs through package installer  */
    val OP_REQUEST_INSTALL_PACKAGES = 66

    /**  Enter picture-in-picture.  */
    val OP_PICTURE_IN_PICTURE = 67

    /**  Instant app start foreground service.  */
    val OP_INSTANT_APP_START_FOREGROUND = 68

    /**  Answer incoming phone calls  */
    val OP_ANSWER_PHONE_CALLS = 69

    /**  Run jobs when in background  */
    val OP_RUN_ANY_IN_BACKGROUND = 70

    /**  Change Wi-Fi connectivity state  */
    val OP_CHANGE_WIFI_STATE = 71

    /**  Request package deletion through package installer  */
    val OP_REQUEST_DELETE_PACKAGES = 72

    /**  Bind an accessibility service.  */
    val OP_BIND_ACCESSIBILITY_SERVICE = 73

    /**  Continue handover of a call from another app  */
    val OP_ACCEPT_HANDOVER = 74

    /**  Create and Manage IPsec Tunnels  */
    val OP_MANAGE_IPSEC_TUNNELS = 75

    /**  Any app start foreground service.  */
    val OP_START_FOREGROUND = 76


    val OP_BLUETOOTH_SCAN = 77

    /**  Use the BiometricPrompt/BiometricManager APIs.  */
    val OP_USE_BIOMETRIC = 78

    /**  Physical activity recognition.  */
    val OP_ACTIVITY_RECOGNITION = 79

    /**  Financial app sms read.  */
    val OP_SMS_FINANCIAL_TRANSACTIONS = 80

    /**  Read media of audio type.  */
    val OP_READ_MEDIA_AUDIO = 81

    /**  Write media of audio type.  */
    val OP_WRITE_MEDIA_AUDIO = 82

    /**  Read media of video type.  */
    val OP_READ_MEDIA_VIDEO = 83

    /**  Write media of video type.  */
    val OP_WRITE_MEDIA_VIDEO = 84

    /**  Read media of image type.  */
    val OP_READ_MEDIA_IMAGES = 85

    /**  Write media of image type.  */
    val OP_WRITE_MEDIA_IMAGES = 86

    /**  Has a legacy (non-isolated) view of storage.  */
    val OP_LEGACY_STORAGE = 87

    /**  Accessing accessibility features  */
    val OP_ACCESS_ACCESSIBILITY = 88

    /**  Read the device identifiers (IMEI / MEID, IMSI, SIM / Build serial)  */
    val OP_READ_DEVICE_IDENTIFIERS = 89
    val _NUM_OP = 90

    val OPSTR_ACCEPT_HANDOVER = "android:accept_handover"

    /** Access to coarse location information.  */
    val OPSTR_COARSE_LOCATION = "android:coarse_location"

    /** Access to fine location information.  */
    val OPSTR_FINE_LOCATION = "android:fine_location"

    /** Continually monitoring location data.  */
    val OPSTR_MONITOR_LOCATION = "android:monitor_location"

    /** Continually monitoring location data with a relatively high power request.  */
    val OPSTR_MONITOR_HIGH_POWER_LOCATION = "android:monitor_location_high_power"

    /** Access to [android.app.usage.UsageStatsManager].  */
    val OPSTR_GET_USAGE_STATS = "android:get_usage_stats"

    /** Activate a VPN connection without user intervention. @hide  */
    val OPSTR_ACTIVATE_VPN = "android:activate_vpn"

    /** Allows an application to read the user's contacts data.  */
    val OPSTR_READ_CONTACTS = "android:read_contacts"

    /** Allows an application to write to the user's contacts data.  */
    val OPSTR_WRITE_CONTACTS = "android:write_contacts"

    /** Allows an application to read the user's call log.  */
    val OPSTR_READ_CALL_LOG = "android:read_call_log"

    /** Allows an application to write to the user's call log.  */
    val OPSTR_WRITE_CALL_LOG = "android:write_call_log"

    /** Allows an application to read the user's calendar data.  */
    val OPSTR_READ_CALENDAR = "android:read_calendar"

    /** Allows an application to write to the user's calendar data.  */
    val OPSTR_WRITE_CALENDAR = "android:write_calendar"

    /** Allows an application to initiate a phone call.  */
    val OPSTR_CALL_PHONE = "android:call_phone"

    /** Allows an application to read SMS messages.  */
    val OPSTR_READ_SMS = "android:read_sms"

    /** Allows an application to receive SMS messages.  */
    val OPSTR_RECEIVE_SMS = "android:receive_sms"

    /** Allows an application to receive MMS messages.  */
    val OPSTR_RECEIVE_MMS = "android:receive_mms"

    /** Allows an application to receive WAP push messages.  */
    val OPSTR_RECEIVE_WAP_PUSH = "android:receive_wap_push"

    /** Allows an application to send SMS messages.  */
    val OPSTR_SEND_SMS = "android:send_sms"

    /** Required to be able to access the camera device.  */
    val OPSTR_CAMERA = "android:camera"

    /** Required to be able to access the microphone device.  */
    val OPSTR_RECORD_AUDIO = "android:record_audio"

    /** Required to access phone state related information.  */
    val OPSTR_READ_PHONE_STATE = "android:read_phone_state"

    /** Required to access phone state related information.  */
    val OPSTR_ADD_VOICEMAIL = "android:add_voicemail"

    /** Access APIs for SIP calling over VOIP or WiFi  */
    val OPSTR_USE_SIP = "android:use_sip"

    /** Access APIs for diverting outgoing calls  */
    val OPSTR_PROCESS_OUTGOING_CALLS = "android:process_outgoing_calls"

    /** Use the fingerprint API.  */
    val OPSTR_USE_FINGERPRINT = "android:use_fingerprint"

    /** Access to body sensors such as heart rate, etc.  */
    val OPSTR_BODY_SENSORS = "android:body_sensors"

    /** Read previously received cell broadcast messages.  */
    val OPSTR_READ_CELL_BROADCASTS = "android:read_cell_broadcasts"

    /** Inject mock location into the system.  */
    val OPSTR_MOCK_LOCATION = "android:mock_location"

    /** Read external storage.  */
    val OPSTR_READ_EXTERNAL_STORAGE = "android:read_external_storage"

    /** Write external storage.  */
    val OPSTR_WRITE_EXTERNAL_STORAGE = "android:write_external_storage"

    /** Required to draw on top of other apps.  */
    val OPSTR_SYSTEM_ALERT_WINDOW = "android:system_alert_window"

    /** Required to write/modify/update system settingss.  */
    val OPSTR_WRITE_SETTINGS = "android:write_settings"

    /** @hide Get device accounts.
     */
    val OPSTR_GET_ACCOUNTS = "android:get_accounts"
    val OPSTR_READ_PHONE_NUMBERS = "android:read_phone_numbers"

    /** Access to picture-in-picture.  */
    val OPSTR_PICTURE_IN_PICTURE = "android:picture_in_picture"

    /** @hide
     */
    val OPSTR_INSTANT_APP_START_FOREGROUND = "android:instant_app_start_foreground"

    /** Answer incoming phone calls  */
    val OPSTR_ANSWER_PHONE_CALLS = "android:answer_phone_calls"
    val OPSTR_GPS = "android:gps"
    val OPSTR_VIBRATE = "android:vibrate"
    val OPSTR_WIFI_SCAN = "android:wifi_scan"
    val OPSTR_POST_NOTIFICATION = "android:post_notification"
    val OPSTR_NEIGHBORING_CELLS = "android:neighboring_cells"
    val OPSTR_WRITE_SMS = "android:write_sms"
    val OPSTR_RECEIVE_EMERGENCY_BROADCAST = "android:receive_emergency_broadcast"
    val OPSTR_READ_ICC_SMS = "android:read_icc_sms"
    val OPSTR_WRITE_ICC_SMS = "android:write_icc_sms"
    val OPSTR_ACCESS_NOTIFICATIONS = "android:access_notifications"
    val OPSTR_PLAY_AUDIO = "android:play_audio"
    val OPSTR_READ_CLIPBOARD = "android:read_clipboard"
    val OPSTR_WRITE_CLIPBOARD = "android:write_clipboard"
    val OPSTR_TAKE_MEDIA_BUTTONS = "android:take_media_buttons"
    val OPSTR_TAKE_AUDIO_FOCUS = "android:take_audio_focus"
    val OPSTR_AUDIO_MASTER_VOLUME = "android:audio_master_volume"
    val OPSTR_AUDIO_VOICE_VOLUME = "android:audio_voice_volume"
    val OPSTR_AUDIO_RING_VOLUME = "android:audio_ring_volume"
    val OPSTR_AUDIO_MEDIA_VOLUME = "android:audio_media_volume"
    val OPSTR_AUDIO_ALARM_VOLUME = "android:audio_alarm_volume"
    val OPSTR_AUDIO_NOTIFICATION_VOLUME = "android:audio_notification_volume"
    val OPSTR_AUDIO_BLUETOOTH_VOLUME = "android:audio_bluetooth_volume"
    val OPSTR_WAKE_LOCK = "android:wake_lock"
    val OPSTR_MUTE_MICROPHONE = "android:mute_microphone"
    val OPSTR_TOAST_WINDOW = "android:toast_window"
    val OPSTR_PROJECT_MEDIA = "android:project_media"
    val OPSTR_WRITE_WALLPAPER = "android:write_wallpaper"
    val OPSTR_ASSIST_STRUCTURE = "android:assist_structure"
    val OPSTR_ASSIST_SCREENSHOT = "android:assist_screenshot"
    val OPSTR_TURN_SCREEN_ON = "android:turn_screen_on"
    val OPSTR_RUN_IN_BACKGROUND = "android:run_in_background"
    val OPSTR_AUDIO_ACCESSIBILITY_VOLUME = "android:audio_accessibility_volume"
    val OPSTR_REQUEST_INSTALL_PACKAGES = "android:request_install_packages"
    val OPSTR_RUN_ANY_IN_BACKGROUND = "android:run_any_in_background"
    val OPSTR_CHANGE_WIFI_STATE = "android:change_wifi_state"
    val OPSTR_REQUEST_DELETE_PACKAGES = "android:request_delete_packages"
    val OPSTR_BIND_ACCESSIBILITY_SERVICE = "android:bind_accessibility_service"
    val OPSTR_MANAGE_IPSEC_TUNNELS = "android:manage_ipsec_tunnels"
    val OPSTR_START_FOREGROUND = "android:start_foreground"
    val OPSTR_BLUETOOTH_SCAN = "android:bluetooth_scan"

    /** @hide Use the BiometricPrompt/BiometricManager APIs.
     */
    val OPSTR_USE_BIOMETRIC = "android:use_biometric"

    /** @hide Recognize physical activity.
     */
    val OPSTR_ACTIVITY_RECOGNITION = "android:activity_recognition"

    /** @hide Financial app read sms.
     */
    val OPSTR_SMS_FINANCIAL_TRANSACTIONS = "android:sms_financial_transactions"

    /** @hide Read media of audio type.
     */
    val OPSTR_READ_MEDIA_AUDIO = "android:read_media_audio"

    /** @hide Write media of audio type.
     */
    val OPSTR_WRITE_MEDIA_AUDIO = "android:write_media_audio"

    /** @hide Read media of video type.
     */
    val OPSTR_READ_MEDIA_VIDEO = "android:read_media_video"

    /** @hide Write media of video type.
     */
    val OPSTR_WRITE_MEDIA_VIDEO = "android:write_media_video"

    /** @hide Read media of image type.
     */
    val OPSTR_READ_MEDIA_IMAGES = "android:read_media_images"

    /** @hide Write media of image type.
     */
    val OPSTR_WRITE_MEDIA_IMAGES = "android:write_media_images"

    /** @hide Has a legacy (non-isolated) view of storage.
     */
    val OPSTR_LEGACY_STORAGE = "android:legacy_storage"

    /** @hide Interact with accessibility.
     */
    val OPSTR_ACCESS_ACCESSIBILITY = "android:access_accessibility"

    /** @hide Read device identifiers
     */
    val OPSTR_READ_DEVICE_IDENTIFIERS = "android:read_device_identifiers"

    /**
     * This maps each operation to the operation that serves as the
     * switch to determine whether it is allowed.  Generally this is
     * a 1:1 mapping, but for some things (like location) that have
     * multiple low-level operations being tracked that should be
     * presented to the user as one switch then this can be used to
     * make them all controlled by the same single operation.
     */
    val sOpToSwitch = intArrayOf(
        OP_COARSE_LOCATION,  // COARSE_LOCATION
        OP_COARSE_LOCATION,  // FINE_LOCATION
        OP_COARSE_LOCATION,  // GPS
        OP_VIBRATE,  // VIBRATE
        OP_READ_CONTACTS,  // READ_CONTACTS
        OP_WRITE_CONTACTS,  // WRITE_CONTACTS
        OP_READ_CALL_LOG,  // READ_CALL_LOG
        OP_WRITE_CALL_LOG,  // WRITE_CALL_LOG
        OP_READ_CALENDAR,  // READ_CALENDAR
        OP_WRITE_CALENDAR,  // WRITE_CALENDAR
        OP_COARSE_LOCATION,  // WIFI_SCAN
        OP_POST_NOTIFICATION,  // POST_NOTIFICATION
        OP_COARSE_LOCATION,  // NEIGHBORING_CELLS
        OP_CALL_PHONE,  // CALL_PHONE
        OP_READ_SMS,  // READ_SMS
        OP_WRITE_SMS,  // WRITE_SMS
        OP_RECEIVE_SMS,  // RECEIVE_SMS
        OP_RECEIVE_SMS,  // RECEIVE_EMERGECY_SMS
        OP_RECEIVE_MMS,  // RECEIVE_MMS
        OP_RECEIVE_WAP_PUSH,  // RECEIVE_WAP_PUSH
        OP_SEND_SMS,  // SEND_SMS
        OP_READ_SMS,  // READ_ICC_SMS
        OP_WRITE_SMS,  // WRITE_ICC_SMS
        OP_WRITE_SETTINGS,  // WRITE_SETTINGS
        OP_SYSTEM_ALERT_WINDOW,  // SYSTEM_ALERT_WINDOW
        OP_ACCESS_NOTIFICATIONS,  // ACCESS_NOTIFICATIONS
        OP_CAMERA,  // CAMERA
        OP_RECORD_AUDIO,  // RECORD_AUDIO
        OP_PLAY_AUDIO,  // PLAY_AUDIO
        OP_READ_CLIPBOARD,  // READ_CLIPBOARD
        OP_WRITE_CLIPBOARD,  // WRITE_CLIPBOARD
        OP_TAKE_MEDIA_BUTTONS,  // TAKE_MEDIA_BUTTONS
        OP_TAKE_AUDIO_FOCUS,  // TAKE_AUDIO_FOCUS
        OP_AUDIO_MASTER_VOLUME,  // AUDIO_MASTER_VOLUME
        OP_AUDIO_VOICE_VOLUME,  // AUDIO_VOICE_VOLUME
        OP_AUDIO_RING_VOLUME,  // AUDIO_RING_VOLUME
        OP_AUDIO_MEDIA_VOLUME,  // AUDIO_MEDIA_VOLUME
        OP_AUDIO_ALARM_VOLUME,  // AUDIO_ALARM_VOLUME
        OP_AUDIO_NOTIFICATION_VOLUME,  // AUDIO_NOTIFICATION_VOLUME
        OP_AUDIO_BLUETOOTH_VOLUME,  // AUDIO_BLUETOOTH_VOLUME
        OP_WAKE_LOCK,  // WAKE_LOCK
        OP_COARSE_LOCATION,  // MONITOR_LOCATION
        OP_COARSE_LOCATION,  // MONITOR_HIGH_POWER_LOCATION
        OP_GET_USAGE_STATS,  // GET_USAGE_STATS
        OP_MUTE_MICROPHONE,  // MUTE_MICROPHONE
        OP_TOAST_WINDOW,  // TOAST_WINDOW
        OP_PROJECT_MEDIA,  // PROJECT_MEDIA
        OP_ACTIVATE_VPN,  // ACTIVATE_VPN
        OP_WRITE_WALLPAPER,  // WRITE_WALLPAPER
        OP_ASSIST_STRUCTURE,  // ASSIST_STRUCTURE
        OP_ASSIST_SCREENSHOT,  // ASSIST_SCREENSHOT
        OP_READ_PHONE_STATE,  // READ_PHONE_STATE
        OP_ADD_VOICEMAIL,  // ADD_VOICEMAIL
        OP_USE_SIP,  // USE_SIP
        OP_PROCESS_OUTGOING_CALLS,  // PROCESS_OUTGOING_CALLS
        OP_USE_FINGERPRINT,  // USE_FINGERPRINT
        OP_BODY_SENSORS,  // BODY_SENSORS
        OP_READ_CELL_BROADCASTS,  // READ_CELL_BROADCASTS
        OP_MOCK_LOCATION,  // MOCK_LOCATION
        OP_READ_EXTERNAL_STORAGE,  // READ_EXTERNAL_STORAGE
        OP_WRITE_EXTERNAL_STORAGE,  // WRITE_EXTERNAL_STORAGE
        OP_TURN_SCREEN_ON,  // TURN_SCREEN_ON
        OP_GET_ACCOUNTS,  // GET_ACCOUNTS
        OP_RUN_IN_BACKGROUND,  // RUN_IN_BACKGROUND
        OP_AUDIO_ACCESSIBILITY_VOLUME,  // AUDIO_ACCESSIBILITY_VOLUME
        OP_READ_PHONE_NUMBERS,  // READ_PHONE_NUMBERS
        OP_REQUEST_INSTALL_PACKAGES,  // REQUEST_INSTALL_PACKAGES
        OP_PICTURE_IN_PICTURE,  // ENTER_PICTURE_IN_PICTURE_ON_HIDE
        OP_INSTANT_APP_START_FOREGROUND,  // INSTANT_APP_START_FOREGROUND
        OP_ANSWER_PHONE_CALLS,  // ANSWER_PHONE_CALLS
        OP_RUN_ANY_IN_BACKGROUND,  // OP_RUN_ANY_IN_BACKGROUND
        OP_CHANGE_WIFI_STATE,  // OP_CHANGE_WIFI_STATE
        OP_REQUEST_DELETE_PACKAGES,  // OP_REQUEST_DELETE_PACKAGES
        OP_BIND_ACCESSIBILITY_SERVICE,  // OP_BIND_ACCESSIBILITY_SERVICE
        OP_ACCEPT_HANDOVER,  // ACCEPT_HANDOVER
        OP_MANAGE_IPSEC_TUNNELS,  // MANAGE_IPSEC_HANDOVERS
        OP_START_FOREGROUND,  // START_FOREGROUND
        OP_COARSE_LOCATION,  // BLUETOOTH_SCAN
        OP_USE_BIOMETRIC,  // BIOMETRIC
        OP_ACTIVITY_RECOGNITION,  // ACTIVITY_RECOGNITION
        OP_SMS_FINANCIAL_TRANSACTIONS,  // SMS_FINANCIAL_TRANSACTIONS
        OP_READ_MEDIA_AUDIO,  // READ_MEDIA_AUDIO
        OP_WRITE_MEDIA_AUDIO,  // WRITE_MEDIA_AUDIO
        OP_READ_MEDIA_VIDEO,  // READ_MEDIA_VIDEO
        OP_WRITE_MEDIA_VIDEO,  // WRITE_MEDIA_VIDEO
        OP_READ_MEDIA_IMAGES,  // READ_MEDIA_IMAGES
        OP_WRITE_MEDIA_IMAGES,  // WRITE_MEDIA_IMAGES
        OP_LEGACY_STORAGE,  // LEGACY_STORAGE
        OP_ACCESS_ACCESSIBILITY,  // ACCESS_ACCESSIBILITY
        OP_READ_DEVICE_IDENTIFIERS
    )

    /**
     * This maps each operation to the public string constant for it.
     */
    val sOpToString = arrayOf(
        OPSTR_COARSE_LOCATION,
        OPSTR_FINE_LOCATION,
        OPSTR_GPS,
        OPSTR_VIBRATE,
        OPSTR_READ_CONTACTS,
        OPSTR_WRITE_CONTACTS,
        OPSTR_READ_CALL_LOG,
        OPSTR_WRITE_CALL_LOG,
        OPSTR_READ_CALENDAR,
        OPSTR_WRITE_CALENDAR,
        OPSTR_WIFI_SCAN,
        OPSTR_POST_NOTIFICATION,
        OPSTR_NEIGHBORING_CELLS,
        OPSTR_CALL_PHONE,
        OPSTR_READ_SMS,
        OPSTR_WRITE_SMS,
        OPSTR_RECEIVE_SMS,
        OPSTR_RECEIVE_EMERGENCY_BROADCAST,
        OPSTR_RECEIVE_MMS,
        OPSTR_RECEIVE_WAP_PUSH,
        OPSTR_SEND_SMS,
        OPSTR_READ_ICC_SMS,
        OPSTR_WRITE_ICC_SMS,
        OPSTR_WRITE_SETTINGS,
        OPSTR_SYSTEM_ALERT_WINDOW,
        OPSTR_ACCESS_NOTIFICATIONS,
        OPSTR_CAMERA,
        OPSTR_RECORD_AUDIO,
        OPSTR_PLAY_AUDIO,
        OPSTR_READ_CLIPBOARD,
        OPSTR_WRITE_CLIPBOARD,
        OPSTR_TAKE_MEDIA_BUTTONS,
        OPSTR_TAKE_AUDIO_FOCUS,
        OPSTR_AUDIO_MASTER_VOLUME,
        OPSTR_AUDIO_VOICE_VOLUME,
        OPSTR_AUDIO_RING_VOLUME,
        OPSTR_AUDIO_MEDIA_VOLUME,
        OPSTR_AUDIO_ALARM_VOLUME,
        OPSTR_AUDIO_NOTIFICATION_VOLUME,
        OPSTR_AUDIO_BLUETOOTH_VOLUME,
        OPSTR_WAKE_LOCK,
        OPSTR_MONITOR_LOCATION,
        OPSTR_MONITOR_HIGH_POWER_LOCATION,
        OPSTR_GET_USAGE_STATS,
        OPSTR_MUTE_MICROPHONE,
        OPSTR_TOAST_WINDOW,
        OPSTR_PROJECT_MEDIA,
        OPSTR_ACTIVATE_VPN,
        OPSTR_WRITE_WALLPAPER,
        OPSTR_ASSIST_STRUCTURE,
        OPSTR_ASSIST_SCREENSHOT,
        OPSTR_READ_PHONE_STATE,
        OPSTR_ADD_VOICEMAIL,
        OPSTR_USE_SIP,
        OPSTR_PROCESS_OUTGOING_CALLS,
        OPSTR_USE_FINGERPRINT,
        OPSTR_BODY_SENSORS,
        OPSTR_READ_CELL_BROADCASTS,
        OPSTR_MOCK_LOCATION,
        OPSTR_READ_EXTERNAL_STORAGE,
        OPSTR_WRITE_EXTERNAL_STORAGE,
        OPSTR_TURN_SCREEN_ON,
        OPSTR_GET_ACCOUNTS,
        OPSTR_RUN_IN_BACKGROUND,
        OPSTR_AUDIO_ACCESSIBILITY_VOLUME,
        OPSTR_READ_PHONE_NUMBERS,
        OPSTR_REQUEST_INSTALL_PACKAGES,
        OPSTR_PICTURE_IN_PICTURE,
        OPSTR_INSTANT_APP_START_FOREGROUND,
        OPSTR_ANSWER_PHONE_CALLS,
        OPSTR_RUN_ANY_IN_BACKGROUND,
        OPSTR_CHANGE_WIFI_STATE,
        OPSTR_REQUEST_DELETE_PACKAGES,
        OPSTR_BIND_ACCESSIBILITY_SERVICE,
        OPSTR_ACCEPT_HANDOVER,
        OPSTR_MANAGE_IPSEC_TUNNELS,
        OPSTR_START_FOREGROUND,
        OPSTR_BLUETOOTH_SCAN,
        OPSTR_USE_BIOMETRIC,
        OPSTR_ACTIVITY_RECOGNITION,
        OPSTR_SMS_FINANCIAL_TRANSACTIONS,
        OPSTR_READ_MEDIA_AUDIO,
        OPSTR_WRITE_MEDIA_AUDIO,
        OPSTR_READ_MEDIA_VIDEO,
        OPSTR_WRITE_MEDIA_VIDEO,
        OPSTR_READ_MEDIA_IMAGES,
        OPSTR_WRITE_MEDIA_IMAGES,
        OPSTR_LEGACY_STORAGE,
        OPSTR_ACCESS_ACCESSIBILITY,
        OPSTR_READ_DEVICE_IDENTIFIERS
    )

    // Warning: If an permission is added here it also has to be added to
    // com.android.packageinstaller.permission.utils.EventLogger
    val RUNTIME_AND_APPOP_PERMISSIONS_OPS = intArrayOf( // RUNTIME PERMISSIONS
        // Contacts
        OP_READ_CONTACTS,
        OP_WRITE_CONTACTS,
        OP_GET_ACCOUNTS,  // Calendar
        OP_READ_CALENDAR,
        OP_WRITE_CALENDAR,  // SMS
        OP_SEND_SMS,
        OP_RECEIVE_SMS,
        OP_READ_SMS,
        OP_RECEIVE_WAP_PUSH,
        OP_RECEIVE_MMS,
        OP_READ_CELL_BROADCASTS,  // Storage
        OP_READ_EXTERNAL_STORAGE,
        OP_WRITE_EXTERNAL_STORAGE,  // Location
        OP_COARSE_LOCATION,
        OP_FINE_LOCATION,  // Phone
        OP_READ_PHONE_STATE,
        OP_READ_PHONE_NUMBERS,
        OP_CALL_PHONE,
        OP_READ_CALL_LOG,
        OP_WRITE_CALL_LOG,
        OP_ADD_VOICEMAIL,
        OP_USE_SIP,
        OP_PROCESS_OUTGOING_CALLS,
        OP_ANSWER_PHONE_CALLS,
        OP_ACCEPT_HANDOVER,  // Microphone
        OP_RECORD_AUDIO,  // Camera
        OP_CAMERA,  // Body sensors
        OP_BODY_SENSORS,  // Activity recognition
        OP_ACTIVITY_RECOGNITION,  // Aural
        OP_READ_MEDIA_AUDIO,
        OP_WRITE_MEDIA_AUDIO,  // Visual
        OP_READ_MEDIA_VIDEO,
        OP_WRITE_MEDIA_VIDEO,
        OP_READ_MEDIA_IMAGES,
        OP_WRITE_MEDIA_IMAGES,  // APPOP PERMISSIONS
        OP_ACCESS_NOTIFICATIONS,
        OP_SYSTEM_ALERT_WINDOW,
        OP_WRITE_SETTINGS,
        OP_REQUEST_INSTALL_PACKAGES,
        OP_START_FOREGROUND,
        OP_SMS_FINANCIAL_TRANSACTIONS
    )

    /**
     * This optionally maps a permission to an operation.  If there
     * is no permission associated with an operation, it is null.
     */
    val sOpPerms = arrayOf(
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION,
        null,
        Manifest.permission.VIBRATE,
        Manifest.permission.READ_CONTACTS,
        Manifest.permission.WRITE_CONTACTS,
        Manifest.permission.READ_CALL_LOG,
        Manifest.permission.WRITE_CALL_LOG,
        Manifest.permission.READ_CALENDAR,
        Manifest.permission.WRITE_CALENDAR,
        Manifest.permission.ACCESS_WIFI_STATE,
        null, // no permission required for notifications
        // no permission required for notifications
        null, // neighboring cells shares the coarse location perm
        // neighboring cells shares the coarse location perm
        Manifest.permission.CALL_PHONE,
        Manifest.permission.READ_SMS,
        null, // no permission required for writing sms
        // no permission required for writing sms
        Manifest.permission.RECEIVE_SMS,
        null,
        Manifest.permission.RECEIVE_MMS,
        Manifest.permission.RECEIVE_WAP_PUSH,
        Manifest.permission.SEND_SMS,
        Manifest.permission.READ_SMS,
        null, // no permission required for writing icc sms
        // no permission required for writing icc sms
        Manifest.permission.WRITE_SETTINGS,
        Manifest.permission.SYSTEM_ALERT_WINDOW,
        null,
        Manifest.permission.CAMERA,
        Manifest.permission.RECORD_AUDIO,
        null, // no permission for playing audio
        // no permission for playing audio
        null, // no permission for reading clipboard
        // no permission for reading clipboard
        null, // no permisslion for writing clipboard
        // no permisslion for writing clipboard
        null, // no permission for taking media buttons
        // no permission for taking media buttons
        null, // no permission for taking audio focus
        // no permission for taking audio focus
        null, // no permission for changing master volume
        // no permission for changing master volume
        null, // no permission for changing voice volume
        // no permission for changing voice volume
        null, // no permission for changing ring volume
        // no permission for changing ring volume
        null, // no permission for changing media volume
        // no permission for changing media volume
        null, // no permission for changing alarm volume
        // no permission for changing alarm volume
        null, // no permission for changing notification volume
        // no permission for changing notification volume
        null, // no permission for changing bluetooth volume
        // no permission for changing bluetooth volume
        Manifest.permission.WAKE_LOCK,
        null, // no permission for generic location monitoring
        // no permission for generic location monitoring
        null, // no permission for high power location monitoring
        // no permission for high power location monitoring
        Manifest.permission.PACKAGE_USAGE_STATS,
        null, // no permission for muting/unmuting microphone
        // no permission for muting/unmuting microphone
        null, // no permission for displaying toasts
        // no permission for displaying toasts
        null, // no permission for projecting media
        // no permission for projecting media
        null, // no permission for activating vpn
        // no permission for activating vpn
        null, // no permission for supporting wallpaper
        // no permission for supporting wallpaper
        null, // no permission for receiving assist structure
        // no permission for receiving assist structure
        null, // no permission for receiving assist screenshot
        // no permission for receiving assist screenshot
        Manifest.permission.READ_PHONE_STATE,
        Manifest.permission.ADD_VOICEMAIL,
        Manifest.permission.USE_SIP,
        Manifest.permission.PROCESS_OUTGOING_CALLS,
        Manifest.permission.USE_FINGERPRINT,
        Manifest.permission.BODY_SENSORS,
        null,
        null,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        null, // no permission for turning the screen on
        // no permission for turning the screen on
        Manifest.permission.GET_ACCOUNTS,
        null, // no permission for running in background
        // no permission for running in background
        null, // no permission for changing accessibility volume
        // no permission for changing accessibility volume
        Manifest.permission.READ_PHONE_NUMBERS,
        Manifest.permission.REQUEST_INSTALL_PACKAGES,
        null, // no permission for entering picture-in-picture on hide
        // no permission for entering picture-in-picture on hide
        Manifest.permission.INSTANT_APP_FOREGROUND_SERVICE,
        Manifest.permission.ANSWER_PHONE_CALLS,
        null, // no permission for OP_RUN_ANY_IN_BACKGROUND
        // no permission for OP_RUN_ANY_IN_BACKGROUND
        Manifest.permission.CHANGE_WIFI_STATE,
        Manifest.permission.REQUEST_DELETE_PACKAGES,
        Manifest.permission.BIND_ACCESSIBILITY_SERVICE,
        Manifest.permission.ACCEPT_HANDOVER,
        null, // no permission for OP_MANAGE_IPSEC_TUNNELS
        // no permission for OP_MANAGE_IPSEC_TUNNELS
        Manifest.permission.FOREGROUND_SERVICE,
        null, // no permission for OP_BLUETOOTH_SCAN
        // no permission for OP_BLUETOOTH_SCAN
        Manifest.permission.USE_BIOMETRIC,
        Manifest.permission.ACTIVITY_RECOGNITION,
        Manifest.permission.SMS_FINANCIAL_TRANSACTIONS,
        null,
        null, // no permission for OP_WRITE_MEDIA_AUDIO
        // no permission for OP_WRITE_MEDIA_AUDIO
        null,
        null, // no permission for OP_WRITE_MEDIA_VIDEO
        // no permission for OP_WRITE_MEDIA_VIDEO
        null,
        null, // no permission for OP_WRITE_MEDIA_IMAGES
        // no permission for OP_WRITE_MEDIA_IMAGES
        null, // no permission for OP_LEGACY_STORAGE
        // no permission for OP_LEGACY_STORAGE
        null, // no permission for OP_ACCESS_ACCESSIBILITY
        // no permission for OP_ACCESS_ACCESSIBILITY
        null // no direct permission for OP_READ_DEVICE_IDENTIFIERS
    )

    /**
     * get OpsStr
     */
    fun strOpToOp(opStr: String): Int {
        return sOpStrToOp[opStr]
            ?: throw IllegalArgumentException("Unknown operation string: $opStr")
    }

    fun strOpToPermission(opStr: String): Int {
        return sPermToOp[opStr]
            ?: throw IllegalArgumentException("Unknown operation string: $opStr")
    }

    fun permissionToOp(permission: String?): String? {
        val opCode: Int = sPermToOp[permission] ?: return null
        return sOpToString[opCode]
    }

    companion object{
         val instance : OpsConstants by lazy { OpsConstants() }
    }

    /**
     * Mapping from an app op name to the app op code.
     */
    val sOpStrToOp =
        HashMap<String, Int>()

    /**
     * Mapping from a permission to the corresponding app op.
     */
    val sPermToOp =
        HashMap<String?, Int>()


    init {

        for (i in 0 until _NUM_OP) {
            if (sOpToString[i] != null) {
                sOpStrToOp[sOpToString[i]] = i
            }
        }
        for (op in RUNTIME_AND_APPOP_PERMISSIONS_OPS) {
            if (sOpPerms[op] != null) {
                sPermToOp[sOpPerms[op]] = op
            }
        }
    }

    fun opToSwitch(op: Int): Int {
        return sOpToSwitch.get(op)
    }


}