package bazaar.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseExecutorTest {

    @org.junit.jupiter.api.Test
    void getBaseResponse() {
        Object object = new Object();
        BaseResponse baseResponse  = BaseExecutor.getBaseResponse(object);
        System.out.println(baseResponse);

        assertEquals(object,baseResponse);

    }

    @Test
    void testGetBaseResponse() {
    }
}