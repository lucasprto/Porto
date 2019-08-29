package drummond.com.br.resources;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResources {

	
	@RequestMapping(value="/health", method = RequestMethod.GET)
	public String test() {
					 
			return "Sistema Drummond API ativo - " + new SimpleDateFormat("yyyyMM-dd HH:mm:ss").format(new Date());
	}	
}
