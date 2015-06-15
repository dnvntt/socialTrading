package vn.com.vndirect.socialtrading.api;

import org.codehaus.jackson.map.ObjectMapper;
import spark.ResponseTransformer;

class JsonTransformer implements ResponseTransformer {
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public String render(Object model) throws Exception {
		return mapper.writeValueAsString(model);
	}
}
