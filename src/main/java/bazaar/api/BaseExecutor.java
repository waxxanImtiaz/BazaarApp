package bazaar.api;

import bazaar.utils.ResponseRelatedFields;

import java.util.List;

public class BaseExecutor {

    private static BaseResponse baseResponse;



    @SuppressWarnings("unchecked")
    public static BaseResponse getBaseResponse(Object returnObject){
        if (baseResponse == null)
            baseResponse = new BaseResponse();

        if (returnObject == null){
            baseResponse.setMessage(ResponseRelatedFields.DATA_NOT_FOUND);
            baseResponse.setResCode(ResponseRelatedFields.DATA_NOT_FOUND_REQ_CODE);
            return baseResponse;
        }
        if (returnObject instanceof List)
        {
            if(((List)returnObject).size()>0)
            {
                baseResponse.setResponseObject(returnObject);
                baseResponse.setMessage(ResponseRelatedFields.DEFAULT_MESSAGE);
                baseResponse.setResCode(ResponseRelatedFields.SUCCESS_REQ_CODE);
                return baseResponse;
            }
            else {
                baseResponse.setMessage(ResponseRelatedFields.DATA_NOT_FOUND);
                baseResponse.setResCode(ResponseRelatedFields.DATA_NOT_FOUND_REQ_CODE);
                return baseResponse;
            }

        }

        baseResponse.setResponseObject(returnObject);
        baseResponse.setMessage(ResponseRelatedFields.DEFAULT_MESSAGE);
        baseResponse.setResCode(ResponseRelatedFields.SUCCESS_REQ_CODE);

        return baseResponse;
    }

}
