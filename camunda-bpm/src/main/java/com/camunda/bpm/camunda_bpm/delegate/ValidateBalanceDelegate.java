package com.camunda.bpm.camunda_bpm.delegate;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.connect.Connectors;
import org.camunda.connect.httpclient.HttpConnector;
import org.camunda.connect.httpclient.HttpRequest;
import org.camunda.connect.httpclient.HttpResponse;

import com.camunda.bpm.camunda_bpm.LoggerDelegate;
import com.camunda.bpm.camunda_bpm.dto.PostDto;
import com.google.gson.Gson;

import spinjar.com.fasterxml.jackson.databind.ObjectMapper;
import spinjar.com.fasterxml.jackson.databind.ObjectWriter;



public class ValidateBalanceDelegate implements JavaDelegate{
	
	 private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		PostDto body = new PostDto(null, 20L, "test tiltle", "test body");
		
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String bodyStr = ow.writeValueAsString(body);
		
		HttpConnector http = Connectors.getConnector(HttpConnector.ID);
		
		HttpRequest req=  http.createRequest();
		
		req.post()
		.url("https://jsonplaceholder.typicode.com/posts")
		.payload(bodyStr)
		.header("Accept", "application/json");
		
		HttpResponse res = req.execute();
		
		LOGGER.info("Post response is >>> " + res.getResponse());
		
		Gson json= new Gson();
		PostDto dto  = json.fromJson(res.getResponse(), PostDto.class);
		
		LOGGER.info("post id is " + dto.getId() + " post body is >> " + dto.getBody());
	
	}

}
