package com.djwebpros.validator;

import org.json.JSONException;
import org.json.JSONObject;
/**
 * class to validate Login Request.
 * @author DJ
 */
public class LoginRequestValidator extends RequestValidator {
  
    @Override
    /**
    * @method : validation check.
    * @param postJSONData :
    * JSON Object containing all the parameters sent in the request
    * @param errorJson :
    * object that will hold all the errors in a key value pair.
    */
    public void validate(final JSONObject errorJson, JSONObject postJSONData) throws JSONException {
    	
    }
}
