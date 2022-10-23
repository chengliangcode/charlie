package com.cl.code.common.util;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chengliang
 * @since 2022/10/22 15:20
 */
@Data
@Slf4j
public class TreeUtils {

    private static String id = "111";

    public static String toTree() {
        log.debug("值:{}", id);
        return id;
    }

}
