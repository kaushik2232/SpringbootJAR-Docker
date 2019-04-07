package Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/docker")
public class DockerResource {
	
	@GetMapping
	public String hello() {
		return "You are using DOCKER now";
	}

}
