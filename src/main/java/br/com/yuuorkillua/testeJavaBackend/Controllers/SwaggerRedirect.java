package br.com.yuuorkillua.testeJavaBackend.Controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;
import lombok.Value;

@Controller
public class SwaggerRedirect {

	@Value("${springfox.documentation.swagger.v2.path:/v2/api-docs}")
	private String springfoxPath;

	@GetMapping("/swagger-ui.html")
	public void redirectToUi(HttpServletRequest request, HttpServletResponse response) throws IOException {
		final String contextPath = request.getContextPath();
		final String url = "?url=" + contextPath + springfoxPath;
		final String configUrl = "&configUrl=" + contextPath + "/swagger-resources/configuration/ui";
		response.sendRedirect("webjars/swagger-ui/index.html" + url + configUrl);
	}
}
