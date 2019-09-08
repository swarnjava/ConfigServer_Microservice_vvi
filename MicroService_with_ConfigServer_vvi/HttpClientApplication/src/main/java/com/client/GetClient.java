package com.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import com.client2.model.EmployeeVO;

public class GetClient {

	public static void demoGetRESTAPI() throws Exception
	{
		String url = "http://localhost:8285/getEmployees";

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		//request.addHeader("User-Agent", USER_AGENT);
		HttpResponse response = client.execute(request);

		System.out.println("Response Code : " 
	                + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(
			new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		System.out.println("Response Data: "+result.toString());
		ObjectMapper mapper = new ObjectMapper();
		
		List<EmployeeVO> list2 = mapper.readValue(result.toString(),TypeFactory.collectionType(List.class, EmployeeVO.class));

		if(list2!=null && list2.size()>0)
		{
			System.out.println("************* Employee Data *************");
			for(EmployeeVO em:list2)
			{
				System.out.println(em.getEmpid()+" / "+em.getEmpname()+" / "+em.getEmpaddr());
			}
		}
		
	}
}
