package cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum CacheKey {

    EVENT_TIME,
    EVENT_DATE;

    private static final Map<CacheKey, Object> cacheMap = new HashMap<>();

    public static void putData(CacheKey key, Object data) {
        cacheMap.put(key, data);
    }

    public static Object getData(CacheKey key) {
        return cacheMap.get(key);
    }

}
