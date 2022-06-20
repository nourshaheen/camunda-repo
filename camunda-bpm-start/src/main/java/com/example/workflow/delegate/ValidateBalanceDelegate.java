package com.example.workflow.delegate;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.workflow.dto.PostDto;
import com.example.workflow.service.LeaveService;


@Component
public class ValidateBalanceDelegate implements JavaDelegate{
	
	@Autowired
	private LeaveService leaveService;
	
	 private final Logger LOGGER = Logger.getLogger(ValidateBalanceDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		PostDto body = new PostDto(null, 20L, "test tiltle", "test body");
		
		leaveService.printLeaveName("Annual Leave");
		
//		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//		String bodyStr = ow.writeValueAsString(body);
		
//		HttpConnector http = Connectors.getConnector(HttpConnector.ID);
//		
//		HttpRequest req=  http.createRequest();
//		
//		req.post()
//		.url("https://jsonplaceholder.typicode.com/posts")
//		.payload(bodyStr)
//		.header("Accept", "application/json");
//		
//		HttpResponse res = req.execute();
//		
//		LOGGER.info("Post response is >>> " + res.getResponse());
//		
//		Gson json= new Gson();
//		PostDto dto  = json.fromJson(res.getResponse(), PostDto.class);
//		
//		LOGGER.info("post id is " + dto.getId() + " post body is >> " + dto.getBody());
	
	}

}
