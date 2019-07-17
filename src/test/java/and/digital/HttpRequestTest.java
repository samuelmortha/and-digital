package and.digital;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import and.digital.model.PhoneNumber;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnCustomerPhoneNumber() throws Exception {
        Map<String, String> responeMap = 
        		(Map<String, String>) this.restTemplate.getForObject("http://localhost:" + port + 
        				"/api/phonenumbers/customer/1", List.class).get(0);
        assertThat(responeMap.get("phoneNumber")).isEqualTo("+44-123-456-7801");
    }
    
    @Test
    public void shouldReturnAllPhoneNumber() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/phonenumbers",
        		List.class).size()).isEqualTo(9);
    }
    
    @Test
    public void shouldReturnUpdatedObject() throws Exception {
    	
    	String activatePhoneNumberURL = "http://localhost:" + port + "/api/phonenumbers/activate";
    	JSONObject jsonObject = new JSONObject();
    	HttpHeaders httpHeaders = new HttpHeaders();
    	httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    	jsonObject.put("id", 3);
    	jsonObject.put("phoneNumber", "+44-123-456-7803");
    	jsonObject.put("isActive", false);
    	HttpEntity<String> request = new HttpEntity<String>(jsonObject.toString(), httpHeaders);
    	PhoneNumber responsePhoneNumber = restTemplate.postForObject(activatePhoneNumberURL, request, PhoneNumber.class);
    	assertThat(responsePhoneNumber.getPhoneNumber().equals(jsonObject.get("phoneNumber")));
    	assertTrue("Did not update correcly.",responsePhoneNumber.isActive());
    }
}

