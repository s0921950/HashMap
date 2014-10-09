package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

import com.oplk.platform.eagle.server.core.command.constants.KeyConstants;

public class TestMap {

    public static void main(String[] args) throws JSONException {
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(KeyConstants.IDENTIFIER, KeyConstants.EVENT_NOTICE);
        parameters.put(KeyConstants.EVENT_ID, "1");
        parameters.put(KeyConstants.OPU_UID, "2");
        parameters.put(KeyConstants.VALUE_NAME, "3");
        parameters.put(KeyConstants.SENSOR_NAME, "4");
        System.out.println("Parameters size: " + parameters);
        JSONObject payload = new JSONObject();

        parameters.size();
        JSONObject data = new JSONObject();

        Set<String> ketSet = parameters.keySet();
        for (String key : ketSet) {
            data.put(key, parameters.get(key));
        }
        payload.put("data", data);
        payload.put("consolidationKey", "ADM_Enqueue_Sample");

        // Add an expires-after value to the message of 1 day. If the targeted app instance does not
        // come online within the expires-after window, the message will not be delivered.
        payload.put("expiresAfter", 86400);
        System.out.println("payload: " + payload);
    }
}
