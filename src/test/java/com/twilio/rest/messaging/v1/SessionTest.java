/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class SessionTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Sessions/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.fetcher("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MG80af39294fe338b3848294685d097e04\",\"friendly_name\": \"friendly_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"created_by\": \"creator\",\"url\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Session.fetcher("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Sessions/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.deleter("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Session.deleter("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Sessions");
            request.addPostParam("MessagingServiceSid", serialize("messaging_service_sid"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.creator("messaging_service_sid").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MG80af39294fe338b3848294685d097e04\",\"friendly_name\": \"friendly_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"created_by\": \"creator\",\"url\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Session.creator("messaging_service_sid").create();
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Sessions/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.updater("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MG80af39294fe338b3848294685d097e04\",\"friendly_name\": \"friendly_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"created_by\": \"creator\",\"url\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Session.updater("CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Sessions");
            
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sessions\": [{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"messaging_service_sid\": \"MG80af39294fe338b3848294685d097e04\",\"friendly_name\": \"friendly_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"created_by\": \"creator\",\"url\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\",\"messages\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"webhooks\": \"https://messaging.twilio.com/v1/Sessions/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\"}}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://messaging.twilio.com/v1/Sessions?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://messaging.twilio.com/v1/Sessions?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"sessions\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Session.reader().read());
    }
}