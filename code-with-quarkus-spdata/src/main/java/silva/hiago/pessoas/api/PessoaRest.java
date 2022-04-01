package silva.hiago.pessoas.api;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import silva.hiago.pessoas.business.PessoaService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/v1/pessoas")
public class PessoaRest {

    @Inject
    private PessoaService service;

    @APIResponses(value = {
            @APIResponse(responseCode = "204", description ="Retorno para inclusão do documento"),
            @APIResponse(responseCode = "404", description ="Recurso não encontrado")
    })
    @Operation(description = "API para buscar dados do cliente")
    @GET
    @Path("/pessoas/{id}")
    public Response buscarPessoas(@PathParam("id") Long id) {
        return Response.ok(service.findById(id)).build();
    }

}
