package utilities;

import java.util.Collection;

public class CollectionUtil {

    public static boolean isNotNullOrEmpty(Collection<?> collection) {
        return !(collection == null || collection.isEmpty());
    }
}
