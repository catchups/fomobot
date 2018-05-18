package com.leafCat.coin.svc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TelegramApiService {

	public String sendMSG(String msg) {
		
		String result="";
		// RestTemplate 에 MessageConverter 세팅
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new FormHttpMessageConverter());
		converters.add(new StringHttpMessageConverter());
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setMessageConverters(converters);
		
		result =  restTemplate.getForObject("https://api.telegram.org/bot577023742:AAEH0SgepYl3XxRvNudGvlEVoFPzMWAXofg/sendMessage?chat_id=-1001317239552&text="+ msg , String.class);
		
		return result;
		
		
	}
}
