package br.com.hubmarket.produto.categoria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "${cors.allowed-origins}")
@RequestMapping(value = "/categoria")
public class CategoriaController {

	@Autowired
	protected CategoriaRepository categoriaRepository;

	
	@GetMapping
	public List<CategoriaDTO> listar() {
		List<CategoriaDTO> listaCategoriaDTO = new ArrayList<CategoriaDTO>(); 
		List<CategoriaEntity> listaCategoriaEntity = this.categoriaRepository.findByListaCategoriasInferioresIsNotEmpty();
		
		for (CategoriaEntity categoriaEntity : listaCategoriaEntity) {
			CategoriaDTO categoriaDTO = transformaEntityEmDTO(categoriaEntity);			
			listaCategoriaDTO.add(categoriaDTO);
		}
		
		return listaCategoriaDTO;	
	}
	
		
	private static CategoriaDTO transformaEntityEmDTO(CategoriaEntity categoriaEntity) {		
		CategoriaDTO categoriaDTO = new CategoriaDTO(categoriaEntity.getId(), categoriaEntity.getDescricao());
		
		if (!categoriaEntity.getListaCategoriasInferiores().isEmpty()) {
		   categoriaDTO.setListaCategoriasInferiores(new ArrayList<CategoriaDTO>());	
		   for (CategoriaEntity categoriaEntityInferior : categoriaEntity.getListaCategoriasInferiores() ) {
			    CategoriaDTO  categoriaDTOInferior = transformaEntityEmDTO(categoriaEntityInferior);
			    categoriaDTO.getListaCategoriasInferiores().add(categoriaDTOInferior);  			   
		   }			
		}		
		return categoriaDTO;
	}
}
