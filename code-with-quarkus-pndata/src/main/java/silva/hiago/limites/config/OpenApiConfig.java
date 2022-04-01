package silva.hiago.limites.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        tags = {
                @Tag(name = "/v1/pessoas", description = "Grupo de API's para busca limites diarios do cliente")
        },
        info = @Info(
                title = "Sistema de exemplo para apresentação da unicred",
                version = "1.0.0",
                contact = @Contact(
                        name = "Fale com a Hiago",
                        url = "https://www.linkedin.com/in/hiago-silva-2101/")),
        servers = {
                @Server(url = "http://localhost:8080")
        })

public class OpenApiConfig extends Application {
}
