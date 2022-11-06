package br.com.fah.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fah.bo.PessoaJuridicaBO;
import br.com.fah.model.PessoaJuridicaTO;

@Path("/juridica")
public class PessoaJuridicaResource {
	
	PessoaJuridicaBO pjb = new PessoaJuridicaBO();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(PessoaJuridicaTO pj, @Context UriInfo uriInfo) {
	pjb.Inserir(pj);
	UriBuilder builder = uriInfo.getAbsolutePathBuilder();
	builder.path(pj.getNmFantasia());
	return Response.created(builder.build()).build();
	}

}
