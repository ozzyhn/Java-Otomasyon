package kodlama.io.rentACar.Business.abstracts;

import java.util.List;

import kodlama.io.rentACar.Business.requests.CreateModelRequest;
import kodlama.io.rentACar.Business.responses.GetAllModelResponse;

public interface ModelService {
	List<GetAllModelResponse> getAll();
	void add(CreateModelRequest createModelRequest);

}
