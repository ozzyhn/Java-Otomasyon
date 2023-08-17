package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.Business.abstracts.ModelService;
import kodlama.io.rentACar.Business.requests.CreateModelRequest;
import kodlama.io.rentACar.Business.responses.GetAllModelResponse;
import lombok.AllArgsConstructor;

@RestController     //annotation
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
	private ModelService modelService;  //Enjekte ettik Model Service i
	
	@GetMapping() //data eklemek için
	public List<GetAllModelResponse> getAll(){
		return modelService.getAll();
	}
	
	@PostMapping() //data çekmek için
	@ResponseStatus(code=HttpStatus.CREATED)//kodlar 201 döndürsün diye yapıyoruz
	public void add(CreateModelRequest createModelRequest) {
		this.modelService.add(createModelRequest);
	}

}
