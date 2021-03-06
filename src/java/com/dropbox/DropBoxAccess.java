package com.dropbox;

import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxRequestConfig;
import java.util.Locale;

public class DropBoxAccess {

    private final static String ACCESS_TOKEN = "Your dropbox access token";
    private final static String userLocale = Locale.getDefault().toString();
    private static DbxClient dbxClient;

    public static DbxClient getDbxClient() {
        DbxRequestConfig requestConfig = new DbxRequestConfig("examples-account-info", userLocale);
        if (dbxClient == null) {
            dbxClient = new DbxClient(requestConfig, ACCESS_TOKEN);
        }
        return dbxClient;
    }

}
