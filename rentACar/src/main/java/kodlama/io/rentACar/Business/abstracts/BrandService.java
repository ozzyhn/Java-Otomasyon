package kodlama.io.rentACar.Business.abstracts;

import java.util.List;

import kodlama.io.rentACar.Business.requests.CreateBrandRequest;
import kodlama.io.rentACar.Business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.Business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.Business.responses.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);

}
