package com.hjp.middleware.db.router;

/**
 * @description:
 * @author：hjp
 * @date: 2023-05-31
 * @Copyright： hjp
 */
public class DBRouterBase {
    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }
}
