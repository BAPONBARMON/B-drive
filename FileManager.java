package com.bdrive;

import android.os.Environment;
import java.io.File;

public class FileManager {

    public static File[] listRootFiles() {
        File root = Environment.getExternalStorageDirectory();
        return root.listFiles();
    }

    // Backend base URL
    public static final String BACKEND_BASE_URL = "https://baponbarmon.github.io/my-cloud-storage-backend/";

    // Sample method to show backend usage (implement your API calls here)
    public static String getBackendApiUrl(String endpoint) {
        return BACKEND_BASE_URL + endpoint;
    }
}