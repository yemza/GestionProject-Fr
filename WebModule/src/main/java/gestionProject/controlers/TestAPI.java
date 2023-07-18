package gestionProject.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import gestionProject.entitiesDAO.ClassTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@Api(value = "Notes controler" ,tags = {"Notes controler"})
@SwaggerDefinition(tags = {@Tag(name = "Notes controler", description = "Notes controler")})
public class TestAPI {
	
	
	@GetMapping("/testControler")
	public ClassTest testControler() {
		return new ClassTest();
	}

}
