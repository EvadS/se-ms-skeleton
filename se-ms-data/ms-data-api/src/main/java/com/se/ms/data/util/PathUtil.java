package com.se.ms.data.util;

import com.google.common.base.Joiner;

public class PathUtil {

    /**
     * Private constructor to avoid instances of this class.
     */
    private PathUtil() {
    }

    /**
     * Combines multiple URI sections to form a full URL regardless of the sections starting or ending with '/'
     *
     * @param first the path string or initial part of the path string
     * @param more  additional strings to be joined to form the path string
     * @return The combined path result.
     */
    public static String combine(String first, String... more) {
        StringBuilder url = new StringBuilder(first);
        url.append('/');
        url.append(Joiner.on("/").join(more));
        return url.toString();
    }
}
