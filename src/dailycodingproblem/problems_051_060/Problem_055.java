package dailycodingproblem.problems_051_060;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 Problem #55 [Easy] - Microsoft
 */
class Problem_055 {
    private Map<String, String> M = new HashMap<>();

    private String prefix = "http://example.com/";

    String shorten(String str) {
        var md5 = DigestUtils.md5Hex(str);
        var base64 = Base64.getEncoder().encodeToString(md5.getBytes()).substring(0, 6);
        M.put(base64, str);
        return prefix + base64;
    }

    String restore(String str) {
        return M.get(str.substring(prefix.length()));
    }
}
